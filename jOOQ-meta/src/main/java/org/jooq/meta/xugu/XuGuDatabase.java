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
import org.jooq.*;
import org.jooq.TableOptions.TableType;
import org.jooq.impl.DSL;
import org.jooq.meta.*;
import org.jooq.meta.mysql.MySQLRoutineDefinition;
import org.jooq.meta.mysql.mysql.enums.ProcType;
import org.jooq.meta.postgres.PostgresRoutineDefinition;
import org.jooq.meta.xugu.all.tables.AllSchemas;
import org.jooq.meta.xugu.all.tables.AllSequences;
import org.jooq.meta.xugu.all.tables.AllTables;
import org.jooq.tools.csv.CSVReader;
import org.jooq.util.mariadb.MariaDBDataType;
import org.jooq.util.xugu.XuGuDataType;

import java.io.StringReader;
import java.math.BigInteger;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.jooq.impl.DSL.*;
import static org.jooq.meta.mysql.information_schema.Tables.ROUTINES;
import static org.jooq.meta.mysql.information_schema.Tables.TABLES;
import static org.jooq.meta.postgres.information_schema.Tables.SEQUENCES;
import static org.jooq.meta.xugu.all.Tables.*;
import static org.jooq.meta.xugu.all.tables.AllColumns.ALL_COLUMNS;
import static org.jooq.meta.xugu.all.tables.AllConstraints.ALL_CONSTRAINTS;
import static org.jooq.meta.xugu.all.tables.AllIndexes.ALL_INDEXES;
import static org.jooq.meta.xugu.all.tables.AllObjects.ALL_OBJECTS;
import static org.jooq.meta.xugu.all.tables.AllProcedures.ALL_PROCEDURES;
import static org.jooq.meta.xugu.all.tables.AllSchemas.ALL_SCHEMAS;
import static org.jooq.meta.xugu.all.tables.AllSequences.ALL_SEQUENCES;
import static org.jooq.meta.xugu.all.tables.AllTables.ALL_TABLES;
import static org.jooq.meta.xugu.all.tables.AllViews.ALL_VIEWS;

/**
 * @author Lukas Eder
 */
public class XuGuDatabase extends AbstractDatabase {

//    private static Boolean is8;
//    private static Boolean is8_0_16;


    @Override
    protected List<IndexDefinition> getIndexes0() throws SQLException {
        List<IndexDefinition> result = new ArrayList<>();

        Result<Record5<String, String, String, Boolean, String>> fetchResult = create()
                .selectDistinct(
                        ALL_SCHEMAS.SCHEMA_NAME,
                        ALL_TABLES.TABLE_NAME,
                        ALL_INDEXES.INDEX_NAME,
                        ALL_INDEXES.IS_UNIQUE,
                        ALL_INDEXES.KEYS)
                .from(ALL_INDEXES)
                .leftJoin(ALL_TABLES).on(ALL_TABLES.TABLE_ID.eq(ALL_INDEXES.TABLE_ID))
                .leftJoin(ALL_SCHEMAS).on(ALL_SCHEMAS.SCHEMA_ID.eq(ALL_TABLES.SCHEMA_ID))
                .where(ALL_SCHEMAS.SCHEMA_NAME.in(getInputSchemata()).or(
                        getInputSchemata().size() == 1
                                ? ALL_SCHEMAS.SCHEMA_NAME.in(getInputSchemata())
                                : falseCondition()))
                .and(getIncludeSystemIndexes()
                        ? noCondition()
                        : ALL_INDEXES.IS_UNIQUE.eq(false).and(ALL_INDEXES.IS_PRIMARY.eq(false))
                ).and(ALL_INDEXES.IS_SYS.eq(false))
                .orderBy(
                        ALL_SCHEMAS.SCHEMA_NAME,
                        ALL_TABLES.TABLE_NAME,
                        ALL_INDEXES.INDEX_NAME)
                .fetch();

        indexLoop:
        for (Record5<String, String, String, Boolean, String> record5 : fetchResult) {
            final SchemaDefinition tableSchema = getSchema(record5.get(ALL_SCHEMAS.SCHEMA_NAME));
            if (tableSchema == null) {
                continue indexLoop;
            }
            final String indexName = record5.get(ALL_INDEXES.INDEX_NAME);
            final String tableName = record5.get(ALL_TABLES.TABLE_NAME);
            final TableDefinition table = getTable(tableSchema, tableName);
            if (table == null)
                continue indexLoop;

            final boolean unique = record5.get(ALL_INDEXES.IS_UNIQUE, boolean.class);

            String keys = record5.get(ALL_INDEXES.KEYS);
            String[] columnNames = keys.replace("\"", "").split(",");
            for (String columnName : columnNames) {
                if (table.getColumn(columnName.trim()) == null)
                    continue indexLoop;
            }

            result.add(new AbstractIndexDefinition(tableSchema, indexName, table, unique) {
                List<IndexColumnDefinition> indexColumns = new ArrayList<>();

                {
                    for (int i = 0; i < columnNames.length; i++) {
                        indexColumns.add(new DefaultIndexColumnDefinition(
                                this,
                                table.getColumn(columnNames[i].trim()),
                                SortOrder.ASC,
                                i
                        ));
                    }
                }

                @Override
                protected List<IndexColumnDefinition> getIndexColumns0() {
                    return indexColumns;
                }
            });
        }

        return result;
    }

