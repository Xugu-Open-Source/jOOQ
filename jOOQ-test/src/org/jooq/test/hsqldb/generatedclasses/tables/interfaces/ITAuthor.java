/**
 * This class is generated by jOOQ
 */
package org.jooq.test.hsqldb.generatedclasses.tables.interfaces;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public interface ITAuthor extends java.io.Serializable {

	/**
	 * The table column <code>PUBLIC.T_AUTHOR.ID</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public void setId(java.lang.Integer value);

	/**
	 * The table column <code>PUBLIC.T_AUTHOR.ID</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public java.lang.Integer getId();

	/**
	 * The table column <code>PUBLIC.T_AUTHOR.FIRST_NAME</code>
	 */
	public void setFirstName(java.lang.String value);

	/**
	 * The table column <code>PUBLIC.T_AUTHOR.FIRST_NAME</code>
	 */
	public java.lang.String getFirstName();

	/**
	 * The table column <code>PUBLIC.T_AUTHOR.LAST_NAME</code>
	 */
	public void setLastName(java.lang.String value);

	/**
	 * The table column <code>PUBLIC.T_AUTHOR.LAST_NAME</code>
	 */
	public java.lang.String getLastName();

	/**
	 * The table column <code>PUBLIC.T_AUTHOR.DATE_OF_BIRTH</code>
	 */
	public void setDateOfBirth(java.sql.Date value);

	/**
	 * The table column <code>PUBLIC.T_AUTHOR.DATE_OF_BIRTH</code>
	 */
	public java.sql.Date getDateOfBirth();

	/**
	 * The table column <code>PUBLIC.T_AUTHOR.YEAR_OF_BIRTH</code>
	 */
	public void setYearOfBirth(java.lang.Integer value);

	/**
	 * The table column <code>PUBLIC.T_AUTHOR.YEAR_OF_BIRTH</code>
	 */
	public java.lang.Integer getYearOfBirth();

	/**
	 * The table column <code>PUBLIC.T_AUTHOR.ADDRESS</code>
	 */
	public void setAddress(java.lang.String value);

	/**
	 * The table column <code>PUBLIC.T_AUTHOR.ADDRESS</code>
	 */
	public java.lang.String getAddress();
}
