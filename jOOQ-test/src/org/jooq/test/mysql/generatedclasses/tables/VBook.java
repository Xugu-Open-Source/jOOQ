/**
 * This class is generated by jOOQ
 */
package org.jooq.test.mysql.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 *
 * VIEW
 */
public class VBook extends org.jooq.impl.TableImpl<org.jooq.test.mysql.generatedclasses.tables.records.VBookRecord> {

	private static final long serialVersionUID = 1605917689;

	/**
	 * The singleton instance of test.v_book
	 */
	public static final org.jooq.test.mysql.generatedclasses.tables.VBook V_BOOK = new org.jooq.test.mysql.generatedclasses.tables.VBook();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.mysql.generatedclasses.tables.records.VBookRecord> getRecordType() {
		return org.jooq.test.mysql.generatedclasses.tables.records.VBookRecord.class;
	}

	/**
	 * The book ID
	 */
	public static final org.jooq.TableField<org.jooq.test.mysql.generatedclasses.tables.records.VBookRecord, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER, V_BOOK);

	/**
	 * The author ID in entity 'author'
	 */
	public static final org.jooq.TableField<org.jooq.test.mysql.generatedclasses.tables.records.VBookRecord, java.lang.Integer> AUTHOR_ID = createField("AUTHOR_ID", org.jooq.impl.SQLDataType.INTEGER, V_BOOK);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.mysql.generatedclasses.tables.records.VBookRecord, java.lang.Integer> CO_AUTHOR_ID = createField("co_author_id", org.jooq.impl.SQLDataType.INTEGER, V_BOOK);

	/**
	 * Some more details about the book
	 */
	public static final org.jooq.TableField<org.jooq.test.mysql.generatedclasses.tables.records.VBookRecord, java.lang.Integer> DETAILS_ID = createField("DETAILS_ID", org.jooq.impl.SQLDataType.INTEGER, V_BOOK);

	/**
	 * The book's title
	 */
	public static final org.jooq.TableField<org.jooq.test.mysql.generatedclasses.tables.records.VBookRecord, java.lang.String> TITLE = createField("TITLE", org.jooq.impl.SQLDataType.CLOB, V_BOOK);

	/**
	 * The year the book was published in
	 */
	public static final org.jooq.TableField<org.jooq.test.mysql.generatedclasses.tables.records.VBookRecord, java.lang.Integer> PUBLISHED_IN = createField("PUBLISHED_IN", org.jooq.impl.SQLDataType.INTEGER, V_BOOK);

	/**
	 * The language of the book
	 */
	public static final org.jooq.TableField<org.jooq.test.mysql.generatedclasses.tables.records.VBookRecord, java.lang.Integer> LANGUAGE_ID = createField("LANGUAGE_ID", org.jooq.impl.SQLDataType.INTEGER, V_BOOK);

	/**
	 * Some textual content of the book
	 */
	public static final org.jooq.TableField<org.jooq.test.mysql.generatedclasses.tables.records.VBookRecord, java.lang.String> CONTENT_TEXT = createField("CONTENT_TEXT", org.jooq.impl.SQLDataType.CLOB, V_BOOK);

	/**
	 * Some binary content of the book
	 */
	public static final org.jooq.TableField<org.jooq.test.mysql.generatedclasses.tables.records.VBookRecord, byte[]> CONTENT_PDF = createField("CONTENT_PDF", org.jooq.impl.SQLDataType.BLOB, V_BOOK);

	/**
	 * The book's stock status
	 */
	public static final org.jooq.TableField<org.jooq.test.mysql.generatedclasses.tables.records.VBookRecord, org.jooq.test.mysql.generatedclasses.enums.VBookStatus> STATUS = createField("STATUS", org.jooq.util.mysql.MySQLDataType.VARCHAR.asEnumDataType(org.jooq.test.mysql.generatedclasses.enums.VBookStatus.class), V_BOOK);

	/**
	 * No further instances allowed
	 */
	private VBook() {
		super("v_book", org.jooq.test.mysql.generatedclasses.Test.TEST);
	}
}
