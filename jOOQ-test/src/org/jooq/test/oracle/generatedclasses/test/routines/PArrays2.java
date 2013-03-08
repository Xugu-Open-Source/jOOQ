/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.test.routines;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked" })
public class PArrays2 extends org.jooq.impl.AbstractRoutine<java.lang.Void> {

	private static final long serialVersionUID = 2023008405;

	/**
	 * The parameter <code>TEST.P_ARRAYS2.IN_ARRAY</code>. 
	 */
	public static final org.jooq.Parameter<org.jooq.test.oracle.generatedclasses.test.udt.records.UNumberLongArrayRecord> IN_ARRAY = createParameter("IN_ARRAY", org.jooq.impl.SQLDataType.BIGINT.asArrayDataType(org.jooq.test.oracle.generatedclasses.test.udt.records.UNumberLongArrayRecord.class));

	/**
	 * The parameter <code>TEST.P_ARRAYS2.OUT_ARRAY</code>. 
	 */
	public static final org.jooq.Parameter<org.jooq.test.oracle.generatedclasses.test.udt.records.UNumberLongArrayRecord> OUT_ARRAY = createParameter("OUT_ARRAY", org.jooq.impl.SQLDataType.BIGINT.asArrayDataType(org.jooq.test.oracle.generatedclasses.test.udt.records.UNumberLongArrayRecord.class));

	/**
	 * Create a new routine call instance
	 */
	public PArrays2() {
		super("P_ARRAYS2", org.jooq.test.oracle.generatedclasses.test.Test.TEST);

		addInParameter(IN_ARRAY);
		addOutParameter(OUT_ARRAY);
	}

	/**
	 * Set the <code>IN_ARRAY</code> parameter IN value to the routine
	 */
	public void setInArray(org.jooq.test.oracle.generatedclasses.test.udt.records.UNumberLongArrayRecord value) {
		setValue(org.jooq.test.oracle.generatedclasses.test.routines.PArrays2.IN_ARRAY, value);
	}

	/**
	 * Get the <code>OUT_ARRAY</code> parameter OUT value from the routine
	 */
	public org.jooq.test.oracle.generatedclasses.test.udt.records.UNumberLongArrayRecord getOutArray() {
		return getValue(OUT_ARRAY);
	}
}
