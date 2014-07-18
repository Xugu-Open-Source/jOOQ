/**
 * This class is generated by jOOQ
 */
package org.jooq.example.db.oracle.udt;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.5.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AuthorT extends org.jooq.impl.UDTImpl<org.jooq.example.db.oracle.udt.records.AuthorTRecord> {

	private static final long serialVersionUID = -1334397729;

	/**
	 * The singleton instance of <code>SP.AUTHOR_T</code>
	 */
	public static final org.jooq.example.db.oracle.udt.AuthorT AUTHOR_T = new org.jooq.example.db.oracle.udt.AuthorT();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.example.db.oracle.udt.records.AuthorTRecord> getRecordType() {
		return org.jooq.example.db.oracle.udt.records.AuthorTRecord.class;
	}

	/**
	 * The attribute <code>SP.AUTHOR_T.ID</code>.
	 */
	public static final org.jooq.UDTField<org.jooq.example.db.oracle.udt.records.AuthorTRecord, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER, AUTHOR_T);

	/**
	 * The attribute <code>SP.AUTHOR_T.FIRST_NAME</code>.
	 */
	public static final org.jooq.UDTField<org.jooq.example.db.oracle.udt.records.AuthorTRecord, java.lang.String> FIRST_NAME = createField("FIRST_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(100), AUTHOR_T);

	/**
	 * The attribute <code>SP.AUTHOR_T.LAST_NAME</code>.
	 */
	public static final org.jooq.UDTField<org.jooq.example.db.oracle.udt.records.AuthorTRecord, java.lang.String> LAST_NAME = createField("LAST_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(100), AUTHOR_T);

	/**
	 * The attribute <code>SP.AUTHOR_T.BOOKS</code>.
	 */
	public static final org.jooq.UDTField<org.jooq.example.db.oracle.udt.records.AuthorTRecord, org.jooq.example.db.oracle.udt.records.BooksTRecord> BOOKS = createField("BOOKS", org.jooq.example.db.oracle.udt.BookT.BOOK_T.getDataType().asArrayDataType(org.jooq.example.db.oracle.udt.records.BooksTRecord.class), AUTHOR_T);

	/**
	 * No further instances allowed
	 */
	private AuthorT() {
		super("AUTHOR_T", org.jooq.example.db.oracle.Sp.SP);

		// Initialise data type
		getDataType();
	}
}
