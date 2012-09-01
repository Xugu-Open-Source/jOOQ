/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.tables.interfaces;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
@javax.persistence.Entity
@javax.persistence.Table(name = "X_TEST_CASE_85", schema = "TEST")
public interface X_TEST_CASE_85_INTERFACE extends java.lang.Cloneable, java.io.Serializable {

	/**
	 * The table column <code>TEST.X_TEST_CASE_85.ID</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public void setID(java.lang.Integer value);

	/**
	 * The table column <code>TEST.X_TEST_CASE_85.ID</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "ID", unique = true, nullable = false, precision = 7)
	public java.lang.Integer getID();

	/**
	 * The table column <code>TEST.X_TEST_CASE_85.X_UNUSED_ID</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT FK_X_TEST_CASE_85
	 * FOREIGN KEY (X_UNUSED_ID, X_UNUSED_NAME)
	 * REFERENCES TEST.X_UNUSED (ID, NAME)
	 * </pre></code>
	 */
	public void setX_UNUSED_ID(java.lang.Integer value);

	/**
	 * The table column <code>TEST.X_TEST_CASE_85.X_UNUSED_ID</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT FK_X_TEST_CASE_85
	 * FOREIGN KEY (X_UNUSED_ID, X_UNUSED_NAME)
	 * REFERENCES TEST.X_UNUSED (ID, NAME)
	 * </pre></code>
	 */
	@javax.persistence.Column(name = "X_UNUSED_ID", precision = 7)
	public java.lang.Integer getX_UNUSED_ID();

	/**
	 * The table column <code>TEST.X_TEST_CASE_85.X_UNUSED_NAME</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT FK_X_TEST_CASE_85
	 * FOREIGN KEY (X_UNUSED_ID, X_UNUSED_NAME)
	 * REFERENCES TEST.X_UNUSED (ID, NAME)
	 * </pre></code>
	 */
	public void setX_UNUSED_NAME(java.lang.String value);

	/**
	 * The table column <code>TEST.X_TEST_CASE_85.X_UNUSED_NAME</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT FK_X_TEST_CASE_85
	 * FOREIGN KEY (X_UNUSED_ID, X_UNUSED_NAME)
	 * REFERENCES TEST.X_UNUSED (ID, NAME)
	 * </pre></code>
	 */
	@javax.persistence.Column(name = "X_UNUSED_NAME", length = 10)
	public java.lang.String getX_UNUSED_NAME();
}
