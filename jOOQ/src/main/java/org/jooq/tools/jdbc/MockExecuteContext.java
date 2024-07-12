/*
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
 * Other licenses:
 * -----------------------------------------------------------------------------
 * Commercial licenses for this work are available. These replace the above
 * ASL 2.0 and offer limited warranties, support, maintenance, and commercial
 * database integrations.
 *
 * For more information, please visit: http://www.jooq.org/licenses
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */
package org.jooq.tools.jdbc;

import java.sql.Statement;

import org.jooq.DSLContext;
import org.jooq.Query;

/**
 * A mock execution context.
 * <p>
 * This context is passed to
 * {@link MockDataProvider#execute(MockExecuteContext)}, as a context object
 * containing all relevant information about a given query execution.
 *
 * @author Lukas Eder
 * @see MockDataProvider
 */
public class MockExecuteContext {

    private final String[]   sql;
    private final Object[][] bindings;

    private final int        autoGeneratedKeys;
    private final int[]      columnIndexes;
    private final String[]   columnNames;

    private final int[]      outParameterTypes;

    /**
     * Create a new mock execution context.
     *
     * @param sql The SQL statement(s)
     * @param bindings The bind variable(s)
     */
    public MockExecuteContext(String[] sql, Object[][] bindings) {
        this(sql, bindings, Statement.NO_GENERATED_KEYS, null, null, null);
    }

    /**
     * Create a new mock execution context.
     *
     * @param sql The SQL statement(s)
     * @param bindings The bind variable(s)
     * @param autoGeneratedKeys The corresponding value from
     *            <code>MockStatement</code>
     */
    public MockExecuteContext(String[] sql, Object[][] bindings, int autoGeneratedKeys) {
        this(sql, bindings, autoGeneratedKeys, null, null, null);
    }

    /**
     * Create a new mock execution context.
     * <p>
     *
     * @param sql The SQL statement(s)
     * @param bindings The bind variable(s)
     * @param columnIndexes The corresponding value from
     *            <code>MockStatement</code>
     */
    public MockExecuteContext(String[] sql, Object[][] bindings, int[] columnIndexes) {
        this(sql, bindings, Statement.RETURN_GENERATED_KEYS, columnIndexes, null, null);
    }

    /**
     * Create a new mock execution context.
     * <p>
     *
     * @param sql The SQL statement(s)
     * @param bindings The bind variable(s)
     * @param columnNames The corresponding value from
     *            <code>MockStatement</code>
     */
    public MockExecuteContext(String[] sql, Object[][] bindings, String[] columnNames) {
        this(sql, bindings, Statement.RETURN_GENERATED_KEYS, null, columnNames, null);
    }

    MockExecuteContext(
        String[] sql,
        Object[][] bindings,
        int autoGeneratedKeys,
        int[] columnIndexes,
        String[] columnNames,
        int[] outParameterTypes
    ) {
        this.sql = sql;
        this.bindings = bindings;
        this.autoGeneratedKeys = autoGeneratedKeys;
        this.columnIndexes = columnIndexes;
        this.columnNames = columnNames;
        this.outParameterTypes = outParameterTypes;
    }

    /**
     * Whether this execution context is a from a batch statement.
     *
     * @return Whether this execution context is a from a batch statement.
     */
    public boolean batch() {
        return batchSingle() || batchMultiple();
    }

    /**
     * Whether this execution context is from a "single batch" statement.
     *
     * @return Whether this execution context is from a "single batch"
     *         statement.
     * @see DSLContext#batch(Query)
     */
    public boolean batchSingle() {
        return bindings.length > 1;
    }

    /**
     * Whether this execution context is from a "multi batch" statement.
     *
     * @return Whether this execution context is from a "multi batch" statement.
     * @see DSLContext#batch(Query...)
     */
    public boolean batchMultiple() {
        return sql.length > 1;
    }

    /**
     * Get all batch SQL statements of a "multi batch" statement.
     *
     * @return All batch SQL statements of a "multi batch" statement, or an
     *         array of length <code>1</code> with the single statement.
     */
    public String[] batchSQL() {
        return sql;
    }

    /**
     * Get all bind variables of a "single batch" statement.
     *
     * @return All bind variables of a "single batch" statment, or an array of
     *         length <code>1</code> with the bind variables of a single
     *         statement.
     */
    public Object[][] batchBindings() {
        return bindings;
    }

    /**
     * Get the single (or first "multi batch") SQL statement.
     *
     * @return The single (or first "multi batch") SQL statement.
     */
    public String sql() {
        return sql[0];
    }

    /**
     * Get the single (or first "single batch") set of bind variables.
     *
     * @return The single (or first "single batch") set of bind variables.
     */
    public Object[] bindings() {
        return (bindings != null && bindings.length > 0) ? bindings[0] : new Object[0];
    }

    /**
     * The corresponding value from <code>MockStatement</code>.
     *
     * @return The corresponding value from <code>MockStatement</code>.
     */
    public int autoGeneratedKeys() {
        return autoGeneratedKeys;
    }

    /**
     * The corresponding value from <code>MockStatement</code>.
     *
     * @return The corresponding value from <code>MockStatement</code>.
     */
    public int[] columnIndexes() {
        return columnIndexes;
    }

    /**
     * The corresponding value from <code>MockStatement</code>.
     *
     * @return The corresponding value from <code>MockStatement</code>.
     */
    public String[] columnNames() {
        return columnNames;
    }

    /**
     * Get the types of registered out parameters, if any.
     *
     * @return the types of registered out parameters, if any.
     */
    public int[] outParameterTypes() {
        return outParameterTypes == null ? new int[0] : outParameterTypes.clone();
    }
}
