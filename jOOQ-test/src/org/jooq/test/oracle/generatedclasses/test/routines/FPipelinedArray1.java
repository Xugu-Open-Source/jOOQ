/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.test.routines;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class FPipelinedArray1 extends org.jooq.impl.AbstractRoutine<org.jooq.test.oracle.generatedclasses.test.udt.records.UNumberArrayRecord> {

	private static final long serialVersionUID = -764217755;


	/**
	 * The procedure parameter <code>TEST.F_PIPELINED_ARRAY1.RETURN_VALUE</code>
	 */
	public static final org.jooq.Parameter<org.jooq.test.oracle.generatedclasses.test.udt.records.UNumberArrayRecord> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.INTEGER.asArrayDataType(org.jooq.test.oracle.generatedclasses.test.udt.records.UNumberArrayRecord.class));

	/**
	 * Create a new routine call instance
	 */
	public FPipelinedArray1() {
		super("F_PIPELINED_ARRAY1", org.jooq.test.oracle.generatedclasses.test.Test.TEST, org.jooq.impl.SQLDataType.INTEGER.asArrayDataType(org.jooq.test.oracle.generatedclasses.test.udt.records.UNumberArrayRecord.class));

		setReturnParameter(RETURN_VALUE);
	}
}
