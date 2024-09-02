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

import org.jooq.*;
import org.jooq.TableOptions.TableType;
import org.jooq.impl.DSL;
import org.jooq.meta.*;
import org.jooq.meta.xugu.information_schema.tables.Schemata;
import org.jooq.meta.xugu.information_schema.tables.Tables;
import org.jooq.meta.xugu.xugu.enums.ProcType;
import org.jooq.tools.csv.CSVReader;

import java.io.StringReader;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import static org.jooq.impl.DSL.*;
import static org.jooq.meta.xugu.information_schema.Tables.*;
import static org.jooq.meta.xugu.information_schema.tables.DataBases.DATA_BASES;
import static org.jooq.meta.xugu.xugu.Tables.PROC;

/**
 * @author Lukas Eder
 */
public class XuGuDatabase extends AbstractDatabase {

    private static Boolean is8;
    private static Boolean is8_0_16;

    @Override
    protected List<IndexDefinition> getIndexes0() throws SQLException {
        List<IndexDefinition> result = new ArrayList<>();

        // Same implementation as in H2Database and HSQLDBDatabase
        Map<Record, Result<Record>> indexes = create()
                // [#2059] In MemSQL primary key indexes are typically duplicated
                // (once with INDEX_TYPE = 'SHARD' and once with INDEX_TYPE = 'BTREE)
                .selectDistinct(
                        SCHEMATA.SCHEMA_NAME,
                        TABLES.TABLE_NAME,
                        STATISTICS.INDEX_NAME,
                        STATISTICS.NON_UNIQUE,
                        STATISTICS.KEYS,
                        inline("").as(STATISTICS.SEQ_IN_INDEX))
                .from(STATISTICS)
                .leftJoin(TABLES).on(TABLES.TABLE_ID.eq(STATISTICS.TABLE_ID))
                .leftJoin(SCHEMATA).on(SCHEMATA.SCHEMA_ID.eq(TABLES.SCHEMA_ID))
                .where(SCHEMATA.SCHEMA_NAME.in(getInputSchemata()).or(
                        getInputSchemata().size() == 1
                                ? SCHEMATA.SCHEMA_NAME.in(getInputSchemata())
                                : falseCondition()))
                .and(getIncludeSystemIndexes()
                                ? noCondition()
                                : row(SCHEMATA.SCHEMA_NAME, TABLES.TABLE_NAME, STATISTICS.INDEX_NAME).notIn(
                                select(SCHEMATA.SCHEMA_NAME, TABLES.TABLE_NAME, TABLE_CONSTRAINTS.CONSTRAINT_NAME)
                                        .from(TABLE_CONSTRAINTS)
                                        .leftJoin(TABLES).on(TABLES.TABLE_ID.eq(TABLE_CONSTRAINTS.TABLE_ID))
                                        .leftJoin(SCHEMATA).on(SCHEMATA.SCHEMA_ID.eq(TABLES.SCHEMA_ID))
                        )
                )
                .orderBy(
                        SCHEMATA.SCHEMA_NAME,
                        TABLES.TABLE_NAME,
                        STATISTICS.INDEX_NAME,
                        STATISTICS.INDEX_ID)
                .fetchGroups(
                        new Field[]{
                                SCHEMATA.SCHEMA_NAME,
                                TABLES.TABLE_NAME,
                                STATISTICS.INDEX_NAME,
                                STATISTICS.NON_UNIQUE
                        },
                        new Field[]{
                                STATISTICS.KEYS,
                                STATISTICS.SEQ_IN_INDEX
                        });

        indexLoop:
        for (Entry<Record, Result<Record>> entry : indexes.entrySet()) {
            final Record index = entry.getKey();
            final Result<Record> columns = entry.getValue();

            final SchemaDefinition tableSchema = getSchema(index.get(SCHEMATA.SCHEMA_NAME));
            if (tableSchema == null)
                continue indexLoop;

            final String indexName = index.get(STATISTICS.INDEX_NAME);
            final String tableName = index.get(TABLES.TABLE_NAME);
            final TableDefinition table = getTable(tableSchema, tableName);
            if (table == null)
                continue indexLoop;

            final boolean unique = !index.get(STATISTICS.NON_UNIQUE, boolean.class);

            // [#6310] [#6620] Function-based indexes are not yet supported
            for (Record column : columns)
                if (table.getColumn(column.get(STATISTICS.KEYS)) == null)
                    continue indexLoop;

            result.add(new AbstractIndexDefinition(tableSchema, indexName, table, unique) {
                List<IndexColumnDefinition> indexColumns = new ArrayList<>();

                {
                    for (Record column : columns) {
                        indexColumns.add(new DefaultIndexColumnDefinition(
                                this,
                                table.getColumn(column.get(STATISTICS.KEYS)),
                                SortOrder.ASC,
                                column.get(STATISTICS.SEQ_IN_INDEX, int.class)
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
            SchemaDefinition schema = getSchema(record.get(SCHEMATA.SCHEMA_NAME));
            String constraintName = record.get(STATISTICS.INDEX_NAME);
            String tableName = record.get(TABLES.TABLE_NAME);
            String columnName = record.get(STATISTICS.KEYS);

            String key = getKeyName(tableName, constraintName);
            TableDefinition table = getTable(schema, tableName);

            if (table != null)
                relations.addPrimaryKey(key, table, table.getColumn(columnName));
        }
    }

    @Override
    protected void loadUniqueKeys(DefaultRelations relations) throws SQLException {
        for (Record record : fetchKeys(false)) {
            SchemaDefinition schema = getSchema(record.get(SCHEMATA.SCHEMA_NAME));
            String constraintName = record.get(STATISTICS.INDEX_NAME);
            String tableName = record.get(TABLES.TABLE_NAME);
            String columnName = record.get(STATISTICS.KEYS);

            String key = getKeyName(tableName, constraintName);
            TableDefinition table = getTable(schema, tableName);

            if (table != null)
                relations.addUniqueKey(key, table, table.getColumn(columnName));
        }
    }

    private String getKeyName(String tableName, String keyName) {
        return "KEY_" + tableName + "_" + keyName;
    }

    protected boolean is8() {

        if (is8 == null)
            is8 = !exists(OBJECTS);

        return is8;
    }

    protected boolean is8_0_16() {

        if (is8_0_16 == null)
            is8_0_16 = exists(CHECK_CONSTRAINTS);

        return true;
    }

    private Result<?> fetchKeys(boolean primary) {

        // [#3560] It has been shown that querying the STATISTICS table is much faster on
        // very large databases than going through TABLE_CONSTRAINTS and KEY_COLUMN_USAGE
        // [#2059] In MemSQL primary key indexes are typically duplicated
        // (once with INDEX_TYPE = 'SHARD' and once with INDEX_TYPE = 'BTREE)
        return create().selectDistinct(
                        SCHEMATA.SCHEMA_NAME,
                        TABLES.TABLE_NAME,
                        STATISTICS.KEYS,
                        STATISTICS.INDEX_NAME,
                        inline(1).as(STATISTICS.SEQ_IN_INDEX))
                .from(STATISTICS)
                .leftJoin(TABLES).on(TABLES.TABLE_ID.eq(STATISTICS.TABLE_ID))
                .leftJoin(SCHEMATA).on(SCHEMATA.SCHEMA_ID.eq(TABLES.SCHEMA_ID))
                .where(SCHEMATA.SCHEMA_NAME.in(getInputSchemata()).or(
                        getInputSchemata().size() == 1
                                ? SCHEMATA.SCHEMA_NAME.in(getInputSchemata())
                                : falseCondition()))
                .and(primary
                        ? STATISTICS.INDEX_NAME.eq(inline("PRIMARY"))
                        : STATISTICS.INDEX_NAME.ne(inline("PRIMARY")).and(STATISTICS.NON_UNIQUE.eq(inline(1))))
                .orderBy(
                        SCHEMATA.SCHEMA_NAME,
                        TABLES.TABLE_NAME,
                        STATISTICS.INDEX_NAME,
                        STATISTICS.INDEX_ID)
                .fetch();
    }

    @Override
    protected void loadForeignKeys(DefaultRelations relations) throws SQLException {
        for (Record record : create().select(
                        SCHEMATA.SCHEMA_NAME,
                        REFERENTIAL_CONSTRAINTS.CONSTRAINT_NAME,
                        TABLES.TABLE_NAME,
                        TABLES.TABLE_NAME.as(REFERENTIAL_CONSTRAINTS.REFERENCED_TABLE_NAME),
                        inline("").as(REFERENTIAL_CONSTRAINTS.UNIQUE_CONSTRAINT_NAME),
                        inline("").as(REFERENTIAL_CONSTRAINTS.UNIQUE_CONSTRAINT_SCHEMA),
                        KEY_COLUMN_USAGE.COLUMN_NAME)
                .from(REFERENTIAL_CONSTRAINTS)
                .leftJoin(TABLES).on(TABLES.TABLE_ID.eq(REFERENTIAL_CONSTRAINTS.TABLE_ID))
                .leftJoin(SCHEMATA).on(SCHEMATA.SCHEMA_ID.eq(TABLES.SCHEMA_ID))
                .where(SCHEMATA.SCHEMA_NAME.in(getInputSchemata()).or(
                        getInputSchemata().size() == 1
                                ? SCHEMATA.SCHEMA_NAME.in(getInputSchemata())
                                : falseCondition()))
                .orderBy(
                        SCHEMATA.SCHEMA_NAME.asc(),
                        KEY_COLUMN_USAGE.CONSTRAINT_NAME.asc(),
                        KEY_COLUMN_USAGE.TABLE_ID.asc())
                .fetch()) {

            SchemaDefinition foreignKeySchema = getSchema(record.get(SCHEMATA.SCHEMA_NAME));
            SchemaDefinition uniqueKeySchema = getSchema(record.get(REFERENTIAL_CONSTRAINTS.UNIQUE_CONSTRAINT_SCHEMA));

            String foreignKey = record.get(REFERENTIAL_CONSTRAINTS.CONSTRAINT_NAME);
            String foreignKeyColumn = record.get(KEY_COLUMN_USAGE.COLUMN_NAME);
            String foreignKeyTableName = record.get(TABLES.TABLE_NAME);
            String uniqueKey = record.get(REFERENTIAL_CONSTRAINTS.UNIQUE_CONSTRAINT_NAME);
            String uniqueKeyTableName = record.get(REFERENTIAL_CONSTRAINTS.REFERENCED_TABLE_NAME);

            TableDefinition foreignKeyTable = getTable(foreignKeySchema, foreignKeyTableName);
            TableDefinition uniqueKeyTable = getTable(uniqueKeySchema, uniqueKeyTableName);

            if (foreignKeyTable != null)
                relations.addForeignKey(
                        foreignKey,
                        foreignKeyTable,
                        foreignKeyTable.getColumn(foreignKeyColumn),
                        getKeyName(uniqueKeyTableName, uniqueKey),
                        uniqueKeyTable
                );
        }
    }

    @Override
    protected void loadCheckConstraints(DefaultRelations relations) throws SQLException {
        if (is8_0_16()) {
            for (Record record : create()
                    .select(
                            SCHEMATA.SCHEMA_NAME,
                            TABLES.TABLE_NAME,
                            TABLE_CONSTRAINTS.CONSTRAINT_NAME,
                            TABLE_CONSTRAINTS.DEFINE.as(CHECK_CONSTRAINTS.CHECK_CLAUSE),

                            // We need this additional, useless projection. See:
                            // https://jira.mariadb.org/browse/MDEV-21201
                            DATA_BASES.DB_NAME.as(TABLE_CONSTRAINTS.CONSTRAINT_CATALOG),
                            SCHEMATA.SCHEMA_NAME.as(TABLE_CONSTRAINTS.CONSTRAINT_SCHEMA)
                    )
                    .from(TABLE_CONSTRAINTS)
                    .leftJoin(TABLES).on(TABLES.TABLE_ID.eq(REFERENTIAL_CONSTRAINTS.TABLE_ID))
                    .leftJoin(SCHEMATA).on(SCHEMATA.SCHEMA_ID.eq(TABLES.SCHEMA_ID))
                    .leftJoin(DATA_BASES).on(TABLES.DB_ID.eq(DATA_BASES.DB_ID))
                    .where(SCHEMATA.SCHEMA_NAME.in(getInputSchemata()))
                    .orderBy(
                            SCHEMATA.SCHEMA_NAME,
                            TABLES.TABLE_NAME,
                            TABLE_CONSTRAINTS.CONSTRAINT_NAME)) {

                SchemaDefinition schema = getSchema(record.get(SCHEMATA.SCHEMA_NAME));
                TableDefinition table = getTable(schema, record.get(TABLES.TABLE_NAME));

                if (table != null) {
                    relations.addCheckConstraint(table, new DefaultCheckConstraintDefinition(
                            schema,
                            table,
                            record.get(CHECK_CONSTRAINTS.CONSTRAINT_NAME),
                            record.get(CHECK_CONSTRAINTS.CHECK_CLAUSE)
                    ));
                }
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
                .select(SCHEMATA.SCHEMA_NAME)
                .from(SCHEMATA)
                .fetch(SCHEMATA.SCHEMA_NAME)) {

            result.add(new SchemaDefinition(this, name, ""));
        }

        return result;
    }

    @Override
    protected List<SequenceDefinition> getSequences0() throws SQLException {
        List<SequenceDefinition> result = new ArrayList<>();
        return result;
    }

    @Override
    protected List<TableDefinition> getTables0() throws SQLException {
        List<TableDefinition> result = new ArrayList<>();

        for (Record record : create().select(
                        SCHEMATA.SCHEMA_NAME,
                        TABLES.TABLE_NAME,
                        TABLES.TABLE_COMMENT,
                        TABLES.TABLE_TYPE,
                        when(VIEWS.VIEW_DEFINITION.lower().like(inline("create%")), VIEWS.VIEW_DEFINITION)
                                .else_(inline("create view `").concat(TABLES.TABLE_NAME).concat("` as ").concat(VIEWS.VIEW_DEFINITION)).as(VIEWS.VIEW_DEFINITION))
                .from(TABLES)
                .leftJoin(VIEWS)
                .on(TABLES.SCHEMA_ID.eq(VIEWS.SCHEMA_ID))
                .and(TABLES.TABLE_NAME.eq(VIEWS.VIEW_NAME))

                .leftJoin(new Schemata("s")).on(TABLES.SCHEMA_ID.eq(SCHEMATA.SCHEMA_ID))
                .where(SCHEMATA.SCHEMA_NAME.in(getInputSchemata()).or(
                        getInputSchemata().size() == 1
                                ? SCHEMATA.SCHEMA_NAME.in(getInputSchemata())
                                : falseCondition()))

                // [#9291] MariaDB treats sequences as tables
                .orderBy(
                        SCHEMATA.SCHEMA_NAME,
                        TABLES.TABLE_NAME)) {

            SchemaDefinition schema = getSchema(record.get(SCHEMATA.SCHEMA_NAME));
            String name = record.get(TABLES.TABLE_NAME);
            String comment = record.get(TABLES.TABLE_COMMENT);
            TableType tableType = record.get("TABLE_TYPE", TableType.class);
            String source = record.get(VIEWS.VIEW_DEFINITION);

            XuGuTableDefinition table = new XuGuTableDefinition(schema, name, comment, tableType, source);
            result.add(table);
        }

        return result;
    }

    @Override
    protected List<EnumDefinition> getEnums0() throws SQLException {
        List<EnumDefinition> result = new ArrayList<>();

        Result<Record5<String, String, String, String, String>> records = create()
                .select(
                        SCHEMATA.SCHEMA_NAME,
                        COLUMNS.COLUMN_COMMENT,
                        TABLES.TABLE_NAME,
                        COLUMNS.COLUMN_NAME,
                        COLUMNS.COLUMN_TYPE)
                .from(COLUMNS)
                .leftJoin(TABLES).on(TABLES.DB_ID.eq(COLUMNS.DB_ID))
                .leftJoin(SCHEMATA).on(TABLES.SCHEMA_ID.eq(SCHEMATA.SCHEMA_ID))
                .where(
                        COLUMNS.COLUMN_TYPE.like("enum(%)").and(
                                SCHEMATA.SCHEMA_NAME.in(getInputSchemata()).or(
                                        getInputSchemata().size() == 1
                                                ? SCHEMATA.SCHEMA_NAME.in(getInputSchemata())
                                                : falseCondition()))
                        )
                .orderBy(
                        SCHEMATA.SCHEMA_NAME.asc(),
                        TABLES.TABLE_NAME.asc(),
                        COLUMNS.COLUMN_NAME.asc())
                .fetch();

        for (Record record : records) {
            SchemaDefinition schema = getSchema(record.get(SCHEMATA.SCHEMA_NAME));

            String comment = record.get(COLUMNS.COLUMN_COMMENT);
            String table = record.get(TABLES.TABLE_NAME);
            String column = record.get(COLUMNS.COLUMN_NAME);
            String name = table + "_" + column;
            String columnType = record.get(COLUMNS.COLUMN_TYPE);

            // that are excluded from code generation
            TableDefinition tableDefinition = getTable(schema, table);
            if (tableDefinition != null) {
                ColumnDefinition columnDefinition = tableDefinition.getColumn(column);

                if (columnDefinition != null) {

                    // [#1137] Avoid generating enum classes for enum types that
                    // are explicitly forced to another type
                    if (getConfiguredForcedType(columnDefinition, columnDefinition.getType()) == null) {
                        DefaultEnumDefinition definition = new DefaultEnumDefinition(schema, name, comment);

                        CSVReader reader = new CSVReader(
                                new StringReader(columnType.replaceAll("(^enum\\()|(\\)$)", ""))
                                , ','  // Separator
                                , '\'' // Quote character
                                , true // Strict quotes
                        );

                        for (String string : reader.next()) {
                            definition.addLiteral(string);
                        }

                        result.add(definition);
                    }
                }
            }
        }

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
        Result<Record6<String, String, String, String, String, ProcType>> records = is8()

                ? create().select(
                        SCHEMATA.SCHEMA_NAME,
                        ROUTINES.ROUTINE_NAME,
                        ROUTINES.ROUTINE_COMMENT,
                        inline("").as(PROC.PARAM_LIST),
                        inline("").as(PROC.RETURNS),
                        when(ROUTINES.PROC_ID.isNull(),ProcType.FUNCTION)
                                .else_(ProcType.PROCEDURE).as(ROUTINES.ROUTINE_TYPE))
                .from(OBJECTS)
                .leftJoin(SCHEMATA).on(SCHEMATA.SCHEMA_ID.eq(OBJECTS.SCHEMA_ID))
                .leftJoin(ROUTINES).on(ROUTINES.PROC_ID.eq(OBJECTS.OBJ_ID))
                .where(SCHEMATA.SCHEMA_NAME.in(getInputSchemata()))
                .and(OBJECTS.OBJ_TYPE.eq("7"))
                .orderBy(1, 2, 6)
                .fetch()

                : create().select(
                        PROC.DB.as(ROUTINES.ROUTINE_SCHEMA),
                        PROC.NAME.as(ROUTINES.ROUTINE_NAME),
                        PROC.COMMENT.as(ROUTINES.ROUTINE_COMMENT),
                        inline("").as(PROC.PARAM_LIST),
                        inline("").as(PROC.RETURNS),
                        PROC.TYPE.as(ROUTINES.ROUTINE_TYPE))
                .from(PROC)
                .where(PROC.DB.in(getInputSchemata()))
                .orderBy(1, 2, 6)
                .fetch();

        Map<Record, Result<Record6<String, String, String, String, String, ProcType>>> groups =
                records.intoGroups(new Field[]{SCHEMATA.SCHEMA_NAME, ROUTINES.ROUTINE_NAME});

        // procedures and functions with the same signature.
        for (Entry<Record, Result<Record6<String, String, String, String, String, ProcType>>> entry : groups.entrySet()) {
            Result<?> overloads = entry.getValue();

            for (int i = 0; i < overloads.size(); i++) {
                Record record = overloads.get(i);

                SchemaDefinition schema = getSchema(record.get(SCHEMATA.SCHEMA_NAME));
                String name = record.get(ROUTINES.ROUTINE_NAME);
                String comment = record.get(ROUTINES.ROUTINE_COMMENT);
                String params = is8() ? "" : new String();
                String returns = is8() ? "" : new String(record.get(PROC.RETURNS));
                ProcType type = record.get(ROUTINES.ROUTINE_TYPE.coerce(PROC.TYPE).as(ROUTINES.ROUTINE_TYPE));

                if (overloads.size() > 1)
                    result.add(new XuGuRoutineDefinition(schema, name, comment, params, returns, type, "_" + type.name()));
                else
                    result.add(new XuGuRoutineDefinition(schema, name, comment, params, returns, type, null));
            }
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
