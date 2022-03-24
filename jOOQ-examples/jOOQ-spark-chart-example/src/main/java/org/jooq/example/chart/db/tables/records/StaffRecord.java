/*
 * This file is generated by jOOQ.
 */
package org.jooq.example.chart.db.tables.records;


import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record11;
import org.jooq.Row11;
import org.jooq.example.chart.db.tables.Staff;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class StaffRecord extends UpdatableRecordImpl<StaffRecord> implements Record11<Integer, String, String, Short, String, Short, Boolean, String, String, LocalDateTime, byte[]> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.staff.staff_id</code>.
     */
    public void setStaffId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.staff.staff_id</code>.
     */
    public Integer getStaffId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.staff.first_name</code>.
     */
    public void setFirstName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.staff.first_name</code>.
     */
    public String getFirstName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.staff.last_name</code>.
     */
    public void setLastName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.staff.last_name</code>.
     */
    public String getLastName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.staff.address_id</code>.
     */
    public void setAddressId(Short value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.staff.address_id</code>.
     */
    public Short getAddressId() {
        return (Short) get(3);
    }

    /**
     * Setter for <code>public.staff.email</code>.
     */
    public void setEmail(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.staff.email</code>.
     */
    public String getEmail() {
        return (String) get(4);
    }

    /**
     * Setter for <code>public.staff.store_id</code>.
     */
    public void setStoreId(Short value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.staff.store_id</code>.
     */
    public Short getStoreId() {
        return (Short) get(5);
    }

    /**
     * Setter for <code>public.staff.active</code>.
     */
    public void setActive(Boolean value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.staff.active</code>.
     */
    public Boolean getActive() {
        return (Boolean) get(6);
    }

    /**
     * Setter for <code>public.staff.username</code>.
     */
    public void setUsername(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>public.staff.username</code>.
     */
    public String getUsername() {
        return (String) get(7);
    }

    /**
     * Setter for <code>public.staff.password</code>.
     */
    public void setPassword(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>public.staff.password</code>.
     */
    public String getPassword() {
        return (String) get(8);
    }

    /**
     * Setter for <code>public.staff.last_update</code>.
     */
    public void setLastUpdate(LocalDateTime value) {
        set(9, value);
    }

    /**
     * Getter for <code>public.staff.last_update</code>.
     */
    public LocalDateTime getLastUpdate() {
        return (LocalDateTime) get(9);
    }

    /**
     * Setter for <code>public.staff.picture</code>.
     */
    public void setPicture(byte[] value) {
        set(10, value);
    }

    /**
     * Getter for <code>public.staff.picture</code>.
     */
    public byte[] getPicture() {
        return (byte[]) get(10);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record11 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row11<Integer, String, String, Short, String, Short, Boolean, String, String, LocalDateTime, byte[]> fieldsRow() {
        return (Row11) super.fieldsRow();
    }

    @Override
    public Row11<Integer, String, String, Short, String, Short, Boolean, String, String, LocalDateTime, byte[]> valuesRow() {
        return (Row11) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return Staff.STAFF.STAFF_ID;
    }

    @Override
    public Field<String> field2() {
        return Staff.STAFF.FIRST_NAME;
    }

    @Override
    public Field<String> field3() {
        return Staff.STAFF.LAST_NAME;
    }

    @Override
    public Field<Short> field4() {
        return Staff.STAFF.ADDRESS_ID;
    }

    @Override
    public Field<String> field5() {
        return Staff.STAFF.EMAIL;
    }

    @Override
    public Field<Short> field6() {
        return Staff.STAFF.STORE_ID;
    }

    @Override
    public Field<Boolean> field7() {
        return Staff.STAFF.ACTIVE;
    }

    @Override
    public Field<String> field8() {
        return Staff.STAFF.USERNAME;
    }

    @Override
    public Field<String> field9() {
        return Staff.STAFF.PASSWORD;
    }

    @Override
    public Field<LocalDateTime> field10() {
        return Staff.STAFF.LAST_UPDATE;
    }

    @Override
    public Field<byte[]> field11() {
        return Staff.STAFF.PICTURE;
    }

    @Override
    public Integer component1() {
        return getStaffId();
    }

    @Override
    public String component2() {
        return getFirstName();
    }

    @Override
    public String component3() {
        return getLastName();
    }

    @Override
    public Short component4() {
        return getAddressId();
    }

    @Override
    public String component5() {
        return getEmail();
    }

    @Override
    public Short component6() {
        return getStoreId();
    }

    @Override
    public Boolean component7() {
        return getActive();
    }

    @Override
    public String component8() {
        return getUsername();
    }

    @Override
    public String component9() {
        return getPassword();
    }

    @Override
    public LocalDateTime component10() {
        return getLastUpdate();
    }

    @Override
    public byte[] component11() {
        return getPicture();
    }

    @Override
    public Integer value1() {
        return getStaffId();
    }

    @Override
    public String value2() {
        return getFirstName();
    }

    @Override
    public String value3() {
        return getLastName();
    }

    @Override
    public Short value4() {
        return getAddressId();
    }

    @Override
    public String value5() {
        return getEmail();
    }

    @Override
    public Short value6() {
        return getStoreId();
    }

    @Override
    public Boolean value7() {
        return getActive();
    }

    @Override
    public String value8() {
        return getUsername();
    }

    @Override
    public String value9() {
        return getPassword();
    }

    @Override
    public LocalDateTime value10() {
        return getLastUpdate();
    }

    @Override
    public byte[] value11() {
        return getPicture();
    }

    @Override
    public StaffRecord value1(Integer value) {
        setStaffId(value);
        return this;
    }

    @Override
    public StaffRecord value2(String value) {
        setFirstName(value);
        return this;
    }

    @Override
    public StaffRecord value3(String value) {
        setLastName(value);
        return this;
    }

    @Override
    public StaffRecord value4(Short value) {
        setAddressId(value);
        return this;
    }

    @Override
    public StaffRecord value5(String value) {
        setEmail(value);
        return this;
    }

    @Override
    public StaffRecord value6(Short value) {
        setStoreId(value);
        return this;
    }

    @Override
    public StaffRecord value7(Boolean value) {
        setActive(value);
        return this;
    }

    @Override
    public StaffRecord value8(String value) {
        setUsername(value);
        return this;
    }

    @Override
    public StaffRecord value9(String value) {
        setPassword(value);
        return this;
    }

    @Override
    public StaffRecord value10(LocalDateTime value) {
        setLastUpdate(value);
        return this;
    }

    @Override
    public StaffRecord value11(byte[] value) {
        setPicture(value);
        return this;
    }

    @Override
    public StaffRecord values(Integer value1, String value2, String value3, Short value4, String value5, Short value6, Boolean value7, String value8, String value9, LocalDateTime value10, byte[] value11) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached StaffRecord
     */
    public StaffRecord() {
        super(Staff.STAFF);
    }

    /**
     * Create a detached, initialised StaffRecord
     */
    public StaffRecord(Integer staffId, String firstName, String lastName, Short addressId, String email, Short storeId, Boolean active, String username, String password, LocalDateTime lastUpdate, byte[] picture) {
        super(Staff.STAFF);

        setStaffId(staffId);
        setFirstName(firstName);
        setLastName(lastName);
        setAddressId(addressId);
        setEmail(email);
        setStoreId(storeId);
        setActive(active);
        setUsername(username);
        setPassword(password);
        setLastUpdate(lastUpdate);
        setPicture(picture);
    }
}
