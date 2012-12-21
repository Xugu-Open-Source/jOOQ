/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.packages.library;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class PKG_P_AUTHOR_EXISTS______ABC_2 extends org.jooq.impl.AbstractRoutine<java.lang.Void> implements java.lang.Cloneable {

	private static final long serialVersionUID = -2104893232;

	/**
	 * The parameter <code>TEST.LIBRARY.PKG_P_AUTHOR_EXISTS.AUTHOR_NAME</code>. 
	 */
	public static final org.jooq.Parameter<java.lang.String> AUTHOR_NAME = createParameter("AUTHOR_NAME", org.jooq.impl.SQLDataType.VARCHAR);

	/**
	 * The parameter <code>TEST.LIBRARY.PKG_P_AUTHOR_EXISTS.RESULT</code>. 
	 */
	public static final org.jooq.Parameter<java.math.BigDecimal> RESULT = createParameter("RESULT", org.jooq.impl.SQLDataType.NUMERIC);

	/**
	 * The parameter <code>TEST.LIBRARY.PKG_P_AUTHOR_EXISTS.UNUSED</code>. 
	 */
	public static final org.jooq.Parameter<java.math.BigDecimal> UNUSED = createParameter("UNUSED", org.jooq.impl.SQLDataType.NUMERIC);

	/**
	 * Create a new routine call instance
	 */
	public PKG_P_AUTHOR_EXISTS______ABC_2() {
		super("PKG_P_AUTHOR_EXISTS", org.jooq.test.oracle3.generatedclasses.TEST.TEST, org.jooq.test.oracle3.generatedclasses.packages.LIBRARY.LIBRARY);

		addInParameter(AUTHOR_NAME);
		addOutParameter(RESULT);
		addInOutParameter(UNUSED);
		setOverloaded(true);
	}

	/**
	 * Set the <code>AUTHOR_NAME</code> parameter IN value to the routine
	 */
	public void setAUTHOR_NAME(java.lang.String value) {
		setValue(org.jooq.test.oracle3.generatedclasses.packages.library.PKG_P_AUTHOR_EXISTS______ABC_2.AUTHOR_NAME, value);
	}

	/**
	 * Set the <code>UNUSED</code> parameter IN value to the routine
	 */
	public void setUNUSED(java.lang.Number value) {
		setNumber(org.jooq.test.oracle3.generatedclasses.packages.library.PKG_P_AUTHOR_EXISTS______ABC_2.UNUSED, value);
	}

	/**
	 * Get the <code>RESULT</code> parameter OUT value from the routine
	 */
	public java.math.BigDecimal getRESULT() {
		return getValue(RESULT);
	}

	/**
	 * Get the <code>UNUSED</code> parameter OUT value from the routine
	 */
	public java.math.BigDecimal getUNUSED() {
		return getValue(UNUSED);
	}
}
