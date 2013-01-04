/**
 * This class is generated by jOOQ
 */
package org.jooq.test.cubrid.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class TBook extends org.jooq.impl.UpdatableTableImpl<org.jooq.test.cubrid.generatedclasses.tables.records.TBookRecord> {

	private static final long serialVersionUID = 1830908415;

	/**
	 * The singleton instance of <code>t_book</code>
	 */
	public static final org.jooq.test.cubrid.generatedclasses.tables.TBook T_BOOK = new org.jooq.test.cubrid.generatedclasses.tables.TBook();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.cubrid.generatedclasses.tables.records.TBookRecord> getRecordType() {
		return org.jooq.test.cubrid.generatedclasses.tables.records.TBookRecord.class;
	}

	/**
	 * The column <code>t_book.id</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.cubrid.generatedclasses.tables.records.TBookRecord, java.lang.Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER, T_BOOK);

	/**
	 * The column <code>t_book.author_id</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.cubrid.generatedclasses.tables.records.TBookRecord, java.lang.Integer> AUTHOR_ID = createField("author_id", org.jooq.impl.SQLDataType.INTEGER, T_BOOK);

	/**
	 * The column <code>t_book.co_author_id</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.cubrid.generatedclasses.tables.records.TBookRecord, java.lang.Integer> CO_AUTHOR_ID = createField("co_author_id", org.jooq.impl.SQLDataType.INTEGER, T_BOOK);

	/**
	 * The column <code>t_book.details_id</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.cubrid.generatedclasses.tables.records.TBookRecord, java.lang.Integer> DETAILS_ID = createField("details_id", org.jooq.impl.SQLDataType.INTEGER, T_BOOK);

	/**
	 * The column <code>t_book.title</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.cubrid.generatedclasses.tables.records.TBookRecord, java.lang.String> TITLE = createField("title", org.jooq.impl.SQLDataType.VARCHAR, T_BOOK);

	/**
	 * The column <code>t_book.published_in</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.cubrid.generatedclasses.tables.records.TBookRecord, java.lang.Integer> PUBLISHED_IN = createField("published_in", org.jooq.impl.SQLDataType.INTEGER, T_BOOK);

	/**
	 * The column <code>t_book.language_id</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.cubrid.generatedclasses.tables.records.TBookRecord, java.lang.Integer> LANGUAGE_ID = createField("language_id", org.jooq.impl.SQLDataType.INTEGER, T_BOOK);

	/**
	 * The column <code>t_book.content_text</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.cubrid.generatedclasses.tables.records.TBookRecord, java.lang.String> CONTENT_TEXT = createField("content_text", org.jooq.impl.SQLDataType.CLOB, T_BOOK);

	/**
	 * The column <code>t_book.content_pdf</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.cubrid.generatedclasses.tables.records.TBookRecord, byte[]> CONTENT_PDF = createField("content_pdf", org.jooq.impl.SQLDataType.BLOB, T_BOOK);

	/**
	 * The column <code>t_book.status</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.cubrid.generatedclasses.tables.records.TBookRecord, org.jooq.test.cubrid.generatedclasses.enums.TBookStatus> STATUS = createField("status", org.jooq.util.cubrid.CUBRIDDataType.VARCHAR.asEnumDataType(org.jooq.test.cubrid.generatedclasses.enums.TBookStatus.class), T_BOOK);

	/**
	 * No further instances allowed
	 */
	private TBook() {
		super("t_book", org.jooq.test.cubrid.generatedclasses.DefaultSchema.DEFAULT_SCHEMA);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.jooq.test.cubrid.generatedclasses.tables.records.TBookRecord> getMainKey() {
		return org.jooq.test.cubrid.generatedclasses.Keys.T_BOOK__PK_T_BOOK;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.cubrid.generatedclasses.tables.records.TBookRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.cubrid.generatedclasses.tables.records.TBookRecord>>asList(org.jooq.test.cubrid.generatedclasses.Keys.T_BOOK__PK_T_BOOK);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<org.jooq.test.cubrid.generatedclasses.tables.records.TBookRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.test.cubrid.generatedclasses.tables.records.TBookRecord, ?>>asList(org.jooq.test.cubrid.generatedclasses.Keys.T_BOOK__FK_T_BOOK_AUTHOR_ID, org.jooq.test.cubrid.generatedclasses.Keys.T_BOOK__FK_T_BOOK_CO_AUTHOR_ID, org.jooq.test.cubrid.generatedclasses.Keys.T_BOOK__FK_T_BOOK_LANGUAGE_ID);
	}
}
