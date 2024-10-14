package org.jooq.meta.xugu.all.tables;

import org.jooq.*;
import org.jooq.Record;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;
import org.jooq.meta.xugu.all.All;
import org.jooq.meta.xugu.all.Keys;
import org.jooq.types.ULong;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

public class AllTables extends TableImpl<Record> {

    private static final long serialVersionUID = 43722443;

    /**
     * The reference instance of <code>information_schema.TABLES</code>
     */
    public static final AllTables ALL_TABLES = new AllTables();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>information_schema.ALL_TABLES.TABLE_CATALOG</code>.
     */
    public final TableField<Record, String> TABLE_CATALOG = createField(DSL.name("TABLE_CATALOG"), SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>information_schema.ALL_TABLES.TABLE_SCHEMA</code>.
     */
    public final TableField<Record, String> TABLE_SCHEMA = createField(DSL.name("TABLE_SCHEMA"), SQLDataType.VARCHAR(64).nullable(false), this, "");

    public final TableField<Record, String> SCHEMA_ID = createField(DSL.name("SCHEMA_ID"), SQLDataType.VARCHAR(64).nullable(false), this, "");

    public final TableField<Record, String> TABLE_ID = createField(DSL.name("TABLE_ID"), SQLDataType.VARCHAR(64).nullable(false), this, "");

    public final TableField<Record, String> DB_ID = createField(DSL.name("DB_ID"), SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>information_schema.ALL_TABLES.TABLE_NAME</code>.
     */
    public final TableField<Record, String> TABLE_NAME = createField(DSL.name("TABLE_NAME"), SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>information_schema.ALL_TABLES.TABLE_TYPE</code>.
     */
    public final TableField<Record, String> TABLE_TYPE = createField(DSL.name("TABLE_TYPE"), SQLDataType.VARCHAR(11).nullable(false), this, "");

    /**
     * The column <code>information_schema.ALL_TABLES.ENGINE</code>.
     */
    public final TableField<Record, String> ENGINE = createField(DSL.name("ENGINE"), SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>information_schema.ALL_TABLES.VERSION</code>.
     */
    public final TableField<Record, Integer> VERSION = createField(DSL.name("VERSION"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>information_schema.ALL_TABLES.ROW_FORMAT</code>.
     */
    public final TableField<Record, String> ROW_FORMAT = createField(DSL.name("ROW_FORMAT"), SQLDataType.VARCHAR(10), this, "");

    /**
     * The column <code>information_schema.ALL_TABLES.TABLE_ROWS</code>.
     */
    public final TableField<Record, ULong> TABLE_ROWS = createField(DSL.name("TABLE_ROWS"), SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>information_schema.ALL_TABLES.AVG_ROW_LENGTH</code>.
     */
    public final TableField<Record, ULong> AVG_ROW_LENGTH = createField(DSL.name("AVG_ROW_LENGTH"), SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>information_schema.ALL_TABLES.DATA_LENGTH</code>.
     */
    public final TableField<Record, ULong> DATA_LENGTH = createField(DSL.name("DATA_LENGTH"), SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>information_schema.ALL_TABLES.MAX_DATA_LENGTH</code>.
     */
    public final TableField<Record, ULong> MAX_DATA_LENGTH = createField(DSL.name("MAX_DATA_LENGTH"), SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>information_schema.ALL_TABLES.INDEX_LENGTH</code>.
     */
    public final TableField<Record, ULong> INDEX_LENGTH = createField(DSL.name("INDEX_LENGTH"), SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>information_schema.ALL_TABLES.DATA_FREE</code>.
     */
    public final TableField<Record, ULong> DATA_FREE = createField(DSL.name("DATA_FREE"), SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>information_schema.ALL_TABLES.AUTO_INCREMENT</code>.
     */
    public final TableField<Record, ULong> AUTO_INCREMENT = createField(DSL.name("AUTO_INCREMENT"), SQLDataType.BIGINTUNSIGNED, this, "");

    /**
     * The column <code>information_schema.ALL_TABLES.CREATE_TIME</code>.
     */
    public final TableField<Record, Timestamp> CREATE_TIME = createField(DSL.name("CREATE_TIME"), SQLDataType.TIMESTAMP(0).nullable(false), this, "");

    /**
     * The column <code>information_schema.ALL_TABLES.UPDATE_TIME</code>.
     */
    public final TableField<Record, Timestamp> UPDATE_TIME = createField(DSL.name("UPDATE_TIME"), SQLDataType.TIMESTAMP(0), this, "");

    /**
     * The column <code>information_schema.ALL_TABLES.CHECK_TIME</code>.
     */
    public final TableField<Record, Timestamp> CHECK_TIME = createField(DSL.name("CHECK_TIME"), SQLDataType.TIMESTAMP(0), this, "");

    /**
     * The column <code>information_schema.ALL_TABLES.TABLE_COLLATION</code>.
     */
    public final TableField<Record, String> TABLE_COLLATION = createField(DSL.name("TABLE_COLLATION"), SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>information_schema.ALL_TABLES.CHECKSUM</code>.
     */
    public final TableField<Record, Long> CHECKSUM = createField(DSL.name("CHECKSUM"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>information_schema.ALL_TABLES.CREATE_OPTIONS</code>.
     */
    public final TableField<Record, String> CREATE_OPTIONS = createField(DSL.name("CREATE_OPTIONS"), SQLDataType.VARCHAR(256), this, "");

    /**
     * The column <code>information_schema.ALL_TABLES.TABLE_COMMENT</code>.
     */
    public final TableField<Record, String> COMMENTS = createField(DSL.name("COMMENTS"), SQLDataType.CLOB, this, "");

    private AllTables(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private AllTables(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>information_schema.ALL_TABLES</code> table reference
     */
    public AllTables(String alias) {
        this(DSL.name(alias), ALL_TABLES);
    }

    /**
     * Create an aliased <code>information_schema.ALL_TABLES</code> table reference
     */
    public AllTables(Name alias) {
        this(alias, ALL_TABLES);
    }

    /**
     * Create a <code>information_schema.ALL_TABLES</code> table reference
     */
    public AllTables() {
        this(DSL.name("ALL_TABLES"), null);
    }


    public <O extends Record> AllTables(Table<O> child, ForeignKey<O, Record> key) {
        super(child, key, ALL_TABLES);
    }

    @Override
    public Schema getSchema() {
        return All.ALL;
    }

    @Override
    public UniqueKey<Record> getPrimaryKey() {
        return Keys.SYNTHETIC_PK_ALL_TABLES;
    }

    @Override
    public List<UniqueKey<Record>> getKeys() {
        return Arrays.<UniqueKey<Record>>asList(Keys.SYNTHETIC_PK_ALL_TABLES);
    }

    @Override
    public AllTables as(String alias) {
        return new AllTables(DSL.name(alias), this);
    }

    @Override
    public AllTables as(Name alias) {
        return new AllTables(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public AllTables rename(String name) {
        return new AllTables(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public AllTables rename(Name name) {
        return new AllTables(name, null);
    }
}
