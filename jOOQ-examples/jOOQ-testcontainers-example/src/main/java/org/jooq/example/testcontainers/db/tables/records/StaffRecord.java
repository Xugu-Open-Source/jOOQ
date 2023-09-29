/*
 * This file is generated by jOOQ.
 */
package org.jooq.example.testcontainers.db.tables.records;


import java.time.LocalDateTime;

import org.jooq.Record1;
import org.jooq.example.testcontainers.db.tables.Staff;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class StaffRecord extends UpdatableRecordImpl<StaffRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.staff.staff_id</code>.
     */
    public void setStaffId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.staff.staff_id</code>.
     */
    public Long getStaffId() {
        return (Long) get(0);
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
    public void setAddressId(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.staff.address_id</code>.
     */
    public Long getAddressId() {
        return (Long) get(3);
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
    public void setStoreId(Long value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.staff.store_id</code>.
     */
    public Long getStoreId() {
        return (Long) get(5);
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
    public Record1<Long> key() {
        return (Record1) super.key();
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
    public StaffRecord(Long staffId, String firstName, String lastName, Long addressId, String email, Long storeId, Boolean active, String username, String password, LocalDateTime lastUpdate, byte[] picture) {
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
        resetChangedOnNotNull();
    }
}
