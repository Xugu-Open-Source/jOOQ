/**
 * This class is generated by jOOQ
 */
package org.jooq.test.jdbcoracle.generatedclasses.test.tables.interfaces;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public interface IDr$iBookTitleContext$i extends java.io.Serializable {

	/**
	 * Setter for <code>TEST.DR$I_BOOK_TITLE_CONTEXT$I.TOKEN_TEXT</code>. 
	 */
	public void setTokenText(java.lang.String value);

	/**
	 * Getter for <code>TEST.DR$I_BOOK_TITLE_CONTEXT$I.TOKEN_TEXT</code>. 
	 */
	public java.lang.String getTokenText();

	/**
	 * Setter for <code>TEST.DR$I_BOOK_TITLE_CONTEXT$I.TOKEN_TYPE</code>. 
	 */
	public void setTokenType(java.lang.Long value);

	/**
	 * Getter for <code>TEST.DR$I_BOOK_TITLE_CONTEXT$I.TOKEN_TYPE</code>. 
	 */
	public java.lang.Long getTokenType();

	/**
	 * Setter for <code>TEST.DR$I_BOOK_TITLE_CONTEXT$I.TOKEN_FIRST</code>. 
	 */
	public void setTokenFirst(java.lang.Long value);

	/**
	 * Getter for <code>TEST.DR$I_BOOK_TITLE_CONTEXT$I.TOKEN_FIRST</code>. 
	 */
	public java.lang.Long getTokenFirst();

	/**
	 * Setter for <code>TEST.DR$I_BOOK_TITLE_CONTEXT$I.TOKEN_LAST</code>. 
	 */
	public void setTokenLast(java.lang.Long value);

	/**
	 * Getter for <code>TEST.DR$I_BOOK_TITLE_CONTEXT$I.TOKEN_LAST</code>. 
	 */
	public java.lang.Long getTokenLast();

	/**
	 * Setter for <code>TEST.DR$I_BOOK_TITLE_CONTEXT$I.TOKEN_COUNT</code>. 
	 */
	public void setTokenCount(java.lang.Long value);

	/**
	 * Getter for <code>TEST.DR$I_BOOK_TITLE_CONTEXT$I.TOKEN_COUNT</code>. 
	 */
	public java.lang.Long getTokenCount();

	/**
	 * Setter for <code>TEST.DR$I_BOOK_TITLE_CONTEXT$I.TOKEN_INFO</code>. 
	 */
	public void setTokenInfo(byte[] value);

	/**
	 * Getter for <code>TEST.DR$I_BOOK_TITLE_CONTEXT$I.TOKEN_INFO</code>. 
	 */
	public byte[] getTokenInfo();

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * Load data from another generated Record/POJO implementing the common interface IDr$iBookTitleContext$i
	 */
	public void from(org.jooq.test.jdbcoracle.generatedclasses.test.tables.interfaces.IDr$iBookTitleContext$i from);

	/**
	 * Copy data into another generated Record/POJO implementing the common interface IDr$iBookTitleContext$i
	 */
	public <E extends org.jooq.test.jdbcoracle.generatedclasses.test.tables.interfaces.IDr$iBookTitleContext$i> E into(E into);
}
