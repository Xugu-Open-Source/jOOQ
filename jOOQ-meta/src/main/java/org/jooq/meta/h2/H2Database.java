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
package org.jooq.meta.h2;

import static org.jooq.impl.DSL.condition;
import static org.jooq.impl.DSL.falseCondition;
import static org.jooq.impl.DSL.field;
import static org.jooq.impl.DSL.inline;
import static org.jooq.impl.DSL.name;
import static org.jooq.impl.DSL.noCondition;
import static org.jooq.impl.DSL.not;
import static org.jooq.impl.DSL.nullif;
import static org.jooq.impl.DSL.one;
import static org.jooq.impl.DSL.select;
import static org.jooq.impl.DSL.when;
import static org.jooq.meta.h2.information_schema.Tables.COLUMNS;
import static org.jooq.meta.h2.information_schema.Tables.CONSTRAINTS;
import static org.jooq.meta.h2.information_schema.Tables.CROSS_REFERENCES;
import static org.jooq.meta.h2.information_schema.Tables.DOMAINS;
import static org.jooq.meta.h2.information_schema.Tables.FUNCTION_ALIASES;
import static org.jooq.meta.h2.information_schema.Tables.INDEXES;
import static org.jooq.meta.h2.information_schema.Tables.SCHEMATA;
import static org.jooq.meta.h2.information_schema.Tables.SEQUENCES;
import static org.jooq.meta.h2.information_schema.Tables.TABLES;
import static org.jooq.meta.h2.information_schema.Tables.TYPE_INFO;
import static org.jooq.meta.h2.information_schema.Tables.VIEWS;

import java.io.StringReader;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.jooq.DSLContext;
import org.jooq.Field;
import org.jooq.Record;
import org.jooq.Record4;
import org.jooq.Result;
import org.jooq.SQLDialect;
import org.jooq.Select;
import org.jooq.SortOrder;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions.TableType;
import org.jooq.impl.DSL;
import org.jooq.meta.AbstractDatabase;
import org.jooq.meta.AbstractIndexDefinition;
import org.jooq.meta.ArrayDefinition;
import org.jooq.meta.CatalogDefinition;
import org.jooq.meta.ColumnDefinition;
import org.jooq.meta.DataTypeDefinition;
import org.jooq.meta.DefaultCheckConstraintDefinition;
import org.jooq.meta.DefaultDataTypeDefinition;
import org.jooq.meta.DefaultDomainDefinition;
import org.jooq.meta.DefaultEnumDefinition;
import org.jooq.meta.DefaultIndexColumnDefinition;
import org.jooq.meta.DefaultRelations;
import org.jooq.meta.DefaultSequenceDefinition;
import org.jooq.meta.DomainDefinition;
import org.jooq.meta.EnumDefinition;
import org.jooq.meta.IndexColumnDefinition;
import org.jooq.meta.IndexDefinition;
import org.jooq.meta.PackageDefinition;
import org.jooq.meta.RoutineDefinition;
import org.jooq.meta.SchemaDefinition;
import org.jooq.meta.SequenceDefinition;
import org.jooq.meta.TableDefinition;
import org.jooq.meta.UDTDefinition;
import org.jooq.tools.StringUtils;
import org.jooq.tools.csv.CSVReader;
import org.jooq.util.h2.H2DataType;

/**
 * H2 implementation of {@link AbstractDatabase}
 *
 * @author Espen Stromsnes
 */
public class H2Database extends AbstractDatabase {

    private static final long DEFAULT_SEQUENCE_CACHE    = 32;
    private static final long DEFAULT_SEQUENCE_MAXVALUE = Long.MAX_VALUE;

    @Override
    protected DSLContext create0() {
        return DSL.using(getConnection(), SQLDialect.H2);
    }

    @Override
    protected boolean exists0(TableField<?, ?> field) {
        return exists1(field, COLUMNS, COLUMNS.TABLE_SCHEMA, COLUMNS.TABLE_NAME, COLUMNS.COLUMN_NAME);
    }

    @Override
    protected boolean exists0(Table<?> table) {
        return exists1(table, TABLES, TABLES.TABLE_SCHEMA, TABLES.TABLE_NAME);
    }

