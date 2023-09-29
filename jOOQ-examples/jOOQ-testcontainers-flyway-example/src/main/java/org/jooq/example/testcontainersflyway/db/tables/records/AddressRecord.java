/*
 * This file is generated by jOOQ.
 */
package org.jooq.example.testcontainersflyway.db.tables.records;


import java.time.LocalDateTime;

import org.jooq.Record1;
import org.jooq.example.testcontainersflyway.db.tables.Address;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class AddressRecord extends UpdatableRecordImpl<AddressRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.address.address_id</code>.
     */
    public void setAddressId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.address.address_id</code>.
     */
    public Long getAddressId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.address.address</code>.
     */
    public void setAddress(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.address.address</code>.
     */
    public String getAddress() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.address.address2</code>.
     */
    public void setAddress2(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.address.address2</code>.
     */
    public String getAddress2() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.address.district</code>.
     */
    public void setDistrict(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.address.district</code>.
     */
    public String getDistrict() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.address.city_id</code>.
     */
    public void setCityId(Long value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.address.city_id</code>.
     */
    public Long getCityId() {
        return (Long) get(4);
    }

    /**
     * Setter for <code>public.address.postal_code</code>.
     */
    public void setPostalCode(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.address.postal_code</code>.
     */
    public String getPostalCode() {
        return (String) get(5);
    }

    /**
     * Setter for <code>public.address.phone</code>.
     */
    public void setPhone(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.address.phone</code>.
     */
    public String getPhone() {
        return (String) get(6);
    }

    /**
     * Setter for <code>public.address.last_update</code>.
     */
    public void setLastUpdate(LocalDateTime value) {
        set(7, value);
    }

    /**
     * Getter for <code>public.address.last_update</code>.
     */
    public LocalDateTime getLastUpdate() {
        return (LocalDateTime) get(7);
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
     * Create a detached AddressRecord
     */
    public AddressRecord() {
        super(Address.ADDRESS);
    }

    /**
     * Create a detached, initialised AddressRecord
     */
    public AddressRecord(Long addressId, String address, String address2, String district, Long cityId, String postalCode, String phone, LocalDateTime lastUpdate) {
        super(Address.ADDRESS);

        setAddressId(addressId);
        setAddress(address);
        setAddress2(address2);
        setDistrict(district);
        setCityId(cityId);
        setPostalCode(postalCode);
        setPhone(phone);
        setLastUpdate(lastUpdate);
        resetChangedOnNotNull();
    }
}
