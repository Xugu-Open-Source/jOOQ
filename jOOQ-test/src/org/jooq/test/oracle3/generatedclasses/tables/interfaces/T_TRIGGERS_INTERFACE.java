/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.tables.interfaces;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
@javax.persistence.Entity
@javax.persistence.Table(name = "T_TRIGGERS")
public interface T_TRIGGERS_INTERFACE extends java.lang.Cloneable, java.io.Serializable {

	/**
	 * Setter for <code>T_TRIGGERS.ID_GENERATED</code>. 
	 */
	public void setID_GENERATED(java.lang.Integer value);

	/**
	 * Getter for <code>T_TRIGGERS.ID_GENERATED</code>. 
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "ID_GENERATED", unique = true, nullable = false, precision = 7)
	public java.lang.Integer getID_GENERATED();

	/**
	 * Setter for <code>T_TRIGGERS.ID</code>. 
	 */
	public void setID(java.lang.Integer value);

	/**
	 * Getter for <code>T_TRIGGERS.ID</code>. 
	 */
	@javax.persistence.Column(name = "ID", nullable = false, precision = 7)
	public java.lang.Integer getID();

	/**
	 * Setter for <code>T_TRIGGERS.COUNTER</code>. 
	 */
	public void setCOUNTER(java.lang.Integer value);

	/**
	 * Getter for <code>T_TRIGGERS.COUNTER</code>. 
	 */
	@javax.persistence.Column(name = "COUNTER", nullable = false, precision = 7)
	public java.lang.Integer getCOUNTER();

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * Load data from another generated Record/POJO implementing the common interface T_TRIGGERS_INTERFACE
	 */
	public void from(org.jooq.test.oracle3.generatedclasses.tables.interfaces.T_TRIGGERS_INTERFACE from);

	/**
	 * Copy data into another generated Record/POJO implementing the common interface T_TRIGGERS_INTERFACE
	 */
	public <E extends org.jooq.test.oracle3.generatedclasses.tables.interfaces.T_TRIGGERS_INTERFACE> E into(E into);
}
