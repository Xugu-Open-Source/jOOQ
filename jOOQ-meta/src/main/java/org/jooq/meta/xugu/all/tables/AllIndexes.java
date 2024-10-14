package org.jooq.meta.xugu.all.tables;

import org.jooq.*;
import org.jooq.Record;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;
import org.jooq.meta.xugu.all.All;
import org.jooq.types.UInteger;

public class AllIndexes extends TableImpl<Record> {

    private static final long serialVersionUID = -277536801;

    /**
     * The reference instance of <code>ALL.AllIndexes</code>
     */
    public static final AllIndexes ALL_INDEXES = new AllIndexes();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>ALL.AllIndexes.TABLE_CATALOG</code>.
     */
    public final TableField<Record, String> TABLE_CATALOG = createField(DSL.name("TABLE_CATALOG"), SQLDataType.VARCHAR(64).nullable(false), this, "");

    public final TableField<Record, String> TABLE_ID = createField(DSL.name("TABLE_ID"), SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * 相当于mysql的COLUMN_NAME。
     */
    public final TableField<Record, String> KEYS = createField(DSL.name("KEYS"), SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>ALL.AllIndexes.TABLE_SCHEMA</code>.
     */
    public final TableField<Record, String> TABLE_SCHEMA = createField(DSL.name("TABLE_SCHEMA"), SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>ALL.AllIndexes.TABLE_NAME</code>.
     */
    public final TableField<Record, String> TABLE_NAME = createField(DSL.name("TABLE_NAME"), SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>ALL.AllIndexes.NON_UNIQUE</code>.
     * 适配虚谷数据结构
     * NON_UNIQUE改为IS_UNIQUE
     */
    public final TableField<Record, Integer> IS_UNIQUE= createField(DSL.name("IS_UNIQUE"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("0", SQLDataType.INTEGER)), this, "");

    /**
     * 添加虚谷字段
     * 判断是否为主键
     */
    public final TableField<Record, Integer> IS_PRIMARY = createField(DSL.name("IS_PRIMARY"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.inline("0", SQLDataType.INTEGER)), this, "");


    /**
     * The column <code>ALL.AllIndexes.INDEX_SCHEMA</code>.
     */
    public final TableField<Record, String> INDEX_SCHEMA = createField(DSL.name("INDEX_SCHEMA"), SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>ALL.AllIndexes.INDEX_NAME</code>.
     */
    public final TableField<Record, String> INDEX_NAME = createField(DSL.name("INDEX_NAME"), SQLDataType.VARCHAR(64), this, "");

    public final TableField<Record, String> INDEX_ID = createField(DSL.name("INDEX_ID"), SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>ALL.AllIndexes.SEQ_IN_INDEX</code>.
     */
    public final TableField<Record, UInteger> SEQ_IN_INDEX = createField(DSL.name("SEQ_IN_INDEX"), SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>ALL.AllIndexes.COLUMN_NAME</code>.
     */
    public final TableField<Record, String> COLUMN_NAME = createField(DSL.name("COLUMN_NAME"), SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>ALL.AllIndexes.COLLATION</code>.
     */
    public final TableField<Record, String> COLLATION = createField(DSL.name("COLLATION"), SQLDataType.VARCHAR(1), this, "");

    /**
     * The column <code>ALL.AllIndexes.CARDINALITY</code>.
     */
    public final TableField<Record, Long> CARDINALITY = createField(DSL.name("CARDINALITY"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>ALL.AllIndexes.SUB_PART</code>.
     */
    public final TableField<Record, Long> SUB_PART = createField(DSL.name("SUB_PART"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>ALL.AllIndexes.PACKED</code>.
     */
    public final TableField<Record, byte[]> PACKED = createField(DSL.name("PACKED"), SQLDataType.BINARY, this, "");

    /**
     * The column <code>ALL.AllIndexes.NULLABLE</code>.
     */
    public final TableField<Record, String> NULLABLE = createField(DSL.name("NULLABLE"), SQLDataType.VARCHAR(3).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>ALL.AllIndexes.INDEX_TYPE</code>.
     */
    public final TableField<Record, String> INDEX_TYPE = createField(DSL.name("INDEX_TYPE"), SQLDataType.VARCHAR(11).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>ALL.AllIndexes.COMMENT</code>.
     */
    public final TableField<Record, String> COMMENT = createField(DSL.name("COMMENT"), SQLDataType.VARCHAR(8).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>ALL.AllIndexes.INDEX_COMMENT</code>.
     */
    public final TableField<Record, String> INDEX_COMMENT = createField(DSL.name("INDEX_COMMENT"), SQLDataType.VARCHAR(2048).nullable(false), this, "");

    /**
     * The column <code>ALL.AllIndexes.IS_VISIBLE</code>.
     */
    public final TableField<Record, String> IS_VISIBLE = createField(DSL.name("IS_VISIBLE"), SQLDataType.VARCHAR(3).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>ALL.AllIndexes.EXPRESSION</code>.
     */
    public final TableField<Record, String> EXPRESSION = createField(DSL.name("EXPRESSION"), SQLDataType.CLOB, this, "");

    private AllIndexes(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private AllIndexes(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>ALL.AllIndexes</code> table reference
     */
    public AllIndexes(String alias) {
        this(DSL.name(alias),ALL_INDEXES);
    }

    /**
     * Create an aliased <code>ALL.AllIndexes</code> table reference
     */
    public AllIndexes(Name alias) {
        this(alias, ALL_INDEXES);
    }

    /**
     * Create a <code>ALL.AllIndexes</code> table reference
     */
    public AllIndexes() {
        this(DSL.name("ALL_INDEXES"), null);
    }

    public <O extends Record> AllIndexes(Table<O> child, ForeignKey<O, Record> key) {
        super(child, key, ALL_INDEXES);
    }

    @Override
    public Schema getSchema() {
        return All.ALL;
    }

    @Override
    public AllIndexes as(String alias) {
        return new AllIndexes(DSL.name(alias), this);
    }

    @Override
    public AllIndexes as(Name alias) {
        return new AllIndexes(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public AllIndexes rename(String name) {
        return new AllIndexes(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public AllIndexes rename(Name name) {
        return new AllIndexes(name, null);
    }
}

