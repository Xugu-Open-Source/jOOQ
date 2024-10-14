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
     * The column <code>information_schema.AllSchemas.CATALOG_NAME</code>.
     */
    public final TableField<Record, String> CATALOG_NAME = createField(DSL.name("CATALOG_NAME"), SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>information_schema.AllSchemas.SCHEMA_NAME</code>.
     */
    public final TableField<Record, String> SCHEMA_NAME = createField(DSL.name("SCHEMA_NAME"), SQLDataType.VARCHAR(64).nullable(false), this, "");
    public final TableField<Record, String> SCHEMA_ID = createField(DSL.name("SCHEMA_ID"), SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>information_schema.AllSchemas.DEFAULT_CHARACTER_SET_NAME</code>.
     */
    public final TableField<Record, String> DEFAULT_CHARACTER_SET_NAME = createField(DSL.name("DEFAULT_CHARACTER_SET_NAME"), SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>information_schema.AllSchemas.DEFAULT_COLLATION_NAME</code>.
     */
    public final TableField<Record, String> DEFAULT_COLLATION_NAME = createField(DSL.name("DEFAULT_COLLATION_NAME"), SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>information_schema.AllSchemas.SQL_PATH</code>.
     */
    public final TableField<Record, byte[]> SQL_PATH = createField(DSL.name("SQL_PATH"), SQLDataType.BINARY, this, "");

    /**
     * The column <code>information_schema.AllSchemas.DEFAULT_ENCRYPTION</code>.
     */
    public final TableField<Record, String> DEFAULT_ENCRYPTION = createField(DSL.name("DEFAULT_ENCRYPTION"), SQLDataType.VARCHAR(3).nullable(false), this, "");

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

