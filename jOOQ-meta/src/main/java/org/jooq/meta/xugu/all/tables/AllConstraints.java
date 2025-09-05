package org.jooq.meta.xugu.all.tables;

import org.jooq.*;
import org.jooq.Record;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;
import org.jooq.meta.xugu.all.All;
import org.jooq.meta.xugu.all.Keys;

import java.util.Arrays;
import java.util.List;

public class AllConstraints extends TableImpl<Record> {

    private static final long serialVersionUID = -1723893463;

    /**
     * The reference instance of <code>ALL.ALL_CONSTRAINTS</code>
     */
    public static final AllConstraints ALL_CONSTRAINTS = new AllConstraints();

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
     * 引用的表的ID（对于外键约束有效）
     */
    public final TableField<Record, Integer> REF_TABLE_ID = createField(DSL.name("REF_TABLE_ID"), SQLDataType.INTEGER.nullable(true), this, "");

    /**
     * 约束名
     */
    public final TableField<Record, String> CONS_NAME = createField(DSL.name("CONS_NAME"), SQLDataType.VARCHAR(128), this, "");

    /**
     * 约束类型('F'：外键；'R'：引用外键；'C'：值检查；'U'：唯一值；'P'：主键)
     */
    public final TableField<Record, String> CONS_TYPE = createField(DSL.name("CONS_TYPE"), SQLDataType.CHAR(1), this, "");

    /**
     * 外键匹配方式('A'：全部匹配；'P'：部分匹配; 'U': 简单匹配(只要约束字段中含有空值，则不作外键匹配检查))
     */
    public final TableField<Record, String> MATCH_TYPE = createField(DSL.name("MATCH_TYPE"), SQLDataType.CHAR(1).nullable(true), this, "");

    /**
     * 延期特性
     */
    public final TableField<Record, Boolean> DEFERRABLE = createField(DSL.name("DEFERRABLE"), SQLDataType.BOOLEAN.nullable(true), this, "");

    /**
     * 延期特性的初始设置
     */
    public final TableField<Record, Boolean> INITDEFERRED = createField(DSL.name("INITDEFERRED"), SQLDataType.BOOLEAN.nullable(true), this, "");

    /**
     * 约束定义
     */
    public final TableField<Record, String> DEFINE = createField(DSL.name("DEFINE"), SQLDataType.VARCHAR, this, "");

    /**
     * 当引用的记录更改时的反向动作
     */
    public final TableField<Record, String> UPDATE_ACTION = createField(DSL.name("UPDATE_ACTION"), SQLDataType.CHAR(1).nullable(true), this, "");

    /**
     * 当引用的记录删除时的反向动作
     */
    public final TableField<Record, String> DELETE_ACTION = createField(DSL.name("DELETE_ACTION"), SQLDataType.CHAR(1).nullable(true), this, "");

    /**
     * 值检查约束是否可用（对于值检查约束有效）
     */
    public final TableField<Record, Boolean> ENABLE = createField(DSL.name("ENABLE"), SQLDataType.BOOLEAN, this, "");

    /**
     * 是否有效
     */
    public final TableField<Record, Boolean> VALID = createField(DSL.name("VALID"), SQLDataType.BOOLEAN, this, "");

    /**
     * 是否系统内建
     */
    public final TableField<Record, Boolean> IS_SYS = createField(DSL.name("IS_SYS"), SQLDataType.BOOLEAN.nullable(true), this, "");

    /**
     * 保留字段
     */
    public final TableField<Record, String> RESERVED1 = createField(DSL.name("RESERVED1"), SQLDataType.VARCHAR.nullable(true), this, "");

    /**
     * 保留字段
     */
    public final TableField<Record, String> RESERVED2 = createField(DSL.name("RESERVED2"), SQLDataType.VARCHAR.nullable(true), this, "");

    private AllConstraints(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private AllConstraints(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>ALL.ALL_CONSTRAINTS</code> table reference
     */
    public AllConstraints(String alias) {
        this(DSL.name(alias), ALL_CONSTRAINTS);
    }

    /**
     * Create an aliased <code>ALL.ALL_CONSTRAINTS</code> table reference
     */
    public AllConstraints(Name alias) {
        this(alias, ALL_CONSTRAINTS);
    }

    /**
     * Create a <code>ALL.ALL_CONSTRAINTS</code> table reference
     */
    public AllConstraints() {
        this(DSL.name("ALL_CONSTRAINTS"), null);
    }

    public <O extends Record> AllConstraints(Table<O> child, ForeignKey<O, Record> key) {
        super(child, key, ALL_CONSTRAINTS);
    }

    @Override
    public Schema getSchema() {
        return All.ALL;
    }

    @Override
    public UniqueKey<Record> getPrimaryKey() {
        return Keys.SYNTHETIC_PK_ALL_CONSTRAINTS;
    }

    @Override
    public List<UniqueKey<Record>> getKeys() {
        return Arrays.<UniqueKey<Record>>asList(Keys.SYNTHETIC_PK_ALL_CONSTRAINTS);
    }

    @Override
    public AllConstraints as(String alias) {
        return new AllConstraints(DSL.name(alias), this);
    }

    @Override
    public AllConstraints as(Name alias) {
        return new AllConstraints(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public AllConstraints rename(String name) {
        return new AllConstraints(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public AllConstraints rename(Name name) {
        return new AllConstraints(name, null);
    }
}
