/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.tables.interfaces;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
@javax.persistence.Entity
@javax.persistence.Table(name = "T_EXOTIC_TYPES")
public interface T_EXOTIC_TYPES_INTERFACE extends java.lang.Cloneable, java.io.Serializable {

	/**
	 * Setter for <code>T_EXOTIC_TYPES.ID</code>. 
	 */
	public void setID(java.lang.Integer value);

	/**
	 * Getter for <code>T_EXOTIC_TYPES.ID</code>. 
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "ID", unique = true, nullable = false, precision = 7)
	public java.lang.Integer getID();

	/**
	 * Setter for <code>T_EXOTIC_TYPES.UU</code>. 
	 */
	public void setUU(java.lang.String value);

	/**
	 * Getter for <code>T_EXOTIC_TYPES.UU</code>. 
	 */
	@javax.persistence.Column(name = "UU", length = 36)
	public java.lang.String getUU();

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * Load data from another generated Record/POJO implementing the common interface T_EXOTIC_TYPES_INTERFACE
	 */
	public void from(org.jooq.test.oracle3.generatedclasses.tables.interfaces.T_EXOTIC_TYPES_INTERFACE from);

	/**
	 * Copy data into another generated Record/POJO implementing the common interface T_EXOTIC_TYPES_INTERFACE
	 */
	public <E extends org.jooq.test.oracle3.generatedclasses.tables.interfaces.T_EXOTIC_TYPES_INTERFACE> E into(E into);
}
