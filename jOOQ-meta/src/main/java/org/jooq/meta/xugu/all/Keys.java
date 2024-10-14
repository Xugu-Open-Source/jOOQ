package org.jooq.meta.xugu.all;

import org.jooq.ForeignKey;
import org.jooq.Record;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.Internal;
import org.jooq.meta.xugu.all.tables.*;


public class Keys {

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<Record> SYNTHETIC_PK_ALL_PROCEDURES = Internal.createUniqueKey(
            AllProcedures.ALL_PROCEDURES,
            DSL.name("SYNTHETIC_PK_ALL_PROCEDURES"),
            new TableField[] {
                    AllProcedures.ALL_PROCEDURES.PROC_NAME
            },
            true);



    public static final UniqueKey<Record> SYNTHETIC_PK_ALL_SCHEMAS = Internal.createUniqueKey(
            AllSchemas.ALL_SCHEMAS,
            DSL.name("SYNTHETIC_PK_ALL_SCHEMAS"),
            new TableField[] {
//                    AllSchemas.ALL_SCHEMAS.CATALOG_NAME,
                    AllSchemas.ALL_SCHEMAS.SCHEMA_NAME
            },
            true);



    public static final UniqueKey<Record> SYNTHETIC_PK_ALL_CONSTRAINTS = Internal.createUniqueKey(
            AllConstraints.ALL_CONSTRAINTS,
            DSL.name("SYNTHETIC_PK_ALL_CONSTRAINTS"),
            new TableField[] {
//                    AllConstraints.ALL_CONSTRAINTS.CONSTRAINT_CATALOG,
//                    AllConstraints.ALL_CONSTRAINTS.CONSTRAINT_SCHEMA,
                    AllConstraints.ALL_CONSTRAINTS.CONS_NAME,
                    AllConstraints.ALL_CONSTRAINTS.DB_ID,
                    AllConstraints.ALL_CONSTRAINTS.TABLE_NAME,
            },
            true);



    public static final UniqueKey<Record> SYNTHETIC_PK_ALL_TABLES = Internal.createUniqueKey(
            AllTables.ALL_TABLES,
            DSL.name("SYNTHETIC_PK_ALL_TABLES"),
            new TableField[] {
                    AllTables.ALL_TABLES.TABLE_NAME,
                    AllTables.ALL_TABLES.DB_ID,
                    AllTables.ALL_TABLES.TABLE_NAME,
            },
            true);



    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------

    public static final ForeignKey<Record, Record> SYNTHETIC_FK_ALL_VIEWS__SYNTHETIC_PK_ALL_TABLES = Internal.createForeignKey(
            AllViews.ALL_VIEWS,
            DSL.name("SYNTHETIC_FK_ALL_VIEWS__SYNTHETIC_PK_ALL_TABLES"),
            new TableField[] {
//                    AllViews.ALL_VIEWS.TABLE_CATALOG,
//                    AllViews.ALL_VIEWS.TABLE_SCHEMA,
//                    AllViews.ALL_VIEWS.TABLE_NAME
                    AllTables.ALL_TABLES.DB_ID,
                    AllTables.ALL_TABLES.TABLE_SCHEMA,
                    AllTables.ALL_TABLES.TABLE_NAME
            },
            Keys.SYNTHETIC_PK_ALL_TABLES,
            new TableField[] {
//                    AllTables.ALL_TABLES.TABLE_CATALOG,
                    AllTables.ALL_TABLES.DB_ID,
                    AllTables.ALL_TABLES.TABLE_SCHEMA,
                    AllTables.ALL_TABLES.TABLE_NAME
            },
            true);
}
