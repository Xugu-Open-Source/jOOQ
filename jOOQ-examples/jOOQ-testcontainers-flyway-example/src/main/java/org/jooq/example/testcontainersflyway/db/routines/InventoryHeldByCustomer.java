/*
 * This file is generated by jOOQ.
 */
package org.jooq.example.testcontainersflyway.db.routines;


import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.example.testcontainersflyway.db.Public;
import org.jooq.impl.AbstractRoutine;
import org.jooq.impl.Internal;
import org.jooq.impl.SQLDataType;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class InventoryHeldByCustomer extends AbstractRoutine<Integer> {

    private static final long serialVersionUID = 1L;

    /**
     * The parameter
     * <code>public.inventory_held_by_customer.RETURN_VALUE</code>.
     */
    public static final Parameter<Integer> RETURN_VALUE = Internal.createParameter("RETURN_VALUE", SQLDataType.INTEGER, false, false);

    /**
     * The parameter
     * <code>public.inventory_held_by_customer.p_inventory_id</code>.
     */
    public static final Parameter<Long> P_INVENTORY_ID = Internal.createParameter("p_inventory_id", SQLDataType.BIGINT, false, false);

    /**
     * Create a new routine call instance
     */
    public InventoryHeldByCustomer() {
        super("inventory_held_by_customer", Public.PUBLIC, SQLDataType.INTEGER);

        setReturnParameter(RETURN_VALUE);
        addInParameter(P_INVENTORY_ID);
    }

    /**
     * Set the <code>p_inventory_id</code> parameter IN value to the routine
     */
    public void setPInventoryId(Long value) {
        setValue(P_INVENTORY_ID, value);
    }

    /**
     * Set the <code>p_inventory_id</code> parameter to the function to be used
     * with a {@link org.jooq.Select} statement
     */
    public void setPInventoryId(Field<Long> field) {
        setField(P_INVENTORY_ID, field);
    }
}
