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
 * Apache-2.0 license and offer limited warranties, support, maintenance, and
 * commercial database integrations.
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

import org.jooq.Field;
import org.jooq.Record;
import org.jooq.TableOptions.TableType;
import org.jooq.impl.QOM.GenerationOption;
import org.jooq.meta.AbstractTableDefinition;
import org.jooq.meta.ColumnDefinition;
import org.jooq.meta.DataTypeDefinition;
import org.jooq.meta.DefaultColumnDefinition;
import org.jooq.meta.DefaultDataTypeDefinition;
import org.jooq.meta.SchemaDefinition;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.util.Arrays.asList;
import static org.jooq.impl.DSL.coalesce;
import static org.jooq.impl.DSL.*;
import static org.jooq.meta.xugu.information_schema.Tables.*;


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
        XuGuDatabase database = (XuGuDatabase) getDatabase();
        Field<String> generationExpression = database.generationExpression(COLUMNS.GENERATION_EXPRESSION);

        for (Record record : create().select(
                    inline("").as(COLUMNS.ORDINAL_POSITION),
                    COLUMNS.COLUMN_NAME,
                    COLUMNS.COLUMN_COMMENT,
                    COLUMNS.COLUMN_TYPE,
                    COLUMNS.DATA_TYPE,
                    when(COLUMNS.IS_NULLABLE.eq("true"),"YES").else_("NO").as(COLUMNS.IS_NULLABLE),
                    COLUMNS.COLUMN_DEFAULT,
                    COLUMNS.EXTRA,
                    generationExpression,
                    COLUMNS.CHARACTER_MAXIMUM_LENGTH,

                    // [#10856] Some older versions of MySQL 5.7 don't have the DATETIME_PRECISION column yet
                    getDatabase().exists(COLUMNS.DATETIME_PRECISION)
                        ? coalesce(COLUMNS.NUMERIC_PRECISION, COLUMNS.DATETIME_PRECISION).as(COLUMNS.NUMERIC_PRECISION)
                        : COLUMNS.NUMERIC_PRECISION,
                    COLUMNS.NUMERIC_SCALE,
                    COLUMNS.EXTRA)
                .from(COLUMNS)
                // [#5213] Duplicate schema value to work around MySQL issue https://bugs.mysql.com/bug.php?id=86022
                .leftJoin(TABLES).on(TABLES.TABLE_ID.eq(COLUMNS.TABLE_ID))
                .leftJoin(SCHEMATA).on(SCHEMATA.SCHEMA_ID.eq(TABLES.SCHEMA_ID))
                .where(SCHEMATA.SCHEMA_NAME.in(getSchema().getName(), getSchema().getName()))
                .and(TABLES.TABLE_NAME.equal(getName()))
                .orderBy(TABLES.TABLE_ID)
        ) {

            String dataType = record.get(COLUMNS.DATA_TYPE);

            // [#519] Some types have unsigned versions
            boolean unsigned = getDatabase().supportsUnsignedTypes();

            // [#7719]
            boolean displayWidths = getDatabase().integerDisplayWidths();

            // [#6492] MariaDB supports a standard IS_GENERATED, but MySQL doesn't (yet)
            GenerationOption generationOption =
                  "VIRTUAL GENERATED".equalsIgnoreCase(record.get(COLUMNS.EXTRA))
                ? GenerationOption.VIRTUAL
                : "STORED GENERATED".equalsIgnoreCase(record.get(COLUMNS.EXTRA))
                ? GenerationOption.STORED
                : null;

            // [#13818] Some DEFAULT expressions (e.g. CURRENT_TIMESTAMP) produce a DEFAULT_GENERATED value in EXTRA
            boolean generated = generationOption != null;

            columnTypeFix:
            if (unsigned || displayWidths) {
                if (asList("tinyint", "smallint", "mediumint", "int", "bigint").contains(dataType.toLowerCase())) {
                    String columnType = record.get(COLUMNS.COLUMN_TYPE).toLowerCase();






                    Matcher matcher = COLUMN_TYPE.matcher(columnType);

                    if (matcher.find()) {
                        String mType = matcher.group(1);
                        String mPrecision = matcher.group(2);
                        String mUnsigned = matcher.group(3);

                        dataType = mType
                                 + (unsigned && mUnsigned != null ? mUnsigned : "")
                                 + (displayWidths && mPrecision != null ? mPrecision : "");
                    }
                }
            }

            DataTypeDefinition type = new DefaultDataTypeDefinition(
                getDatabase(),
                getSchema(),
                dataType,
                record.get(COLUMNS.CHARACTER_MAXIMUM_LENGTH),
                null,
                null,
                record.get(COLUMNS.IS_NULLABLE, boolean.class),
                generated ? null : record.get(COLUMNS.COLUMN_DEFAULT),
                name(getSchema().getName(), getName() + "_" + record.get(COLUMNS.COLUMN_NAME))
            )
                .generatedAlwaysAs(generated ? record.get(COLUMNS.GENERATION_EXPRESSION) : null)
                .generationOption(generationOption);

            result.add(new DefaultColumnDefinition(
                getDatabase().getTable(getSchema(), getName()),
                record.get(COLUMNS.COLUMN_NAME),
                result.size() + 1,
                type,
                "auto_increment".equalsIgnoreCase(record.get(COLUMNS.EXTRA)),
                record.get(COLUMNS.COLUMN_COMMENT)
            ));
        }

        return result;
    }
}
