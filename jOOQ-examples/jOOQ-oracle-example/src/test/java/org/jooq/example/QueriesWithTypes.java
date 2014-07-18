/**
 * Copyright (c) 2009-2013, Data Geekery GmbH (http://www.datageekery.com)
 * All rights reserved.
 *
 * This work is dual-licensed
 * - under the Apache Software License 2.0 (the "ASL")
 * - under the jOOQ License and Maintenance Agreement (the "jOOQ License")
 * =============================================================================
 * You may choose which license applies to you:
 *
 * - If you're using this work with Open Source databases, you may choose
 *   either ASL or jOOQ License.
 * - If you're using this work with at least one commercial database, you must
 *   choose jOOQ License
 *
 * For more information, please visit http://www.jooq.org/licenses
 *
 * Apache Software License 2.0:
 * -----------------------------------------------------------------------------
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * jOOQ License and Maintenance Agreement:
 * -----------------------------------------------------------------------------
 * Data Geekery grants the Customer the non-exclusive, timely limited and
 * non-transferable license to install and use the Software under the terms of
 * the jOOQ License and Maintenance Agreement.
 *
 * This library is distributed with a LIMITED WARRANTY. See the jOOQ License
 * and Maintenance Agreement for more details: http://www.jooq.org/licensing
 */
package org.jooq.example;

import static java.util.stream.Collectors.toList;
import static java.util.stream.IntStream.range;
import static org.jooq.example.db.oracle.Queues.NEW_AUTHOR_AQ;
import static org.jooq.example.db.oracle.Tables.AUTHORS;
import static org.jooq.example.db.oracle.Tables.BOOKS;
import static org.jooq.impl.DSL.using;
import static org.jooq.util.oracle.OracleDSL.DBMS_AQ.VISIBILITY.IMMEDIATE;
import static org.jooq.util.oracle.OracleDSL.DBMS_AQ.WAIT.NO_WAIT;
import static org.junit.Assert.assertEquals;

import java.util.List;

import org.jooq.example.db.oracle.packages.Library;
import org.jooq.example.db.oracle.udt.records.AuthorTRecord;
import org.jooq.exception.DataAccessException;
import org.jooq.impl.DSL;
import org.jooq.util.oracle.OracleDSL.DBMS_AQ;
import org.jooq.util.oracle.OracleDSL.DBMS_AQ.DEQUEUE_OPTIONS_T;
import org.jooq.util.oracle.OracleDSL.DBMS_AQ.ENQUEUE_OPTIONS_T;
import org.jooq.util.oracle.OracleDSL.DBMS_AQ.MESSAGE_PROPERTIES_T;

import org.junit.Before;
import org.junit.Test;

/**
 * @author Lukas Eder
 */
public class QueriesWithTypes extends Utils {

    // Generate 10 authors
    static final List<AuthorTRecord> authors =
        range(0, 10).mapToObj(i -> new AuthorTRecord(i, "F" + i, "L1" + i, null)).collect(toList());

    @Before
    public void setup() {
        dsl.transaction(ctx -> {
            using(ctx).delete(BOOKS).execute();
            using(ctx).delete(AUTHORS).execute();

            using(ctx).insertInto(AUTHORS, AUTHORS.ID, AUTHORS.FIRST_NAME, AUTHORS.LAST_NAME)
                      .values(1, "George", "Orwell")
                      .values(2, "Paulo" , "Coelho")
                      .execute();

            using(ctx).insertInto(BOOKS, BOOKS.ID, BOOKS.TITLE, BOOKS.LANGUAGE, BOOKS.AUTHOR_ID)
                      .values(1, "1984"        , "en", 1)
                      .values(2, "Animal Farm" , "en", 1)
                      .values(3, "O Alquimista", "pt", 2)
                      .values(4, "Brida"       , "en", 2)
                      .execute();
        });
    }

    @Test
    public void testProcedures() {
        // TODO: Work on this nice table unnesting syntax, which currently doesn't work.
        // dsl.selectFrom(table(Library.getAuthors(null, 1)))
        //    .fetch();

        dsl.select(AUTHORS.FIRST_NAME, AUTHORS.LAST_NAME, Library.getBooks(AUTHORS.ID))
           .from(AUTHORS)
           .fetch()
           .forEach(author -> {

            System.out.println();
            System.out.println("Author " + author.getValue(AUTHORS.FIRST_NAME) + " " + author.getValue(AUTHORS.LAST_NAME) + " wrote: ");
            author.value3().getList().forEach(book -> {
                System.out.println(book.getTitle());
            });
        });
    }

    @Test
    public void testAQSimple() throws Exception {
        dsl.transaction(c -> {

            // Enqueue all authors
            authors.stream().forEach(a -> {
                DBMS_AQ.enqueue(dsl.configuration(), NEW_AUTHOR_AQ, a);
            });

            // Dequeue them again
            authors.stream().forEach(a -> {
                assertEquals(a, DBMS_AQ.dequeue(dsl.configuration(), NEW_AUTHOR_AQ));
            });
        });
    }

    @Test
    public void testAQOptions() throws Exception {
        dsl.transaction(c -> {
            MESSAGE_PROPERTIES_T props = new MESSAGE_PROPERTIES_T();
            ENQUEUE_OPTIONS_T enq = new ENQUEUE_OPTIONS_T().visibility(IMMEDIATE);

            // Enqueue two authors
            DBMS_AQ.enqueue(c, NEW_AUTHOR_AQ, authors.get(0), enq, props);
            DBMS_AQ.enqueue(c, NEW_AUTHOR_AQ, authors.get(1), enq, props);

            // Dequeue them again
            DEQUEUE_OPTIONS_T deq = new DEQUEUE_OPTIONS_T().wait(NO_WAIT);

            assertEquals(authors.get(0), DBMS_AQ.dequeue(c, NEW_AUTHOR_AQ, deq, props));
            assertEquals(authors.get(1), DBMS_AQ.dequeue(c, NEW_AUTHOR_AQ, deq, props));

            // The queue is empty, this should fail
            assertThrows(DataAccessException.class, () -> {
                DBMS_AQ.dequeue(c, NEW_AUTHOR_AQ, deq, props);
            });
        });
    }

    @Test
    public void testAQTransactions() throws Exception {
        dsl.transaction(c1 -> {

            // Enqueue an author
            DBMS_AQ.enqueue(c1, NEW_AUTHOR_AQ, authors.get(0));

            // This nested transaction is rolled back to its savepoint
            assertThrows(RuntimeException.class, () -> {
                DSL.using(c1).transaction(c2 -> {
                    DBMS_AQ.enqueue(c2, NEW_AUTHOR_AQ, authors.get(1));
                    throw new RuntimeException();
                });
            });

            // Dequeue the first author
            MESSAGE_PROPERTIES_T props = new MESSAGE_PROPERTIES_T();
            DEQUEUE_OPTIONS_T deq = new DEQUEUE_OPTIONS_T().wait(NO_WAIT);
            assertEquals(authors.get(0), DBMS_AQ.dequeue(c1, NEW_AUTHOR_AQ, deq, props));

            // The queue is empty (due to the rollback), this should fail
            assertThrows(DataAccessException.class, () -> {
                DBMS_AQ.dequeue(c1, NEW_AUTHOR_AQ, deq, props);
            });
        });
    }
}
