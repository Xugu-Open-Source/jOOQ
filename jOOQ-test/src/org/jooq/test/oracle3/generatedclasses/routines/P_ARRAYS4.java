/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.routines;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked" })
public class P_ARRAYS4 extends org.jooq.impl.AbstractRoutine<java.lang.Void> implements java.lang.Cloneable {

	private static final long serialVersionUID = -1025017627;

	/**
	 * The parameter <code>P_ARRAYS4.IN_ARRAY</code>. 
	 */
	public static final org.jooq.Parameter<org.jooq.test.oracle3.generatedclasses.udt.records.U_BOOK_ARRAY> IN_ARRAY = createParameter("IN_ARRAY", org.jooq.test.oracle3.generatedclasses.udt.U_BOOK_TYPE.U_BOOK_TYPE.getDataType().asArrayDataType(org.jooq.test.oracle3.generatedclasses.udt.records.U_BOOK_ARRAY.class));

	/**
	 * The parameter <code>P_ARRAYS4.OUT_ARRAY</code>. 
	 */
	public static final org.jooq.Parameter<org.jooq.test.oracle3.generatedclasses.udt.records.U_BOOK_ARRAY> OUT_ARRAY = createParameter("OUT_ARRAY", org.jooq.test.oracle3.generatedclasses.udt.U_BOOK_TYPE.U_BOOK_TYPE.getDataType().asArrayDataType(org.jooq.test.oracle3.generatedclasses.udt.records.U_BOOK_ARRAY.class));

	/**
	 * Create a new routine call instance
	 */
	public P_ARRAYS4() {
		super("P_ARRAYS4", org.jooq.test.oracle3.generatedclasses.DefaultSchema.DEFAULT_SCHEMA);

		addInParameter(IN_ARRAY);
		addOutParameter(OUT_ARRAY);
	}

	/**
	 * Set the <code>IN_ARRAY</code> parameter IN value to the routine
	 */
	public void setIN_ARRAY(org.jooq.test.oracle3.generatedclasses.udt.records.U_BOOK_ARRAY value) {
		setValue(org.jooq.test.oracle3.generatedclasses.routines.P_ARRAYS4.IN_ARRAY, value);
	}

	/**
	 * Get the <code>OUT_ARRAY</code> parameter OUT value from the routine
	 */
	public org.jooq.test.oracle3.generatedclasses.udt.records.U_BOOK_ARRAY getOUT_ARRAY() {
		return getValue(OUT_ARRAY);
	}
}
