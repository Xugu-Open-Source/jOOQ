/**
 * This class is generated by jOOQ
 */
package org.jooq.test.mysql2.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 *
 * VIEW
 */
public class VBook extends org.jooq.impl.TableImpl<org.jooq.test.mysql2.generatedclasses.tables.records.VBookRecord> {

	private static final long serialVersionUID = -327641948;

	/**
	 * The singleton instance of test2.v_book
	 */
	public static final org.jooq.test.mysql2.generatedclasses.tables.VBook V_BOOK = new org.jooq.test.mysql2.generatedclasses.tables.VBook();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.mysql2.generatedclasses.tables.records.VBookRecord> getRecordType() {
		return org.jooq.test.mysql2.generatedclasses.tables.records.VBookRecord.class;
	}

	/**
	 * The book ID
	 */
	public final org.jooq.TableField<org.jooq.test.mysql2.generatedclasses.tables.records.VBookRecord, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The author ID in entity 'author'
	 */
	public final org.jooq.TableField<org.jooq.test.mysql2.generatedclasses.tables.records.VBookRecord, java.lang.Integer> AUTHOR_ID = createField("AUTHOR_ID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.test.mysql2.generatedclasses.tables.records.VBookRecord, java.lang.Integer> CO_AUTHOR_ID = createField("co_author_id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * Some more details about the book
	 */
	public final org.jooq.TableField<org.jooq.test.mysql2.generatedclasses.tables.records.VBookRecord, java.lang.Integer> DETAILS_ID = createField("DETAILS_ID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The book's title
	 */
	public final org.jooq.TableField<org.jooq.test.mysql2.generatedclasses.tables.records.VBookRecord, java.lang.String> TITLE = createField("TITLE", org.jooq.impl.SQLDataType.CLOB, this);

	/**
	 * The year the book was published in
	 */
	public final org.jooq.TableField<org.jooq.test.mysql2.generatedclasses.tables.records.VBookRecord, java.lang.Integer> PUBLISHED_IN = createField("PUBLISHED_IN", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The language of the book
	 */
	public final org.jooq.TableField<org.jooq.test.mysql2.generatedclasses.tables.records.VBookRecord, java.lang.Integer> LANGUAGE_ID = createField("LANGUAGE_ID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * Some textual content of the book
	 */
	public final org.jooq.TableField<org.jooq.test.mysql2.generatedclasses.tables.records.VBookRecord, java.lang.String> CONTENT_TEXT = createField("CONTENT_TEXT", org.jooq.impl.SQLDataType.CLOB, this);

	/**
	 * Some binary content of the book
	 */
	public final org.jooq.TableField<org.jooq.test.mysql2.generatedclasses.tables.records.VBookRecord, byte[]> CONTENT_PDF = createField("CONTENT_PDF", org.jooq.impl.SQLDataType.BLOB, this);

	/**
	 * The book's stock status
	 */
	public final org.jooq.TableField<org.jooq.test.mysql2.generatedclasses.tables.records.VBookRecord, org.jooq.test.mysql2.generatedclasses.enums.VBookStatus> STATUS = createField("STATUS", org.jooq.util.mysql.MySQLDataType.VARCHAR.asEnumDataType(org.jooq.test.mysql2.generatedclasses.enums.VBookStatus.class), this);

	public VBook() {
		super("v_book", org.jooq.test.mysql2.generatedclasses.Test2.TEST2);
	}

	public VBook(java.lang.String alias) {
		super(alias, org.jooq.test.mysql2.generatedclasses.Test2.TEST2, org.jooq.test.mysql2.generatedclasses.tables.VBook.V_BOOK);
	}

	@Override
	public org.jooq.test.mysql2.generatedclasses.tables.VBook as(java.lang.String alias) {
		return new org.jooq.test.mysql2.generatedclasses.tables.VBook(alias);
	}
}
