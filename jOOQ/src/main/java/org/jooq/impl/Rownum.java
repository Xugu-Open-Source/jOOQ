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

import org.jooq.Context;
import org.jooq.Field;
import org.jooq.Function0;
import org.jooq.SQLDialect;

import java.util.Set;

final class Rownum extends AbstractField<Integer> implements NamedField<Integer>, QOM.Rownum {
    static final Set<SQLDialect> NATIVE_SUPPORT = SQLDialect.supportedBy(new SQLDialect[]{SQLDialect.XUGU});

    Rownum() {
        super(Names.N_ROWNUM, Tools.allNotNull(SQLDataType.INTEGER));
    }

    @Override
    public final void accept(Context<?> ctx) {
        ctx.visit(Names.N_ROWNUM);
    }

    @Override
    public final Function0<? extends QOM.Rownum> $constructor() {
        return () -> new Rownum();
    }

    @Override
    public boolean equals(Object that) {
        if (that instanceof QOM.Rownum) {
            QOM.Rownum o = (QOM.Rownum) that;
            return true;
        } else {
            return super.equals(that);
        }
    }
}


















































