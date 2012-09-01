/**
 * This class is generated by jOOQ
 */
package org.jooq.test.sybase.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class VBookRecord extends org.jooq.impl.TableRecordImpl<org.jooq.test.sybase.generatedclasses.tables.records.VBookRecord> {

	private static final long serialVersionUID = -2114686603;

	/**
	 * The table column <code>DBA.v_book.ID</code>
	 */
	public void setId(java.lang.Integer value) {
		setValue(org.jooq.test.sybase.generatedclasses.tables.VBook.V_BOOK.ID, value);
	}

	/**
	 * The table column <code>DBA.v_book.ID</code>
	 */
	public java.lang.Integer getId() {
		return getValue(org.jooq.test.sybase.generatedclasses.tables.VBook.V_BOOK.ID);
	}

	/**
	 * The table column <code>DBA.v_book.AUTHOR_ID</code>
	 */
	public void setAuthorId(java.lang.Integer value) {
		setValue(org.jooq.test.sybase.generatedclasses.tables.VBook.V_BOOK.AUTHOR_ID, value);
	}

	/**
	 * The table column <code>DBA.v_book.AUTHOR_ID</code>
	 */
	public java.lang.Integer getAuthorId() {
		return getValue(org.jooq.test.sybase.generatedclasses.tables.VBook.V_BOOK.AUTHOR_ID);
	}

	/**
	 * The table column <code>DBA.v_book.CO_AUTHOR_ID</code>
	 */
	public void setCoAuthorId(java.lang.Integer value) {
		setValue(org.jooq.test.sybase.generatedclasses.tables.VBook.V_BOOK.CO_AUTHOR_ID, value);
	}

	/**
	 * The table column <code>DBA.v_book.CO_AUTHOR_ID</code>
	 */
	public java.lang.Integer getCoAuthorId() {
		return getValue(org.jooq.test.sybase.generatedclasses.tables.VBook.V_BOOK.CO_AUTHOR_ID);
	}

	/**
	 * The table column <code>DBA.v_book.DETAILS_ID</code>
	 */
	public void setDetailsId(java.lang.Integer value) {
		setValue(org.jooq.test.sybase.generatedclasses.tables.VBook.V_BOOK.DETAILS_ID, value);
	}

	/**
	 * The table column <code>DBA.v_book.DETAILS_ID</code>
	 */
	public java.lang.Integer getDetailsId() {
		return getValue(org.jooq.test.sybase.generatedclasses.tables.VBook.V_BOOK.DETAILS_ID);
	}

	/**
	 * The table column <code>DBA.v_book.TITLE</code>
	 */
	public void setTitle(java.lang.String value) {
		setValue(org.jooq.test.sybase.generatedclasses.tables.VBook.V_BOOK.TITLE, value);
	}

	/**
	 * The table column <code>DBA.v_book.TITLE</code>
	 */
	public java.lang.String getTitle() {
		return getValue(org.jooq.test.sybase.generatedclasses.tables.VBook.V_BOOK.TITLE);
	}

	/**
	 * The table column <code>DBA.v_book.PUBLISHED_IN</code>
	 */
	public void setPublishedIn(java.lang.Integer value) {
		setValue(org.jooq.test.sybase.generatedclasses.tables.VBook.V_BOOK.PUBLISHED_IN, value);
	}

	/**
	 * The table column <code>DBA.v_book.PUBLISHED_IN</code>
	 */
	public java.lang.Integer getPublishedIn() {
		return getValue(org.jooq.test.sybase.generatedclasses.tables.VBook.V_BOOK.PUBLISHED_IN);
	}

	/**
	 * The table column <code>DBA.v_book.LANGUAGE_ID</code>
	 */
	public void setLanguageId(java.lang.Integer value) {
		setValue(org.jooq.test.sybase.generatedclasses.tables.VBook.V_BOOK.LANGUAGE_ID, value);
	}

	/**
	 * The table column <code>DBA.v_book.LANGUAGE_ID</code>
	 */
	public java.lang.Integer getLanguageId() {
		return getValue(org.jooq.test.sybase.generatedclasses.tables.VBook.V_BOOK.LANGUAGE_ID);
	}

	/**
	 * The table column <code>DBA.v_book.CONTENT_TEXT</code>
	 */
	public void setContentText(java.lang.String value) {
		setValue(org.jooq.test.sybase.generatedclasses.tables.VBook.V_BOOK.CONTENT_TEXT, value);
	}

	/**
	 * The table column <code>DBA.v_book.CONTENT_TEXT</code>
	 */
	public java.lang.String getContentText() {
		return getValue(org.jooq.test.sybase.generatedclasses.tables.VBook.V_BOOK.CONTENT_TEXT);
	}

	/**
	 * The table column <code>DBA.v_book.CONTENT_PDF</code>
	 */
	public void setContentPdf(byte[] value) {
		setValue(org.jooq.test.sybase.generatedclasses.tables.VBook.V_BOOK.CONTENT_PDF, value);
	}

	/**
	 * The table column <code>DBA.v_book.CONTENT_PDF</code>
	 */
	public byte[] getContentPdf() {
		return getValue(org.jooq.test.sybase.generatedclasses.tables.VBook.V_BOOK.CONTENT_PDF);
	}

	/**
	 * Create a detached VBookRecord
	 */
	public VBookRecord() {
		super(org.jooq.test.sybase.generatedclasses.tables.VBook.V_BOOK);
	}
}
