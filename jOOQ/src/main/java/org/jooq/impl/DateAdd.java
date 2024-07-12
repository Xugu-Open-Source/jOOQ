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

import static org.jooq.DatePart.DAY;
import static org.jooq.impl.DSL.inline;
import static org.jooq.impl.DSL.sql;
import static org.jooq.impl.Keywords.K_AS;
import static org.jooq.impl.Keywords.K_CAST;
import static org.jooq.impl.Keywords.K_DAY;
import static org.jooq.impl.Keywords.K_HOUR;
import static org.jooq.impl.Keywords.K_INTERVAL;
import static org.jooq.impl.Keywords.K_MINUTE;
import static org.jooq.impl.Keywords.K_SECOND;
import static org.jooq.impl.Names.N_ADD_MONTHS;
import static org.jooq.impl.Names.N_DATEADD;
import static org.jooq.impl.Names.N_DATE_ADD;
import static org.jooq.impl.Names.N_STRFTIME;
import static org.jooq.impl.Names.N_TIMESTAMPADD;

import org.jooq.Context;
import org.jooq.DatePart;
import org.jooq.Field;
import org.jooq.Keyword;

/**
 * @author Lukas Eder
 */
final class DateAdd<T> extends AbstractField<T> {

    /**
     * Generated UID
     */
    private static final long             serialVersionUID = -19593015886723235L;

    private final Field<T>                date;
    private final Field<? extends Number> interval;
    private final DatePart                datePart;

    DateAdd(Field<T> date, Field<? extends Number> interval, DatePart datePart) {
        super(N_DATEADD, date.getDataType());

        this.date = date;
        this.interval = interval;
        this.datePart = datePart;
    }

    @Override
    public final void accept(Context<?> ctx) {
        Keyword keyword = null;
        String  string  = null;

        switch (ctx.family()) {




            case CUBRID:
            case MARIADB:
            case MYSQL: {
                ctx.visit(N_DATE_ADD).sql('(').visit(date).sql(", ").visit(K_INTERVAL).sql(' ').visit(interval).sql(' ').visit(standardKeyword()).sql(')');
                break;
            }

            case DERBY:
            case HSQLDB: {
                switch (datePart) {
                    case YEAR:   keyword = DSL.keyword("sql_tsi_year");   break;
                    case MONTH:  keyword = DSL.keyword("sql_tsi_month");  break;
                    case DAY:    keyword = DSL.keyword("sql_tsi_day");    break;
                    case HOUR:   keyword = DSL.keyword("sql_tsi_hour");   break;
                    case MINUTE: keyword = DSL.keyword("sql_tsi_minute"); break;
                    case SECOND: keyword = DSL.keyword("sql_tsi_second"); break;
                    default: throw unsupported();
                }

                ctx.sql("{fn ").visit(N_TIMESTAMPADD).sql('(').visit(keyword).sql(", ").visit(interval).sql(", ").visit(date).sql(") }");
                break;
            }

            case H2: {
                switch (datePart) {
                    case YEAR:   string = "year";   break;
                    case MONTH:  string = "month";  break;
                    case DAY:    string = "day";    break;
                    case HOUR:   string = "hour";   break;
                    case MINUTE: string = "minute"; break;
                    case SECOND: string = "second"; break;
                    default: throw unsupported();
                }

                ctx.visit(N_DATEADD).sql('(').visit(inline(string)).sql(", ").visit(interval).sql(", ").visit(date).sql(')');
                break;
            }










            case POSTGRES: {
                switch (datePart) {
                    case YEAR:   string = "1 year";   break;
                    case MONTH:  string = "1 month";  break;
                    case DAY:    string = "1 day";    break;
                    case HOUR:   string = "1 hour";   break;
                    case MINUTE: string = "1 minute"; break;
                    case SECOND: string = "1 second"; break;
                    default: throw unsupported();
                }

                if (getDataType().isDate())

                    // [#10258] Special case for DATE + INTEGER arithmetic
                    if (datePart == DAY)
                        ctx.sql('(').visit(date).sql(" + ").visit(interval).sql(')');

                    // [#3824] Ensure that the output for DATE arithmetic will also be of type DATE, not TIMESTAMP
                    else
                        ctx.sql('(').visit(date).sql(" + ").visit(interval).sql(" * ").visit(K_INTERVAL).sql(' ').visit(inline(string)).sql(")::date");

                else
                    ctx.sql('(').visit(date).sql(" + ").visit(interval).sql(" * ").visit(K_INTERVAL).sql(' ').visit(inline(string)).sql(")");

                break;
            }

            case SQLITE: {
                switch (datePart) {
                    case YEAR:   string = " year";   break;
                    case MONTH:  string = " month";  break;
                    case DAY:    string = " day";    break;
                    case HOUR:   string = " hour";   break;
                    case MINUTE: string = " minute"; break;
                    case SECOND: string = " second"; break;
                    default: throw unsupported();
                }

                ctx.visit(N_STRFTIME).sql("('%Y-%m-%d %H:%M:%f', ").visit(date).sql(", ").visit(interval.concat(inline(string))).sql(')');
                break;
            }










































































































            case FIREBIRD:
            default: {
                ctx.visit(N_DATEADD).sql('(').visit(standardKeyword()).sql(", ").visit(interval).sql(", ").visit(date).sql(')');
                break;
            }
        }
    }

    private final Keyword standardKeyword() {
        switch (datePart) {
            case YEAR:
            case MONTH:
            case DAY:
            case HOUR:
            case MINUTE:
            case SECOND:
                return datePart.toKeyword();

            default:
                throw unsupported();
        }
    }

    private final UnsupportedOperationException unsupported() {
        return new UnsupportedOperationException("Unknown date part : " + datePart);
    }
}
