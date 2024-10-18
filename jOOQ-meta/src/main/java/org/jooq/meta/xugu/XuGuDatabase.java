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
//import org.jooq.meta.xugu.all.tables.Schemata;
//import org.jooq.meta.xugu.xugu.enums.ProcType;
import org.jooq.meta.xugu.all.tables.AllSchemas;
import org.jooq.meta.xugu.all.tables.AllTables;
import org.jooq.tools.csv.CSVReader;

import java.io.StringReader;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.jooq.impl.DSL.*;
import static org.jooq.meta.xugu.all.Tables.*;
import static org.jooq.meta.xugu.all.tables.AllColumns.ALL_COLUMNS;
import static org.jooq.meta.xugu.all.tables.AllConstraints.ALL_CONSTRAINTS;
import static org.jooq.meta.xugu.all.tables.AllDataBases.ALL_DATABASES;
import static org.jooq.meta.xugu.all.tables.AllIndexes.ALL_INDEXES;
import static org.jooq.meta.xugu.all.tables.AllObjects.ALL_OBJECTS;
import static org.jooq.meta.xugu.all.tables.AllProcedures.ALL_PROCEDURES;
import static org.jooq.meta.xugu.all.tables.AllSchemas.ALL_SCHEMAS;
import static org.jooq.meta.xugu.all.tables.AllTables.ALL_TABLES;
import static org.jooq.meta.xugu.all.tables.AllViews.ALL_VIEWS;
//import static org.jooq.meta.xugu.all.tables.AllDataBases.DATA_BASES;
//import static org.jooq.meta.xugu.xugu.Tables.PROC;

/**
 * @author Lukas Eder
 */
public class XuGuDatabase extends AbstractDatabase {

//    private static Boolean is8;
//    private static Boolean is8_0_16;


