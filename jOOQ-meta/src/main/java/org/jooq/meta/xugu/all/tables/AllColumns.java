package org.jooq.meta.xugu.all.tables;

import org.jooq.*;
import org.jooq.Record;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;
import org.jooq.meta.xugu.all.All;
import org.jooq.types.UInteger;
import org.jooq.types.ULong;

public class AllColumns extends TableImpl<Record> {
    private static final long serialVersionUID = -1477092040;

    /**
     * The reference instance of <code>All.AllColumns</code>
     */
    public static final AllColumns ALL_COLUMNS = new AllColumns();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    public final TableField<Record, String> DB_ID = createField(DSL.name("DB_ID"), SQLDataType.VARCHAR(64).nullable(false), this, "");

    public final TableField<Record, String> TABLE_ID = createField(DSL.name("TABLE_ID"), SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * 添加col_no字段
     */
    public final TableField<Record, String> COL_NO = createField(DSL.name("COL_NO"), SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>ALL.AllColumns.COLUMN_NAME</code>.
     * 将column_name改为col_name
     */
    public final TableField<Record, String> COL_NAME = createField(DSL.name("COL_NAME"), SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>ALL.AllColumns.TABLE_NAME</code>.
     */
    public final TableField<Record, String> TABLE_NAME = createField(DSL.name("TABLE_NAME"), SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>ALL.AllColumns.TABLE_CATALOG</code>.
     */
    public final TableField<Record, String> TABLE_CATALOG = createField(DSL.name("TABLE_CATALOG"), SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>ALL.AllColumns.TABLE_SCHEMA</code>.
     */
    public final TableField<Record, String> TABLE_SCHEMA = createField(DSL.name("TABLE_SCHEMA"), SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>ALL.AllColumns.ORDINAL_POSITION</code>.
     */
    public final TableField<Record, UInteger> ORDINAL_POSITION = createField(DSL.name("ORDINAL_POSITION"), SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");

    /**
     * The column <code>ALL.AllColumns.COLUMN_DEFAULT</code>.
     * 将COLUMN_DEFAULT改为DEF_VAL
     */
    public final TableField<Record, String> DEF_VAL = createField(DSL.name("DEF_VAL"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>ALL.AllColumns.IS_NULLABLE</code>.
     * 将is_nullable改为not_null
     * 这里处理的非空逻辑，不确定虚谷是否与mysql相同，标记一下。
     */
    public final TableField<Record, String> NOT_NULL = createField(DSL.name("NOT_NULL"), SQLDataType.VARCHAR(5).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>ALL.AllColumns.DATA_TYPE</code>.
     * 改为TYPE_NAME
     */
    public final TableField<Record, String> TYPE_NAME = createField(DSL.name("TYPE_NAME"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>ALL.AllColumns.CHARACTER_MAXIMUM_LENGTH</code>.
     * 改为SCALE，虚谷的scale是用来计算标度和精度的字段，需要换算后得出标度和精度，似乎不能直接用。
     */
    public final TableField<Record, Long> SCALE = createField(DSL.name("SCALE"), SQLDataType.BIGINT, this, "");

    /**
     * 添加字段，用于自增判断
     */
    public final TableField<Record, String> IS_SERIAL=createField(DSL.name("IS_SERIAL"), SQLDataType.VARCHAR(3).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>ALL.AllColumns.CHARACTER_OCTET_LENGTH</code>.
     */
    public final TableField<Record, Long> CHARACTER_OCTET_LENGTH = createField(DSL.name("CHARACTER_OCTET_LENGTH"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>ALL.AllColumns.NUMERIC_PRECISION</code>.
     * 虚谷不匹配
     */
    public final TableField<Record, ULong> NUMERIC_PRECISION = createField(DSL.name("DISPERSION"), SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>ALL.AllColumns.NUMERIC_SCALE</code>.
     * 虚谷不匹配
     */
    public final TableField<Record, ULong> NUMERIC_SCALE = createField(DSL.name("DISPERSION"), SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>ALL.AllColumns.DATETIME_PRECISION</code>.
     */
    public final TableField<Record, UInteger> DATETIME_PRECISION = createField(DSL.name("DATETIME_PRECISION"), SQLDataType.INTEGERUNSIGNED, this, "");

    public final TableField<Record, UInteger> EMPTY_STRING = createField(DSL.name(""), SQLDataType.INTEGERUNSIGNED, this, "");

    /**
     * The column <code>ALL.AllColumns.CHARACTER_SET_NAME</code>.
     */
    public final TableField<Record, String> CHARACTER_SET_NAME = createField(DSL.name("CHARACTER_SET_NAME"), SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>ALL.AllColumns.COLLATION_NAME</code>.
     */
    public final TableField<Record, String> COLLATION_NAME = createField(DSL.name("COLLATION_NAME"), SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>ALL.AllColumns.COLUMN_TYPE</code>.
     */
    public final TableField<Record, String> COLUMN_TYPE = createField(DSL.name("TYPE_NAME"), SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>ALL.AllColumns.COLUMN_KEY</code>.
     */
    public final TableField<Record, String> COLUMN_KEY = createField(DSL.name("COLUMN_KEY"), SQLDataType.VARCHAR(3).nullable(false), this, "");

    /**
     * The column <code>ALL.AllColumns.EXTRA</code>.
     */
    public final TableField<Record, String> EXTRA = createField(DSL.name("COMMENTS"), SQLDataType.VARCHAR(256), this, "");

    /**
     * The column <code>ALL.AllColumns.PRIVILEGES</code>.
     */
    public final TableField<Record, String> PRIVILEGES = createField(DSL.name("PRIVILEGES"), SQLDataType.VARCHAR(154), this, "");

    /**
     * The column <code>ALL.AllColumns.COLUMN_COMMENT</code>.
     */
    public final TableField<Record, String> COMMENTS = createField(DSL.name("COMMENTS"), SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>ALL.AllColumns.GENERATION_EXPRESSION</code>.
     */
    public final TableField<Record, String> GENERATION_EXPRESSION = createField(DSL.name("GENERATION_EXPRESSION"), SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>ALL.AllColumns.SRS_ID</code>.
     */
    public final TableField<Record, UInteger> SRS_ID = createField(DSL.name("SRS_ID"), SQLDataType.INTEGERUNSIGNED, this, "");

    private AllColumns(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private AllColumns(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>All.AllColumns</code> table reference
     */
    public AllColumns(String alias) {
        this(DSL.name(alias),ALL_COLUMNS);
    }

    /**
     * Create an aliased <code>All.COLUMNS</code> table reference
     */
    public AllColumns(Name alias) {
        this(alias, ALL_COLUMNS);
    }

    /**
     * Create a <code>All.AllColumns</code> table reference
     */
    public AllColumns() {
        this(DSL.name("ALL_COLUMNS"), null);
    }

    public <O extends Record> AllColumns(Table<O> child, ForeignKey<O, Record> key) {
        super(child, key, ALL_COLUMNS);
    }

    @Override
    public Schema getSchema() {
        return All.ALL;
    }

    @Override
    public AllColumns as(String alias) {
        return new AllColumns(DSL.name(alias), this);
    }

    @Override
    public AllColumns as(Name alias) {
        return new AllColumns(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public AllColumns rename(String name) {
        return new AllColumns(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public AllColumns rename(Name name) {
        return new AllColumns(name, null);
    }
}