    @Override
    protected void loadPrimaryKeys(DefaultRelations relations) throws SQLException {
        for (Record record : fetchKeys(true)) {
            SchemaDefinition schema = getSchema(record.get(ALL_SCHEMAS.SCHEMA_NAME));
            String constraintName = record.get(ALL_INDEXES.INDEX_NAME);
            String tableName = record.get(ALL_TABLES.TABLE_NAME);
            String keys = record.get(ALL_INDEXES.KEYS);

            String key = getKeyName(tableName, constraintName);
            TableDefinition table = getTable(schema, tableName);

            if (table != null) {
                String[] columnNames = keys.replace("\"", "").split(",");

                for (String columnName : columnNames) {
                    relations.addPrimaryKey(key, table, table.getColumn(columnName.trim()));
                }
            }
        }
    }
    @Override
    protected void loadUniqueKeys(DefaultRelations relations) throws SQLException {
        for (Record record : fetchKeys(false)) {
            SchemaDefinition schema = getSchema(record.get(ALL_SCHEMAS.SCHEMA_NAME));
            String constraintName = record.get(ALL_INDEXES.INDEX_NAME);
            String tableName = record.get(ALL_TABLES.TABLE_NAME);
            String keys= record.get(ALL_INDEXES.KEYS);

            String key = getKeyName(tableName, constraintName);
            TableDefinition table = getTable(schema, tableName);

            if (table != null) {
                String[] columnNames = keys.replace("\"", "").split(",");

                for (String columnName : columnNames) {
                    relations.addPrimaryKey(key, table, table.getColumn(columnName.trim()));
                }
            }
        }
    }
    private String getKeyName(String tableName, String keyName) {
        return "KEY_" + tableName + "_" + keyName;
    }


    /**
     * 该方法负责处理mysql版本，与虚谷无关。
     * mysql在8.0.16版本完全支持检查约束，这里是对当前mysql版本进行策略分流。
    * */
//    protected boolean is8() {
//
//        if (is8 == null)
//            is8 = !exists(ALL_OBJECTS);
//
//        return is8;
//    }
//
//    protected boolean is8_0_16() {
//
//        if (is8_0_16 == null)
//            is8_0_16 = exists(CHECK_CONSTRAINTS);
//
//        return true;
//    }

    /**
     * 修改部分逻辑，虚谷对于外键的存储不同于mysql
     * */
    private Result<?> fetchKeys(boolean primary) {

        // [#3560] It has been shown that querying the ALL_INDEXES table is much faster on
        // very large databases than going through ALL_CONSTRAINTS and KEY_COLUMN_USAGE
        // [#2059] In MemSQL primary key indexes are typically duplicated
        // (once with INDEX_TYPE = 'SHARD' and once with INDEX_TYPE = 'BTREE)
        return create().selectDistinct(
                        ALL_SCHEMAS.SCHEMA_NAME,
                        ALL_TABLES.TABLE_NAME,
                        ALL_INDEXES.KEYS,
                        ALL_INDEXES.INDEX_NAME)
                .from(ALL_INDEXES)
                .leftJoin(ALL_TABLES).on(ALL_TABLES.TABLE_ID.eq(ALL_INDEXES.TABLE_ID))
                .leftJoin(ALL_SCHEMAS).on(ALL_SCHEMAS.SCHEMA_ID.eq(ALL_TABLES.SCHEMA_ID))
                .where(ALL_SCHEMAS.SCHEMA_NAME.in(getInputSchemata()).or(
                        getInputSchemata().size() == 1
                                ? ALL_SCHEMAS.SCHEMA_NAME.in(getInputSchemata())
                                : falseCondition()))
                .and(primary
                        ? ALL_INDEXES.IS_PRIMARY.eq(true)
                        : ALL_INDEXES.IS_PRIMARY.ne(true).and(ALL_INDEXES.IS_UNIQUE.eq(inline(true))))
                .orderBy(
                        ALL_SCHEMAS.SCHEMA_NAME,
                        ALL_TABLES.TABLE_NAME,
                        ALL_INDEXES.INDEX_NAME)
                .fetch();
    }

