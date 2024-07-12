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
import static org.jooq.impl.Internal.isub;
import static org.jooq.impl.Names.N_HEX;
import static org.jooq.impl.Names.N_LEN;
import static org.jooq.impl.Names.N_LENGTH;
import static org.jooq.impl.Names.N_REPLACE;
import static org.jooq.impl.Names.N_RPAD;
import static org.jooq.impl.Names.N_SPACE;
import static org.jooq.impl.Names.N_SUBSTR;
import static org.jooq.impl.Names.N_ZEROBLOB;
import static org.jooq.impl.SQLDataType.VARCHAR;

import org.jooq.Context;
import org.jooq.Field;

/**
 * @author Lukas Eder
 */
final class Rpad extends AbstractField<String> {

    /**
     * Generated UID
     */
    private static final long             serialVersionUID = -7273879239726265322L;

    private final Field<String>           field;
    private final Field<? extends Number> length;
    private final Field<String>           character;

    Rpad(Field<String> field, Field<? extends Number> length) {
        this(field, length, null);
    }

    Rpad(Field<String> field, Field<? extends Number> length, Field<String> character) {
        super(N_RPAD, VARCHAR);

        this.field = field;
        this.length = length;
        this.character = (character == null ? inline(" ") : character);
    }

    @Override
    public final void accept(Context<?> ctx) {
        switch (ctx.family()) {













            // This beautiful expression was contributed by "Ludo", here:
            // http://stackoverflow.com/questions/6576343/how-to-simulate-lpad-rpad-with-sqlite
            case SQLITE:
                ctx.visit(field).sql(" || ").visit(N_SUBSTR).sql('(')
                    .visit(N_REPLACE).sql('(')
                        .visit(N_HEX).sql('(')
                            .visit(N_ZEROBLOB).sql('(')
                                .visit(length)
                        .sql(")), '00', ").visit(character)
                    .sql("), 1, ").visit(length).sql(" - ").visit(N_LENGTH).sql('(').visit(field).sql(')')
                .sql(')');
                break;

            default:
                ctx.visit(N_RPAD).sql('(').visit(field).sql(", ").visit(length).sql(", ").visit(character).sql(')');
                break;
        }
    }
}
