/*
 * This file is generated by jOOQ.
 */
package org.jooq.example.testcontainers.db.tables;


import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function11;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row11;
import org.jooq.Schema;
import org.jooq.SelectField;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.example.testcontainers.db.Keys;
import org.jooq.example.testcontainers.db.Public;
import org.jooq.example.testcontainers.db.tables.records.StaffRecord;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Staff extends TableImpl<StaffRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.staff</code>
     */
    public static final Staff STAFF = new Staff();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<StaffRecord> getRecordType() {
        return StaffRecord.class;
    }

    /**
     * The column <code>public.staff.staff_id</code>.
     */
    public final TableField<StaffRecord, Long> STAFF_ID = createField(DSL.name("staff_id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>public.staff.first_name</code>.
     */
    public final TableField<StaffRecord, String> FIRST_NAME = createField(DSL.name("first_name"), SQLDataType.VARCHAR(45).nullable(false), this, "");

    /**
     * The column <code>public.staff.last_name</code>.
     */
    public final TableField<StaffRecord, String> LAST_NAME = createField(DSL.name("last_name"), SQLDataType.VARCHAR(45).nullable(false), this, "");

    /**
     * The column <code>public.staff.address_id</code>.
     */
    public final TableField<StaffRecord, Long> ADDRESS_ID = createField(DSL.name("address_id"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.staff.email</code>.
     */
    public final TableField<StaffRecord, String> EMAIL = createField(DSL.name("email"), SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>public.staff.store_id</code>.
     */
    public final TableField<StaffRecord, Long> STORE_ID = createField(DSL.name("store_id"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.staff.active</code>.
     */
    public final TableField<StaffRecord, Boolean> ACTIVE = createField(DSL.name("active"), SQLDataType.BOOLEAN.nullable(false).defaultValue(DSL.field("true", SQLDataType.BOOLEAN)), this, "");

    /**
     * The column <code>public.staff.username</code>.
     */
    public final TableField<StaffRecord, String> USERNAME = createField(DSL.name("username"), SQLDataType.VARCHAR(16).nullable(false), this, "");

    /**
     * The column <code>public.staff.password</code>.
     */
    public final TableField<StaffRecord, String> PASSWORD = createField(DSL.name("password"), SQLDataType.VARCHAR(40), this, "");

    /**
     * The column <code>public.staff.last_update</code>.
     */
    public final TableField<StaffRecord, LocalDateTime> LAST_UPDATE = createField(DSL.name("last_update"), SQLDataType.LOCALDATETIME(6).nullable(false).defaultValue(DSL.field("now()", SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>public.staff.picture</code>.
     */
    public final TableField<StaffRecord, byte[]> PICTURE = createField(DSL.name("picture"), SQLDataType.BLOB, this, "");

    private Staff(Name alias, Table<StaffRecord> aliased) {
        this(alias, aliased, null);
    }

    private Staff(Name alias, Table<StaffRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>public.staff</code> table reference
     */
    public Staff(String alias) {
        this(DSL.name(alias), STAFF);
    }

    /**
     * Create an aliased <code>public.staff</code> table reference
     */
    public Staff(Name alias) {
        this(alias, STAFF);
    }

    /**
     * Create a <code>public.staff</code> table reference
     */
    public Staff() {
        this(DSL.name("staff"), null);
    }

    public <O extends Record> Staff(Table<O> child, ForeignKey<O, StaffRecord> key) {
        super(child, key, STAFF);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Public.PUBLIC;
    }

    @Override
    public Identity<StaffRecord, Long> getIdentity() {
        return (Identity<StaffRecord, Long>) super.getIdentity();
    }

    @Override
    public UniqueKey<StaffRecord> getPrimaryKey() {
        return Keys.STAFF_PKEY;
    }

    @Override
    public List<ForeignKey<StaffRecord, ?>> getReferences() {
        return Arrays.asList(Keys.STAFF__STAFF_ADDRESS_ID_FKEY, Keys.STAFF__STAFF_STORE_ID_FKEY);
    }

    private transient Address _address;
    private transient Store _store;

    /**
     * Get the implicit join path to the <code>public.address</code> table.
     */
    public Address address() {
        if (_address == null)
            _address = new Address(this, Keys.STAFF__STAFF_ADDRESS_ID_FKEY);

        return _address;
    }

    /**
     * Get the implicit join path to the <code>public.store</code> table.
     */
    public Store store() {
        if (_store == null)
            _store = new Store(this, Keys.STAFF__STAFF_STORE_ID_FKEY);

        return _store;
    }

    @Override
    public Staff as(String alias) {
        return new Staff(DSL.name(alias), this);
    }

    @Override
    public Staff as(Name alias) {
        return new Staff(alias, this);
    }

    @Override
    public Staff as(Table alias) {
        return new Staff(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public Staff rename(String name) {
        return new Staff(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Staff rename(Name name) {
        return new Staff(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public Staff rename(Table name) {
        return new Staff(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row11 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row11<Long, String, String, Long, String, Long, Boolean, String, String, LocalDateTime, byte[]> fieldsRow() {
        return (Row11) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link #convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function11<? super Long, ? super String, ? super String, ? super Long, ? super String, ? super Long, ? super Boolean, ? super String, ? super String, ? super LocalDateTime, ? super byte[], ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link #convertFrom(Class, Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function11<? super Long, ? super String, ? super String, ? super Long, ? super String, ? super Long, ? super Boolean, ? super String, ? super String, ? super LocalDateTime, ? super byte[], ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
