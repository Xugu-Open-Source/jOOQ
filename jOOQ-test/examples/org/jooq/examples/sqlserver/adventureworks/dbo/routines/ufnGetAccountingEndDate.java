/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.dbo.routines;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class ufnGetAccountingEndDate extends org.jooq.impl.AbstractRoutine<java.sql.Timestamp> {

	private static final long serialVersionUID = -830271398;


	/**
	 * The procedure parameter <code>dbo.ufnGetAccountingEndDate.RETURN_VALUE</code>
	 */
	public static final org.jooq.Parameter<java.sql.Timestamp> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.TIMESTAMP);

	/**
	 * Create a new routine call instance
	 */
	public ufnGetAccountingEndDate() {
		super("ufnGetAccountingEndDate", org.jooq.examples.sqlserver.adventureworks.dbo.dbo.dbo, org.jooq.impl.SQLDataType.TIMESTAMP);

		setReturnParameter(RETURN_VALUE);
	}
}
