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
     * 添加新字段
     */
    public final TableField<Record, String> DB_ID = createField(DSL.name("DB_ID"), SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * 添加新字段
     */
    public final TableField<Record, String> REF_TABLE_ID = createField(DSL.name("REF_TABLE_ID"), SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * 添加新字段
     */
    public final TableField<Record, String> CONS_TYPE = createField(DSL.name("CONS_TYPE"), SQLDataType.VARCHAR(64).nullable(false), this, "");


    /**
     * The column <code>ALL.ALL_CONSTRAINTS.CONSTRAINT_CATALOG</code>.
     */
    public final TableField<Record, String> CONSTRAINT_CATALOG = createField(DSL.name("CONSTRAINT_CATALOG"), SQLDataType.VARCHAR(64).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>ALL.ALL_CONSTRAINTS.CONSTRAINT_SCHEMA</code>.
     */
    public final TableField<Record, String> CONSTRAINT_SCHEMA = createField(DSL.name("CONSTRAINT_SCHEMA"), SQLDataType.VARCHAR(64).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>ALL.ALL_CONSTRAINTS.CONSTRAINT_NAME</code>.
     */
    public final TableField<Record, String> CONS_NAME = createField(DSL.name("CONS_NAME"), SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>ALL.ALL_CONSTRAINTS.TABLE_SCHEMA</code>.
     */
    public final TableField<Record, String> TABLE_SCHEMA = createField(DSL.name("TABLE_SCHEMA"), SQLDataType.VARCHAR(64).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "");

    /**
     * 添加新字段，改变字段长度
     * */
    public final TableField<Record, String> DEFINE = createField(DSL.name("DEFINE"), SQLDataType.VARCHAR(500).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>ALL.ALL_CONSTRAINTS.TABLE_NAME</code>.
     */
    public final TableField<Record, String> TABLE_NAME = createField(DSL.name("TABLE_NAME"), SQLDataType.VARCHAR(64).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "");

    public final TableField<Record, String> TABLE_ID = createField(DSL.name("TABLE_ID"), SQLDataType.VARCHAR(64).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>ALL.ALL_CONSTRAINTS.CONSTRAINT_TYPE</code>.
     */
    public final TableField<Record, String> CONSTRAINT_TYPE = createField(DSL.name("CONSTRAINT_TYPE"), SQLDataType.VARCHAR(11).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>ALL.ALL_CONSTRAINTS.ENFORCED</code>.
     */
    public final TableField<Record, String> ENFORCED = createField(DSL.name("ENFORCED"), SQLDataType.VARCHAR(3).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "");

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
