/*
 * This file is generated by jOOQ.
 */
package org.jooq.meta.xugu.information_schema.tables;


import org.jooq.*;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;
import org.jooq.meta.xugu.information_schema.InformationSchema;
import org.jooq.types.UInteger;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Statistics extends TableImpl<Record> {

    private static final long serialVersionUID = -277536801;

    /**
     * The reference instance of <code>information_schema.STATISTICS</code>
     */
    public static final Statistics STATISTICS = new Statistics();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>information_schema.STATISTICS.TABLE_CATALOG</code>.
     */
    public final TableField<Record, String> TABLE_CATALOG = createField(DSL.name("TABLE_CATALOG"), SQLDataType.VARCHAR(64).nullable(false), this, "");

    public final TableField<Record, String> TABLE_ID = createField(DSL.name("TABLE_ID"), SQLDataType.VARCHAR(64).nullable(false), this, "");

    public final TableField<Record, String> KEYS = createField(DSL.name("KEYS"), SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>information_schema.STATISTICS.TABLE_SCHEMA</code>.
     */
    public final TableField<Record, String> TABLE_SCHEMA = createField(DSL.name("TABLE_SCHEMA"), SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>information_schema.STATISTICS.TABLE_NAME</code>.
     */
    public final TableField<Record, String> TABLE_NAME = createField(DSL.name("TABLE_NAME"), SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>information_schema.STATISTICS.NON_UNIQUE</code>.
     */
    public final TableField<Record, Integer> NON_UNIQUE = createField(DSL.name("IS_UNIQUE"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("0", SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>information_schema.STATISTICS.INDEX_SCHEMA</code>.
     */
    public final TableField<Record, String> INDEX_SCHEMA = createField(DSL.name("INDEX_SCHEMA"), SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>information_schema.STATISTICS.INDEX_NAME</code>.
     */
    public final TableField<Record, String> INDEX_NAME = createField(DSL.name("INDEX_NAME"), SQLDataType.VARCHAR(64), this, "");

    public final TableField<Record, String> INDEX_ID = createField(DSL.name("INDEX_ID"), SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>information_schema.STATISTICS.SEQ_IN_INDEX</code>.
     */
    public final TableField<Record, UInteger> SEQ_IN_INDEX = createField(DSL.name("SEQ_IN_INDEX"), SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>information_schema.STATISTICS.COLUMN_NAME</code>.
     */
    public final TableField<Record, String> COLUMN_NAME = createField(DSL.name("COLUMN_NAME"), SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>information_schema.STATISTICS.COLLATION</code>.
     */
    public final TableField<Record, String> COLLATION = createField(DSL.name("COLLATION"), SQLDataType.VARCHAR(1), this, "");

    /**
     * The column <code>information_schema.STATISTICS.CARDINALITY</code>.
     */
    public final TableField<Record, Long> CARDINALITY = createField(DSL.name("CARDINALITY"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>information_schema.STATISTICS.SUB_PART</code>.
     */
    public final TableField<Record, Long> SUB_PART = createField(DSL.name("SUB_PART"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>information_schema.STATISTICS.PACKED</code>.
     */
    public final TableField<Record, byte[]> PACKED = createField(DSL.name("PACKED"), SQLDataType.BINARY, this, "");

    /**
     * The column <code>information_schema.STATISTICS.NULLABLE</code>.
     */
    public final TableField<Record, String> NULLABLE = createField(DSL.name("NULLABLE"), SQLDataType.VARCHAR(3).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.STATISTICS.INDEX_TYPE</code>.
     */
    public final TableField<Record, String> INDEX_TYPE = createField(DSL.name("INDEX_TYPE"), SQLDataType.VARCHAR(11).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.STATISTICS.COMMENT</code>.
     */
    public final TableField<Record, String> COMMENT = createField(DSL.name("COMMENT"), SQLDataType.VARCHAR(8).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.STATISTICS.INDEX_COMMENT</code>.
     */
    public final TableField<Record, String> INDEX_COMMENT = createField(DSL.name("INDEX_COMMENT"), SQLDataType.VARCHAR(2048).nullable(false), this, "");

    /**
     * The column <code>information_schema.STATISTICS.IS_VISIBLE</code>.
     */
    public final TableField<Record, String> IS_VISIBLE = createField(DSL.name("IS_VISIBLE"), SQLDataType.VARCHAR(3).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>information_schema.STATISTICS.EXPRESSION</code>.
     */
    public final TableField<Record, String> EXPRESSION = createField(DSL.name("EXPRESSION"), SQLDataType.CLOB, this, "");

    private Statistics(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private Statistics(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>information_schema.STATISTICS</code> table reference
     */
    public Statistics(String alias) {
        this(DSL.name(alias), STATISTICS);
    }

    /**
     * Create an aliased <code>information_schema.STATISTICS</code> table reference
     */
    public Statistics(Name alias) {
        this(alias, STATISTICS);
    }

    /**
     * Create a <code>information_schema.STATISTICS</code> table reference
     */
    public Statistics() {
        this(DSL.name("ALL_INDEXES"), null);
    }

    public <O extends Record> Statistics(Table<O> child, ForeignKey<O, Record> key) {
        super(child, key, STATISTICS);
    }

    @Override
    public Schema getSchema() {
        return InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public Statistics as(String alias) {
        return new Statistics(DSL.name(alias), this);
    }

    @Override
    public Statistics as(Name alias) {
        return new Statistics(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Statistics rename(String name) {
        return new Statistics(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Statistics rename(Name name) {
        return new Statistics(name, null);
    }
}
