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
package org.jooq;

import org.jetbrains.annotations.NotNull;

public interface SelectConnectByAfterStartWithConditionStep<R extends Record> extends SelectGroupByStep<R> {

    @Support({SQLDialect.XUGU})
    @NotNull
    SelectConnectByAfterStartWithConditionStep<R> and(Condition condition);

    @Support({SQLDialect.XUGU})
    @NotNull
    SelectConnectByAfterStartWithConditionStep<R> and(Field<Boolean> condition);

    @Support({SQLDialect.XUGU})
    @PlainSQL
    @NotNull
    SelectConnectByAfterStartWithConditionStep<R> and(SQL sql);

    @Support({SQLDialect.XUGU})
    @PlainSQL
    @NotNull
    SelectConnectByAfterStartWithConditionStep<R> and(String sql);

    @Support({SQLDialect.XUGU})
    @PlainSQL
    @NotNull
    SelectConnectByAfterStartWithConditionStep<R> and(String sql, Object... bindings);

    @Support({SQLDialect.XUGU})
    @PlainSQL
    @NotNull
    SelectConnectByAfterStartWithConditionStep<R> and(String sql, QueryPart... parts);
}
