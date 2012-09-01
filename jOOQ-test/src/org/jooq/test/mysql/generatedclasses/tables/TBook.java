/**
 * This class is generated by jOOQ
 */
package org.jooq.test.mysql.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 *
 * An entity holding books
 */
@java.lang.SuppressWarnings("all")
public class TBook extends org.jooq.impl.UpdatableTableImpl<org.jooq.test.mysql.generatedclasses.tables.records.TBookRecord> {

	private static final long serialVersionUID = 2087743895;

	/**
	 * The singleton instance of test.t_book
	 */
	public static final org.jooq.test.mysql.generatedclasses.tables.TBook T_BOOK = new org.jooq.test.mysql.generatedclasses.tables.TBook();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.mysql.generatedclasses.tables.records.TBookRecord> getRecordType() {
		return org.jooq.test.mysql.generatedclasses.tables.records.TBookRecord.class;
	}

	/**
	 * The book ID
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public static final org.jooq.TableField<org.jooq.test.mysql.generatedclasses.tables.records.TBookRecord, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER, T_BOOK);

	/**
	 * The author ID in entity 'author'
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT fk_t_book_author_id
	 * FOREIGN KEY (AUTHOR_ID)
	 * REFERENCES test.t_author (ID)
	 * </pre></code>
	 */
	public static final org.jooq.TableField<org.jooq.test.mysql.generatedclasses.tables.records.TBookRecord, java.lang.Integer> AUTHOR_ID = createField("AUTHOR_ID", org.jooq.impl.SQLDataType.INTEGER, T_BOOK);

	/**
	 * The table column <code>test.t_book.co_author_id</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT fk_t_book_co_author_id
	 * FOREIGN KEY (co_author_id)
	 * REFERENCES test.t_author (ID)
	 * </pre></code>
	 */
	public static final org.jooq.TableField<org.jooq.test.mysql.generatedclasses.tables.records.TBookRecord, java.lang.Integer> CO_AUTHOR_ID = createField("co_author_id", org.jooq.impl.SQLDataType.INTEGER, T_BOOK);

	/**
	 * Some more details about the book
	 */
	public static final org.jooq.TableField<org.jooq.test.mysql.generatedclasses.tables.records.TBookRecord, java.lang.Integer> DETAILS_ID = createField("DETAILS_ID", org.jooq.impl.SQLDataType.INTEGER, T_BOOK);

	/**
	 * The book's title
	 */
	public static final org.jooq.TableField<org.jooq.test.mysql.generatedclasses.tables.records.TBookRecord, java.lang.String> TITLE = createField("TITLE", org.jooq.impl.SQLDataType.CLOB, T_BOOK);

	/**
	 * The year the book was published in
	 */
	public static final org.jooq.TableField<org.jooq.test.mysql.generatedclasses.tables.records.TBookRecord, java.lang.Integer> PUBLISHED_IN = createField("PUBLISHED_IN", org.jooq.impl.SQLDataType.INTEGER, T_BOOK);

	/**
	 * The language of the book
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT fk_t_book_language_id
	 * FOREIGN KEY (LANGUAGE_ID)
	 * REFERENCES test.t_language (ID)
	 * </pre></code>
	 */
	public static final org.jooq.TableField<org.jooq.test.mysql.generatedclasses.tables.records.TBookRecord, org.jooq.test.mysql.generatedclasses.enums.TLanguage> LANGUAGE_ID = createField("LANGUAGE_ID", org.jooq.impl.SQLDataType.INTEGER.asMasterDataType(org.jooq.test.mysql.generatedclasses.enums.TLanguage.class), T_BOOK);

	/**
	 * Some textual content of the book
	 */
	public static final org.jooq.TableField<org.jooq.test.mysql.generatedclasses.tables.records.TBookRecord, java.lang.String> CONTENT_TEXT = createField("CONTENT_TEXT", org.jooq.impl.SQLDataType.CLOB, T_BOOK);

	/**
	 * Some binary content of the book
	 */
	public static final org.jooq.TableField<org.jooq.test.mysql.generatedclasses.tables.records.TBookRecord, byte[]> CONTENT_PDF = createField("CONTENT_PDF", org.jooq.impl.SQLDataType.BLOB, T_BOOK);

	/**
	 * The book's stock status
	 */
	public static final org.jooq.TableField<org.jooq.test.mysql.generatedclasses.tables.records.TBookRecord, org.jooq.test.mysql.generatedclasses.enums.TBookStatus> STATUS = createField("STATUS", org.jooq.util.mysql.MySQLDataType.VARCHAR.asEnumDataType(org.jooq.test.mysql.generatedclasses.enums.TBookStatus.class), T_BOOK);

	/**
	 * No further instances allowed
	 */
	private TBook() {
		super("t_book", org.jooq.test.mysql.generatedclasses.Test.TEST);
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.test.mysql.generatedclasses.tables.records.TBookRecord> getMainKey() {
		return org.jooq.test.mysql.generatedclasses.Keys.KEY_T_BOOK_PRIMARY;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.mysql.generatedclasses.tables.records.TBookRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.mysql.generatedclasses.tables.records.TBookRecord>>asList(org.jooq.test.mysql.generatedclasses.Keys.KEY_T_BOOK_PRIMARY);
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.ForeignKey<org.jooq.test.mysql.generatedclasses.tables.records.TBookRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.test.mysql.generatedclasses.tables.records.TBookRecord, ?>>asList(org.jooq.test.mysql.generatedclasses.Keys.FK_T_BOOK_AUTHOR_ID, org.jooq.test.mysql.generatedclasses.Keys.FK_T_BOOK_CO_AUTHOR_ID);
	}
}
