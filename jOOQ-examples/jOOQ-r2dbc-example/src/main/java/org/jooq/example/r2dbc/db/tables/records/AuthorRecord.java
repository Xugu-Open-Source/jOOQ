/*
 * This file is generated by jOOQ.
 */
package org.jooq.example.r2dbc.db.tables.records;


import org.jooq.Record1;
import org.jooq.example.r2dbc.db.tables.Author;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class AuthorRecord extends UpdatableRecordImpl<AuthorRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>R2DBC_EXAMPLE.AUTHOR.ID</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>R2DBC_EXAMPLE.AUTHOR.ID</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>R2DBC_EXAMPLE.AUTHOR.FIRST_NAME</code>.
     */
    public void setFirstName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>R2DBC_EXAMPLE.AUTHOR.FIRST_NAME</code>.
     */
    public String getFirstName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>R2DBC_EXAMPLE.AUTHOR.LAST_NAME</code>.
     */
    public void setLastName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>R2DBC_EXAMPLE.AUTHOR.LAST_NAME</code>.
     */
    public String getLastName() {
        return (String) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached AuthorRecord
     */
    public AuthorRecord() {
        super(Author.AUTHOR);
    }

    /**
     * Create a detached, initialised AuthorRecord
     */
    public AuthorRecord(Integer id, String firstName, String lastName) {
        super(Author.AUTHOR);

        setId(id);
        setFirstName(firstName);
        setLastName(lastName);
        resetChangedOnNotNull();
    }
}
