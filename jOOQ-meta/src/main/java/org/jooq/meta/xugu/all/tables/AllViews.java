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

public class AllViews extends TableImpl<Record> {
  
    private static final long serialVersionUID = -815570636;

    /**
     * The reference instance of <code>information_schema.ALL_VIEWS</code>
     */
    public static final AllViews ALL_VIEWS = new AllViews();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>information_schema.ALL_VIEWS.TABLE_CATALOG</code>.
     */
    public final TableField<Record, String> TABLE_CATALOG = createField(DSL.name("TABLE_CATALOG"), SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>information_schema.ALL_VIEWS.TABLE_SCHEMA</code>.
     */
    public final TableField<Record, String> TABLE_SCHEMA = createField(DSL.name("TABLE_SCHEMA"), SQLDataType.VARCHAR(64).nullable(false), this, "");

    public final TableField<Record, String> SCHEMA_ID = createField(DSL.name("SCHEMA_ID"), SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>information_schema.ALL_VIEWS.TABLE_NAME</code>.
     */
    public final TableField<Record, String> TABLE_NAME = createField(DSL.name("TABLE_NAME"), SQLDataType.VARCHAR(64).nullable(false), this, "");
    public final TableField<Record, String> VIEW_NAME = createField(DSL.name("VIEW_NAME"), SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>information_schema.ALL_VIEWS.VIEW_DEFINITION</code>.
     */
    public final TableField<Record, String> DEFINE = createField(DSL.name("DEFINE"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>information_schema.ALL_VIEWS.CHECK_OPTION</code>.
     */
    public final TableField<Record, String> CHECK_OPTION = createField(DSL.name("CHECK_OPTION"), SQLDataType.VARCHAR(8), this, "");

    /**
     * The column <code>information_schema.ALL_VIEWS.IS_UPDATABLE</code>.
     */
    public final TableField<Record, String> IS_UPDATABLE = createField(DSL.name("IS_UPDATABLE"), SQLDataType.VARCHAR(3), this, "");

    /**
     * The column <code>information_schema.ALL_VIEWS.DEFINER</code>.
     */
    public final TableField<Record, String> DEFINER = createField(DSL.name("DEFINER"), SQLDataType.VARCHAR(288), this, "");

    /**
     * The column <code>information_schema.ALL_VIEWS.SECURITY_TYPE</code>.
     */
    public final TableField<Record, String> SECURITY_TYPE = createField(DSL.name("SECURITY_TYPE"), SQLDataType.VARCHAR(7), this, "");

    /**
     * The column <code>information_schema.ALL_VIEWS.CHARACTER_SET_CLIENT</code>.
     */
    public final TableField<Record, String> CHARACTER_SET_CLIENT = createField(DSL.name("CHARACTER_SET_CLIENT"), SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>information_schema.ALL_VIEWS.COLLATION_CONNECTION</code>.
     */
    public final TableField<Record, String> COLLATION_CONNECTION = createField(DSL.name("COLLATION_CONNECTION"), SQLDataType.VARCHAR(64).nullable(false), this, "");

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
    public List<ForeignKey<Record, ?>> getReferences() {
        return Arrays.<ForeignKey<Record, ?>>asList(Keys.SYNTHETIC_FK_ALL_VIEWS__SYNTHETIC_PK_ALL_TABLES);
    }

    public AllTables tables() {
        return new AllTables(this, Keys.SYNTHETIC_FK_ALL_VIEWS__SYNTHETIC_PK_ALL_TABLES);
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


