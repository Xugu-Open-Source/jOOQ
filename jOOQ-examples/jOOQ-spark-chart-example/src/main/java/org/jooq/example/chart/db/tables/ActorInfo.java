/*
 * This file is generated by jOOQ.
 */
package org.jooq.example.chart.db.tables;


import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function4;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row4;
import org.jooq.Schema;
import org.jooq.SelectField;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.example.chart.db.Public;
import org.jooq.example.chart.db.tables.records.ActorInfoRecord;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ActorInfo extends TableImpl<ActorInfoRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.actor_info</code>
     */
    public static final ActorInfo ACTOR_INFO = new ActorInfo();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ActorInfoRecord> getRecordType() {
        return ActorInfoRecord.class;
    }

    /**
     * The column <code>public.actor_info.actor_id</code>.
     */
    public final TableField<ActorInfoRecord, Integer> ACTOR_ID = createField(DSL.name("actor_id"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.actor_info.first_name</code>.
     */
    public final TableField<ActorInfoRecord, String> FIRST_NAME = createField(DSL.name("first_name"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>public.actor_info.last_name</code>.
     */
    public final TableField<ActorInfoRecord, String> LAST_NAME = createField(DSL.name("last_name"), SQLDataType.VARCHAR(45), this, "");

    /**
     * The column <code>public.actor_info.film_info</code>.
     */
    public final TableField<ActorInfoRecord, String> FILM_INFO = createField(DSL.name("film_info"), SQLDataType.CLOB, this, "");

    private ActorInfo(Name alias, Table<ActorInfoRecord> aliased) {
        this(alias, aliased, null);
    }

    private ActorInfo(Name alias, Table<ActorInfoRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view("create view \"actor_info\" as  SELECT a.actor_id,\n    a.first_name,\n    a.last_name,\n    group_concat(DISTINCT (((c.name)::text || ': '::text) || ( SELECT group_concat((f.title)::text) AS group_concat\n           FROM ((film f\n             JOIN film_category fc_1 ON ((f.film_id = fc_1.film_id)))\n             JOIN film_actor fa_1 ON ((f.film_id = fa_1.film_id)))\n          WHERE ((fc_1.category_id = c.category_id) AND (fa_1.actor_id = a.actor_id))\n          GROUP BY fa_1.actor_id))) AS film_info\n   FROM (((actor a\n     LEFT JOIN film_actor fa ON ((a.actor_id = fa.actor_id)))\n     LEFT JOIN film_category fc ON ((fa.film_id = fc.film_id)))\n     LEFT JOIN category c ON ((fc.category_id = c.category_id)))\n  GROUP BY a.actor_id, a.first_name, a.last_name;"));
    }

    /**
     * Create an aliased <code>public.actor_info</code> table reference
     */
    public ActorInfo(String alias) {
        this(DSL.name(alias), ACTOR_INFO);
    }

    /**
     * Create an aliased <code>public.actor_info</code> table reference
     */
    public ActorInfo(Name alias) {
        this(alias, ACTOR_INFO);
    }

    /**
     * Create a <code>public.actor_info</code> table reference
     */
    public ActorInfo() {
        this(DSL.name("actor_info"), null);
    }

    public <O extends Record> ActorInfo(Table<O> child, ForeignKey<O, ActorInfoRecord> key) {
        super(child, key, ACTOR_INFO);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Public.PUBLIC;
    }

    @Override
    public ActorInfo as(String alias) {
        return new ActorInfo(DSL.name(alias), this);
    }

    @Override
    public ActorInfo as(Name alias) {
        return new ActorInfo(alias, this);
    }

    @Override
    public ActorInfo as(Table alias) {
        return new ActorInfo(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public ActorInfo rename(String name) {
        return new ActorInfo(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ActorInfo rename(Name name) {
        return new ActorInfo(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public ActorInfo rename(Table name) {
        return new ActorInfo(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row4<Integer, String, String, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link #convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function4<? super Integer, ? super String, ? super String, ? super String, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link #convertFrom(Class, Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function4<? super Integer, ? super String, ? super String, ? super String, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
