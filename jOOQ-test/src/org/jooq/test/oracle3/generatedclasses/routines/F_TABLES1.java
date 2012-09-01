/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.routines;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class F_TABLES1 extends org.jooq.impl.AbstractRoutine<org.jooq.test.oracle3.generatedclasses.udt.records.U_NUMBER_TABLE> implements java.lang.Cloneable {

	private static final long serialVersionUID = -9875455;


	/**
	 * The procedure parameter <code>TEST.F_TABLES1.RETURN_VALUE</code>
	 */
	public static final org.jooq.Parameter<org.jooq.test.oracle3.generatedclasses.udt.records.U_NUMBER_TABLE> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.INTEGER.asArrayDataType(org.jooq.test.oracle3.generatedclasses.udt.records.U_NUMBER_TABLE.class));

	/**
	 * The procedure parameter <code>TEST.F_TABLES1.IN_TABLE</code>
	 */
	public static final org.jooq.Parameter<org.jooq.test.oracle3.generatedclasses.udt.records.U_NUMBER_TABLE> IN_TABLE = createParameter("IN_TABLE", org.jooq.impl.SQLDataType.INTEGER.asArrayDataType(org.jooq.test.oracle3.generatedclasses.udt.records.U_NUMBER_TABLE.class));

	/**
	 * Create a new routine call instance
	 */
	public F_TABLES1() {
		super("F_TABLES1", org.jooq.test.oracle3.generatedclasses.TEST.TEST, org.jooq.impl.SQLDataType.INTEGER.asArrayDataType(org.jooq.test.oracle3.generatedclasses.udt.records.U_NUMBER_TABLE.class));

		setReturnParameter(RETURN_VALUE);
		addInParameter(IN_TABLE);
	}

	/**
	 * Set the <code>IN_TABLE</code> parameter IN value to the routine
	 */
	public void setIN_TABLE(org.jooq.test.oracle3.generatedclasses.udt.records.U_NUMBER_TABLE value) {
		setValue(org.jooq.test.oracle3.generatedclasses.routines.F_TABLES1.IN_TABLE, value);
	}

	/**
	 * Set the <code>IN_TABLE</code> parameter to the function
	 * <p>
	 * Use this method only, if the function is called as a {@link org.jooq.Field} in a {@link org.jooq.Select} statement!
	 */
	public void setIN_TABLE(org.jooq.Field<org.jooq.test.oracle3.generatedclasses.udt.records.U_NUMBER_TABLE> field) {
		setField(IN_TABLE, field);
	}
}
