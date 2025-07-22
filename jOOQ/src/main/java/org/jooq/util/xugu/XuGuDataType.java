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

package org.jooq.util.xugu;

import org.jooq.DataType;
import org.jooq.JSON;
import org.jooq.JSONB;
import org.jooq.SQLDialect;
import org.jooq.impl.DefaultDataType;
import org.jooq.impl.SQLDataType;
import org.jooq.types.UByte;
import org.jooq.types.UInteger;
import org.jooq.types.ULong;
import org.jooq.types.UShort;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.UUID;

/**
 * Supported data types for the {@link SQLDialect#XUGU} dialect
 *
 * @author Lukas Eder
 * @see <a href="http://dev.mysql.com/doc/refman/5.5/en/data-types.html">http://dev.mysql.com/doc/refman/5.5/en/data-types.html</a>
 * @see <a href="http://dev.mysql.com/doc/refman/5.5/en/cast-functions.html#function_cast">http://dev.mysql.com/doc/refman/5.5/en/cast-functions.html#function_cast</a>
 * @deprecated - 3.11.0 - [#7375] - This type is part of jOOQ's internal API. Do
 *             not reference this type directly from client code. Referencing
 *             this type before the {@link SQLDataType} class has been
 *             initialised may lead to deadlocks! See <a href=
 *             "https://github.com/jOOQ/jOOQ/issues/3777">https://github.com/jOOQ/jOOQ/issues/3777</a>
 *             for details.
 *             <p>
 *             Use the corresponding {@link SQLDataType} instead.
 */
@Deprecated
public class XuGuDataType {

    private static final SQLDialect FAMILY = SQLDialect.XUGU;

    // -------------------------------------------------------------------------
    // Default SQL data types and synonyms thereof
    // -------------------------------------------------------------------------

    public static final DataType<Byte>       TINYINT            = new DefaultDataType<>(FAMILY, SQLDataType.TINYINT, "tinyint", "signed");
    public static final DataType<UByte>      TINYINTUNSIGNED    = new DefaultDataType<>(FAMILY, SQLDataType.TINYINTUNSIGNED, "tinyint unsigned", "unsigned");
    public static final DataType<Short>      SMALLINT           = new DefaultDataType<>(FAMILY, SQLDataType.SMALLINT, "smallint", "signed");
    public static final DataType<UShort>     SMALLINTUNSIGNED   = new DefaultDataType<>(FAMILY, SQLDataType.SMALLINTUNSIGNED, "smallint unsigned", "unsigned");
    public static final DataType<Integer>    INT                = new DefaultDataType<>(FAMILY, SQLDataType.INTEGER, "int", "signed");
    public static final DataType<UInteger>   INTUNSIGNED        = new DefaultDataType<>(FAMILY, SQLDataType.INTEGERUNSIGNED, "int unsigned", "unsigned");
    public static final DataType<Integer>    MEDIUMINT          = new DefaultDataType<>(FAMILY, SQLDataType.INTEGER, "mediumint", "signed");
    public static final DataType<UInteger>   MEDIUMINTUNSIGNED  = new DefaultDataType<>(FAMILY, SQLDataType.INTEGERUNSIGNED, "mediumint unsigned", "unsigned");
    public static final DataType<Integer>    INTEGER            = new DefaultDataType<>(FAMILY, SQLDataType.INTEGER, "integer", "signed");
    public static final DataType<UInteger>   INTEGERUNSIGNED    = new DefaultDataType<>(FAMILY, SQLDataType.INTEGERUNSIGNED, "integer unsigned", "unsigned");
    public static final DataType<Long>       BIGINT             = new DefaultDataType<>(FAMILY, SQLDataType.BIGINT, "bigint", "signed");
    public static final DataType<ULong>      BIGINTUNSIGNED     = new DefaultDataType<>(FAMILY, SQLDataType.BIGINTUNSIGNED, "bigint unsigned", "unsigned");
    public static final DataType<Double>     DOUBLE             = new DefaultDataType<>(FAMILY, SQLDataType.DOUBLE, "double", "decimal");
    public static final DataType<Float>      REAL               = new DefaultDataType<>(FAMILY, SQLDataType.REAL, "real", "decimal");
    public static final DataType<Boolean>    BOOLEAN            = new DefaultDataType<>(FAMILY, SQLDataType.BOOLEAN, "boolean", "unsigned");
    public static final DataType<Boolean>    BOOL               = new DefaultDataType<>(FAMILY, SQLDataType.BOOLEAN, "bool", "unsigned");
    public static final DataType<BigDecimal> DECIMAL            = new DefaultDataType<>(FAMILY, SQLDataType.DECIMAL, "decimal", "decimal");
    public static final DataType<BigDecimal> DEC                = new DefaultDataType<>(FAMILY, SQLDataType.DECIMAL, "dec", "decimal");
    public static final DataType<String>     VARCHAR            = new DefaultDataType<>(FAMILY, SQLDataType.VARCHAR, "varchar", "char");
    public static final DataType<String>     CHAR               = new DefaultDataType<>(FAMILY, SQLDataType.CHAR, "char", "char");
    public static final DataType<String>     TEXT               = new DefaultDataType<>(FAMILY, SQLDataType.CLOB, "text", "char");
    public static final DataType<byte[]>     BLOB               = new DefaultDataType<>(FAMILY, SQLDataType.BLOB, "blob", "binary");
    public static final DataType<byte[]>     BINARY             = new DefaultDataType<>(FAMILY, SQLDataType.BINARY, "binary", "binary");
    public static final DataType<byte[]>     VARBINARY          = new DefaultDataType<>(FAMILY, SQLDataType.VARBINARY, "varbinary", "binary");
    public static final DataType<Date>       DATE               = new DefaultDataType<>(FAMILY, SQLDataType.DATE, "date", "date");
    public static final DataType<Time>       TIME               = new DefaultDataType<>(FAMILY, SQLDataType.TIME, "time", "time");
    public static final DataType<Timestamp>  TIMESTAMP          = new DefaultDataType<>(FAMILY, SQLDataType.TIMESTAMP, "timestamp", "datetime");
    public static final DataType<Timestamp>  DATETIME           = new DefaultDataType<>(FAMILY, SQLDataType.TIMESTAMP, "datetime", "datetime");

