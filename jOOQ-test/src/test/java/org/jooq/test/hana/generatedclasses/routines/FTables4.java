/**
 * This class is generated by jOOQ
 */
package org.jooq.test.hana.generatedclasses.routines;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FTables4 extends org.jooq.impl.AbstractRoutine<java.lang.Object> {

	private static final long serialVersionUID = 94303141;

	/**
	 * The parameter <code>DEV_2ZUU8JBREPCG8SWGL0XWK7NTF.F_TABLES4.RETURN_VALUE</code>.
	 */
	public static final org.jooq.Parameter<java.lang.Object> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.DefaultDataType.getDefaultDataType("TABLE_TYPE"), false);

	/**
	 * The parameter <code>DEV_2ZUU8JBREPCG8SWGL0XWK7NTF.F_TABLES4.IN_ID</code>.
	 */
	public static final org.jooq.Parameter<java.lang.Integer> IN_ID = createParameter("IN_ID", org.jooq.impl.SQLDataType.INTEGER, false);

	/**
	 * Create a new routine call instance
	 */
	public FTables4() {
		super("F_TABLES4", org.jooq.test.hana.generatedclasses.Dev_2zuu8jbrepcg8swgl0xwk7ntf.DEV_2ZUU8JBREPCG8SWGL0XWK7NTF, org.jooq.impl.DefaultDataType.getDefaultDataType("TABLE_TYPE"));

		setReturnParameter(RETURN_VALUE);
		addInParameter(IN_ID);
	}

	/**
	 * Set the <code>IN_ID</code> parameter IN value to the routine
	 */
	public void setInId(java.lang.Integer value) {
		setValue(org.jooq.test.hana.generatedclasses.routines.FTables4.IN_ID, value);
	}

	/**
	 * Set the <code>IN_ID</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setInId(org.jooq.Field<java.lang.Integer> field) {
		setField(IN_ID, field);
	}
}