    @Override
    protected void loadForeignKeys(DefaultRelations relations) throws SQLException {
        AllTables t = ALL_TABLES.as("T");
        AllTables rt = ALL_TABLES.as("RT");
        AllSchemas s = ALL_SCHEMAS.as("S");
        AllSchemas rs = ALL_SCHEMAS.as("RS");

        for (Record record : create().selectDistinct(
                        s.SCHEMA_NAME,
                        ALL_CONSTRAINTS.CONS_NAME,
                        t.TABLE_NAME,
                        rt.TABLE_NAME.as("REF_TABLE_NAME"),
                        rs.SCHEMA_NAME.as("REF_SCHEMA_NAME"),
                        ALL_INDEXES.INDEX_NAME.as("UNIQUE_CONSTRAINT_NAME"),
                        ALL_CONSTRAINTS.DEFINE
                )
                .from(ALL_CONSTRAINTS)
                .join(t).on(ALL_CONSTRAINTS.TABLE_ID.eq(t.TABLE_ID))
                .join(s).on(s.SCHEMA_ID.eq(t.SCHEMA_ID))

                //依赖所在表
                .join(rt).on(ALL_CONSTRAINTS.REF_TABLE_ID.eq(rt.TABLE_ID))
                .join(rs).on(rs.SCHEMA_ID.eq(rt.SCHEMA_ID))
                .join(ALL_INDEXES).on(ALL_INDEXES.TABLE_ID.eq(rt.TABLE_ID)).and(ALL_INDEXES.IS_UNIQUE.eq(true))
                .where(ALL_CONSTRAINTS.CONS_TYPE.eq("F"))
                .and(s.SCHEMA_NAME.in(getInputSchemata()).or(
                        getInputSchemata().size() == 1
                                ? s.SCHEMA_NAME.in(getInputSchemata())
                                : falseCondition()))
                .orderBy(
                        s.SCHEMA_NAME,
                        t.TABLE_NAME
                )
                .fetch())
        {

            SchemaDefinition foreignKeySchema = getSchema(record.get(s.SCHEMA_NAME));
            SchemaDefinition uniqueKeySchema = getSchema(record.get(rs.SCHEMA_NAME.as("REF_SCHEMA_NAME")));

            String foreignKey = record.get(ALL_CONSTRAINTS.CONS_NAME);

            String define = record.get(ALL_CONSTRAINTS.DEFINE);
            Pattern pattern = Pattern.compile("\\((.*?)\\)\\(.*?\\)");
            Matcher matcher = pattern.matcher(define);

            String foreignKeyColumns = null;
            if (matcher.find()) {
                foreignKeyColumns = matcher.group(1);  // 提取第一个括号内的列名
            }

            if (foreignKeyColumns != null) {
                String[] foreignKeyColumnNames = foreignKeyColumns.replace("\"", "").split(",");

                String foreignKeyTableName = record.get(t.TABLE_NAME);
                String uniqueKey = record.get(ALL_INDEXES.INDEX_NAME.as("UNIQUE_CONSTRAINT_NAME"));
                String uniqueKeyTableName = record.get(rt.TABLE_NAME.as("REF_TABLE_NAME"));

                TableDefinition foreignKeyTable = getTable(foreignKeySchema, foreignKeyTableName);
                TableDefinition uniqueKeyTable = getTable(uniqueKeySchema, uniqueKeyTableName);

                if (foreignKeyTable != null) {
                    for (String columnName : foreignKeyColumnNames) {
                        // 对每个外键列名添加外键关联
                        relations.addForeignKey(
                                foreignKey,
                                foreignKeyTable,
                                foreignKeyTable.getColumn(columnName.trim()),
                                getKeyName(uniqueKeyTableName, uniqueKey),
                                uniqueKeyTable
                        );
                    }
                }
            }
        }
    }