    @Override
    protected List<IndexDefinition> getIndexes0() throws SQLException {
        List<IndexDefinition> result = new ArrayList<>();

        Map<Record, Result<Record>> indexes = create()
                .selectDistinct(
                        ALL_SCHEMAS.SCHEMA_NAME,
                        ALL_TABLES.TABLE_NAME,
                        ALL_INDEXES.INDEX_NAME,
                        when(ALL_INDEXES.IS_UNIQUE.eq("TRUE"),inline("NO")).otherwise(inline("YES")).as("IS_UNIQUE"),
                        ALL_INDEXES.KEYS,
                        inline("").as(ALL_INDEXES.SEQ_IN_INDEX))
                .from(ALL_INDEXES)
                .leftJoin(ALL_TABLES).on(ALL_TABLES.TABLE_ID.eq(ALL_INDEXES.TABLE_ID))
                .leftJoin(ALL_SCHEMAS).on(ALL_SCHEMAS.SCHEMA_ID.eq(ALL_TABLES.SCHEMA_ID))
                .where(ALL_SCHEMAS.SCHEMA_NAME.in(getInputSchemata()).or(
                        getInputSchemata().size() == 1
                                ? ALL_SCHEMAS.SCHEMA_NAME.in(getInputSchemata())
                                : falseCondition()))
                .and(getIncludeSystemIndexes()
                                ? noCondition()
                                : row(ALL_SCHEMAS.SCHEMA_NAME, ALL_TABLES.TABLE_NAME, ALL_INDEXES.INDEX_NAME).notIn(
                                select(ALL_SCHEMAS.SCHEMA_NAME, ALL_TABLES.TABLE_NAME, ALL_CONSTRAINTS.CONS_NAME)
                                        .from(ALL_CONSTRAINTS)
                                        .leftJoin(ALL_TABLES).on(ALL_TABLES.TABLE_ID.eq(ALL_CONSTRAINTS.TABLE_ID))
                                        .leftJoin(ALL_SCHEMAS).on(ALL_SCHEMAS.SCHEMA_ID.eq(ALL_TABLES.SCHEMA_ID))
                        )
                )
                .orderBy(
                        ALL_SCHEMAS.SCHEMA_NAME,
                        ALL_TABLES.TABLE_NAME,
                        ALL_INDEXES.INDEX_NAME,
                        ALL_INDEXES.INDEX_ID)
                .fetchGroups(
                        new Field[]{
                                ALL_SCHEMAS.SCHEMA_NAME,
                                ALL_TABLES.TABLE_NAME,
                                ALL_INDEXES.INDEX_NAME,
                                ALL_INDEXES.IS_UNIQUE
                        },
                        new Field[]{
                                ALL_INDEXES.KEYS,
                                ALL_INDEXES.SEQ_IN_INDEX
                        });

        indexLoop:
        for (Entry<Record, Result<Record>> entry : indexes.entrySet()) {
            final Record index = entry.getKey();
            final Result<Record> columns = entry.getValue();

            final SchemaDefinition tableSchema = getSchema(index.get(ALL_SCHEMAS.SCHEMA_NAME));
            if (tableSchema == null)
                continue indexLoop;

            final String indexName = index.get(ALL_INDEXES.INDEX_NAME);
            final String tableName = index.get(ALL_TABLES.TABLE_NAME);
            final TableDefinition table = getTable(tableSchema, tableName);
            if (table == null)
                continue indexLoop;

            final boolean unique = !index.get(ALL_INDEXES.IS_UNIQUE, boolean.class);

            for (Record column : columns) {
                String keys = column.get(ALL_INDEXES.KEYS);
                String[] columnNames = keys.replace("\"", "").split(",");
                for (String columnName : columnNames) {
                    if (table.getColumn(columnName.trim()) == null)
                        continue indexLoop;
                }
            }

            result.add(new AbstractIndexDefinition(tableSchema, indexName, table, unique) {
                List<IndexColumnDefinition> indexColumns = new ArrayList<>();

                {
                    for (Record column : columns) {
                        String keys = column.get(ALL_INDEXES.KEYS);
                        String[] columnNames = keys.replace("\"", "").split(",");

                        for (String columnName : columnNames) {
                            indexColumns.add(new DefaultIndexColumnDefinition(
                                    this,
                                    table.getColumn(columnName.trim()),
                                    SortOrder.ASC,
                                    column.get(ALL_INDEXES.SEQ_IN_INDEX, int.class)
                            ));
                        }
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
                        ALL_INDEXES.INDEX_NAME,
                        inline(1).as(ALL_INDEXES.SEQ_IN_INDEX))
                .from(ALL_INDEXES)
                .leftJoin(ALL_TABLES).on(ALL_TABLES.TABLE_ID.eq(ALL_INDEXES.TABLE_ID))
                .leftJoin(ALL_SCHEMAS).on(ALL_SCHEMAS.SCHEMA_ID.eq(ALL_TABLES.SCHEMA_ID))
                .where(ALL_SCHEMAS.SCHEMA_NAME.in(getInputSchemata()).or(
                        getInputSchemata().size() == 1
                                ? ALL_SCHEMAS.SCHEMA_NAME.in(getInputSchemata())
                                : falseCondition()))
                .and(primary
                        ? ALL_INDEXES.IS_PRIMARY.eq(inline(1))
                        : ALL_INDEXES.IS_PRIMARY.ne(inline(1)).and(ALL_INDEXES.IS_UNIQUE.eq(inline("TRUE"))))
                .orderBy(
                        ALL_SCHEMAS.SCHEMA_NAME,
                        ALL_TABLES.TABLE_NAME,
                        ALL_INDEXES.INDEX_NAME,
                        ALL_INDEXES.INDEX_ID)
                .fetch();
    }

    @Override
    protected void loadForeignKeys(DefaultRelations relations) throws SQLException {
        AllTables t = ALL_TABLES.as("T");
        AllTables rt = ALL_TABLES.as("RT");
        AllSchemas s = ALL_SCHEMAS.as("S");
        AllSchemas rs = ALL_SCHEMAS.as("RS");

        for (Record record : create().selectDistinct(
                        ALL_DATABASES.DB_NAME,
                        s.SCHEMA_NAME,
                        ALL_CONSTRAINTS.CONS_NAME,
                        t.TABLE_NAME,
                        rt.TABLE_NAME.as("REF_TABLE_NAME"),
                        rs.SCHEMA_NAME.as("REF_SCHEMA_NAME"),
                        ALL_INDEXES.INDEX_NAME.as("UNIQUE_CONSTRAINT_NAME"),
                        ALL_CONSTRAINTS.DEFINE
                )
                .from(ALL_CONSTRAINTS)
                .join(ALL_DATABASES).on(ALL_CONSTRAINTS.DB_ID.eq(ALL_DATABASES.DB_ID))
                .join(t).on(ALL_CONSTRAINTS.TABLE_ID.eq(t.TABLE_ID))
                .join(s).on(s.SCHEMA_ID.eq(t.SCHEMA_ID))

                //依赖所在表
                .join(rt).on(ALL_CONSTRAINTS.REF_TABLE_ID.eq(rt.TABLE_ID))
                .join(rs).on(rs.SCHEMA_ID.eq(rt.SCHEMA_ID))
                .join(ALL_INDEXES).on(ALL_INDEXES.TABLE_ID.eq(rt.TABLE_ID)).and(ALL_INDEXES.IS_UNIQUE.eq("TRUE"))
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
                            ALL_CONSTRAINTS.DEFINE,

                            // We need this additional, useless projection. See:
                            // https://jira.mariadb.org/browse/MDEV-21201
                            ALL_DATABASES.DB_NAME.as(ALL_CONSTRAINTS.CONSTRAINT_CATALOG),
                            ALL_SCHEMAS.SCHEMA_NAME.as(ALL_CONSTRAINTS.CONSTRAINT_SCHEMA)
                    )
                    .from(ALL_CONSTRAINTS)
                    .leftJoin(ALL_TABLES).on(ALL_TABLES.TABLE_ID.eq(ALL_CONSTRAINTS.TABLE_ID))
                    .leftJoin(ALL_SCHEMAS).on(ALL_SCHEMAS.SCHEMA_ID.eq(ALL_TABLES.SCHEMA_ID))
                    .leftJoin(ALL_DATABASES).on(ALL_TABLES.DB_ID.eq(ALL_DATABASES.DB_ID))
                    .where(ALL_SCHEMAS.SCHEMA_NAME.in(getInputSchemata()))
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
                        ALL_TABLES.TABLE_TYPE,
                        when(ALL_VIEWS.DEFINE.lower().like(inline("create%")), ALL_VIEWS.DEFINE)
                                .else_(inline("create view `").concat(ALL_TABLES.TABLE_NAME).concat("` as ").concat(ALL_VIEWS.DEFINE)).as(ALL_VIEWS.DEFINE))
                .from(ALL_TABLES)
                .leftJoin(ALL_VIEWS)
                .on(ALL_TABLES.SCHEMA_ID.eq(ALL_VIEWS.SCHEMA_ID))
                .and(ALL_TABLES.TABLE_NAME.eq(ALL_VIEWS.VIEW_NAME))

                .leftJoin(new AllSchemas("s")).on(ALL_TABLES.SCHEMA_ID.eq(ALL_SCHEMAS.SCHEMA_ID))
                .where(ALL_SCHEMAS.SCHEMA_NAME.in(getInputSchemata()).or(
                        getInputSchemata().size() == 1
                                ? ALL_SCHEMAS.SCHEMA_NAME.in(getInputSchemata())
                                : falseCondition()))

                // [#9291] MariaDB treats sequences as tables
                .orderBy(
                        ALL_SCHEMAS.SCHEMA_NAME,
                        ALL_TABLES.TABLE_NAME)) {

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

    /**
     * 这里的代码是改过的，可以先按照逻辑把查询结果还原。
     * */
    @Override
    protected List<RoutineDefinition> getRoutines0() throws SQLException {
        List<RoutineDefinition> result = new ArrayList<>();
        return result;
//        Result<Record6<String, String, String, String, String, ProcType>> records = is8()
//
//                ? create().select(
//                        ALL_SCHEMAS.SCHEMA_NAME,
//                        ALL_PROCEDURES.ROUTINE_NAME,
//                        ALL_PROCEDURES.ROUTINE_COMMENT,
//                        inline("").as(PROC.PARAM_LIST),
//                        inline("").as(PROC.RETURNS),
//                        when(ALL_PROCEDURES.PROC_ID.isNull(),ProcType.FUNCTION)
//                                .else_(ProcType.PROCEDURE).as(ALL_PROCEDURES.ROUTINE_TYPE))
//                .from(ALL_OBJECTS)
//                .leftJoin(ALL_SCHEMAS).on(ALL_SCHEMAS.SCHEMA_ID.eq(ALL_OBJECTS.SCHEMA_ID))
//                .leftJoin(ALL_PROCEDURES).on(ALL_PROCEDURES.PROC_ID.eq(ALL_OBJECTS.OBJ_ID))
//                .where(ALL_SCHEMAS.SCHEMA_NAME.in(getInputSchemata()))
//                .and(ALL_OBJECTS.OBJ_TYPE.eq("7"))
//                .orderBy(1, 2, 6)
//                .fetch()
//
//                : create().select(
//                        PROC.DB.as(ALL_PROCEDURES.ROUTINE_SCHEMA),
//                        PROC.NAME.as(ALL_PROCEDURES.ROUTINE_NAME),
//                        PROC.COMMENT.as(ALL_PROCEDURES.ROUTINE_COMMENT),
//                        inline("").as(PROC.PARAM_LIST),
//                        inline("").as(PROC.RETURNS),
//                        PROC.TYPE.as(ALL_PROCEDURES.ROUTINE_TYPE))
//                .from(PROC)
//                .where(PROC.DB.in(getInputSchemata()))
//                .orderBy(1, 2, 6)
//                .fetch();
//
//        Map<Record, Result<Record6<String, String, String, String, String, ProcType>>> groups =
//                records.intoGroups(new Field[]{ALL_SCHEMAS.SCHEMA_NAME, ALL_PROCEDURES.ROUTINE_NAME});
//
//        // procedures and functions with the same signature.
//        for (Entry<Record, Result<Record6<String, String, String, String, String, ProcType>>> entry : groups.entrySet()) {
//            Result<?> overloads = entry.getValue();
//
//            for (int i = 0; i < overloads.size(); i++) {
//                Record record = overloads.get(i);
//
//                SchemaDefinition schema = getSchema(record.get(ALL_SCHEMAS.SCHEMA_NAME));
//                String name = record.get(ALL_PROCEDURES.ROUTINE_NAME);
//                String comment = record.get(ALL_PROCEDURES.ROUTINE_COMMENT);
//                String params = is8() ? "" : new String();
//                String returns = is8() ? "" : new String(record.get(PROC.RETURNS));
//                ProcType type = record.get(ALL_PROCEDURES.ROUTINE_TYPE.coerce(PROC.TYPE).as(ALL_PROCEDURES.ROUTINE_TYPE));
//
//                if (overloads.size() > 1)
//                    result.add(new XuGuRoutineDefinition(schema, name, comment, params, returns, type, "_" + type.name()));
//                else
//                    result.add(new XuGuRoutineDefinition(schema, name, comment, params, returns, type, null));
//            }
//        }
//
//        return result;
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
