/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.packages.test_synonym_package;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TEST_OBJECT extends org.jooq.impl.AbstractRoutine<java.lang.Object> implements java.lang.Cloneable {

	private static final long serialVersionUID = -1582014191;

	/**
	 * The parameter <code>TEST_SYNONYM_PACKAGE.TEST_OBJECT.RETURN_VALUE</code>.
	 */
	public static final org.jooq.Parameter<java.lang.Object> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.DefaultDataType.getDefaultDataType("OBJECT"));

	/**
	 * Create a new routine call instance
	 */
	public TEST_OBJECT() {
		super("TEST_OBJECT", org.jooq.test.oracle3.generatedclasses.DefaultSchema.DEFAULT_SCHEMA, org.jooq.test.oracle3.generatedclasses.packages.TEST_SYNONYM_PACKAGE.TEST_SYNONYM_PACKAGE, org.jooq.impl.DefaultDataType.getDefaultDataType("OBJECT"));

		setReturnParameter(RETURN_VALUE);
	}
}
