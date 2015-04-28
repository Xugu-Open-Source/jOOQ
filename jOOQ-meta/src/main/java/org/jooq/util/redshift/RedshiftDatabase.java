/**
 * Copyright (c) 2009-2015, Data Geekery GmbH (http://www.datageekery.com)
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

package org.jooq.util.redshift;

import static org.jooq.util.postgres.PostgresDSL.oid;
import static org.jooq.util.redshift.information_schema.Tables.TABLES;
import static org.jooq.util.redshift.pg_catalog.Tables.PG_CLASS;
import static org.jooq.util.redshift.pg_catalog.Tables.PG_DESCRIPTION;
import static org.jooq.util.redshift.pg_catalog.Tables.PG_NAMESPACE;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;
import org.jooq.tools.JooqLogger;
import org.jooq.util.AbstractDatabase;
import org.jooq.util.ArrayDefinition;
import org.jooq.util.DefaultRelations;
import org.jooq.util.EnumDefinition;
import org.jooq.util.PackageDefinition;
import org.jooq.util.RoutineDefinition;
import org.jooq.util.SchemaDefinition;
import org.jooq.util.SequenceDefinition;
import org.jooq.util.TableDefinition;
import org.jooq.util.UDTDefinition;

/**
 * The Amazon Redshift Database
 *
 * @author Lukas Eder
 */
public class RedshiftDatabase extends AbstractDatabase {

    private static final JooqLogger log = JooqLogger.getLogger(RedshiftDatabase.class);

    @Override
    protected DSLContext create0() {
        return DSL.using(getConnection(), SQLDialect.REDSHIFT);
    }

    @Override
    protected void loadPrimaryKeys(DefaultRelations r) throws SQLException {}

    @Override
    protected void loadUniqueKeys(DefaultRelations r) throws SQLException {}

    @Override
    protected void loadForeignKeys(DefaultRelations r) throws SQLException {}

    @Override
    protected void loadCheckConstraints(DefaultRelations r) throws SQLException {}

    @Override
    protected List<SchemaDefinition> getSchemata0() throws SQLException {
        List<SchemaDefinition> result = new ArrayList<SchemaDefinition>();

        // [#1409] Shouldn't select from INFORMATION_SCHEMA.SCHEMATA, as that
        // would only return schemata of which CURRENT_USER is the owner
        for (String name : create()
                .select(PG_NAMESPACE.NSPNAME)
                .from(PG_NAMESPACE)
                .fetch(PG_NAMESPACE.NSPNAME)) {

            result.add(new SchemaDefinition(this, name, ""));
        }

        return result;
    }

    @Override
    protected List<TableDefinition> getTables0() throws SQLException {
        List<TableDefinition> result = new ArrayList<TableDefinition>();

        for (Record record : create()
                .select(
                    TABLES.TABLE_SCHEMA,
                    TABLES.TABLE_NAME,
                    PG_DESCRIPTION.DESCRIPTION)
                .from(TABLES)
                .join(PG_NAMESPACE)
                    .on(TABLES.TABLE_SCHEMA.eq(PG_NAMESPACE.NSPNAME))
                .join(PG_CLASS)
                    .on(PG_CLASS.RELNAME.eq(TABLES.TABLE_NAME))
                    .and(PG_CLASS.RELNAMESPACE.eq(oid(PG_NAMESPACE)))
                .leftOuterJoin(PG_DESCRIPTION)
                    .on(PG_DESCRIPTION.OBJOID.eq(oid(PG_CLASS)))
                    .and(PG_DESCRIPTION.OBJSUBID.eq(0))
                .where(TABLES.TABLE_SCHEMA.in(getInputSchemata()))
                .orderBy(1, 2)
                .fetch()) {

            SchemaDefinition schema = getSchema(record.getValue(TABLES.TABLE_SCHEMA));
            String name = record.getValue(TABLES.TABLE_NAME);
            String comment = record.getValue(PG_DESCRIPTION.DESCRIPTION, String.class);

            RedshiftTableDefinition t = new RedshiftTableDefinition(schema, name, comment);
            result.add(t);
        }

        return result;
    }

    // The following features are not supported by Amazon Redshift
    // -------------------------------------------------------------------------

    @Override
    protected List<SequenceDefinition> getSequences0() throws SQLException {
        return new ArrayList<SequenceDefinition>();
    }

    @Override
    protected List<EnumDefinition> getEnums0() throws SQLException {
        return new ArrayList<EnumDefinition>();
    }

    @Override
    protected List<UDTDefinition> getUDTs0() throws SQLException {
        return new ArrayList<UDTDefinition>();
    }

    @Override
    protected List<ArrayDefinition> getArrays0() throws SQLException {
        return new ArrayList<ArrayDefinition>();
    }

    @Override
    protected List<RoutineDefinition> getRoutines0() throws SQLException {
        return new ArrayList<RoutineDefinition>();
    }

    @Override
    protected List<PackageDefinition> getPackages0() throws SQLException {
        return new ArrayList<PackageDefinition>();
    }
}
