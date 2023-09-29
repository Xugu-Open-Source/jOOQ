/*
 * This file is generated by jOOQ.
 */
package org.jooq.example.testcontainersflyway.db.tables.records;


import java.time.LocalDate;
import java.time.LocalDateTime;

import org.jooq.Record1;
import org.jooq.example.testcontainersflyway.db.tables.Customer;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class CustomerRecord extends UpdatableRecordImpl<CustomerRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.customer.customer_id</code>.
     */
    public void setCustomerId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.customer.customer_id</code>.
     */
    public Long getCustomerId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.customer.store_id</code>.
     */
    public void setStoreId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.customer.store_id</code>.
     */
    public Long getStoreId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>public.customer.first_name</code>.
     */
    public void setFirstName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.customer.first_name</code>.
     */
    public String getFirstName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.customer.last_name</code>.
     */
    public void setLastName(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.customer.last_name</code>.
     */
    public String getLastName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.customer.email</code>.
     */
    public void setEmail(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.customer.email</code>.
     */
    public String getEmail() {
        return (String) get(4);
    }

    /**
     * Setter for <code>public.customer.address_id</code>.
     */
    public void setAddressId(Long value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.customer.address_id</code>.
     */
    public Long getAddressId() {
        return (Long) get(5);
    }

    /**
     * Setter for <code>public.customer.activebool</code>.
     */
    public void setActivebool(Boolean value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.customer.activebool</code>.
     */
    public Boolean getActivebool() {
        return (Boolean) get(6);
    }

    /**
     * Setter for <code>public.customer.create_date</code>.
     */
    public void setCreateDate(LocalDate value) {
        set(7, value);
    }

    /**
     * Getter for <code>public.customer.create_date</code>.
     */
    public LocalDate getCreateDate() {
        return (LocalDate) get(7);
    }

    /**
     * Setter for <code>public.customer.last_update</code>.
     */
    public void setLastUpdate(LocalDateTime value) {
        set(8, value);
    }

    /**
     * Getter for <code>public.customer.last_update</code>.
     */
    public LocalDateTime getLastUpdate() {
        return (LocalDateTime) get(8);
    }

    /**
     * Setter for <code>public.customer.active</code>.
     */
    public void setActive(Integer value) {
        set(9, value);
    }

    /**
     * Getter for <code>public.customer.active</code>.
     */
    public Integer getActive() {
        return (Integer) get(9);
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
     * Create a detached CustomerRecord
     */
    public CustomerRecord() {
        super(Customer.CUSTOMER);
    }

    /**
     * Create a detached, initialised CustomerRecord
     */
    public CustomerRecord(Long customerId, Long storeId, String firstName, String lastName, String email, Long addressId, Boolean activebool, LocalDate createDate, LocalDateTime lastUpdate, Integer active) {
        super(Customer.CUSTOMER);

        setCustomerId(customerId);
        setStoreId(storeId);
        setFirstName(firstName);
        setLastName(lastName);
        setEmail(email);
        setAddressId(addressId);
        setActivebool(activebool);
        setCreateDate(createDate);
        setLastUpdate(lastUpdate);
        setActive(active);
        resetChangedOnNotNull();
    }
}
