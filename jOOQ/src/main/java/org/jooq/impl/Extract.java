/**
 * Copyright (c) 2009-2014, Data Geekery GmbH (http://www.datageekery.com)
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

package org.jooq.impl;

import static org.jooq.impl.DSL.field;
import static org.jooq.impl.DSL.function;

import org.jooq.Configuration;
import org.jooq.DatePart;
import org.jooq.Field;
import org.jooq.exception.SQLDialectNotSupportedException;

/**
 * @author Lukas Eder
 */
class Extract extends AbstractFunction<Integer> {

    private static final long serialVersionUID = 3748640920856031034L;

    private final Field<?>    field;
    private final DatePart    datePart;

    Extract(Field<?> field, DatePart datePart) {
        super("extract", SQLDataType.INTEGER, field);

        this.field = field;
        this.datePart = datePart;
    }

    @Override
    final Field<Integer> getFunction0(Configuration configuration) {
        switch (configuration.dialect().family()) {
            case SQLITE:
                switch (datePart) {
                    case YEAR:
                        return field("{strftime}('%Y', {0})", SQLDataType.INTEGER, field);
                    case MONTH:
                        return field("{strftime}('%m', {0})", SQLDataType.INTEGER, field);
                    case DAY:
                        return field("{strftime}('%d', {0})", SQLDataType.INTEGER, field);
                    case HOUR:
                        return field("{strftime}('%H', {0})", SQLDataType.INTEGER, field);
                    case MINUTE:
                        return field("{strftime}('%M', {0})", SQLDataType.INTEGER, field);
                    case SECOND:
                        return field("{strftime}('%S', {0})", SQLDataType.INTEGER, field);
                    default:
                        throw new SQLDialectNotSupportedException("DatePart not supported: " + datePart);
                }

            /* [pro] */
            case DB2:
            /* [/pro] */
            case DERBY:
                switch (datePart) {
                    case YEAR:
                        return function("year", SQLDataType.INTEGER, field);
                    case MONTH:
                        return function("month", SQLDataType.INTEGER, field);
                    case DAY:
                        return function("day", SQLDataType.INTEGER, field);
                    case HOUR:
                        return function("hour", SQLDataType.INTEGER, field);
                    case MINUTE:
                        return function("minute", SQLDataType.INTEGER, field);
                    case SECOND:
                        return function("second", SQLDataType.INTEGER, field);
                    default:
                        throw new SQLDialectNotSupportedException("DatePart not supported: " + datePart);
                }

            /* [pro] */

            case ACCESS:
                switch (datePart) {
                    case YEAR:
                        return field("{datepart}('yyyy', {0})", SQLDataType.INTEGER, field);
                    case MONTH:
                        return field("{datepart}('m', {0})", SQLDataType.INTEGER, field);
                    case DAY:
                        return field("{datepart}('d', {0})", SQLDataType.INTEGER, field);
                    case HOUR:
                        return field("{datepart}('h', {0})", SQLDataType.INTEGER, field);
                    case MINUTE:
                        return field("{datepart}('n', {0})", SQLDataType.INTEGER, field);
                    case SECOND:
                        return field("{datepart}('s', {0})", SQLDataType.INTEGER, field);
                    default:
                        throw new SQLDialectNotSupportedException("DatePart not supported: " + datePart);
                }

            case ORACLE:
                switch (datePart) {
                    case YEAR:
                        return field("{to_char}({0}, 'YYYY')", SQLDataType.INTEGER, field);
                    case MONTH:
                        return field("{to_char}({0}, 'MM')", SQLDataType.INTEGER, field);
                    case DAY:
                        return field("{to_char}({0}, 'DD')", SQLDataType.INTEGER, field);
                    case HOUR:
                        return field("{to_char}({0}, 'HH24')", SQLDataType.INTEGER, field);
                    case MINUTE:
                        return field("{to_char}({0}, 'MI')", SQLDataType.INTEGER, field);
                    case SECOND:
                        return field("{to_char}({0}, 'SS')", SQLDataType.INTEGER, field);
                    default:
                        throw new SQLDialectNotSupportedException("DatePart not supported: " + datePart);
                }

            case ASE:
            case SQLSERVER:
            case SYBASE:
                switch (datePart) {
                    case YEAR:
                        return field("{datepart}(yy, {0})", SQLDataType.INTEGER, field);
                    case MONTH:
                        return field("{datepart}(mm, {0})", SQLDataType.INTEGER, field);
                    case DAY:
                        return field("{datepart}(dd, {0})", SQLDataType.INTEGER, field);
                    case HOUR:
                        return field("{datepart}(hh, {0})", SQLDataType.INTEGER, field);
                    case MINUTE:
                        return field("{datepart}(mi, {0})", SQLDataType.INTEGER, field);
                    case SECOND:
                        return field("{datepart}(ss, {0})", SQLDataType.INTEGER, field);
                    default:
                        throw new SQLDialectNotSupportedException("DatePart not supported: " + datePart);
                }

            case INGRES:
            /* [/pro] */
            case MARIADB:
            case MYSQL:
            case POSTGRES:
            case HSQLDB:
            case H2:

            // A default implementation is necessary for hashCode() and toString()
            default:
                return field("{extract}({" + datePart.toSQL() + " from} {0})", SQLDataType.INTEGER, field);
        }
    }
}
