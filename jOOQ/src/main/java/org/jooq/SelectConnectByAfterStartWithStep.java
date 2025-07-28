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

public interface SelectConnectByAfterStartWithStep<R extends Record> {

    @Support({SQLDialect.XUGU})
    @NotNull
    SelectConnectByAfterStartWithConditionStep<R> connectBy(Condition condition);

    @Support({SQLDialect.XUGU})
    @NotNull
    SelectConnectByAfterStartWithConditionStep<R> connectBy(Field<Boolean> condition);

    @Support({SQLDialect.XUGU})
    @PlainSQL
    @NotNull
    SelectConnectByAfterStartWithConditionStep<R> connectBy(SQL sql);

    @Support({SQLDialect.XUGU})
    @PlainSQL
    @NotNull
    SelectConnectByAfterStartWithConditionStep<R> connectBy(String sql);

    @Support({SQLDialect.XUGU})
    @PlainSQL
    @NotNull
    SelectConnectByAfterStartWithConditionStep<R> connectBy(String sql, Object... bindings);

    @Support({SQLDialect.XUGU})
    @PlainSQL
    @NotNull
    SelectConnectByAfterStartWithConditionStep<R> connectBy(String sql, QueryPart... parts);

    @Support({SQLDialect.XUGU})
    @NotNull
    SelectConnectByAfterStartWithConditionStep<R> connectByNoCycle(Condition condition);

    @Support({SQLDialect.XUGU})
    @NotNull
    SelectConnectByAfterStartWithConditionStep<R> connectByNoCycle(Field<Boolean> condition);

    @Support({SQLDialect.XUGU})
    @PlainSQL
    @NotNull
    SelectConnectByAfterStartWithConditionStep<R> connectByNoCycle(SQL sql);

    @Support({SQLDialect.XUGU})
    @PlainSQL
    @NotNull
    SelectConnectByAfterStartWithConditionStep<R> connectByNoCycle(String sql);

    @Support({SQLDialect.XUGU})
    @PlainSQL
    @NotNull
    SelectConnectByAfterStartWithConditionStep<R> connectByNoCycle(String sql, Object... bindings);

    @Support({SQLDialect.XUGU})
    @PlainSQL
    @NotNull
    SelectConnectByAfterStartWithConditionStep<R> connectByNoCycle(String sql, QueryPart... parts);
}
