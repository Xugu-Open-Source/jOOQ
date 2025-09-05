package org.jooq.meta.xugu.all.tables;

import org.jooq.*;
import org.jooq.Record;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;
import org.jooq.meta.xugu.all.All;
import org.jooq.meta.xugu.all.Keys;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

public class AllViews extends TableImpl<Record> {

    private static final long serialVersionUID = -815570636;

    public static final AllViews ALL_VIEWS = new AllViews();

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
     * 属主ID
     */
    public final TableField<Record, Integer> USER_ID = createField(DSL.name("USER_ID"), SQLDataType.INTEGER, this, "");

    /**
     * 视图ID
     */
    public final TableField<Record, Integer> VIEW_ID = createField(DSL.name("VIEW_ID"), SQLDataType.INTEGER, this, "");

    /**
     * 视图名
     */
    public final TableField<Record, String> VIEW_NAME = createField(DSL.name("VIEW_NAME"), SQLDataType.VARCHAR(128), this, "");

    /**
     * 视图定义
     */
    public final TableField<Record, String> DEFINE = createField(DSL.name("DEFINE"), SQLDataType.CLOB, this, "");

    /**
     * 选项(0：无 1：with read only 2：with check option)
     */
    public final TableField<Record, Integer> OPTION = createField(DSL.name("OPTION"), SQLDataType.INTEGER, this, "");

    /**
     * 创建时间
     */
    public final TableField<Record, LocalDateTime> CREATE_TIME = createField(DSL.name("CREATE_TIME"), SQLDataType.LOCALDATETIME, this, "");

    /**
     * 是否有效
     */
    public final TableField<Record, Boolean> VALID = createField(DSL.name("VALID"), SQLDataType.BOOLEAN, this, "");

    /**
     * 是否系统内建
     */
    public final TableField<Record, Boolean> IS_SYS = createField(DSL.name("IS_SYS"), SQLDataType.BOOLEAN, this, "");

    /**
     * 注释信息
     */
    public final TableField<Record, String> COMMENTS = createField(DSL.name("COMMENTS"), SQLDataType.VARCHAR(128).nullable(true), this, "");

    /**
     * 保留字段
     */
    public final TableField<Record, String> RESERVED1 = createField(DSL.name("RESERVED1"), SQLDataType.VARCHAR(128).nullable(true), this, "");

    /**
     * 保留字段
     */
    public final TableField<Record, String> RESERVED2 = createField(DSL.name("RESERVED2"), SQLDataType.VARCHAR(128).nullable(true), this, "");

    private AllViews(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private AllViews(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>information_schema.ALL_VIEWS</code> table reference
     */
    public AllViews(String alias) {
        this(DSL.name(alias), ALL_VIEWS);
    }

    /**
     * Create an aliased <code>information_schema.ALL_VIEWS</code> table reference
     */
    public AllViews(Name alias) {
        this(alias, ALL_VIEWS);
    }

    /**
     * Create a <code>information_schema.ALL_VIEWS</code> table reference
     */
    public AllViews() {
        this(DSL.name("ALL_VIEWS"), null);
    }

    public <O extends Record> AllViews(Table<O> child, ForeignKey<O, Record> key) {
        super(child, key, ALL_VIEWS);
    }

    @Override
    public Schema getSchema() {
        return All.ALL;
    }

    @Override
    public AllViews as(String alias) {
        return new AllViews(DSL.name(alias), this);
    }

    @Override
    public AllViews as(Name alias) {
        return new AllViews(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public AllViews rename(String name) {
        return new AllViews(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public AllViews rename(Name name) {
        return new AllViews(name, null);
    }
}


