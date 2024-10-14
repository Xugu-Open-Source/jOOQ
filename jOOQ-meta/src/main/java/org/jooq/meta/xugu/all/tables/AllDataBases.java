package org.jooq.meta.xugu.all.tables;

import org.jooq.Record;
import org.jooq.*;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;

public class AllDataBases extends TableImpl<Record> {
    public static final AllDataBases ALL_DATABASES = new AllDataBases();

    public final TableField<Record, String> DB_ID = createField(DSL.name("DB_ID"), SQLDataType.VARCHAR(64).nullable(false), this, "");

    public final TableField<Record, String> DB_NAME = createField(DSL.name("DB_NAME"), SQLDataType.VARCHAR(64).nullable(false), this, "");

    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    public AllDataBases(){
        this(DSL.name("ALL_DATABASES"), null);
    }

    public AllDataBases(String name) {
        super(name);
    }

    public AllDataBases(String name, Schema schema) {
        super(name, schema);
    }

    public AllDataBases(String name, Schema schema, Table<Record> aliased) {
        super(name, schema, aliased);
    }

    public AllDataBases(String name, Schema schema, Table<Record> aliased, Field<?>[] parameters) {
        super(name, schema, aliased, parameters);
    }

    public AllDataBases(String name, Schema schema, Table<Record> aliased, Field<?>[] parameters, String comment) {
        super(name, schema, aliased, parameters, comment);
    }

    public AllDataBases(Name name) {
        super(name);
    }

    public AllDataBases(Name name, Schema schema) {
        super(name, schema);
    }

    public AllDataBases(Name name, Schema schema, Table<Record> aliased) {
        super(name, schema, aliased);
    }

    public AllDataBases(Name name, Schema schema, Table<Record> aliased, Field<?>[] parameters) {
        super(name, schema, aliased, parameters);
    }

    public AllDataBases(Name name, Schema schema, Table<Record> aliased, Field<?>[] parameters, String comment) {
        super(name, schema, aliased, parameters, comment);
    }

    public AllDataBases(Name name, Schema schema, Table<Record> aliased, Field<?>[] parameters, Comment comment) {
        super(name, schema, aliased, parameters, comment);
    }

    public AllDataBases(Name name, Schema schema, Table<Record> aliased, Field<?>[] parameters, Comment comment, TableOptions options) {
        super(name, schema, aliased, parameters, comment, options);
    }

    public AllDataBases(Table<?> child, ForeignKey<?, Record> path, Table<Record> parent) {
        super(child, path, parent);
    }

    public AllDataBases(Name name, Schema schema, Table<?> child, ForeignKey<?, Record> path, Table<Record> aliased, Field<?>[] parameters, Comment comment) {
        super(name, schema, child, path, aliased, parameters, comment);
    }

    public AllDataBases(Name name, Schema schema, Table<?> child, ForeignKey<?, Record> path, Table<Record> aliased, Field<?>[] parameters, Comment comment, TableOptions options) {
        super(name, schema, child, path, aliased, parameters, comment, options);
    }
}
