/*
 * This file is generated by jOOQ.
 */
package org.jooq.meta.firebird.rdb.tables;


import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;
import org.jooq.meta.firebird.rdb.DefaultSchema;
import org.jooq.meta.firebird.rdb.Keys;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Rdb$generators extends TableImpl<Record> {

    private static final long serialVersionUID = -1552014164;

    /**
     * The reference instance of <code>RDB$GENERATORS</code>
     */
    public static final Rdb$generators RDB$GENERATORS = new Rdb$generators();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>RDB$GENERATORS.RDB$GENERATOR_NAME</code>.
     */
    public final TableField<Record, String> RDB$GENERATOR_NAME = createField(DSL.name("RDB$GENERATOR_NAME"), SQLDataType.CHAR(31), this, "");

    /**
     * The column <code>RDB$GENERATORS.RDB$GENERATOR_ID</code>.
     */
    public final TableField<Record, Short> RDB$GENERATOR_ID = createField(DSL.name("RDB$GENERATOR_ID"), SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>RDB$GENERATORS.RDB$SYSTEM_FLAG</code>.
     */
    public final TableField<Record, Short> RDB$SYSTEM_FLAG = createField(DSL.name("RDB$SYSTEM_FLAG"), SQLDataType.SMALLINT.nullable(false), this, "");

    /**
     * The column <code>RDB$GENERATORS.RDB$DESCRIPTION</code>.
     */
    public final TableField<Record, String> RDB$DESCRIPTION = createField(DSL.name("RDB$DESCRIPTION"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>RDB$GENERATORS.RDB$SECURITY_CLASS</code>.
     */
    public final TableField<Record, String> RDB$SECURITY_CLASS = createField(DSL.name("RDB$SECURITY_CLASS"), SQLDataType.CHAR(31), this, "");

    /**
     * The column <code>RDB$GENERATORS.RDB$OWNER_NAME</code>.
     */
    public final TableField<Record, String> RDB$OWNER_NAME = createField(DSL.name("RDB$OWNER_NAME"), SQLDataType.CHAR(31), this, "");

    /**
     * The column <code>RDB$GENERATORS.RDB$INITIAL_VALUE</code>.
     */
    public final TableField<Record, Long> RDB$INITIAL_VALUE = createField(DSL.name("RDB$INITIAL_VALUE"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>RDB$GENERATORS.RDB$GENERATOR_INCREMENT</code>.
     */
    public final TableField<Record, Integer> RDB$GENERATOR_INCREMENT = createField(DSL.name("RDB$GENERATOR_INCREMENT"), SQLDataType.INTEGER.nullable(false), this, "");

    private Rdb$generators(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private Rdb$generators(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>RDB$GENERATORS</code> table reference
     */
    public Rdb$generators(String alias) {
        this(DSL.name(alias), RDB$GENERATORS);
    }

    /**
     * Create an aliased <code>RDB$GENERATORS</code> table reference
     */
    public Rdb$generators(Name alias) {
        this(alias, RDB$GENERATORS);
    }

    /**
     * Create a <code>RDB$GENERATORS</code> table reference
     */
    public Rdb$generators() {
        this(DSL.name("RDB$GENERATORS"), null);
    }

    public <O extends Record> Rdb$generators(Table<O> child, ForeignKey<O, Record> key) {
        super(child, key, RDB$GENERATORS);
    }

    @Override
    public Schema getSchema() {
        return DefaultSchema.DEFAULT_SCHEMA;
    }

    @Override
    public List<UniqueKey<Record>> getKeys() {
        return Arrays.<UniqueKey<Record>>asList(Keys.RDB$INDEX_11, Keys.RDB$INDEX_46);
    }

    @Override
    public Rdb$generators as(String alias) {
        return new Rdb$generators(DSL.name(alias), this);
    }

    @Override
    public Rdb$generators as(Name alias) {
        return new Rdb$generators(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Rdb$generators rename(String name) {
        return new Rdb$generators(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Rdb$generators rename(Name name) {
        return new Rdb$generators(name, null);
    }
}
