/*
 * This file is generated by jOOQ.
 */
package org.jooq.example.chart.db.routines;


import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.example.chart.db.Public;
import org.jooq.impl.AbstractRoutine;
import org.jooq.impl.Internal;
import org.jooq.impl.SQLDataType;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class GetCustomerBalance extends AbstractRoutine<BigDecimal> {

    private static final long serialVersionUID = 1L;

    /**
     * The parameter <code>public.get_customer_balance.RETURN_VALUE</code>.
     */
    public static final Parameter<BigDecimal> RETURN_VALUE = Internal.createParameter("RETURN_VALUE", SQLDataType.NUMERIC, false, false);

    /**
     * The parameter <code>public.get_customer_balance.p_customer_id</code>.
     */
    public static final Parameter<Integer> P_CUSTOMER_ID = Internal.createParameter("p_customer_id", SQLDataType.INTEGER, false, false);

    /**
     * The parameter <code>public.get_customer_balance.p_effective_date</code>.
     */
    public static final Parameter<LocalDateTime> P_EFFECTIVE_DATE = Internal.createParameter("p_effective_date", SQLDataType.LOCALDATETIME(6), false, false);

    /**
     * Create a new routine call instance
     */
    public GetCustomerBalance() {
        super("get_customer_balance", Public.PUBLIC, SQLDataType.NUMERIC);

        setReturnParameter(RETURN_VALUE);
        addInParameter(P_CUSTOMER_ID);
        addInParameter(P_EFFECTIVE_DATE);
    }

    /**
     * Set the <code>p_customer_id</code> parameter IN value to the routine
     */
    public void setPCustomerId(Integer value) {
        setValue(P_CUSTOMER_ID, value);
    }

    /**
     * Set the <code>p_customer_id</code> parameter to the function to be used
     * with a {@link org.jooq.Select} statement
     */
    public void setPCustomerId(Field<Integer> field) {
        setField(P_CUSTOMER_ID, field);
    }

    /**
     * Set the <code>p_effective_date</code> parameter IN value to the routine
     */
    public void setPEffectiveDate(LocalDateTime value) {
        setValue(P_EFFECTIVE_DATE, value);
    }

    /**
     * Set the <code>p_effective_date</code> parameter to the function to be
     * used with a {@link org.jooq.Select} statement
     */
    public void setPEffectiveDate(Field<LocalDateTime> field) {
        setField(P_EFFECTIVE_DATE, field);
    }
}