    /**
     * 删除了之前模仿mysql的策略分流判断。更改了对CHECK_CONSTRAINTS字段相关的信息，但是没有改代码逻辑
     * */
    @Override
    protected void loadCheckConstraints(DefaultRelations relations) throws SQLException {
            for (Record record : create()
                    .select(
                            ALL_SCHEMAS.SCHEMA_NAME,
                            ALL_TABLES.TABLE_NAME,
                            ALL_CONSTRAINTS.CONS_NAME,
                            ALL_CONSTRAINTS.DEFINE
                    )
                    .from(ALL_CONSTRAINTS)
                    .leftJoin(ALL_TABLES).on(ALL_TABLES.TABLE_ID.eq(ALL_CONSTRAINTS.TABLE_ID))
                    .leftJoin(ALL_SCHEMAS).on(ALL_SCHEMAS.SCHEMA_ID.eq(ALL_TABLES.SCHEMA_ID))
                    .where(ALL_SCHEMAS.SCHEMA_NAME.in(getInputSchemata()).and(ALL_CONSTRAINTS.CONS_TYPE.eq("C")))
                    .orderBy(
                            ALL_SCHEMAS.SCHEMA_NAME,
                            ALL_TABLES.TABLE_NAME,
                            ALL_CONSTRAINTS.CONS_NAME)) {

                SchemaDefinition schema = getSchema(record.get(ALL_SCHEMAS.SCHEMA_NAME));
                TableDefinition table = getTable(schema, record.get(ALL_TABLES.TABLE_NAME));

                if (table != null) {
                    relations.addCheckConstraint(table, new DefaultCheckConstraintDefinition(
                            schema,
                            table,
                            record.get(ALL_CONSTRAINTS.CONS_NAME),
                            record.get(ALL_CONSTRAINTS.DEFINE)
                    ));
                }
        }
    }

    @Override
    protected List<CatalogDefinition> getCatalogs0() throws SQLException {
        List<CatalogDefinition> result = new ArrayList<>();
        result.add(new CatalogDefinition(this, "", ""));
        return result;
    }

    @Override
    protected List<SchemaDefinition> getSchemata0() throws SQLException {
        List<SchemaDefinition> result = new ArrayList<>();

        for (String name : create()
                .select(ALL_SCHEMAS.SCHEMA_NAME)
                .from(ALL_SCHEMAS)
                .fetch(ALL_SCHEMAS.SCHEMA_NAME)) {

            result.add(new SchemaDefinition(this, name, ""));
        }

        return result;
    }

    @Override
    protected List<SequenceDefinition> getSequences0() throws SQLException {
        List<SequenceDefinition> result = new ArrayList<>();
        for (Record record : create().select(
                        ALL_SEQUENCES.SEQ_NAME,
                        ALL_SCHEMAS.SCHEMA_NAME,
                        ALL_SEQUENCES.COMMENTS,
                        ALL_SEQUENCES.CURR_VAL,
                        ALL_SEQUENCES.STEP_VAL,
                        ALL_SEQUENCES.MIN_VAL,
                        ALL_SEQUENCES.MAX_VAL,
                        ALL_SEQUENCES.IS_CYCLE,
                        ALL_SEQUENCES.CACHE_VAL
                ).from(ALL_SEQUENCES)
                .join(ALL_SCHEMAS)
                .on(ALL_SEQUENCES.SCHEMA_ID.eq(ALL_SCHEMAS.SCHEMA_ID)
                        .and(ALL_SCHEMAS.SCHEMA_NAME.in(getInputSchemata()))
                        .and(ALL_SEQUENCES.IS_SYS.eq(false)))) {
            SchemaDefinition schema = getSchema(record.get(ALL_SCHEMAS.SCHEMA_NAME));

            DefaultDataTypeDefinition type = new DefaultDataTypeDefinition(
                    this,
                    schema,
                    XuGuDataType.BIGINT.getTypeName()
            );

            result.add(new DefaultSequenceDefinition(
                    schema,
                    record.get(ALL_SEQUENCES.SEQ_NAME),
                    type,
                    record.get(ALL_SEQUENCES.COMMENTS),
                    record.get(ALL_SEQUENCES.CURR_VAL),
                    record.get(ALL_SEQUENCES.STEP_VAL),
                    record.get(ALL_SEQUENCES.MIN_VAL),
                    record.get(ALL_SEQUENCES.MAX_VAL),
                    record.get(ALL_SEQUENCES.IS_CYCLE),
                    record.get(ALL_SEQUENCES.CACHE_VAL)
            ));
        }

        return result;
    }

