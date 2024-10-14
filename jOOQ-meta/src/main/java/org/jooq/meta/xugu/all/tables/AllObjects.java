package org.jooq.meta.xugu.all.tables;

import org.jooq.*;
import org.jooq.Record;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/*这个类是先前同事写的，或许要改内容*/
public class AllObjects extends TableImpl<Record> {

    public static final AllObjects ALL_OBJECTS = new AllObjects();

    public final TableField<Record, String> OBJ_TYPE = createField(DSL.name("OBJ_TYPE"), SQLDataType.VARCHAR(64).nullable(false), this, "");

    public final TableField<Record, String> SCHEMA_ID = createField(DSL.name("SCHEMA_ID"), SQLDataType.VARCHAR(64).nullable(false), this, "");

    public final TableField<Record, String> OBJ_NAME = createField(DSL.name("OBJ_NAME"), SQLDataType.VARCHAR(64).nullable(false), this, "");

    public final TableField<Record, String> OBJ_ID = createField(DSL.name("OBJ_ID"), SQLDataType.VARCHAR(64).nullable(false), this, "");

    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    public AllObjects() {
        this(DSL.name("ALL_OBJECTS"), null);
    }

    public AllObjects(Name name) {
        super(name);
    }

    public AllObjects(Name name, Schema schema) {
        super(name, schema);
    }

    public AllObjects(Name name, Schema schema, Table<Record> aliased) {
        super(name, schema, aliased);
    }

    public AllObjects(Name name, Schema schema, Table<Record> aliased, Field<?>[] parameters) {
        super(name, schema, aliased, parameters);
    }

    public AllObjects(Name name, Schema schema, Table<Record> aliased, Field<?>[] parameters, Comment comment) {
        super(name, schema, aliased, parameters, comment);
    }

    public AllObjects(Name name, Schema schema, Table<Record> aliased, Field<?>[] parameters, Comment comment, TableOptions options) {
        super(name, schema, aliased, parameters, comment, options);
    }

    public AllObjects(Table<?> child, ForeignKey<?, Record> path, Table<Record> parent) {
        super(child, path, parent);
    }

    public AllObjects(Name name, Schema schema, Table<?> child, ForeignKey<?, Record> path, Table<Record> aliased, Field<?>[] parameters, Comment comment) {
        super(name, schema, child, path, aliased, parameters, comment);
    }

    public AllObjects(Name name, Schema schema, Table<?> child, ForeignKey<?, Record> path, Table<Record> aliased, Field<?>[] parameters, Comment comment, TableOptions options) {
        super(name, schema, child, path, aliased, parameters, comment, options);
    }
}
