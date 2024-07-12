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

import static org.jooq.impl.DSL.inline;
// ...
import static org.jooq.impl.DSL.one;
import static org.jooq.impl.DSL.select;
import static org.jooq.impl.DSL.unquotedName;
import static org.jooq.impl.DSL.withRecursive;
import static org.jooq.impl.Internal.iadd;
import static org.jooq.impl.Internal.imul;
import static org.jooq.impl.Internal.isub;
import static org.jooq.impl.Names.N_GENERATE_SERIES;
import static org.jooq.impl.Names.N_SYSTEM_RANGE;
import static org.jooq.impl.SQLDataType.INTEGER;
import static org.jooq.impl.Tools.visitSubquery;

import org.jooq.Clause;
import org.jooq.Context;
import org.jooq.Field;
import org.jooq.Name;
import org.jooq.Record1;
import org.jooq.TableOptions;

/**
 * @author Lukas Eder
 */
final class GenerateSeries extends AbstractTable<Record1<Integer>> {

    /**
     * Generated UID
     */
    private static final long    serialVersionUID = 2385574114457239818L;

    private final Field<Integer> from;
    private final Field<Integer> to;
    private final Field<Integer> step;

    GenerateSeries(Field<Integer> from, Field<Integer> to) {
        this(from, to, null);
    }

    GenerateSeries(Field<Integer> from, Field<Integer> to, Field<Integer> step) {
        super(TableOptions.expression(), N_GENERATE_SERIES);

        this.from = from;
        this.to = to;
        this.step = step;
    }

    @Override
    public final void accept(Context<?> ctx) {
        switch (ctx.family()) {








            case FIREBIRD:
            case HSQLDB:
            case SQLITE:
            case MARIADB:
            case MYSQL: {
                Name v = unquotedName("v");
                Field<Integer> f = DSL.field(v, INTEGER);
                visitSubquery(
                    ctx,
                    withRecursive(N_GENERATE_SERIES, v)
                        .as(select(from).unionAll(select(iadd(f, step == null ? inline(1) : step)).from(N_GENERATE_SERIES).where(f.lt(to))))
                        .select(f.as(N_GENERATE_SERIES)).from(N_GENERATE_SERIES),
                    true
                );

                break;
            }

            case H2: {
                if (step == null)
                    ctx.visit(N_SYSTEM_RANGE).sql('(').visit(from).sql(", ").visit(to).sql(')');
                else
                    ctx.visit(N_SYSTEM_RANGE).sql('(').visit(from).sql(", ").visit(to).sql(", ").visit(step).sql(')');

                break;
            }
























            case POSTGRES:
            default: {
                if (step == null)
                    ctx.visit(N_GENERATE_SERIES).sql('(').visit(from).sql(", ").visit(to).sql(')');
                else
                    ctx.visit(N_GENERATE_SERIES).sql('(').visit(from).sql(", ").visit(to).sql(", ").visit(step).sql(')');
            }
        }
    }

    @SuppressWarnings({ "unchecked", "rawtypes" })
    @Override
    public final Class<? extends Record1<Integer>> getRecordType() {
        return (Class) RecordImpl1.class;
    }

    @Override
    final Fields<Record1<Integer>> fields0() {
        return new Fields<>(DSL.field(N_GENERATE_SERIES, Integer.class));
    }

    @Override // Avoid AbstractTable implementation
    public final Clause[] clauses(Context<?> ctx) {
        return null;
    }
}
