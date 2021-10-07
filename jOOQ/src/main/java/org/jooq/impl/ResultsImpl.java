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
package org.jooq.impl;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

import org.jooq.Configuration;
import org.jooq.Record;
import org.jooq.Result;
import org.jooq.ResultOrRows;
import org.jooq.Results;
import org.jooq.exception.DataAccessException;

/**
 * @author Lukas Eder
 */
final class ResultsImpl extends AbstractList<Result<Record>> implements Results {

    private Configuration     configuration;
    final List<ResultOrRows>  resultsOrRows;

    ResultsImpl(Configuration configuration) {
        this.configuration = configuration;
        this.resultsOrRows = new ArrayList<>();
    }

    // ------------------------------------------------------------------------
    // XXX: Additional, Results-specific methods
    // ------------------------------------------------------------------------

    @Override
    public final List<ResultOrRows> resultsOrRows() {
        return resultsOrRows;
    }

    // -------------------------------------------------------------------------
    // XXX: Attachable API
    // -------------------------------------------------------------------------

    @Override
    public final void attach(Configuration c) {
        this.configuration = c;

        for (Result<?> result : this)
            if (result != null)
                result.attach(c);
    }

    @Override
    public final void detach() {
        attach(null);
    }

    @Override
    public final Configuration configuration() {
        return configuration;
    }

    // -------------------------------------------------------------------------
    // XXX Object API
    // -------------------------------------------------------------------------

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        String separator = "";

        for (ResultOrRows result : resultsOrRows) {
            if (result.result() != null)
                sb.append(separator).append("Result set:\n").append(result.result());
            else if (result.exception() != null)
                sb.append(separator).append("Exception: ").append(result.exception().getMessage());
            else
                sb.append(separator).append("Update count: ").append(result.rows());

            separator = "\n";
        }

        return sb.toString();
    }

    @Override
    public int hashCode() {
        return resultsOrRows.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (obj instanceof ResultsImpl)
            return resultsOrRows.equals(((ResultsImpl) obj).resultsOrRows);

        return false;
    }

    // -------------------------------------------------------------------------
    // XXX: List API
    // -------------------------------------------------------------------------

    @Override
    public final int size() {
        return list().size();
    }

    @Override
    public final Result<Record> get(int index) {
        return list().get(index);
    }

    @Override
    public Result<Record> set(int index, Result<Record> element) {
        return resultsOrRows.set(translatedIndex(index), new ResultOrRowsImpl(element)).result();
    }

    @Override
    public void add(int index, Result<Record> element) {
        resultsOrRows.add(translatedIndex(index), new ResultOrRowsImpl(element));
    }

    @Override
    public Result<Record> remove(int index) {
        return resultsOrRows.remove(translatedIndex(index)).result();
    }

    @Override
    public void clear() {
        resultsOrRows.clear();
    }

    private final List<Result<Record>> list() {
        List<Result<Record>> list = new ArrayList<>();

        for (ResultOrRows result : resultsOrRows)
            if (result.result() != null)
                list.add(result.result());

        return list;
    }

    private final int translatedIndex(int index) {
        int translated = 0;

        for (int i = 0; i < index; i++)
            while (resultsOrRows.get(translated++).result() == null);

        return translated;
    }

    static final /* record */ class ResultOrRowsImpl implements ResultOrRows { private final Result<Record> result; private final int rows; private final DataAccessException exception; public ResultOrRowsImpl(Result<Record> result, int rows, DataAccessException exception) { this.result = result; this.rows = rows; this.exception = exception; } public Result<Record> result() { return result; } public int rows() { return rows; } public DataAccessException exception() { return exception; } @Override public boolean equals(Object o) { if (!(o instanceof ResultOrRowsImpl)) return false; ResultOrRowsImpl other = (ResultOrRowsImpl) o; if (!java.util.Objects.equals(this.result, other.result)) return false; if (!java.util.Objects.equals(this.rows, other.rows)) return false; if (!java.util.Objects.equals(this.exception, other.exception)) return false; return true; } @Override public int hashCode() { return java.util.Objects.hash(this.result, this.rows, this.exception); }
        ResultOrRowsImpl(Result<Record> result) {
            this(result, result != null ? result.size() : 0, null);
        }

        ResultOrRowsImpl(int rows) {
            this(null, rows, null);
        }

        ResultOrRowsImpl(DataAccessException exception) {
            this(null, 0, exception);
        }

        @Override
        public String toString() {
            if (exception != null)
                return exception.toString();
            else if (result != null)
                return result.toString();
            else
                return "" + rows;
        }
    }
}
