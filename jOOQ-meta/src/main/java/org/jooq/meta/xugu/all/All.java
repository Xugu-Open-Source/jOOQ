package org.jooq.meta.xugu.all;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;
import org.jooq.meta.xugu.all.tables.*;

import java.util.Arrays;
import java.util.List;

public class All extends SchemaImpl {

    private static final long serialVersionUID = 1825826342;

    public static final All ALL = new All();

    public final AllColumns ALL_COLUMNS = AllColumns.ALL_COLUMNS;

    public final AllSchemas ALl_SCHEMAS = AllSchemas.ALL_SCHEMAS;

    public final AllIndexes ALL_INDEXES = AllIndexes.ALL_INDEXES;

    public final AllObjects ALL_OBJECTS = AllObjects.ALL_OBJECTS;

    public final AllConstraints ALL_CONSTRAINTS = AllConstraints.ALL_CONSTRAINTS;

    public final AllTables ALL_TABLES = AllTables.ALL_TABLES;

    public final AllViews ALL_VIEWS = AllViews.ALL_VIEWS;

    public final AllProcedures ALL_PROCEDURES = AllProcedures.ALL_PROCEDURES;

    public final AllDataBases ALL_DATABASES = AllDataBases.ALL_DATABASES;

    /**
     * No further instances allowed
     */
    private All() {
        super("", null);
    }

    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        return Arrays.<Table<?>>asList(
                AllProcedures.ALL_PROCEDURES,
                AllColumns.ALL_COLUMNS,
                AllViews.ALL_VIEWS,
                AllConstraints.ALL_CONSTRAINTS,
                AllObjects.ALL_OBJECTS,
                AllSchemas.ALL_SCHEMAS,
                AllTables.ALL_TABLES,
                AllIndexes.ALL_INDEXES,
                AllDataBases.ALL_DATABASES
        );
    }
}
