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

package org.jooq.meta.xugu;

import org.jooq.Record;
import org.jooq.TableOptions.TableType;
import org.jooq.meta.*;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.util.Arrays.asList;
import static org.jooq.impl.DSL.*;
import static org.jooq.meta.xugu.all.Tables.*;
import static org.jooq.meta.xugu.all.tables.AllColumns.ALL_COLUMNS;
import static org.jooq.meta.xugu.all.tables.AllDataBases.ALL_DATABASES;
import static org.jooq.meta.xugu.all.tables.AllSchemas.ALL_SCHEMAS;
import static org.jooq.meta.xugu.all.tables.AllTables.ALL_TABLES;

/**
 * @author Lukas Eder
 */
public class XuGuTableDefinition extends AbstractTableDefinition {

    private static final Pattern COLUMN_TYPE = Pattern.compile("(\\w+)\\s*(\\(\\d+\\))?\\s*(unsigned)?");

    public XuGuTableDefinition(SchemaDefinition schema, String name, String comment) {
        super(schema, name, comment);
    }

    public XuGuTableDefinition(SchemaDefinition schema, String name, String comment, TableType tableType, String source) {
        super(schema, name, comment, tableType, source);
    }

    @Override
    public List<ColumnDefinition> getElements0() throws SQLException {
        List<ColumnDefinition> result = new ArrayList<>();

        for (Record record : create().select(
                ALL_COLUMNS.COL_NO,
                ALL_COLUMNS.COL_NAME,
                ALL_COLUMNS.COMMENTS,
                ALL_COLUMNS.TYPE_NAME,
                //处理一下判断逻辑
                when(ALL_COLUMNS.NOT_NULL.eq("TRUE"), inline("NO"))
                        .otherwise(inline("YES")).as("NOT_NULL"),
                ALL_COLUMNS.DEF_VAL,
                ALL_COLUMNS.SCALE,
                inline((Integer) null), //与虚谷字段的存储内容不同，设置 NUMERIC_SCALE 为 NULL
                when(ALL_COLUMNS.IS_SERIAL.eq("TRUE"), inline("auto_increment")).otherwise(inline((String) null)).as("IS_SERIAL"))
                .from(ALL_COLUMNS)
                .join(ALL_TABLES).on(ALL_COLUMNS.TABLE_ID.eq(ALL_TABLES.TABLE_ID))
                .join(ALL_SCHEMAS).on(ALL_TABLES.SCHEMA_ID.eq(ALL_SCHEMAS.SCHEMA_ID))
                .where(ALL_COLUMNS.TABLE_ID.eq(
                        select(ALL_TABLES.TABLE_ID)
                                .from(ALL_TABLES)
                                .where(ALL_TABLES.TABLE_NAME.equal(getName()))
                ))
//                .and(ALL_COLUMNS.DB_ID.eq(
//                        select(ALL_DATABASES.DB_ID)
//                                .from(ALL_DATABASES)
//                                .where(ALL_DATABASES.DB_NAME.in(getSchema().getName(), getSchema().getName()))
//                ))
                .orderBy(ALL_COLUMNS.COL_NO)) {

            String dataType = record.get(ALL_COLUMNS.TYPE_NAME);

//            // 下面逻辑暂时没看。
//            // [#519] Some types have unsigned versions
//            boolean unsigned = getDatabase().supportsUnsignedTypes();
//
//            // [#7719]
//            boolean displayWidths = getDatabase().integerDisplayWidths();
//
//            columnTypeFix:
//            if (unsigned || displayWidths) {
//                if (asList("tinyint", "smallint", "mediumint", "int", "bigint").contains(dataType.toLowerCase())) {
//                    String columnType = record.get(ALL_COLUMNS.COLUMN_TYPE).toLowerCase();
//
//                    Matcher matcher = COLUMN_TYPE.matcher(columnType);
//
//                    if (matcher.find()) {
//                        String mType = matcher.group(1);
//                        String mPrecision = matcher.group(2);
//                        String mUnsigned = matcher.group(3);
//
//                        dataType = mType
//                                 + (unsigned && mUnsigned != null ? mUnsigned : "")
//                                 + (displayWidths && mPrecision != null ? mPrecision : "");
//                    }
//                }
//            }

            DataTypeDefinition type = new DefaultDataTypeDefinition(
                getDatabase(),
                getSchema(),
                dataType,
                record.get(ALL_COLUMNS.SCALE),
                null,
                null,
                record.get(ALL_COLUMNS.NOT_NULL, boolean.class),
                record.get(ALL_COLUMNS.DEF_VAL),
                name(getSchema().getName(), getName() + "_" + record.get(ALL_COLUMNS.COL_NAME))
            );

            result.add(new DefaultColumnDefinition(
                getDatabase().getTable(getSchema(), getName()),
                record.get(ALL_COLUMNS.COL_NAME),
                result.size() + 1,
                type,
                //上面改一下自增判断
                "auto_increment".equalsIgnoreCase(record.get(ALL_COLUMNS.IS_SERIAL)),
                record.get(ALL_COLUMNS.COMMENTS)
            ));
        }

        return result;
    }
}
