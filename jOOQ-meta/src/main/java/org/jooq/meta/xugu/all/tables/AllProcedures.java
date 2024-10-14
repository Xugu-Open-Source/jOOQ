package org.jooq.meta.xugu.all.tables;

import org.jooq.*;
import org.jooq.Record;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;
import org.jooq.meta.xugu.all.All;
import org.jooq.meta.xugu.all.Keys;
import org.jooq.types.UInteger;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

public class AllProcedures extends TableImpl<Record> {
    private static final long serialVersionUID = 828988306;

    /**
     * The reference instance of <code>information_schema.AllProcedures</code>
     */
    public static final AllProcedures ALL_PROCEDURES = new AllProcedures();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>All.AllProcedures.SPECIFIC_NAME</code>.
     */
    public final TableField<Record, String> SPECIFIC_NAME = createField(DSL.name("SPECIFIC_NAME"), SQLDataType.VARCHAR(64).nullable(false), this, "");

    public final TableField<Record, String> PROC_NAME = createField(DSL.name("PROC_NAME"), SQLDataType.VARCHAR(64).nullable(false), this, "");


    public final TableField<Record, String> SCHEMA_ID = createField(DSL.name("SCHEMA_ID"), SQLDataType.VARCHAR(64).nullable(false), this, "");

