/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.routines;

/**
 * This class is generated by jOOQ.
 */
public class F_ARRAYS2 extends org.jooq.impl.AbstractRoutine<org.jooq.test.oracle3.generatedclasses.udt.records.U_NUMBER_LONG_ARRAY> implements java.lang.Cloneable {

	private static final long serialVersionUID = 493511827;


	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<org.jooq.test.oracle3.generatedclasses.udt.records.U_NUMBER_LONG_ARRAY> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.BIGINT.asArrayDataType(org.jooq.test.oracle3.generatedclasses.udt.records.U_NUMBER_LONG_ARRAY.class));

	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<org.jooq.test.oracle3.generatedclasses.udt.records.U_NUMBER_LONG_ARRAY> IN_ARRAY = createParameter("IN_ARRAY", org.jooq.impl.SQLDataType.BIGINT.asArrayDataType(org.jooq.test.oracle3.generatedclasses.udt.records.U_NUMBER_LONG_ARRAY.class));

	/**
	 * Create a new routine call instance
	 */
	public F_ARRAYS2() {
		super("F_ARRAYS2", org.jooq.test.oracle3.generatedclasses.TEST.TEST, org.jooq.impl.SQLDataType.BIGINT.asArrayDataType(org.jooq.test.oracle3.generatedclasses.udt.records.U_NUMBER_LONG_ARRAY.class));

		setReturnParameter(RETURN_VALUE);
		addInParameter(IN_ARRAY);
	}

	/**
	 * Set the <code>IN_ARRAY</code> parameter to the routine
	 */
	public void setIN_ARRAY(org.jooq.test.oracle3.generatedclasses.udt.records.U_NUMBER_LONG_ARRAY value) {
		setValue(org.jooq.test.oracle3.generatedclasses.routines.F_ARRAYS2.IN_ARRAY, value);
	}

	/**
	 * Set the <code>IN_ARRAY</code> parameter to the function
	 * <p>
	 * Use this method only, if the function is called as a {@link org.jooq.Field} in a {@link org.jooq.Select} statement!
	 */
	public void setIN_ARRAY(org.jooq.Field<org.jooq.test.oracle3.generatedclasses.udt.records.U_NUMBER_LONG_ARRAY> field) {
		setField(IN_ARRAY, field);
	}
}
