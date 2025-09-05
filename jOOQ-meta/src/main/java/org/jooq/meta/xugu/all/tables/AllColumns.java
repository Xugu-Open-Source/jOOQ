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

    public static final AllColumns ALL_COLUMNS = new AllColumns();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * 库ID
     */
    public final TableField<Record, Integer> DB_ID = createField(DSL.name("DB_ID"), SQLDataType.INTEGER, this, "");

    /**
     * 表ID
     */
    public final TableField<Record, Integer> TABLE_ID = createField(DSL.name("TABLE_ID"), SQLDataType.INTEGER, this, "");

    /**
     * 字段序号
     */
    public final TableField<Record, Integer> COL_NO = createField(DSL.name("COL_NO"), SQLDataType.INTEGER, this, "");

    /**
     * 字段名
     */
    public final TableField<Record, String> COL_NAME = createField(DSL.name("COL_NAME"), SQLDataType.VARCHAR(128), this, "");

    /**
     * 类型名
     */
    public final TableField<Record, String> TYPE_NAME = createField(DSL.name("TYPE_NAME"), SQLDataType.VARCHAR(128), this, "");

    /**
     * 数据尺寸
     */
    public final TableField<Record, Integer> SCALE = createField(DSL.name("SCALE"), SQLDataType.INTEGER, this, "");

    /**
     * 是否隐藏
     */
    public final TableField<Record, Boolean> IS_HIDE = createField(DSL.name("IS_HIDE"), SQLDataType.BOOLEAN.nullable(true), this, "");

    /**
     * 是否删除
     */
    public final TableField<Record, Boolean> DELETED = createField(DSL.name("DELETED"), SQLDataType.BOOLEAN.nullable(true), this, "");

    /**
     * 是否变长（对char binary有效）
     */
    public final TableField<Record, Boolean> VARYING = createField(DSL.name("VARYING"), SQLDataType.BOOLEAN, this, "");

    /**
     * 是否可为空
     */
    public final TableField<Record, Boolean> NOT_NULL = createField(DSL.name("NOT_NULL"), SQLDataType.BOOLEAN, this, "");

    /**
     * 是否为序列值
     */
    public final TableField<Record, Boolean> IS_SERIAL = createField(DSL.name("IS_SERIAL"), SQLDataType.BOOLEAN, this, "");

    /**
     * 序列值发生器的ID号
     */
    public final TableField<Record, Integer> SERIAL_ID = createField(DSL.name("SERIAL_ID"), SQLDataType.INTEGER, this, "");

    /**
     * 时间戳类型（'i':仅在插入时计值; 'u': 更改时计值; 'n': 非时间戳类型，不计值）
     */
    public final TableField<Record, String> TIMESTAMP_T = createField(DSL.name("TIMESTAMP_T"), SQLDataType.CHAR(1), this, "");

    /**
     * 校验器名
     */
    public final TableField<Record, String> COLLATOR = createField(DSL.name("COLLATOR"), SQLDataType.VARCHAR(128).nullable(true), this, "");

    /**
     * 默认值
     */
    public final TableField<Record, String> DEF_VAL = createField(DSL.name("DEF_VAL"), SQLDataType.VARCHAR(1024).nullable(true), this, "");

    /**
     * 该字段是否是虚字段
     */
    public final TableField<Record, Boolean> IS_VIRTUAL = createField(DSL.name("IS_VIRTUAL"), SQLDataType.BOOLEAN.nullable(true), this, "");

    /**
     * 注释信息
     */
    public final TableField<Record, String> COMMENTS = createField(DSL.name("COMMENTS"), SQLDataType.VARCHAR.nullable(true), this, "");

    /**
     * 重复率
     */
    public final TableField<Record, Double> REPET_RATE = createField(DSL.name("REPET_RATE"), SQLDataType.DOUBLE.nullable(true), this, "");

    /**
     * 离散度
     */
    public final TableField<Record, Double> DISPERSION = createField(DSL.name("DISPERSION"), SQLDataType.DOUBLE.nullable(true), this, "");

    /**
     * 最大值
     */
    public final TableField<Record, String> MAX_VAL = createField(DSL.name("MAX_VAL"), SQLDataType.VARCHAR(1024).nullable(true), this, "");

    /**
     * 最小值
     */
    public final TableField<Record, String> MIN_VAL = createField(DSL.name("MIN_VAL"), SQLDataType.VARCHAR(1024).nullable(true), this, "");

    /**
     * 柱状图
     */
    public final TableField<Record, String> HISTOGRAM = createField(DSL.name("HISTOGRAM"), SQLDataType.CLOB.nullable(true), this, "");

    /**
     * 分析控制标记('2':禁止收集统计信息; 其他值，允许收集)
     */
    public final TableField<Record, Byte> ANA_FLAG = createField(DSL.name("ANA_FLAG"), SQLDataType.TINYINT.nullable(true), this, "");

    /**
     * 是否用默认值替换显式空值(0:无替换; 1:仅插入时替换; 2:插入和更新时替换)
     *
     * @since XuguDB v12
     */
    public final TableField<Record, Byte> ON_NULL = createField(DSL.name("ON_NULL"), SQLDataType.TINYINT, this, "");

    /**
     * 非空值比例
     *
     * @since XuguDB v12
     */
    public final TableField<Record, Double> NON_NULL_RATE = createField(DSL.name("NON_NULL_RATE"), SQLDataType.DOUBLE.nullable(true), this, "");

    /**
     * 保留字段
     */
    public final TableField<Record, String> RESERVED3 = createField(DSL.name("RESERVED3"), SQLDataType.VARCHAR(128).nullable(true), this, "");

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
        this(DSL.name(alias), ALL_COLUMNS);
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
