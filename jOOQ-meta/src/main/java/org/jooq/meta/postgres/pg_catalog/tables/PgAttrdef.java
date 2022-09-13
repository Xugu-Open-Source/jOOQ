/*
 * This file is generated by jOOQ.
 */
package org.jooq.meta.postgres.pg_catalog.tables;


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
import org.jooq.meta.postgres.pg_catalog.Keys;
import org.jooq.meta.postgres.pg_catalog.PgCatalog;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgAttrdef extends TableImpl<Record> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>pg_catalog.pg_attrdef</code>
     */
    public static final PgAttrdef PG_ATTRDEF = new PgAttrdef();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>pg_catalog.pg_attrdef.oid</code>.
     */
    public final TableField<Record, Long> OID = createField(DSL.name("oid"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_attrdef.adrelid</code>.
     */
    public final TableField<Record, Long> ADRELID = createField(DSL.name("adrelid"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_attrdef.adnum</code>.
     */
    public final TableField<Record, Short> ADNUM = createField(DSL.name("adnum"), SQLDataType.SMALLINT.nullable(false), this, "");

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public final TableField<Record, Object> ADBIN = createField(DSL.name("adbin"), org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"pg_node_tree\"").nullable(false), this, "");

    private PgAttrdef(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private PgAttrdef(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>pg_catalog.pg_attrdef</code> table reference
     */
    public PgAttrdef(String alias) {
        this(DSL.name(alias), PG_ATTRDEF);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_attrdef</code> table reference
     */
    public PgAttrdef(Name alias) {
        this(alias, PG_ATTRDEF);
    }

    /**
     * Create a <code>pg_catalog.pg_attrdef</code> table reference
     */
    public PgAttrdef() {
        this(DSL.name("pg_attrdef"), null);
    }

    public <O extends Record> PgAttrdef(Table<O> child, ForeignKey<O, Record> key) {
        super(child, key, PG_ATTRDEF);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    public UniqueKey<Record> getPrimaryKey() {
        return Keys.PG_ATTRDEF_OID_INDEX;
    }

    @Override
    public List<UniqueKey<Record>> getUniqueKeys() {
        return Arrays.asList(Keys.PG_ATTRDEF_ADRELID_ADNUM_INDEX);
    }

    @Override
    public PgAttrdef as(String alias) {
        return new PgAttrdef(DSL.name(alias), this);
    }

    @Override
    public PgAttrdef as(Name alias) {
        return new PgAttrdef(alias, this);
    }

    @Override
    public PgAttrdef as(Table<?> alias) {
        return new PgAttrdef(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgAttrdef rename(String name) {
        return new PgAttrdef(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgAttrdef rename(Name name) {
        return new PgAttrdef(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgAttrdef rename(Table<?> name) {
        return new PgAttrdef(name.getQualifiedName(), null);
    }
}
