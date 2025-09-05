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

public class AllSchemas extends TableImpl<Record> {
    private static final long serialVersionUID = 994269618;

    /**
     * The reference instance of <code>information_schema.AllSchemas</code>
     */
    public static final AllSchemas ALL_SCHEMAS = new AllSchemas();

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
     * 模式ID
     */
    public final TableField<Record, Integer> SCHEMA_ID = createField(DSL.name("SCHEMA_ID"), SQLDataType.INTEGER, this, "");

    /**
     * 属主的用户ID
     */
    public final TableField<Record, Integer> USER_ID = createField(DSL.name("USER_ID"), SQLDataType.INTEGER, this, "");

    /**
     * 模式名
     */
    public final TableField<Record, String> SCHEMA_NAME = createField(DSL.name("SCHEMA_NAME"), SQLDataType.VARCHAR(128), this, "");

    /**
     * 注释信息
     */
    public final TableField<Record, String> COMMENTS = createField(DSL.name("COMMENTS"), SQLDataType.VARCHAR.nullable(true), this, "");

    /**
     * 是否系统内建
     */
    public final TableField<Record, Boolean> IS_SYS = createField(DSL.name("IS_SYS"), SQLDataType.BOOLEAN, this, "");

    /**
     * 是否记载变更日志
     */
    public final TableField<Record, Boolean> REG_MODIFY = createField(DSL.name("REG_MODIFY"), SQLDataType.BOOLEAN.nullable(true), this, "");

    /**
     * 存储域
     */
    public final TableField<Record, Integer> STO_ZONE = createField(DSL.name("STO_ZONE"), SQLDataType.INTEGER, this, "");

    /**
     * 保留字段
     */
    public final TableField<Record, String> RESERVED2 = createField(DSL.name("RESERVED2"), SQLDataType.VARCHAR(128).nullable(true), this, "");

    /**
     * 保留字段
     */
    public final TableField<Record, String> RESERVED3 = createField(DSL.name("RESERVED3"), SQLDataType.VARCHAR(128).nullable(true), this, "");

    private AllSchemas(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private AllSchemas(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>information_schema.AllSchemas</code> table reference
     */
    public AllSchemas(String alias) {
        this(DSL.name(alias), ALL_SCHEMAS);
    }

    /**
     * Create an aliased <code>information_schema.AllSchemas</code> table reference
     */
    public AllSchemas(Name alias) {
        this(alias, ALL_SCHEMAS);
    }

    /**
     * Create a <code>information_schema.AllSchemas</code> table reference
     */
    public AllSchemas() {
        this(DSL.name("All_SCHEMAS"), null);
    }

    public <O extends Record> AllSchemas(Table<O> child, ForeignKey<O, Record> key) {
        super(child, key, ALL_SCHEMAS);
    }

    @Override
    public Schema getSchema() {
        return All.ALL;
    }

    @Override
    public UniqueKey<Record> getPrimaryKey() {
        return Keys.SYNTHETIC_PK_ALL_SCHEMAS;
    }

    @Override
    public List<UniqueKey<Record>> getKeys() {
        return Arrays.<UniqueKey<Record>>asList(Keys.SYNTHETIC_PK_ALL_SCHEMAS);
    }

    @Override
    public AllSchemas as(String alias) {
        return new AllSchemas(DSL.name(alias), this);
    }

    @Override
    public AllSchemas as(Name alias) {
        return new AllSchemas(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public AllSchemas rename(String name) {
        return new AllSchemas(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public AllSchemas rename(Name name) {
        return new AllSchemas(name, null);
    }
}

