/**
 * This class is generated by jOOQ
 */
package org.jooq.test.firebird.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class TBookRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.firebird.generatedclasses.tables.records.TBookRecord> implements org.jooq.test.firebird.generatedclasses.tables.interfaces.ITBook {

	private static final long serialVersionUID = 1617268159;

	/**
	 * The table column <code>T_BOOK.ID</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	@Override
	public void setId(java.lang.Integer value) {
		setValue(org.jooq.test.firebird.generatedclasses.tables.TBook.T_BOOK.ID, value);
	}

	/**
	 * The table column <code>T_BOOK.ID</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	@Override
	public java.lang.Integer getId() {
		return getValue(org.jooq.test.firebird.generatedclasses.tables.TBook.T_BOOK.ID);
	}

	/**
	 * The table column <code>T_BOOK.ID</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public java.util.List<org.jooq.test.firebird.generatedclasses.tables.records.TBookToBookStoreRecord> fetchTBookToBookStoreList() {
		return create()
			.selectFrom(org.jooq.test.firebird.generatedclasses.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE)
			.where(org.jooq.test.firebird.generatedclasses.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE.BOOK_ID.equal(getValue(org.jooq.test.firebird.generatedclasses.tables.TBook.T_BOOK.ID)))
			.fetch();
	}

	/**
	 * The table column <code>T_BOOK.AUTHOR_ID</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT FK_T_BOOK_AUTHOR_ID
	 * FOREIGN KEY (AUTHOR_ID)
	 * REFERENCES T_AUTHOR (ID)
	 * </pre></code>
	 */
	@Override
	public void setAuthorId(java.lang.Integer value) {
		setValue(org.jooq.test.firebird.generatedclasses.tables.TBook.T_BOOK.AUTHOR_ID, value);
	}

	/**
	 * The table column <code>T_BOOK.AUTHOR_ID</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT FK_T_BOOK_AUTHOR_ID
	 * FOREIGN KEY (AUTHOR_ID)
	 * REFERENCES T_AUTHOR (ID)
	 * </pre></code>
	 */
	@Override
	public java.lang.Integer getAuthorId() {
		return getValue(org.jooq.test.firebird.generatedclasses.tables.TBook.T_BOOK.AUTHOR_ID);
	}

	/**
	 * Link this record to a given {@link org.jooq.test.firebird.generatedclasses.tables.records.TAuthorRecord 
	 * TAuthorRecord}
	 */
	public void setAuthorId(org.jooq.test.firebird.generatedclasses.tables.records.TAuthorRecord value) {
		if (value == null) {
			setValue(org.jooq.test.firebird.generatedclasses.tables.TBook.T_BOOK.AUTHOR_ID, null);
		}
		else {
			setValue(org.jooq.test.firebird.generatedclasses.tables.TBook.T_BOOK.AUTHOR_ID, value.getValue(org.jooq.test.firebird.generatedclasses.tables.TAuthor.T_AUTHOR.ID));
		}
	}

	/**
	 * The table column <code>T_BOOK.AUTHOR_ID</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT FK_T_BOOK_AUTHOR_ID
	 * FOREIGN KEY (AUTHOR_ID)
	 * REFERENCES T_AUTHOR (ID)
	 * </pre></code>
	 */
	public org.jooq.test.firebird.generatedclasses.tables.records.TAuthorRecord fetchTAuthorByAuthorId() {
		return create()
			.selectFrom(org.jooq.test.firebird.generatedclasses.tables.TAuthor.T_AUTHOR)
			.where(org.jooq.test.firebird.generatedclasses.tables.TAuthor.T_AUTHOR.ID.equal(getValue(org.jooq.test.firebird.generatedclasses.tables.TBook.T_BOOK.AUTHOR_ID)))
			.fetchOne();
	}

	/**
	 * The table column <code>T_BOOK.CO_AUTHOR_ID</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT FK_T_BOOK_CO_AUTHOR_ID
	 * FOREIGN KEY (CO_AUTHOR_ID)
	 * REFERENCES T_AUTHOR (ID)
	 * </pre></code>
	 */
	@Override
	public void setCoAuthorId(java.lang.Integer value) {
		setValue(org.jooq.test.firebird.generatedclasses.tables.TBook.T_BOOK.CO_AUTHOR_ID, value);
	}

	/**
	 * The table column <code>T_BOOK.CO_AUTHOR_ID</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT FK_T_BOOK_CO_AUTHOR_ID
	 * FOREIGN KEY (CO_AUTHOR_ID)
	 * REFERENCES T_AUTHOR (ID)
	 * </pre></code>
	 */
	@Override
	public java.lang.Integer getCoAuthorId() {
		return getValue(org.jooq.test.firebird.generatedclasses.tables.TBook.T_BOOK.CO_AUTHOR_ID);
	}

	/**
	 * Link this record to a given {@link org.jooq.test.firebird.generatedclasses.tables.records.TAuthorRecord 
	 * TAuthorRecord}
	 */
	public void setCoAuthorId(org.jooq.test.firebird.generatedclasses.tables.records.TAuthorRecord value) {
		if (value == null) {
			setValue(org.jooq.test.firebird.generatedclasses.tables.TBook.T_BOOK.CO_AUTHOR_ID, null);
		}
		else {
			setValue(org.jooq.test.firebird.generatedclasses.tables.TBook.T_BOOK.CO_AUTHOR_ID, value.getValue(org.jooq.test.firebird.generatedclasses.tables.TAuthor.T_AUTHOR.ID));
		}
	}

	/**
	 * The table column <code>T_BOOK.CO_AUTHOR_ID</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT FK_T_BOOK_CO_AUTHOR_ID
	 * FOREIGN KEY (CO_AUTHOR_ID)
	 * REFERENCES T_AUTHOR (ID)
	 * </pre></code>
	 */
	public org.jooq.test.firebird.generatedclasses.tables.records.TAuthorRecord fetchTAuthorByCoAuthorId() {
		return create()
			.selectFrom(org.jooq.test.firebird.generatedclasses.tables.TAuthor.T_AUTHOR)
			.where(org.jooq.test.firebird.generatedclasses.tables.TAuthor.T_AUTHOR.ID.equal(getValue(org.jooq.test.firebird.generatedclasses.tables.TBook.T_BOOK.CO_AUTHOR_ID)))
			.fetchOne();
	}

	/**
	 * The table column <code>T_BOOK.DETAILS_ID</code>
	 */
	@Override
	public void setDetailsId(java.lang.Integer value) {
		setValue(org.jooq.test.firebird.generatedclasses.tables.TBook.T_BOOK.DETAILS_ID, value);
	}

	/**
	 * The table column <code>T_BOOK.DETAILS_ID</code>
	 */
	@Override
	public java.lang.Integer getDetailsId() {
		return getValue(org.jooq.test.firebird.generatedclasses.tables.TBook.T_BOOK.DETAILS_ID);
	}

	/**
	 * The table column <code>T_BOOK.TITLE</code>
	 */
	@Override
	public void setTitle(java.lang.String value) {
		setValue(org.jooq.test.firebird.generatedclasses.tables.TBook.T_BOOK.TITLE, value);
	}

	/**
	 * The table column <code>T_BOOK.TITLE</code>
	 */
	@Override
	public java.lang.String getTitle() {
		return getValue(org.jooq.test.firebird.generatedclasses.tables.TBook.T_BOOK.TITLE);
	}

	/**
	 * The table column <code>T_BOOK.PUBLISHED_IN</code>
	 */
	@Override
	public void setPublishedIn(java.lang.Integer value) {
		setValue(org.jooq.test.firebird.generatedclasses.tables.TBook.T_BOOK.PUBLISHED_IN, value);
	}

	/**
	 * The table column <code>T_BOOK.PUBLISHED_IN</code>
	 */
	@Override
	public java.lang.Integer getPublishedIn() {
		return getValue(org.jooq.test.firebird.generatedclasses.tables.TBook.T_BOOK.PUBLISHED_IN);
	}

	/**
	 * The table column <code>T_BOOK.LANGUAGE_ID</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT FK_T_BOOK_LANGUAGE_ID
	 * FOREIGN KEY (LANGUAGE_ID)
	 * REFERENCES T_LANGUAGE (ID)
	 * </pre></code>
	 */
	@Override
	public void setLanguageId(org.jooq.test.firebird.generatedclasses.enums.TLanguage value) {
		setValue(org.jooq.test.firebird.generatedclasses.tables.TBook.T_BOOK.LANGUAGE_ID, value);
	}

	/**
	 * The table column <code>T_BOOK.LANGUAGE_ID</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT FK_T_BOOK_LANGUAGE_ID
	 * FOREIGN KEY (LANGUAGE_ID)
	 * REFERENCES T_LANGUAGE (ID)
	 * </pre></code>
	 */
	@Override
	public org.jooq.test.firebird.generatedclasses.enums.TLanguage getLanguageId() {
		return getValue(org.jooq.test.firebird.generatedclasses.tables.TBook.T_BOOK.LANGUAGE_ID);
	}

	/**
	 * The table column <code>T_BOOK.CONTENT_TEXT</code>
	 */
	@Override
	public void setContentText(java.lang.String value) {
		setValue(org.jooq.test.firebird.generatedclasses.tables.TBook.T_BOOK.CONTENT_TEXT, value);
	}

	/**
	 * The table column <code>T_BOOK.CONTENT_TEXT</code>
	 */
	@Override
	public java.lang.String getContentText() {
		return getValue(org.jooq.test.firebird.generatedclasses.tables.TBook.T_BOOK.CONTENT_TEXT);
	}

	/**
	 * The table column <code>T_BOOK.CONTENT_PDF</code>
	 */
	@Override
	public void setContentPdf(byte[] value) {
		setValue(org.jooq.test.firebird.generatedclasses.tables.TBook.T_BOOK.CONTENT_PDF, value);
	}

	/**
	 * The table column <code>T_BOOK.CONTENT_PDF</code>
	 */
	@Override
	public byte[] getContentPdf() {
		return getValue(org.jooq.test.firebird.generatedclasses.tables.TBook.T_BOOK.CONTENT_PDF);
	}

	/**
	 * The table column <code>T_BOOK.REC_VERSION</code>
	 */
	@Override
	public void setRecVersion(java.lang.Integer value) {
		setValue(org.jooq.test.firebird.generatedclasses.tables.TBook.T_BOOK.REC_VERSION, value);
	}

	/**
	 * The table column <code>T_BOOK.REC_VERSION</code>
	 */
	@Override
	public java.lang.Integer getRecVersion() {
		return getValue(org.jooq.test.firebird.generatedclasses.tables.TBook.T_BOOK.REC_VERSION);
	}

	/**
	 * Create a detached TBookRecord
	 */
	public TBookRecord() {
		super(org.jooq.test.firebird.generatedclasses.tables.TBook.T_BOOK);
	}
}
