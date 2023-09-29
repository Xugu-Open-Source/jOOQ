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
import org.jooq.example.testcontainersflyway.db.tables.records.SalesByFilmCategoryRecord;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class SalesByFilmCategory extends TableImpl<SalesByFilmCategoryRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.sales_by_film_category</code>
     */
    public static final SalesByFilmCategory SALES_BY_FILM_CATEGORY = new SalesByFilmCategory();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SalesByFilmCategoryRecord> getRecordType() {
        return SalesByFilmCategoryRecord.class;
    }

    /**
     * The column <code>public.sales_by_film_category.category</code>.
     */
    public final TableField<SalesByFilmCategoryRecord, String> CATEGORY = createField(DSL.name("category"), SQLDataType.VARCHAR(25), this, "");

    /**
     * The column <code>public.sales_by_film_category.total_sales</code>.
     */
    public final TableField<SalesByFilmCategoryRecord, BigDecimal> TOTAL_SALES = createField(DSL.name("total_sales"), SQLDataType.NUMERIC, this, "");

    private SalesByFilmCategory(Name alias, Table<SalesByFilmCategoryRecord> aliased) {
        this(alias, aliased, (Field<?>[]) null, null);
    }

    private SalesByFilmCategory(Name alias, Table<SalesByFilmCategoryRecord> aliased, Field<?>[] parameters, Condition where) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view("""
        create view "sales_by_film_category" as  SELECT c.name AS category,
          sum(p.amount) AS total_sales
         FROM (((((payment p
           JOIN rental r ON ((p.rental_id = r.rental_id)))
           JOIN inventory i ON ((r.inventory_id = i.inventory_id)))
           JOIN film f ON ((i.film_id = f.film_id)))
           JOIN film_category fc ON ((f.film_id = fc.film_id)))
           JOIN category c ON ((fc.category_id = c.category_id)))
        GROUP BY c.name
        ORDER BY (sum(p.amount)) DESC;
        """), where);
    }

    /**
     * Create an aliased <code>public.sales_by_film_category</code> table
     * reference
     */
    public SalesByFilmCategory(String alias) {
        this(DSL.name(alias), SALES_BY_FILM_CATEGORY);
    }

    /**
     * Create an aliased <code>public.sales_by_film_category</code> table
     * reference
     */
    public SalesByFilmCategory(Name alias) {
        this(alias, SALES_BY_FILM_CATEGORY);
    }

    /**
     * Create a <code>public.sales_by_film_category</code> table reference
     */
    public SalesByFilmCategory() {
        this(DSL.name("sales_by_film_category"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Public.PUBLIC;
    }

    @Override
    public SalesByFilmCategory as(String alias) {
        return new SalesByFilmCategory(DSL.name(alias), this);
    }

    @Override
    public SalesByFilmCategory as(Name alias) {
        return new SalesByFilmCategory(alias, this);
    }

    @Override
    public SalesByFilmCategory as(Table<?> alias) {
        return new SalesByFilmCategory(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public SalesByFilmCategory rename(String name) {
        return new SalesByFilmCategory(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public SalesByFilmCategory rename(Name name) {
        return new SalesByFilmCategory(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public SalesByFilmCategory rename(Table<?> name) {
        return new SalesByFilmCategory(name.getQualifiedName(), null);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public SalesByFilmCategory where(Condition condition) {
        return new SalesByFilmCategory(getQualifiedName(), aliased() ? this : null, null, condition);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public SalesByFilmCategory where(Collection<? extends Condition> conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public SalesByFilmCategory where(Condition... conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public SalesByFilmCategory where(Field<Boolean> condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public SalesByFilmCategory where(SQL condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public SalesByFilmCategory where(@Stringly.SQL String condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public SalesByFilmCategory where(@Stringly.SQL String condition, Object... binds) {
        return where(DSL.condition(condition, binds));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public SalesByFilmCategory where(@Stringly.SQL String condition, QueryPart... parts) {
        return where(DSL.condition(condition, parts));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public SalesByFilmCategory whereExists(Select<?> select) {
        return where(DSL.exists(select));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public SalesByFilmCategory whereNotExists(Select<?> select) {
        return where(DSL.notExists(select));
    }
}
