package org.jooq.meta.xugu.information_schema.tables;

import org.jooq.*;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;

public class DataBases extends TableImpl<Record> {
    public static final DataBases DATA_BASES = new DataBases();

    public final TableField<Record, String> DB_ID = createField(DSL.name("DB_ID"), SQLDataType.VARCHAR(64).nullable(false), this, "");

    public final TableField<Record, String> DB_NAME = createField(DSL.name("DB_NAME"), SQLDataType.VARCHAR(64).nullable(false), this, "");

    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    public DataBases(){
        this(DSL.name("dba_databases"), null);
    }

    public DataBases(String name) {
        super(name);
    }

    public DataBases(String name, Schema schema) {
        super(name, schema);
    }

    public DataBases(String name, Schema schema, Table<Record> aliased) {
        super(name, schema, aliased);
    }

    public DataBases(String name, Schema schema, Table<Record> aliased, Field<?>[] parameters) {
        super(name, schema, aliased, parameters);
    }

    public DataBases(String name, Schema schema, Table<Record> aliased, Field<?>[] parameters, String comment) {
        super(name, schema, aliased, parameters, comment);
    }

    public DataBases(Name name) {
        super(name);
    }

    public DataBases(Name name, Schema schema) {
        super(name, schema);
    }

    public DataBases(Name name, Schema schema, Table<Record> aliased) {
        super(name, schema, aliased);
    }

    public DataBases(Name name, Schema schema, Table<Record> aliased, Field<?>[] parameters) {
        super(name, schema, aliased, parameters);
    }

    public DataBases(Name name, Schema schema, Table<Record> aliased, Field<?>[] parameters, String comment) {
        super(name, schema, aliased, parameters, comment);
    }

    public DataBases(Name name, Schema schema, Table<Record> aliased, Field<?>[] parameters, Comment comment) {
        super(name, schema, aliased, parameters, comment);
    }

    public DataBases(Name name, Schema schema, Table<Record> aliased, Field<?>[] parameters, Comment comment, TableOptions options) {
        super(name, schema, aliased, parameters, comment, options);
    }

    public DataBases(Table<?> child, ForeignKey<?, Record> path, Table<Record> parent) {
        super(child, path, parent);
    }

    public DataBases(Name name, Schema schema, Table<?> child, ForeignKey<?, Record> path, Table<Record> aliased, Field<?>[] parameters, Comment comment) {
        super(name, schema, child, path, aliased, parameters, comment);
    }

    public DataBases(Name name, Schema schema, Table<?> child, ForeignKey<?, Record> path, Table<Record> aliased, Field<?>[] parameters, Comment comment, TableOptions options) {
        super(name, schema, child, path, aliased, parameters, comment, options);
    }
}
