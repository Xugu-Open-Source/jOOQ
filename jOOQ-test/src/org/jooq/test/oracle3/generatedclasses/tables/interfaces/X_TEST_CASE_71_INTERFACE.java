/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.tables.interfaces;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked" })
@javax.persistence.Entity
@javax.persistence.Table(name = "X_TEST_CASE_71")
public interface X_TEST_CASE_71_INTERFACE extends java.lang.Cloneable, java.io.Serializable {

	/**
	 * Setter for <code>X_TEST_CASE_71.ID</code>. 
	 */
	public void setID(java.lang.Integer value);

	/**
	 * Getter for <code>X_TEST_CASE_71.ID</code>. 
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "ID", unique = true, nullable = false, precision = 7)
	public java.lang.Integer getID();

	/**
	 * Setter for <code>X_TEST_CASE_71.TEST_CASE_64_69_ID</code>. 
	 */
	public void setTEST_CASE_64_69_ID(java.lang.Short value);

	/**
	 * Getter for <code>X_TEST_CASE_71.TEST_CASE_64_69_ID</code>. 
	 */
	@javax.persistence.Column(name = "TEST_CASE_64_69_ID", precision = 4)
	public java.lang.Short getTEST_CASE_64_69_ID();

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * Load data from another generated Record/POJO implementing the common interface X_TEST_CASE_71_INTERFACE
	 */
	public void from(org.jooq.test.oracle3.generatedclasses.tables.interfaces.X_TEST_CASE_71_INTERFACE from);

	/**
	 * Copy data into another generated Record/POJO implementing the common interface X_TEST_CASE_71_INTERFACE
	 */
	public <E extends org.jooq.test.oracle3.generatedclasses.tables.interfaces.X_TEST_CASE_71_INTERFACE> E into(E into);
}
