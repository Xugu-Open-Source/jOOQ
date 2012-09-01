/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.udt.u_author_type;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class NEW_AUTHOR extends org.jooq.impl.AbstractRoutine<java.lang.Void> implements java.lang.Cloneable {

	private static final long serialVersionUID = 1030556824;


	/**
	 * The procedure parameter <code>TEST.U_AUTHOR_TYPE.NEW_AUTHOR.P_ID</code>
	 */
	public static final org.jooq.Parameter<java.math.BigDecimal> P_ID = createParameter("P_ID", org.jooq.impl.SQLDataType.NUMERIC);

	/**
	 * The procedure parameter <code>TEST.U_AUTHOR_TYPE.NEW_AUTHOR.P_FIRST_NAME</code>
	 */
	public static final org.jooq.Parameter<java.lang.String> P_FIRST_NAME = createParameter("P_FIRST_NAME", org.jooq.impl.SQLDataType.VARCHAR);

	/**
	 * The procedure parameter <code>TEST.U_AUTHOR_TYPE.NEW_AUTHOR.P_LAST_NAME</code>
	 */
	public static final org.jooq.Parameter<java.lang.String> P_LAST_NAME = createParameter("P_LAST_NAME", org.jooq.impl.SQLDataType.VARCHAR);

	/**
	 * The procedure parameter <code>TEST.U_AUTHOR_TYPE.NEW_AUTHOR.P_AUTHOR</code>
	 */
	public static final org.jooq.Parameter<org.jooq.test.oracle3.generatedclasses.udt.records.U_AUTHOR_TYPE> P_AUTHOR = createParameter("P_AUTHOR", org.jooq.test.oracle3.generatedclasses.udt.U_AUTHOR_TYPE.U_AUTHOR_TYPE.getDataType());

	/**
	 * Create a new routine call instance
	 */
	public NEW_AUTHOR() {
		super("NEW_AUTHOR", org.jooq.test.oracle3.generatedclasses.TEST.TEST, org.jooq.test.oracle3.generatedclasses.udt.U_AUTHOR_TYPE.U_AUTHOR_TYPE);

		addInParameter(P_ID);
		addInParameter(P_FIRST_NAME);
		addInParameter(P_LAST_NAME);
		addOutParameter(P_AUTHOR);
	}

	/**
	 * Set the <code>P_ID</code> parameter IN value to the routine
	 */
	public void setP_ID(java.lang.Number value) {
		setNumber(org.jooq.test.oracle3.generatedclasses.udt.u_author_type.NEW_AUTHOR.P_ID, value);
	}

	/**
	 * Set the <code>P_FIRST_NAME</code> parameter IN value to the routine
	 */
	public void setP_FIRST_NAME(java.lang.String value) {
		setValue(org.jooq.test.oracle3.generatedclasses.udt.u_author_type.NEW_AUTHOR.P_FIRST_NAME, value);
	}

	/**
	 * Set the <code>P_LAST_NAME</code> parameter IN value to the routine
	 */
	public void setP_LAST_NAME(java.lang.String value) {
		setValue(org.jooq.test.oracle3.generatedclasses.udt.u_author_type.NEW_AUTHOR.P_LAST_NAME, value);
	}

	/**
	 * Get the <code>P_AUTHOR</code> parameter OUT value from the routine
	 */
	public org.jooq.test.oracle3.generatedclasses.udt.records.U_AUTHOR_TYPE getP_AUTHOR() {
		return getValue(P_AUTHOR);
	}
}