    /**
     * 这里代码修改过，但是字段部分没有确认是否于虚谷对应，查询效果还没有测试
     * */
    @Override
    protected List<TableDefinition> getTables0() throws SQLException {
        List<TableDefinition> result = new ArrayList<>();

        for (Record record : create().select(
                        ALL_SCHEMAS.SCHEMA_NAME,
                        ALL_TABLES.TABLE_NAME,
                        ALL_TABLES.COMMENTS,
                        inline(TableType.TABLE.name()).as("TABLE_TYPE"),
                        inline((String) null).as(ALL_VIEWS.DEFINE))
                .from(ALL_TABLES)
                .join(ALL_SCHEMAS).on(ALL_TABLES.SCHEMA_ID.eq(ALL_SCHEMAS.SCHEMA_ID))
                .where(ALL_SCHEMAS.SCHEMA_NAME.in(getInputSchemata()).or(
                        getInputSchemata().size() == 1
                                ? ALL_SCHEMAS.SCHEMA_NAME.in(getInputSchemata())
                                : falseCondition()))
                .and(ALL_TABLES.IS_SYS.eq(false))
                .unionAll(
                        select(ALL_SCHEMAS.SCHEMA_NAME,
                                ALL_VIEWS.VIEW_NAME.as("TABLE_NAME"),
                                ifnull(ALL_VIEWS.COMMENTS, "VIEW"),
                                inline(TableType.VIEW.name()).as("TABLE_TYPE"),
                                ALL_VIEWS.DEFINE
                        )
                                .from(ALL_VIEWS)
                                .join(ALL_SCHEMAS).on(ALL_VIEWS.SCHEMA_ID.eq(ALL_SCHEMAS.SCHEMA_ID))
                                .where(ALL_SCHEMAS.SCHEMA_NAME.in(getInputSchemata()).or(
                                        getInputSchemata().size() == 1
                                                ? ALL_SCHEMAS.SCHEMA_NAME.in(getInputSchemata())
                                                : falseCondition()))
                                .and(ALL_VIEWS.IS_SYS.eq(false))
                )
                .orderBy(
                        inline("SCHEMA_NAME"),
                        inline("TABLE_NAME"))) {

            SchemaDefinition schema = getSchema(record.get(ALL_SCHEMAS.SCHEMA_NAME));
            String name = record.get(ALL_TABLES.TABLE_NAME);
            String comment = record.get(ALL_TABLES.COMMENTS);
            TableType tableType = record.get("TABLE_TYPE", TableType.class);
            String source = record.get(ALL_VIEWS.DEFINE);

            XuGuTableDefinition table = new XuGuTableDefinition(schema, name, comment, tableType, source);
            result.add(table);
        }

        return result;
    }

