/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.tables.interfaces;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
@javax.persistence.Entity
@javax.persistence.Table(name = "V_LIBRARY", schema = "TEST")
public interface V_LIBRARY_INTERFACE extends java.io.Serializable, java.lang.Cloneable {

	/**
	 * Setter for <code>TEST.V_LIBRARY.AUTHOR</code>. 
	 */
	public void setAUTHOR(java.lang.String value);

	/**
	 * Getter for <code>TEST.V_LIBRARY.AUTHOR</code>. 
	 */
	@javax.persistence.Column(name = "AUTHOR", length = 101)
	public java.lang.String getAUTHOR();

	/**
	 * Setter for <code>TEST.V_LIBRARY.TITLE</code>. 
	 */
	public void setTITLE(java.lang.String value);

	/**
	 * Getter for <code>TEST.V_LIBRARY.TITLE</code>. 
	 */
	@javax.persistence.Column(name = "TITLE", nullable = false, length = 400)
	public java.lang.String getTITLE();

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * Load data from another generated Record/POJO implementing the common interface V_LIBRARY_INTERFACE
	 */
	public void from(org.jooq.test.oracle3.generatedclasses.tables.interfaces.V_LIBRARY_INTERFACE from);

	/**
	 * Copy data into another generated Record/POJO implementing the common interface V_LIBRARY_INTERFACE
	 */
	public <E extends org.jooq.test.oracle3.generatedclasses.tables.interfaces.V_LIBRARY_INTERFACE> E into(E into);
}