    // -------------------------------------------------------------------------
    // Compatibility types for supported SQLDialect.MYSQL, SQLDataTypes
    // -------------------------------------------------------------------------

    protected static final DataType<String>     __NCHAR         = new DefaultDataType<>(FAMILY, SQLDataType.NCHAR, "char", "char");
    protected static final DataType<String>     __NCLOB         = new DefaultDataType<>(FAMILY, SQLDataType.NCLOB, "clob", "char");
    protected static final DataType<String>     __LONGNVARCHAR  = new DefaultDataType<>(FAMILY, SQLDataType.LONGNVARCHAR, "varchar", "char");
    protected static final DataType<BigDecimal> __NUMERIC       = new DefaultDataType<>(FAMILY, SQLDataType.NUMERIC, "decimal", "decimal");
    protected static final DataType<String>     __NVARCHAR      = new DefaultDataType<>(FAMILY, SQLDataType.NVARCHAR, "varchar", "char");
    protected static final DataType<String>     __LONGVARCHAR   = new DefaultDataType<>(FAMILY, SQLDataType.LONGVARCHAR, "varchar", "char");
    protected static final DataType<byte[]>     __LONGVARBINARY = new DefaultDataType<>(FAMILY, SQLDataType.LONGVARBINARY, "varbinary", "binary");

    // -------------------------------------------------------------------------
    // Dialect-specific data types and synonyms thereof
    // -------------------------------------------------------------------------

    public static final DataType<String>     TINYTEXT           = new DefaultDataType<>(FAMILY, SQLDataType.CLOB, "tinytext", "char");
    public static final DataType<String>     MEDIUMTEXT         = new DefaultDataType<>(FAMILY, SQLDataType.CLOB, "mediumtext", "char");
    public static final DataType<String>     LONGTEXT           = new DefaultDataType<>(FAMILY, SQLDataType.CLOB, "longtext", "char");
    public static final DataType<String>     ENUM               = new DefaultDataType<>(FAMILY, SQLDataType.VARCHAR, "enum", "char");
    public static final DataType<String>     SET                = new DefaultDataType<>(FAMILY, SQLDataType.VARCHAR, "set", "char");
    public static final DataType<byte[]>     TINYBLOB           = new DefaultDataType<>(FAMILY, SQLDataType.BLOB, "tinyblob", "binary");
    public static final DataType<byte[]>     MEDIUMBLOB         = new DefaultDataType<>(FAMILY, SQLDataType.BLOB, "mediumblob", "binary");
    public static final DataType<byte[]>     LONGBLOB           = new DefaultDataType<>(FAMILY, SQLDataType.BLOB, "longblob", "binary");
    public static final DataType<Date>       YEAR               = new DefaultDataType<>(FAMILY, SQLDataType.DATE, "year", "date");
    public static final DataType<JSON>       JSON               = new DefaultDataType<>(FAMILY, SQLDataType.JSON, "json");

