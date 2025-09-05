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
                    AllProcedures.ALL_PROCEDURES.DB_ID,
                    AllProcedures.ALL_PROCEDURES.SCHEMA_ID,
                    AllProcedures.ALL_PROCEDURES.USER_ID,
                    AllProcedures.ALL_PROCEDURES.PROC_ID
            },
            true);



    public static final UniqueKey<Record> SYNTHETIC_PK_ALL_SCHEMAS = Internal.createUniqueKey(
            AllSchemas.ALL_SCHEMAS,
            DSL.name("SYNTHETIC_PK_ALL_SCHEMAS"),
            new TableField[] {
                    AllSchemas.ALL_SCHEMAS.DB_ID,
                    AllSchemas.ALL_SCHEMAS.SCHEMA_ID,
                    AllSchemas.ALL_SCHEMAS.USER_ID
            },
            true);



    public static final UniqueKey<Record> SYNTHETIC_PK_ALL_CONSTRAINTS = Internal.createUniqueKey(
            AllConstraints.ALL_CONSTRAINTS,
            DSL.name("SYNTHETIC_PK_ALL_CONSTRAINTS"),
            new TableField[] {
                    AllConstraints.ALL_CONSTRAINTS.DB_ID,
                    AllConstraints.ALL_CONSTRAINTS.TABLE_ID,
                    AllConstraints.ALL_CONSTRAINTS.REF_TABLE_ID,
                    AllConstraints.ALL_CONSTRAINTS.CONS_NAME
            },
            true);



    public static final UniqueKey<Record> SYNTHETIC_PK_ALL_TABLES = Internal.createUniqueKey(
            AllTables.ALL_TABLES,
            DSL.name("SYNTHETIC_PK_ALL_TABLES"),
            new TableField[] {
                    AllTables.ALL_TABLES.DB_ID,
                    AllTables.ALL_TABLES.USER_ID,
                    AllTables.ALL_TABLES.SCHEMA_ID,
                    AllTables.ALL_TABLES.TABLE_ID,
            },
            true);



    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------

}