    public final TableField<Record, String> PROC_ID = createField(DSL.name("PROC_ID"), SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>All.AllProcedures.ROUTINE_CATALOG</code>.
     */
    public final TableField<Record, String> ROUTINE_CATALOG = createField(DSL.name("ROUTINE_CATALOG"), SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>All.AllProcedures.ROUTINE_SCHEMA</code>.
     */
    public final TableField<Record, String> ROUTINE_SCHEMA = createField(DSL.name("ROUTINE_SCHEMA"), SQLDataType.VARCHAR(64).nullable(false), this, "");

//    /**
//     * The column <code>All.AllProcedures.ROUTINE_NAME</code>.
//     */
//    public final TableField<Record, String> ROUTINE_NAME = createField(DSL.name("PROC_NAME"), SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>All.AllProcedures.ROUTINE_TYPE</code>.
     */
    public final TableField<Record, String> ROUTINE_TYPE = createField(DSL.name("ROUTINE_TYPE"), SQLDataType.VARCHAR(9).nullable(false), this, "");

    /**
     * The column <code>All.AllProcedures.DATA_TYPE</code>.
     */
    public final TableField<Record, String> DATA_TYPE = createField(DSL.name("DATA_TYPE"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>All.AllProcedures.CHARACTER_MAXIMUM_LENGTH</code>.
     */
    public final TableField<Record, Long> CHARACTER_MAXIMUM_LENGTH = createField(DSL.name("CHARACTER_MAXIMUM_LENGTH"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>All.AllProcedures.CHARACTER_OCTET_LENGTH</code>.
     */
    public final TableField<Record, Long> CHARACTER_OCTET_LENGTH = createField(DSL.name("CHARACTER_OCTET_LENGTH"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>All.AllProcedures.NUMERIC_PRECISION</code>.
     */
    public final TableField<Record, UInteger> NUMERIC_PRECISION = createField(DSL.name("NUMERIC_PRECISION"), SQLDataType.INTEGERUNSIGNED, this, "");

    /**
     * The column <code>All.AllProcedures.NUMERIC_SCALE</code>.
     */
    public final TableField<Record, UInteger> NUMERIC_SCALE = createField(DSL.name("NUMERIC_SCALE"), SQLDataType.INTEGERUNSIGNED, this, "");

    /**
     * The column <code>All.AllProcedures.DATETIME_PRECISION</code>.
     */
    public final TableField<Record, UInteger> DATETIME_PRECISION = createField(DSL.name("DATETIME_PRECISION"), SQLDataType.INTEGERUNSIGNED, this, "");

    /**
     * The column <code>All.AllProcedures.CHARACTER_SET_NAME</code>.
     */
    public final TableField<Record, String> CHARACTER_SET_NAME = createField(DSL.name("CHARACTER_SET_NAME"), SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>All.AllProcedures.COLLATION_NAME</code>.
     */
    public final TableField<Record, String> COLLATION_NAME = createField(DSL.name("COLLATION_NAME"), SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>All.AllProcedures.DTD_IDENTIFIER</code>.
     */
    public final TableField<Record, String> DTD_IDENTIFIER = createField(DSL.name("DTD_IDENTIFIER"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>All.AllProcedures.ROUTINE_BODY</code>.
     */
    public final TableField<Record, String> ROUTINE_BODY = createField(DSL.name("ROUTINE_BODY"), SQLDataType.VARCHAR(3).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>All.AllProcedures.ROUTINE_DEFINITION</code>.
     */
    public final TableField<Record, String> ROUTINE_DEFINITION = createField(DSL.name("ROUTINE_DEFINITION"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>All.AllProcedures.EXTERNAL_NAME</code>.
     */
    public final TableField<Record, byte[]> EXTERNAL_NAME = createField(DSL.name("EXTERNAL_NAME"), SQLDataType.BINARY, this, "");

    /**
     * The column <code>All.AllProcedures.EXTERNAL_LANGUAGE</code>.
     */
    public final TableField<Record, String> EXTERNAL_LANGUAGE = createField(DSL.name("EXTERNAL_LANGUAGE"), SQLDataType.VARCHAR(64).nullable(false).defaultValue(DSL.inline("SQL", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>All.AllProcedures.PARAMETER_STYLE</code>.
     */
    public final TableField<Record, String> PARAMETER_STYLE = createField(DSL.name("PARAMETER_STYLE"), SQLDataType.VARCHAR(3).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>All.AllProcedures.IS_DETERMINISTIC</code>.
     */
    public final TableField<Record, String> IS_DETERMINISTIC = createField(DSL.name("IS_DETERMINISTIC"), SQLDataType.VARCHAR(3).nullable(false).defaultValue(DSL.inline("", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>All.AllProcedures.SQL_DATA_ACCESS</code>.
     */
    public final TableField<Record, String> SQL_DATA_ACCESS = createField(DSL.name("SQL_DATA_ACCESS"), SQLDataType.VARCHAR(17).nullable(false), this, "");

    /**
     * The column <code>All.AllProcedures.SQL_PATH</code>.
     */
    public final TableField<Record, byte[]> SQL_PATH = createField(DSL.name("SQL_PATH"), SQLDataType.BINARY, this, "");

    /**
     * The column <code>All.AllProcedures.SECURITY_TYPE</code>.
     */
    public final TableField<Record, String> SECURITY_TYPE = createField(DSL.name("SECURITY_TYPE"), SQLDataType.VARCHAR(7).nullable(false), this, "");

    /**
     * The column <code>All.AllProcedures.CREATED</code>.
     */
    public final TableField<Record, Timestamp> CREATED = createField(DSL.name("CREATED"), SQLDataType.TIMESTAMP(0).nullable(false), this, "");

    /**
     * The column <code>All.AllProcedures.LAST_ALTERED</code>.
     */
    public final TableField<Record, Timestamp> LAST_ALTERED = createField(DSL.name("LAST_ALTERED"), SQLDataType.TIMESTAMP(0).nullable(false), this, "");

    /**
     * The column <code>All.AllProcedures.SQL_MODE</code>.
     */
    public final TableField<Record, String> SQL_MODE = createField(DSL.name("SQL_MODE"), SQLDataType.VARCHAR(520).nullable(false), this, "");

    /**
     * The column <code>All.AllProcedures.ROUTINE_COMMENT</code>.
     */
    public final TableField<Record, String> ROUTINE_COMMENT = createField(DSL.name("COMMENTS"), SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>All.AllProcedures.DEFINER</code>.
     */
    public final TableField<Record, String> DEFINER = createField(DSL.name("DEFINER"), SQLDataType.VARCHAR(288).nullable(false), this, "");

    /**
     * The column <code>All.AllProcedures.CHARACTER_SET_CLIENT</code>.
     */
    public final TableField<Record, String> CHARACTER_SET_CLIENT = createField(DSL.name("CHARACTER_SET_CLIENT"), SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>All.AllProcedures.COLLATION_CONNECTION</code>.
     */
    public final TableField<Record, String> COLLATION_CONNECTION = createField(DSL.name("COLLATION_CONNECTION"), SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>All.AllProcedures.DATABASE_COLLATION</code>.
     */
    public final TableField<Record, String> DATABASE_COLLATION = createField(DSL.name("DATABASE_COLLATION"), SQLDataType.VARCHAR(64).nullable(false), this, "");

    private AllProcedures(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private AllProcedures(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>All.AllProcedures</code> table reference
     */
    public AllProcedures(String alias) {
        this(DSL.name(alias), ALL_PROCEDURES);
    }

    /**
     * Create an aliased <code>All.AllProcedures</code> table reference
     */
    public AllProcedures(Name alias) {
        this(alias, ALL_PROCEDURES);
    }

    /**
     * Create a <code>All.AllProcedures</code> table reference
     */
    public AllProcedures() {
        this(DSL.name("ALL_PROCEDURES"), null);
    }

    public <O extends Record> AllProcedures(Table<O> child, ForeignKey<O, Record> key) {
        super(child, key, ALL_PROCEDURES);
    }

    @Override
    public Schema getSchema() {
        return All.ALL;
    }

    @Override
    public UniqueKey<Record> getPrimaryKey() {
        return Keys.SYNTHETIC_PK_ALL_PROCEDURES;
    }

    @Override
    public List<UniqueKey<Record>> getKeys() {
        return Arrays.<UniqueKey<Record>>asList(Keys.SYNTHETIC_PK_ALL_PROCEDURES);
    }

    @Override
    public AllProcedures as(String alias) {
        return new AllProcedures(DSL.name(alias), this);
    }

    @Override
    public AllProcedures as(Name alias) {
        return new AllProcedures(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public AllProcedures rename(String name) {
        return new AllProcedures(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public AllProcedures rename(Name name) {
        return new AllProcedures(name, null);
    }
}
