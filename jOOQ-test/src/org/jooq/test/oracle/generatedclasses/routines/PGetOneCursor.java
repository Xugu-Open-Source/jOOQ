/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.routines;

/**
 * This class is generated by jOOQ.
 */
public class PGetOneCursor extends org.jooq.impl.AbstractRoutine<java.lang.Void> {

	private static final long serialVersionUID = -1811126432;


	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.math.BigDecimal> TOTAL = createParameter("TOTAL", org.jooq.impl.SQLDataType.NUMERIC);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<org.jooq.Result<org.jooq.Record>> BOOKS = createParameter("BOOKS", org.jooq.impl.SQLDataType.RESULT);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<org.jooq.test.oracle.generatedclasses.udt.records.UNumberArrayRecord> BOOK_IDS = createParameter("BOOK_IDS", org.jooq.impl.SQLDataType.INTEGER.asArrayDataType(org.jooq.test.oracle.generatedclasses.udt.records.UNumberArrayRecord.class));

	/**
	 * Create a new routine call instance
	 */
	public PGetOneCursor() {
		super(org.jooq.SQLDialect.ORACLE, "P_GET_ONE_CURSOR", org.jooq.test.oracle.generatedclasses.Test.TEST);

		addOutParameter(TOTAL);
		addOutParameter(BOOKS);
		addInParameter(BOOK_IDS);
	}

	/**
	 * Set the <code>BOOK_IDS</code> parameter to the routine
	 */
	public void setBookIds(org.jooq.test.oracle.generatedclasses.udt.records.UNumberArrayRecord value) {
		setValue(BOOK_IDS, value);
	}

	public java.math.BigDecimal getTotal() {
		return getValue(TOTAL);
	}

	public org.jooq.Result<org.jooq.Record> getBooks() {
		return getValue(BOOKS);
	}
}