    @Override
    protected List<IndexDefinition> getIndexes0() throws SQLException {
        List<IndexDefinition> result = new ArrayList<>();

        // Same implementation as in HSQLDBDatabase and MySQLDatabase
        Map<Record, Result<Record>> indexes = create()
            .select(
                INDEXES.TABLE_SCHEMA,
                INDEXES.TABLE_NAME,
                INDEXES.INDEX_NAME,
                INDEXES.NON_UNIQUE,
                INDEXES.COLUMN_NAME,
                INDEXES.ORDINAL_POSITION,
                INDEXES.ASC_OR_DESC)
            .from(INDEXES)
            .where(INDEXES.TABLE_SCHEMA.in(getInputSchemata()))
            .and(getIncludeSystemIndexes()
                ? noCondition()
                : not(condition(INDEXES.IS_GENERATED)))
            .orderBy(
                INDEXES.TABLE_SCHEMA,
                INDEXES.TABLE_NAME,
                INDEXES.INDEX_NAME,
                INDEXES.ORDINAL_POSITION)
            .fetchGroups(
                new Field[] {
                    INDEXES.TABLE_SCHEMA,
                    INDEXES.TABLE_NAME,
                    INDEXES.INDEX_NAME,
                    INDEXES.NON_UNIQUE
                },
                new Field[] {
                    INDEXES.COLUMN_NAME,
                    INDEXES.ORDINAL_POSITION
                });

        indexLoop:
        for (Entry<Record, Result<Record>> entry : indexes.entrySet()) {
            final Record index = entry.getKey();
            final Result<Record> columns = entry.getValue();

            final SchemaDefinition tableSchema = getSchema(index.get(INDEXES.TABLE_SCHEMA));
            if (tableSchema == null)
                continue indexLoop;

            final String indexName = index.get(INDEXES.INDEX_NAME);
            final String tableName = index.get(INDEXES.TABLE_NAME);
            final TableDefinition table = getTable(tableSchema, tableName);
            if (table == null)
                continue indexLoop;

            final boolean unique = !index.get(INDEXES.NON_UNIQUE, boolean.class);

            // [#6310] [#6620] Function-based indexes are not yet supported
            for (Record column : columns)
                if (table.getColumn(column.get(INDEXES.COLUMN_NAME)) == null)
                    continue indexLoop;

            result.add(new AbstractIndexDefinition(tableSchema, indexName, table, unique) {
                List<IndexColumnDefinition> indexColumns = new ArrayList<>();

                {
                    for (Record column : columns) {
                        indexColumns.add(new DefaultIndexColumnDefinition(
                            this,
                            table.getColumn(column.get(INDEXES.COLUMN_NAME)),
                            SortOrder.ASC,
                            column.get(INDEXES.ORDINAL_POSITION, int.class)
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

        // Workaround for https://github.com/h2database/h2database/issues/1000
        for (Record record : fetchKeys("PRIMARY KEY", "PRIMARY_KEY")) {
            SchemaDefinition schema = getSchema(record.get(CONSTRAINTS.TABLE_SCHEMA));

            if (schema != null) {
                String tableName = record.get(CONSTRAINTS.TABLE_NAME);
                String primaryKey = record.get(CONSTRAINTS.CONSTRAINT_NAME);
                String columnName = record.get(INDEXES.COLUMN_NAME);

                TableDefinition table = getTable(schema, tableName);
                if (table != null)
                    relations.addPrimaryKey(primaryKey, table, table.getColumn(columnName));
            }
        }
    }

    @Override
    protected void loadUniqueKeys(DefaultRelations relations) throws SQLException {
        for (Record record : fetchKeys("UNIQUE")) {
            SchemaDefinition schema = getSchema(record.get(CONSTRAINTS.TABLE_SCHEMA));

            if (schema != null) {
                String tableName = record.get(CONSTRAINTS.TABLE_NAME);
                String primaryKey = record.get(CONSTRAINTS.CONSTRAINT_NAME);
                String columnName = record.get(INDEXES.COLUMN_NAME);

                TableDefinition table = getTable(schema, tableName);
                if (table != null)
                    relations.addUniqueKey(primaryKey, table, table.getColumn(columnName));
            }
        }
    }

    private Result<Record4<String, String, String, String>> fetchKeys(String... constraintTypes) {
        return create().select(
                    CONSTRAINTS.TABLE_SCHEMA,
                    CONSTRAINTS.TABLE_NAME,
                    CONSTRAINTS.CONSTRAINT_NAME,
                    INDEXES.COLUMN_NAME)
                .from(CONSTRAINTS)
                .join(INDEXES)
                .on(CONSTRAINTS.TABLE_SCHEMA.eq(INDEXES.TABLE_SCHEMA))
                .and(CONSTRAINTS.TABLE_NAME.eq(INDEXES.TABLE_NAME))
                .and(CONSTRAINTS.UNIQUE_INDEX_NAME.eq(INDEXES.INDEX_NAME))
                .where(CONSTRAINTS.TABLE_SCHEMA.in(getInputSchemata()))
                .and(CONSTRAINTS.CONSTRAINT_TYPE.in(constraintTypes))
                .orderBy(
                    CONSTRAINTS.TABLE_SCHEMA,
                    CONSTRAINTS.CONSTRAINT_NAME,
                    INDEXES.ORDINAL_POSITION)
                .fetch();
    }

    @Override
    protected void loadForeignKeys(DefaultRelations relations) throws SQLException {
        for (Record record : create().select(
                    CROSS_REFERENCES.FK_NAME,
                    CROSS_REFERENCES.FKTABLE_NAME,
                    CROSS_REFERENCES.FKTABLE_SCHEMA,
                    CROSS_REFERENCES.FKCOLUMN_NAME,
                    CROSS_REFERENCES.PKCOLUMN_NAME,
                    CROSS_REFERENCES.referencedConstraint().CONSTRAINT_NAME,
                    CROSS_REFERENCES.referencedConstraint().TABLE_NAME,
                    CROSS_REFERENCES.referencedConstraint().CONSTRAINT_SCHEMA)
                .from(CROSS_REFERENCES)
                .where(CROSS_REFERENCES.FKTABLE_SCHEMA.in(getInputSchemata()))

                // Workaround for https://github.com/h2database/h2database/issues/1000
                .and(CROSS_REFERENCES.referencedConstraint().CONSTRAINT_TYPE.in("PRIMARY KEY", "PRIMARY_KEY", "UNIQUE"))
                .orderBy(
                    CROSS_REFERENCES.FKTABLE_SCHEMA.asc(),
                    CROSS_REFERENCES.FK_NAME.asc(),
                    CROSS_REFERENCES.ORDINAL_POSITION.asc())
                .fetch()) {

            SchemaDefinition foreignKeySchema = getSchema(record.get(CROSS_REFERENCES.FKTABLE_SCHEMA));
            SchemaDefinition uniqueKeySchema = getSchema(record.get(CROSS_REFERENCES.referencedConstraint().CONSTRAINT_SCHEMA));

            if (foreignKeySchema != null && uniqueKeySchema != null) {
                String foreignKey = record.get(CROSS_REFERENCES.FK_NAME);
                String foreignKeyTableName = record.get(CROSS_REFERENCES.FKTABLE_NAME);
                String foreignKeyColumn = record.get(CROSS_REFERENCES.FKCOLUMN_NAME);
                String uniqueKey = record.get(CROSS_REFERENCES.referencedConstraint().CONSTRAINT_NAME);
                String uniqueKeyTableName = record.get(CROSS_REFERENCES.referencedConstraint().TABLE_NAME);
                String uniqueKeyColumn = record.get(CROSS_REFERENCES.PKCOLUMN_NAME);

                TableDefinition foreignKeyTable = getTable(foreignKeySchema, foreignKeyTableName);
                TableDefinition uniqueKeyTable = getTable(uniqueKeySchema, uniqueKeyTableName);

                if (foreignKeyTable != null && uniqueKeyTable != null)
                    relations.addForeignKey(
                        foreignKey,
                        foreignKeyTable,
                        foreignKeyTable.getColumn(foreignKeyColumn),
                        uniqueKey,
                        uniqueKeyTable,
                        uniqueKeyTable.getColumn(uniqueKeyColumn),
                        true
                    );
            }
        }
    }

    @Override
    protected void loadCheckConstraints(DefaultRelations relations) throws SQLException {

        // TODO [https://github.com/h2database/h2database/issues/2286]
        // Starting from H2 1.4.201, we should no longer produce the below UNION
        Select<Record4<String, String, String, String>> inlineChecks = is1_4_201()
            ? select(inline(""), inline(""), inline(""), inline("")).where(falseCondition())
            : select(
                COLUMNS.TABLE_SCHEMA,
                COLUMNS.TABLE_NAME,
                COLUMNS.CHECK_CONSTRAINT,
                COLUMNS.CHECK_CONSTRAINT
            )
            .from(COLUMNS)
            .where(COLUMNS.CHECK_CONSTRAINT.nvl("").ne(""))
            .and(COLUMNS.TABLE_SCHEMA.in(getInputSchemata()));

        for (Record record : create()
            .select(
                CONSTRAINTS.TABLE_SCHEMA,
                CONSTRAINTS.TABLE_NAME,
                CONSTRAINTS.CONSTRAINT_NAME,
                CONSTRAINTS.CHECK_EXPRESSION
             )
            .from(CONSTRAINTS)
            .where(CONSTRAINTS.CONSTRAINT_TYPE.eq("CHECK"))
            .and(CONSTRAINTS.TABLE_SCHEMA.in(getInputSchemata()))
            .union(inlineChecks)) {

            SchemaDefinition schema = getSchema(record.get(CONSTRAINTS.TABLE_SCHEMA));

            if (schema != null) {
                TableDefinition table = getTable(schema, record.get(CONSTRAINTS.TABLE_NAME));

                if (table != null) {
                    relations.addCheckConstraint(table, new DefaultCheckConstraintDefinition(
                        schema,
                        table,
                        record.get(CONSTRAINTS.CONSTRAINT_NAME),
                        record.get(CONSTRAINTS.CHECK_EXPRESSION)
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

        for (Record record : create().select(
                    SCHEMATA.SCHEMA_NAME,
                    SCHEMATA.REMARKS)
                .from(SCHEMATA)
                .fetch()) {

            result.add(new SchemaDefinition(this,
                record.get(SCHEMATA.SCHEMA_NAME),
                record.get(SCHEMATA.REMARKS)));
        }

        return result;
    }

    @Override
    protected List<SequenceDefinition> getSequences0() throws SQLException {
        List<SequenceDefinition> result = new ArrayList<>();

        for (Record record : create().select(
                    SEQUENCES.SEQUENCE_SCHEMA,
                    SEQUENCES.SEQUENCE_NAME,
                    nullif(SEQUENCES.INCREMENT, one()).as(SEQUENCES.INCREMENT),
                    nullif(SEQUENCES.MIN_VALUE, one()).as(SEQUENCES.MIN_VALUE),
                    nullif(SEQUENCES.MAX_VALUE, inline(DEFAULT_SEQUENCE_MAXVALUE)).as(SEQUENCES.MAX_VALUE),
                    SEQUENCES.IS_CYCLE,
                    nullif(SEQUENCES.CACHE, inline(DEFAULT_SEQUENCE_CACHE)).as(SEQUENCES.CACHE)
                )
                .from(SEQUENCES)
                .where(SEQUENCES.SEQUENCE_SCHEMA.in(getInputSchemata()))
                .and(SEQUENCES.SEQUENCE_NAME.upper().notLike("SYSTEM!_SEQUENCE!_%", '!'))
                .orderBy(
                    SEQUENCES.SEQUENCE_SCHEMA,
                    SEQUENCES.SEQUENCE_NAME)
                .fetch()) {

            SchemaDefinition schema = getSchema(record.get(SEQUENCES.SEQUENCE_SCHEMA));

            if (schema != null) {
                String name = record.get(SEQUENCES.SEQUENCE_NAME);

                DefaultDataTypeDefinition type = new DefaultDataTypeDefinition(
                    this,
                    schema,
                    H2DataType.BIGINT.getTypeName()
                );

                result.add(new DefaultSequenceDefinition(
                    schema,
                    name,
                    type,
                    null,
                    null, // H2 doesn't support Postgres-style START WITH
                    record.get(SEQUENCES.INCREMENT),
                    record.get(SEQUENCES.MIN_VALUE),
                    record.get(SEQUENCES.MAX_VALUE),
                    record.get(SEQUENCES.IS_CYCLE),
                    record.get(SEQUENCES.CACHE)));
            }
        }

        return result;
    }

    @Override
    protected List<TableDefinition> getTables0() throws SQLException {
        List<TableDefinition> result = new ArrayList<>();

        for (Record record : create().select(
                    TABLES.TABLE_SCHEMA,
                    TABLES.TABLE_NAME,
                    when(TABLES.TABLE_TYPE.eq(inline("VIEW")), inline(TableType.VIEW.name()))
                       .when(TABLES.STORAGE_TYPE.like(inline("%TEMPORARY%")), inline(TableType.TEMPORARY.name()))
                       .else_(inline(TableType.TABLE.name())).as("table_type"),
                    TABLES.REMARKS,
                    VIEWS.VIEW_DEFINITION)
                .from(TABLES)
                .leftJoin(VIEWS)
                    .on(TABLES.TABLE_SCHEMA.eq(VIEWS.TABLE_SCHEMA))
                    .and(TABLES.TABLE_NAME.eq(VIEWS.TABLE_NAME))
                .where(TABLES.TABLE_SCHEMA.in(getInputSchemata()))
                .orderBy(
                    TABLES.TABLE_SCHEMA,
                    TABLES.TABLE_NAME)) {

            SchemaDefinition schema = getSchema(record.get(TABLES.TABLE_SCHEMA));

            if (schema != null) {
                String name = record.get(TABLES.TABLE_NAME);
                String comment = record.get(TABLES.REMARKS);
                TableType tableType = record.get("table_type", TableType.class);
                String source = record.get(VIEWS.VIEW_DEFINITION);

                H2TableDefinition table = new H2TableDefinition(schema, name, comment, tableType, source);
                result.add(table);
            }
        }

        return result;
    }

    @Override
    protected List<RoutineDefinition> getRoutines0() throws SQLException {
        List<RoutineDefinition> result = new ArrayList<>();

        Field<Boolean> overloaded = field(select(field(DSL.exists(
            select(one())
            .from(FUNCTION_ALIASES.as("a"))
            .where(field(name("a", FUNCTION_ALIASES.ALIAS_SCHEMA.getName())).eq(FUNCTION_ALIASES.ALIAS_SCHEMA))
            .and(field(name("a", FUNCTION_ALIASES.ALIAS_NAME.getName())).eq(FUNCTION_ALIASES.ALIAS_NAME))
            .and(field(name("a", FUNCTION_ALIASES.COLUMN_COUNT.getName())).ne(FUNCTION_ALIASES.COLUMN_COUNT))
        )))).as("overloaded");

        for (Record record : create()
                .select(
                    FUNCTION_ALIASES.ALIAS_SCHEMA,
                    FUNCTION_ALIASES.ALIAS_NAME,
                    FUNCTION_ALIASES.REMARKS,
                    FUNCTION_ALIASES.DATA_TYPE,
                    FUNCTION_ALIASES.RETURNS_RESULT,
                    FUNCTION_ALIASES.COLUMN_COUNT,
                    overloaded,
                    TYPE_INFO.TYPE_NAME,
                    TYPE_INFO.PRECISION,
                    TYPE_INFO.MAXIMUM_SCALE)
                .from(FUNCTION_ALIASES)
                .leftOuterJoin(TYPE_INFO)
                .on(FUNCTION_ALIASES.DATA_TYPE.equal(TYPE_INFO.DATA_TYPE))
                // [#1256] TODO implement this correctly. Not sure if POS = 0
                // is the right predicate to rule out duplicate entries in TYPE_INFO
                .and(TYPE_INFO.POS.equal(0))
                .where(FUNCTION_ALIASES.ALIAS_SCHEMA.in(getInputSchemata()))
                .and(FUNCTION_ALIASES.RETURNS_RESULT.in((short) 1, (short) 2))
                .orderBy(FUNCTION_ALIASES.ALIAS_NAME).fetch()) {

            SchemaDefinition schema = getSchema(record.get(FUNCTION_ALIASES.ALIAS_SCHEMA));

            if (schema != null) {
                String name = record.get(FUNCTION_ALIASES.ALIAS_NAME);
                String comment = record.get(FUNCTION_ALIASES.REMARKS);
                String typeName = record.get(TYPE_INFO.TYPE_NAME);
                Integer precision = record.get(TYPE_INFO.PRECISION);
                Short scale = record.get(TYPE_INFO.MAXIMUM_SCALE);
                String overload = record.get(overloaded)
                    ? record.get(FUNCTION_ALIASES.COLUMN_COUNT, String.class)
                    : null;

                result.add(new H2RoutineDefinition(schema, name, comment, typeName, precision, scale, overload));
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
    protected List<EnumDefinition> getEnums0() throws SQLException {
        List<EnumDefinition> result = new ArrayList<>();

        if (!is1_4_197())
            return result;

        getInlineEnums(result);
        getDomainEnums(result);

        return result;
    }

    private void getInlineEnums(List<EnumDefinition> result) {

        enumLoop:
        for (Record record : create()
                .select(
                    COLUMNS.TABLE_SCHEMA,
                    COLUMNS.TABLE_NAME,
                    COLUMNS.COLUMN_NAME,
                    COLUMNS.COLUMN_TYPE)
                .from(COLUMNS)
                .where(
                    COLUMNS.COLUMN_TYPE.like("ENUM(%)%").and(
                    COLUMNS.TABLE_SCHEMA.in(getInputSchemata())))
                .orderBy(
                    COLUMNS.TABLE_SCHEMA.asc(),
                    COLUMNS.TABLE_NAME.asc(),
                    COLUMNS.COLUMN_NAME.asc())) {

            SchemaDefinition schema = getSchema(record.get(COLUMNS.TABLE_SCHEMA));
            if (schema == null)
                continue enumLoop;

            String table = record.get(COLUMNS.TABLE_NAME);
            String column = record.get(COLUMNS.COLUMN_NAME);
            String name = table + "_" + column;
            String columnType = record.get(COLUMNS.COLUMN_TYPE);

            // [#1237] Don't generate enum classes for columns in MySQL tables
            // that are excluded from code generation
            TableDefinition tableDefinition = getTable(schema, table);
            if (tableDefinition != null) {
                ColumnDefinition columnDefinition = tableDefinition.getColumn(column);

                if (columnDefinition != null) {

                    // [#1137] Avoid generating enum classes for enum types that
                    // are explicitly forced to another type
                    if (getConfiguredForcedType(columnDefinition, columnDefinition.getType()) == null) {
                        DefaultEnumDefinition definition = new DefaultEnumDefinition(schema, name, "");

                        CSVReader reader = new CSVReader(
                            new StringReader(columnType.replaceAll("(^enum\\()|(\\).*$)", ""))
                           ,','  // Separator
                           ,'\'' // Quote character
                           ,true // Strict quotes
                        );

                        for (String string : reader.next())
                            definition.addLiteral(string);

                        result.add(definition);
                    }
                }
            }
        }
    }

    private void getDomainEnums(List<EnumDefinition> result) {

        enumLoop:
        for (Record record : create()
                .select(
                    DOMAINS.DOMAIN_SCHEMA,
                    DOMAINS.DOMAIN_NAME,
                    DOMAINS.SQL)
                .from(DOMAINS)
                .where(DOMAINS.TYPE_NAME.eq(inline("ENUM")))
                .and(DOMAINS.DOMAIN_SCHEMA.in(getInputSchemata()))
                .orderBy(
                    DOMAINS.DOMAIN_SCHEMA,
                    DOMAINS.DOMAIN_NAME)) {

            SchemaDefinition schema = getSchema(record.get(DOMAINS.DOMAIN_SCHEMA));
            if (schema == null)
                continue enumLoop;

            String name = record.get(DOMAINS.DOMAIN_NAME);
            String sql = record.get(DOMAINS.SQL);

            DefaultEnumDefinition definition = new DefaultEnumDefinition(schema, name, "");

            CSVReader reader = new CSVReader(
                new StringReader(sql.replaceAll("(?i:(^.*as enum\\()|(\\).*$))", ""))
               ,','  // Separator
               ,'\'' // Quote character
               ,true // Strict quotes
            );

            for (String string : reader.next())
                definition.addLiteral(string);

            result.add(definition);
        }
    }

    @Override
    protected List<DomainDefinition> getDomains0() throws SQLException {
        List<DomainDefinition> result = new ArrayList<>();

        for (Record record : create()
            .select(
                DOMAINS.DOMAIN_SCHEMA,
                DOMAINS.DOMAIN_NAME,
                DOMAINS.TYPE_NAME,
                DOMAINS.PRECISION,
                DOMAINS.SCALE,
                DOMAINS.IS_NULLABLE,
                DOMAINS.COLUMN_DEFAULT,
                DOMAINS.CHECK_CONSTRAINT)
            .from(DOMAINS)
            .where(DOMAINS.DOMAIN_SCHEMA.in(getInputSchemata()))

            // [#7917] Starting from 1.4.198, ENUM types are stored as domains
            .and(DOMAINS.TYPE_NAME.ne(inline("ENUM")))
            .orderBy(DOMAINS.DOMAIN_SCHEMA, DOMAINS.DOMAIN_NAME)
        ) {
            // [#7644] [#11721] H2 puts DATETIME_PRECISION in NUMERIC_SCALE column
            boolean isTimestamp = record.get(DOMAINS.TYPE_NAME).trim().toLowerCase().startsWith("timestamp");

            SchemaDefinition schema = getSchema(record.get(DOMAINS.DOMAIN_SCHEMA));

            DataTypeDefinition baseType = new DefaultDataTypeDefinition(
                this,
                schema,
                record.get(DOMAINS.TYPE_NAME),
                record.get(DOMAINS.PRECISION),
                isTimestamp
                    ? record.get(DOMAINS.SCALE)
                    : record.get(DOMAINS.PRECISION),
                isTimestamp
                    ? 0
                    : record.get(DOMAINS.SCALE),
               !record.get(DOMAINS.IS_NULLABLE, boolean.class),
                record.get(DOMAINS.COLUMN_DEFAULT)
            );

            DefaultDomainDefinition domain = new DefaultDomainDefinition(
                schema,
                record.get(DOMAINS.DOMAIN_NAME),
                baseType
            );

            if (!StringUtils.isBlank(record.get(DOMAINS.CHECK_CONSTRAINT)))
                domain.addCheckClause(record.get(DOMAINS.CHECK_CONSTRAINT));

            result.add(domain);
        }

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

    private static Boolean is1_4_197;
    private static Boolean is1_4_198;
    private static Boolean is1_4_201;

    boolean is1_4_197() {

        // [#5874] The COLUMNS.COLUMN_TYPE column was introduced in H2 1.4.197
        if (is1_4_197 == null)
            is1_4_197 = exists(COLUMNS.COLUMN_TYPE);

        return is1_4_197;
    }

    boolean is1_4_198() {

        // [#5874] The COLUMNS.IS_VISIBLE column was introduced in H2 1.4.198
        if (is1_4_198 == null)
            is1_4_198 = exists(COLUMNS.IS_VISIBLE);

        return is1_4_198;
    }

    boolean is1_4_201() {

        // [https://github.com/h2database/h2database/issues/2286]
        // The COLUMNS.CHECK_CONSTRAINT column was removed backwards incompatibly in H2 1.4.201
        if (is1_4_201 == null)
            is1_4_201 = !exists(COLUMNS.CHECK_CONSTRAINT);

        return is1_4_201;
    }
}
