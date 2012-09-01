/**
 * Copyright (c) 2009-2012, Lukas Eder, lukas.eder@gmail.com
 * All rights reserved.
 *
 * This software is licensed to you under the Apache License, Version 2.0
 * (the "License"); You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * . Redistributions of source code must retain the above copyright notice, this
 *   list of conditions and the following disclaimer.
 *
 * . Redistributions in binary form must reproduce the above copyright notice,
 *   this list of conditions and the following disclaimer in the documentation
 *   and/or other materials provided with the distribution.
 *
 * . Neither the name "jOOQ" nor the names of its contributors may be
 *   used to endorse or promote products derived from this software without
 *   specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 */
package org.jooq;

import java.util.Collection;

/**
 * A model type for a tuple with degree <code>2</code>
 * <p>
 * Note: Not all databases support tuples, but many tuple operations can be
 * simulated on all databases. See relevant tuple method Javadocs for details.
 *
 * @author Lukas Eder
 */
public interface Tuple2<T1, T2> extends Tuple {

    // ------------------------------------------------------------------------
    // Field accessors
    // ------------------------------------------------------------------------

    /**
     * Get the first field
     */
    Field<T1> field1();

    /**
     * Get the second field
     */
    Field<T2> field2();

    // ------------------------------------------------------------------------
    // Tuple DSL API
    // ------------------------------------------------------------------------

    /**
     * Compare this tuple with another tuple for equality
     * <p>
     * Tuple equality comparison predicates can be simulated in those databases
     * that do not support such predicates natively:
     * <code>(A, B) = (1, 2)</code> is equivalent to
     * <code>A = 1 AND B = 2</code>
     */
    @Support
    Condition equal(Tuple2<T1, T2> tuple);

    /**
     * Compare this tuple with another tuple for equality
     * <p>
     * Tuple equality comparison predicates can be simulated in those databases
     * that do not support such predicates natively:
     * <code>(A, B) = (1, 2)</code> is equivalent to
     * <code>A = 1 AND B = 2</code>
     */
    @Support
    Condition equal(T1 t1, T2 t2);

    /**
     * Compare this tuple with another tuple for equality
     * <p>
     * Tuple equality comparison predicates can be simulated in those databases
     * that do not support such predicates natively:
     * <code>(A, B) = (1, 2)</code> is equivalent to
     * <code>A = 1 AND B = 2</code>
     */
    @Support
    Condition equal(Field<T1> t1, Field<T2> t2);

    /**
     * Compare this tuple with another tuple for equality
     * <p>
     * Tuple equality comparison predicates can be simulated in those databases
     * that do not support such predicates natively:
     * <code>(A, B) = (1, 2)</code> is equivalent to
     * <code>A = 1 AND B = 2</code>
     */
    @Support
    Condition eq(Tuple2<T1, T2> tuple);

    /**
     * Compare this tuple with another tuple for equality
     * <p>
     * Tuple equality comparison predicates can be simulated in those databases
     * that do not support such predicates natively:
     * <code>(A, B) = (1, 2)</code> is equivalent to
     * <code>A = 1 AND B = 2</code>
     */
    @Support
    Condition eq(T1 t1, T2 t2);

    /**
     * Compare this tuple with another tuple for equality
     * <p>
     * Tuple equality comparison predicates can be simulated in those databases
     * that do not support such predicates natively:
     * <code>(A, B) = (1, 2)</code> is equivalent to
     * <code>A = 1 AND B = 2</code>
     */
    @Support
    Condition eq(Field<T1> t1, Field<T2> t2);

    /**
     * Compare this tuple with another tuple for non-equality
     * <p>
     * Tuple non-equality comparison predicates can be simulated in those
     * databases that do not support such predicates natively:
     * <code>(A, B) <> (1, 2)</code> is equivalent to
     * <code>NOT(A = 1 AND B = 2)</code>
     */
    @Support
    Condition notEqual(Tuple2<T1, T2> tuple);

    /**
     * Compare this tuple with another tuple for non-equality
     * <p>
     * Tuple non-equality comparison predicates can be simulated in those
     * databases that do not support such predicates natively:
     * <code>(A, B) <> (1, 2)</code> is equivalent to
     * <code>NOT(A = 1 AND B = 2)</code>
     */
    @Support
    Condition notEqual(T1 t1, T2 t2);

    /**
     * Compare this tuple with another tuple for non-equality
     * <p>
     * Tuple non-equality comparison predicates can be simulated in those
     * databases that do not support such predicates natively:
     * <code>(A, B) <> (1, 2)</code> is equivalent to
     * <code>NOT(A = 1 AND B = 2)</code>
     */
    @Support
    Condition notEqual(Field<T1> t1, Field<T2> t2);

    /**
     * Compare this tuple with another tuple for non-equality
     * <p>
     * Tuple non-equality comparison predicates can be simulated in those
     * databases that do not support such predicates natively:
     * <code>(A, B) <> (1, 2)</code> is equivalent to
     * <code>NOT(A = 1 AND B = 2)</code>
     */
    @Support
    Condition ne(Tuple2<T1, T2> tuple);

    /**
     * Compare this tuple with another tuple for non-equality
     * <p>
     * Tuple non-equality comparison predicates can be simulated in those
     * databases that do not support such predicates natively:
     * <code>(A, B) <> (1, 2)</code> is equivalent to
     * <code>NOT(A = 1 AND B = 2)</code>
     */
    @Support
    Condition ne(T1 t1, T2 t2);

