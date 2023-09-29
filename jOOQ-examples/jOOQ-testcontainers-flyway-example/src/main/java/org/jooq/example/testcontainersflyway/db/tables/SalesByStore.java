/*
 * This file is generated by jOOQ.
 */
package org.jooq.example.testcontainersflyway.db.tables;


import java.math.BigDecimal;
import java.util.Collection;

import org.jooq.Condition;
import org.jooq.Field;
import org.jooq.Name;
import org.jooq.PlainSQL;
import org.jooq.QueryPart;
import org.jooq.SQL;
import org.jooq.Schema;
import org.jooq.Select;
import org.jooq.Stringly;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.example.testcontainersflyway.db.Public;
import org.jooq.example.testcontainersflyway.db.tables.records.SalesByStoreRecord;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class SalesByStore extends TableImpl<SalesByStoreRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.sales_by_store</code>
     */
    public static final SalesByStore SALES_BY_STORE = new SalesByStore();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SalesByStoreRecord> getRecordType() {
        return SalesByStoreRecord.class;
    }

    /**
     * The column <code>public.sales_by_store.store</code>.
     */
    public final TableField<SalesByStoreRecord, String> STORE = createField(DSL.name("store"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.sales_by_store.manager</code>.
     */
    public final TableField<SalesByStoreRecord, String> MANAGER = createField(DSL.name("manager"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.sales_by_store.total_sales</code>.
     */
    public final TableField<SalesByStoreRecord, BigDecimal> TOTAL_SALES = createField(DSL.name("total_sales"), SQLDataType.NUMERIC, this, "");

    private SalesByStore(Name alias, Table<SalesByStoreRecord> aliased) {
        this(alias, aliased, (Field<?>[]) null, null);
    }

    private SalesByStore(Name alias, Table<SalesByStoreRecord> aliased, Field<?>[] parameters, Condition where) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view("""
        create view "sales_by_store" as  SELECT (((c.city)::text || ','::text) || (cy.country)::text) AS store,
          (((m.first_name)::text || ' '::text) || (m.last_name)::text) AS manager,
          sum(p.amount) AS total_sales
         FROM (((((((payment p
           JOIN rental r ON ((p.rental_id = r.rental_id)))
           JOIN inventory i ON ((r.inventory_id = i.inventory_id)))
           JOIN store s ON ((i.store_id = s.store_id)))
           JOIN address a ON ((s.address_id = a.address_id)))
           JOIN city c ON ((a.city_id = c.city_id)))
           JOIN country cy ON ((c.country_id = cy.country_id)))
           JOIN staff m ON ((s.manager_staff_id = m.staff_id)))
        GROUP BY cy.country, c.city, s.store_id, m.first_name, m.last_name
        ORDER BY cy.country, c.city;
        """), where);
    }

    /**
     * Create an aliased <code>public.sales_by_store</code> table reference
     */
    public SalesByStore(String alias) {
        this(DSL.name(alias), SALES_BY_STORE);
    }

    /**
     * Create an aliased <code>public.sales_by_store</code> table reference
     */
    public SalesByStore(Name alias) {
        this(alias, SALES_BY_STORE);
    }

    /**
     * Create a <code>public.sales_by_store</code> table reference
     */
    public SalesByStore() {
        this(DSL.name("sales_by_store"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Public.PUBLIC;
    }

    @Override
    public SalesByStore as(String alias) {
        return new SalesByStore(DSL.name(alias), this);
    }

    @Override
    public SalesByStore as(Name alias) {
        return new SalesByStore(alias, this);
    }

    @Override
    public SalesByStore as(Table<?> alias) {
        return new SalesByStore(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public SalesByStore rename(String name) {
        return new SalesByStore(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public SalesByStore rename(Name name) {
        return new SalesByStore(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public SalesByStore rename(Table<?> name) {
        return new SalesByStore(name.getQualifiedName(), null);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public SalesByStore where(Condition condition) {
        return new SalesByStore(getQualifiedName(), aliased() ? this : null, null, condition);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public SalesByStore where(Collection<? extends Condition> conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public SalesByStore where(Condition... conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public SalesByStore where(Field<Boolean> condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public SalesByStore where(SQL condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public SalesByStore where(@Stringly.SQL String condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public SalesByStore where(@Stringly.SQL String condition, Object... binds) {
        return where(DSL.condition(condition, binds));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public SalesByStore where(@Stringly.SQL String condition, QueryPart... parts) {
        return where(DSL.condition(condition, parts));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public SalesByStore whereExists(Select<?> select) {
        return where(DSL.exists(select));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public SalesByStore whereNotExists(Select<?> select) {
        return where(DSL.notExists(select));
    }
}
