/**
 * This class is generated by jOOQ
 */
package org.jooq.example.db.oracle.packages.library;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.5.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class GetAuthors extends org.jooq.impl.AbstractRoutine<org.jooq.example.db.oracle.udt.records.AuthorsTRecord> {

	private static final long serialVersionUID = 1633763871;

	/**
	 * The parameter <code>SP.LIBRARY.GET_AUTHORS.RETURN_VALUE</code>.
	 */
	public static final org.jooq.Parameter<org.jooq.example.db.oracle.udt.records.AuthorsTRecord> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.example.db.oracle.udt.AuthorT.AUTHOR_T.getDataType().asArrayDataType(org.jooq.example.db.oracle.udt.records.AuthorsTRecord.class));

	/**
	 * The parameter <code>SP.LIBRARY.GET_AUTHORS.P_ID</code>.
	 */
	public static final org.jooq.Parameter<java.math.BigDecimal> P_ID = createParameter("P_ID", org.jooq.impl.SQLDataType.NUMERIC.defaulted(true), true);

	/**
	 * The parameter <code>SP.LIBRARY.GET_AUTHORS.P_LOAD_BOOKS</code>.
	 */
	public static final org.jooq.Parameter<java.math.BigDecimal> P_LOAD_BOOKS = createParameter("P_LOAD_BOOKS", org.jooq.impl.SQLDataType.NUMERIC.defaulted(true), true);

	/**
	 * Create a new routine call instance
	 */
	public GetAuthors() {
		super("GET_AUTHORS", org.jooq.example.db.oracle.Sp.SP, org.jooq.example.db.oracle.packages.Library.LIBRARY, org.jooq.example.db.oracle.udt.AuthorT.AUTHOR_T.getDataType().asArrayDataType(org.jooq.example.db.oracle.udt.records.AuthorsTRecord.class));

		setReturnParameter(RETURN_VALUE);
		addInParameter(P_ID);
		addInParameter(P_LOAD_BOOKS);
	}

	/**
	 * Set the <code>P_ID</code> parameter IN value to the routine
	 */
	public void setPId(java.lang.Number value) {
		setNumber(org.jooq.example.db.oracle.packages.library.GetAuthors.P_ID, value);
	}

	/**
	 * Set the <code>P_ID</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPId(org.jooq.Field<? extends java.lang.Number> field) {
		setNumber(P_ID, field);
	}

	/**
	 * Set the <code>P_LOAD_BOOKS</code> parameter IN value to the routine
	 */
	public void setPLoadBooks(java.lang.Number value) {
		setNumber(org.jooq.example.db.oracle.packages.library.GetAuthors.P_LOAD_BOOKS, value);
	}

	/**
	 * Set the <code>P_LOAD_BOOKS</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setPLoadBooks(org.jooq.Field<? extends java.lang.Number> field) {
		setNumber(P_LOAD_BOOKS, field);
	}
}