    /**
     * Compare this tuple with another tuple for non-equality
     * <p>
     * Tuple non-equality comparison predicates can be simulated in those
     * databases that do not support such predicates natively:
     * <code>(A, B) <> (1, 2)</code> is equivalent to
     * <code>NOT(A = 1 AND B = 2)</code>
     */
    @Support
    Condition ne(Field<T1> t1, Field<T2> t2);

    /**
     * Compare this tuple with a set of tuples for equality
     * <p>
     * Tuple IN predicates can be simulated in those databases that do not
     * support such predicates natively: <code>(A, B) IN ((1, 2), (3, 4))</code>
     * is equivalent to <code>((A, B) = (1, 2)) OR ((A, B) = (3, 4))</code>,
     * which is equivalent to
     * <code>(A = 1 AND B = 2) OR (A = 3 AND B = 4)</code>
     */
    @Support
    Condition in(Collection<? extends Tuple2<T1, T2>> tuples);

    /**
     * Compare this tuple with a set of tuples for equality
     * <p>
     * Tuple IN predicates can be simulated in those databases that do not
     * support such predicates natively: <code>(A, B) IN ((1, 2), (3, 4))</code>
     * is equivalent to <code>((A, B) = (1, 2)) OR ((A, B) = (3, 4))</code>,
     * which is equivalent to
     * <code>(A = 1 AND B = 2) OR (A = 3 AND B = 4)</code>
     */
    @Support
    Condition in(Tuple2<T1, T2>... tuples);

    /**
     * Compare this tuple with a set of tuples for equality
     * <p>
     * Tuple NOT IN predicates can be simulated in those databases that do not
     * support such predicates natively:
     * <code>(A, B) NOT IN ((1, 2), (3, 4))</code> is equivalent to
     * <code>NOT(((A, B) = (1, 2)) OR ((A, B) = (3, 4)))</code>, which is
     * equivalent to <code>NOT((A = 1 AND B = 2) OR (A = 3 AND B = 4))</code>
     */
    @Support
    Condition notIn(Collection<? extends Tuple2<T1, T2>> tuples);

    /**
     * Compare this tuple with a set of tuples for equality
     * <p>
     * Tuple NOT IN predicates can be simulated in those databases that do not
     * support such predicates natively:
     * <code>(A, B) NOT IN ((1, 2), (3, 4))</code> is equivalent to
     * <code>NOT(((A, B) = (1, 2)) OR ((A, B) = (3, 4)))</code>, which is
     * equivalent to <code>NOT((A = 1 AND B = 2) OR (A = 3 AND B = 4))</code>
     */
    @Support
    Condition notIn(Tuple2<T1, T2>... tuples);

    /**
     * Check if this tuple overlaps another tuple
     * <p>
     * The SQL standard specifies a temporal <code>OVERLAPS</code> predicate,
     * which comes in two flavours:
     * <ul>
     * <li><code>(DATE, DATE) OVERLAPS (DATE, DATE)</code></li>
     * <li><code>(DATE, INTERVAL) OVERLAPS (DATE, INTERVAL)</code></li>
     * </ul>
     * <p>
     * jOOQ also supports arbitrary 2-degree tuple comparisons, by simulating
     * them as such <code><pre>
     * -- This predicate
     * (A, B) OVERLAPS (C, D)
     *
     * -- can be simulated as such
     * (C &lt;= B) AND (A &lt;= D)
     * </pre></code>
     */
    @Support
    Condition overlaps(T1 t1, T2 t2);

    /**
     * Check if this tuple overlaps another tuple
     * <p>
     * The SQL standard specifies a temporal <code>OVERLAPS</code> predicate,
     * which comes in two flavours:
     * <ul>
     * <li><code>(DATE, DATE) OVERLAPS (DATE, DATE)</code></li>
     * <li><code>(DATE, INTERVAL) OVERLAPS (DATE, INTERVAL)</code></li>
     * </ul>
     * <p>
     * jOOQ also supports arbitrary 2-degree tuple comparisons, by simulating
     * them as such <code><pre>
     * -- This predicate
     * (A, B) OVERLAPS (C, D)
     *
     * -- can be simulated as such
     * (C &lt;= B) AND (A &lt;= D)
     * </pre></code>
     */
    @Support
    Condition overlaps(Field<T1> t1, Field<T2> t2);

    /**
     * Check if this tuple overlaps another tuple
     * <p>
     * The SQL standard specifies a temporal <code>OVERLAPS</code> predicate,
     * which comes in two flavours:
     * <ul>
     * <li><code>(DATE, DATE) OVERLAPS (DATE, DATE)</code></li>
     * <li><code>(DATE, INTERVAL) OVERLAPS (DATE, INTERVAL)</code></li>
     * </ul>
     * <p>
     * jOOQ also supports arbitrary 2-degree tuple comparisons, by simulating
     * them as such <code><pre>
     * -- This predicate
     * (A, B) OVERLAPS (C, D)
     *
     * -- can be simulated as such
     * (C &lt;= B) AND (A &lt;= D)
     * </pre></code>
     */
    @Support
    Condition overlaps(Tuple2<T1, T2> tuple);
}
