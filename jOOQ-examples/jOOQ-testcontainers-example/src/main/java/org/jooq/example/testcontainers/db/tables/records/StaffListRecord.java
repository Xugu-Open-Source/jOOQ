/*
 * This file is generated by jOOQ.
 */
package org.jooq.example.testcontainers.db.tables.records;


import org.jooq.example.testcontainers.db.tables.StaffList;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class StaffListRecord extends TableRecordImpl<StaffListRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.staff_list.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.staff_list.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.staff_list.name</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.staff_list.name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.staff_list.address</code>.
     */
    public void setAddress(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.staff_list.address</code>.
     */
    public String getAddress() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.staff_list.zip code</code>.
     */
    public void setZipCode(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.staff_list.zip code</code>.
     */
    public String getZipCode() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.staff_list.phone</code>.
     */
    public void setPhone(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.staff_list.phone</code>.
     */
    public String getPhone() {
        return (String) get(4);
    }

    /**
     * Setter for <code>public.staff_list.city</code>.
     */
    public void setCity(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.staff_list.city</code>.
     */
    public String getCity() {
        return (String) get(5);
    }

    /**
     * Setter for <code>public.staff_list.country</code>.
     */
    public void setCountry(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.staff_list.country</code>.
     */
    public String getCountry() {
        return (String) get(6);
    }

    /**
     * Setter for <code>public.staff_list.sid</code>.
     */
    public void setSid(Long value) {
        set(7, value);
    }

    /**
     * Getter for <code>public.staff_list.sid</code>.
     */
    public Long getSid() {
        return (Long) get(7);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached StaffListRecord
     */
    public StaffListRecord() {
        super(StaffList.STAFF_LIST);
    }

    /**
     * Create a detached, initialised StaffListRecord
     */
    public StaffListRecord(Long id, String name, String address, String zipCode, String phone, String city, String country, Long sid) {
        super(StaffList.STAFF_LIST);

        setId(id);
        setName(name);
        setAddress(address);
        setZipCode(zipCode);
        setPhone(phone);
        setCity(city);
        setCountry(country);
        setSid(sid);
        resetChangedOnNotNull();
    }
}