    /**
     * 这里似乎是负责枚举的生成，但是虚谷不支持枚举，这个方法可以省略
     * */
    @Override
    protected List<EnumDefinition> getEnums0() throws SQLException {
        List<EnumDefinition> result = new ArrayList<>();
//
//        Result<Record5<String, String, String, String, String>> records = create()
//                .select(
//                        ALL_SCHEMAS.SCHEMA_NAME,
//                        ALL_COLUMNS.COMMENTS,
//                        ALL_TABLES.TABLE_NAME,
//                        ALL_COLUMNS.COL_NAME,
//                        ALL_COLUMNS.COLUMN_TYPE)
//                .from(ALL_COLUMNS)
//                .leftJoin(ALL_TABLES).on(ALL_TABLES.DB_ID.eq(ALL_COLUMNS.DB_ID))
//                .leftJoin(ALL_SCHEMAS).on(ALL_TABLES.SCHEMA_ID.eq(ALL_SCHEMAS.SCHEMA_ID))
//                .where(
//                        ALL_COLUMNS.COLUMN_TYPE.like("enum(%)").and(
//                                ALL_SCHEMAS.SCHEMA_NAME.in(getInputSchemata()).or(
//                                        getInputSchemata().size() == 1
//                                                ? ALL_SCHEMAS.SCHEMA_NAME.in(getInputSchemata())
//                                                : falseCondition()))
//                        )
//                .orderBy(
//                        ALL_SCHEMAS.SCHEMA_NAME.asc(),
//                        ALL_TABLES.TABLE_NAME.asc(),
//                        ALL_COLUMNS.COL_NAME.asc())
//                .fetch();
//
//        for (Record record : records) {
//            SchemaDefinition schema = getSchema(record.get(ALL_SCHEMAS.SCHEMA_NAME));
//
//            String comment = record.get(ALL_COLUMNS.COMMENTS);
//            String table = record.get(ALL_TABLES.TABLE_NAME);
//            String column = record.get(ALL_COLUMNS.COL_NAME);
//            String name = table + "_" + column;
//            String columnType = record.get(ALL_COLUMNS.COLUMN_TYPE);
//
//            // that are excluded from code generation
//            TableDefinition tableDefinition = getTable(schema, table);
//            if (tableDefinition != null) {
//                ColumnDefinition columnDefinition = tableDefinition.getColumn(column);
//
//                if (columnDefinition != null) {
//
//                    // [#1137] Avoid generating enum classes for enum types that
//                    // are explicitly forced to another type
//                    if (getConfiguredForcedType(columnDefinition, columnDefinition.getType()) == null) {
//                        DefaultEnumDefinition definition = new DefaultEnumDefinition(schema, name, comment);
//
//                        CSVReader reader = new CSVReader(
//                                new StringReader(columnType.replaceAll("(^enum\\()|(\\)$)", ""))
//                                , ','  // Separator
//                                , '\'' // Quote character
//                                , true // Strict quotes
//                        );
//
//                        for (String string : reader.next()) {
//                            definition.addLiteral(string);
//                        }
//
//                        result.add(definition);
//                    }
//                }
//            }
//        }

        return result;
    }

    @Override
    protected List<DomainDefinition> getDomains0() throws SQLException {
        List<DomainDefinition> result = new ArrayList<>();
        return result;
    }

    @Override
    protected List<UDTDefinition> getUDTs0() throws SQLException {
        List<UDTDefinition> result = new ArrayList<>();
        return result;
    }

    @Override
    protected List<ArrayDefinition> getArrays0() throws SQLException {
        List<ArrayDefinition> result = new ArrayList<>();
        return result;
    }

    @Override
    protected List<RoutineDefinition> getRoutines0() throws SQLException {
        List<RoutineDefinition> result = new ArrayList<>();
        for (Record record : create().select(
                        ALL_SCHEMAS.SCHEMA_NAME,
                ALL_PROCEDURES.PROC_NAME,
                        ALL_PROCEDURES.COMMENTS,
                        ALL_PROCEDURES.DEFINE,
                        ALL_PROCEDURES.PIPELINED,
                        ALL_PROCEDURES.RET_TYPE
        ).from(ALL_PROCEDURES).join(ALL_SCHEMAS)
                .on(ALL_PROCEDURES.SCHEMA_ID.eq(ALL_SCHEMAS.SCHEMA_ID)
                        .and(ALL_PROCEDURES.IS_SYS.eq(false))
                        .and(ALL_SCHEMAS.SCHEMA_NAME.in(getInputSchemata())))
                .fetch()) {
            SchemaDefinition schema = getSchema(record.get(ALL_SCHEMAS.SCHEMA_NAME));
            String name = record.get(ALL_PROCEDURES.PROC_NAME);
            String comment = record.get(ALL_PROCEDURES.COMMENTS);
            String define = record.get(ALL_PROCEDURES.DEFINE);
            String retType = record.get(ALL_PROCEDURES.RET_TYPE);
            boolean pipelined = record.get(ALL_PROCEDURES.PIPELINED);
            result.add(new XuGuRoutineDefinition(schema, name, comment, define, retType, pipelined));
        }
       return result;
    }

    @Override
    protected List<PackageDefinition> getPackages0() throws SQLException {
        List<PackageDefinition> result = new ArrayList<>();
        return result;
    }

    @Override
    protected DSLContext create0() {
        return DSL.using(getConnection(), SQLDialect.XUGU);
    }

    @Override
    protected boolean exists0(TableField<?, ?> field) {
        return false;
    }

    @Override
    protected boolean exists0(Table<?> table) {
        //虚谷不存在proc表，直接返回false
//        exists1(table, TABLES.TABLES, TABLES.TABLE_SCHEMA, TABLES.TABLE_NAME);
        return false;
    }
}
