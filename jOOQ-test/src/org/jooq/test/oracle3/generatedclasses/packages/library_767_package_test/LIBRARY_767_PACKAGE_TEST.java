/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.packages.library_767_package_test;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked" })
public class LIBRARY_767_PACKAGE_TEST extends org.jooq.impl.AbstractRoutine<java.math.BigDecimal> implements java.io.Serializable, java.lang.Cloneable {

	private static final long serialVersionUID = -1225677313;

	/**
	 * The parameter <code>LIBRARY_767_PACKAGE_TEST.LIBRARY_767_PACKAGE_TEST.RETURN_VALUE</code>. 
	 */
	public static final org.jooq.Parameter<java.math.BigDecimal> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.NUMERIC);

	/**
	 * Create a new routine call instance
	 */
	public LIBRARY_767_PACKAGE_TEST() {
		super("LIBRARY_767_PACKAGE_TEST", org.jooq.test.oracle3.generatedclasses.DefaultSchema.DEFAULT_SCHEMA, org.jooq.test.oracle3.generatedclasses.packages.LIBRARY_767_PACKAGE_TEST.LIBRARY_767_PACKAGE_TEST, org.jooq.impl.SQLDataType.NUMERIC);

		setReturnParameter(RETURN_VALUE);
	}
}
