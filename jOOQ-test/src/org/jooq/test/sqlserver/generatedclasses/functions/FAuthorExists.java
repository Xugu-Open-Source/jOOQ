/**
 * This class is generated by jOOQ
 */
package org.jooq.test.sqlserver.generatedclasses.functions;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = "http://www.jooq.org",
                            comments = "This class is generated by jOOQ")
public class FAuthorExists extends org.jooq.impl.StoredFunctionImpl<java.lang.Integer> {

	private static final long serialVersionUID = 235917320;


	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.lang.String> AUTHOR_NAME = new org.jooq.impl.ParameterImpl<java.lang.String>("author_name", org.jooq.impl.SQLDataType.VARCHAR);

	/**
	 * Create a new function call instance
	 */
	public FAuthorExists() {
		super(org.jooq.SQLDialect.SQLSERVER, "f_author_exists", org.jooq.test.sqlserver.generatedclasses.Dbo.DBO, org.jooq.impl.SQLDataType.INTEGER);

		addInParameter(AUTHOR_NAME);
	}

	/**
	 * Set the <code>author_name</code> parameter to the function
	 */
	public void setAuthorName(java.lang.String value) {
		setValue(AUTHOR_NAME, value);
	}

	/**
	 * Set the <code>author_name</code> parameter to the function
	 * <p>
	 * Use this method only, if the function is called as a {@link org.jooq.Field} in a {@link org.jooq.Select} statement!
	 */
	public void setAuthorName(org.jooq.Field<java.lang.String> field) {
		setField(AUTHOR_NAME, field);
	}
}