    // -------------------------------------------------------------------------
    // Compatibility types for supported Java types
    // -------------------------------------------------------------------------

    protected static final DataType<BigInteger> __BIGINTEGER    = new DefaultDataType<>(FAMILY, SQLDataType.DECIMAL_INTEGER, "decimal", "decimal");
    protected static final DataType<UUID>       __UUID          = new DefaultDataType<>(FAMILY, SQLDataType.UUID, "varchar", "char");
    protected static final DataType<JSONB>      __JSONB         = new DefaultDataType<>(FAMILY, SQLDataType.JSONB, "json");

    // 虚谷方言数据类型: https://help.xugudb.com/

    protected static final DataType<String> INTERVAL_YEAR = new DefaultDataType<>(FAMILY, String.class, "INTERVAL YEAR");
    protected static final DataType<String> INTERVAL_MONTH = new DefaultDataType<>(FAMILY, String.class, "INTERVAL MONTH");
    protected static final DataType<String> INTERVAL_DAY = new DefaultDataType<>(FAMILY, String.class, "INTERVAL DAY");
    protected static final DataType<String> INTERVAL_HOUR = new DefaultDataType<>(FAMILY, String.class, "INTERVAL HOUR");
    protected static final DataType<String> INTERVAL_MINUTE = new DefaultDataType<>(FAMILY, String.class, "INTERVAL MINUTE");
    protected static final DataType<String> INTERVAL_SECOND = new DefaultDataType<>(FAMILY, String.class, "INTERVAL SECOND");
    protected static final DataType<String> INTERVAL_YEAR_TO_MONTH = new DefaultDataType<>(FAMILY, String.class, "INTERVAL YEAR TO MONTH");
    protected static final DataType<String> INTERVAL_DAY_TO_HOUR = new DefaultDataType<>(FAMILY, String.class, "INTERVAL DAY TO HOUR");
    protected static final DataType<String> INTERVAL_DAY_TO_MINUTE = new DefaultDataType<>(FAMILY, String.class, "INTERVAL DAY TO MINUTE");
    protected static final DataType<String> INTERVAL_DAY_TO_SECOND = new DefaultDataType<>(FAMILY, String.class, "INTERVAL DAY TO SECOND");
    protected static final DataType<String> INTERVAL_HOUR_TO_MINUTE = new DefaultDataType<>(FAMILY, String.class, "INTERVAL HOUR TO MINUTE");
    protected static final DataType<String> INTERVAL_HOUR_TO_SECOND = new DefaultDataType<>(FAMILY, String.class, "INTERVAL HOUR TO SECOND");
    protected static final DataType<String> INTERVAL_MINUTE_TO_SECOND = new DefaultDataType<>(FAMILY, String.class, "INTERVAL MINUTE TO SECOND");
    protected static final DataType<String> DATETIME_WITH_TIME_ZONE = new DefaultDataType<>(FAMILY, String.class, "DATETIME WITH TIME ZONE");
    protected static final DataType<String> TIME_WITH_TIME_ZONE = new DefaultDataType<>(FAMILY, String.class, "TIME WITH TIME ZONE");
    protected static final DataType<String> TIMESTAMP_WITH_TIME_ZONE = new DefaultDataType<>(FAMILY, String.class, "TIMESTAMP WITH TIME ZONE");
    protected static final DataType<Float> FLOAT = new DefaultDataType<>(FAMILY, Float.class, "float");
    protected static final DataType<String> BIT_VARYING = new DefaultDataType<>(FAMILY, SQLDataType.VARCHAR, "bit varying(l)");
    protected static final DataType<String> VARBIT = new DefaultDataType<>(FAMILY, SQLDataType.VARCHAR, "varbit(l)");
    protected static final DataType<String> BIT = new DefaultDataType<>(FAMILY, SQLDataType.CHAR, "bit(l)");
    protected static final DataType<String> POINT = new DefaultDataType<>(FAMILY, String.class, "POINT");
    protected static final DataType<String> LINE = new DefaultDataType<>(FAMILY, String.class, "LINE");
    protected static final DataType<String> LSEG = new DefaultDataType<>(FAMILY, String.class, "LSEG");
    protected static final DataType<String> BOX = new DefaultDataType<>(FAMILY, String.class, "BOX");
    protected static final DataType<String> CIRCLE = new DefaultDataType<>(FAMILY, String.class, "CIRCLE");
    protected static final DataType<String> PATH = new DefaultDataType<>(FAMILY, String.class, "PATH");
    protected static final DataType<String> POLYGON = new DefaultDataType<>(FAMILY, String.class, "POLYGON");
}
