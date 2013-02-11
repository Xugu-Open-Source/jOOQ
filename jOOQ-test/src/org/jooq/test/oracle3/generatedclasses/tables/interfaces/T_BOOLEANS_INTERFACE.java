/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.tables.interfaces;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
@javax.persistence.Entity
@javax.persistence.Table(name = "T_BOOLEANS")
public interface T_BOOLEANS_INTERFACE extends java.lang.Cloneable, java.io.Serializable {

	/**
	 * Setter for <code>T_BOOLEANS.ID</code>. 
	 */
	public void setID(java.lang.Integer value);

	/**
	 * Getter for <code>T_BOOLEANS.ID</code>. 
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "ID", unique = true, nullable = false, precision = 7)
	public java.lang.Integer getID();

	/**
	 * Setter for <code>T_BOOLEANS.ONE_ZERO</code>. 
	 */
	public void setONE_ZERO(java.lang.Integer value);

	/**
	 * Getter for <code>T_BOOLEANS.ONE_ZERO</code>. 
	 */
	@javax.persistence.Column(name = "ONE_ZERO", precision = 7)
	public java.lang.Integer getONE_ZERO();

	/**
	 * Setter for <code>T_BOOLEANS.TRUE_FALSE_LC</code>. 
	 */
	public void setTRUE_FALSE_LC(java.lang.String value);

	/**
	 * Getter for <code>T_BOOLEANS.TRUE_FALSE_LC</code>. 
	 */
	@javax.persistence.Column(name = "TRUE_FALSE_LC", length = 5)
	public java.lang.String getTRUE_FALSE_LC();

	/**
	 * Setter for <code>T_BOOLEANS.TRUE_FALSE_UC</code>. 
	 */
	public void setTRUE_FALSE_UC(java.lang.String value);

	/**
	 * Getter for <code>T_BOOLEANS.TRUE_FALSE_UC</code>. 
	 */
	@javax.persistence.Column(name = "TRUE_FALSE_UC", length = 5)
	public java.lang.String getTRUE_FALSE_UC();

	/**
	 * Setter for <code>T_BOOLEANS.YES_NO_LC</code>. 
	 */
	public void setYES_NO_LC(java.lang.String value);

	/**
	 * Getter for <code>T_BOOLEANS.YES_NO_LC</code>. 
	 */
	@javax.persistence.Column(name = "YES_NO_LC", length = 3)
	public java.lang.String getYES_NO_LC();

	/**
	 * Setter for <code>T_BOOLEANS.YES_NO_UC</code>. 
	 */
	public void setYES_NO_UC(java.lang.String value);

	/**
	 * Getter for <code>T_BOOLEANS.YES_NO_UC</code>. 
	 */
	@javax.persistence.Column(name = "YES_NO_UC", length = 3)
	public java.lang.String getYES_NO_UC();

	/**
	 * Setter for <code>T_BOOLEANS.Y_N_LC</code>. 
	 */
	public void setY_N_LC(java.lang.String value);

	/**
	 * Getter for <code>T_BOOLEANS.Y_N_LC</code>. 
	 */
	@javax.persistence.Column(name = "Y_N_LC", length = 1)
	public java.lang.String getY_N_LC();

	/**
	 * Setter for <code>T_BOOLEANS.Y_N_UC</code>. 
	 */
	public void setY_N_UC(java.lang.String value);

	/**
	 * Getter for <code>T_BOOLEANS.Y_N_UC</code>. 
	 */
	@javax.persistence.Column(name = "Y_N_UC", length = 1)
	public java.lang.String getY_N_UC();

	/**
	 * Setter for <code>T_BOOLEANS.VC_BOOLEAN</code>. 
	 */
	public void setVC_BOOLEAN(java.lang.String value);

	/**
	 * Getter for <code>T_BOOLEANS.VC_BOOLEAN</code>. 
	 */
	@javax.persistence.Column(name = "VC_BOOLEAN", length = 1)
	public java.lang.String getVC_BOOLEAN();

	/**
	 * Setter for <code>T_BOOLEANS.C_BOOLEAN</code>. 
	 */
	public void setC_BOOLEAN(java.lang.String value);

	/**
	 * Getter for <code>T_BOOLEANS.C_BOOLEAN</code>. 
	 */
	@javax.persistence.Column(name = "C_BOOLEAN", length = 1)
	public java.lang.String getC_BOOLEAN();

	/**
	 * Setter for <code>T_BOOLEANS.N_BOOLEAN</code>. 
	 */
	public void setN_BOOLEAN(java.lang.Integer value);

	/**
	 * Getter for <code>T_BOOLEANS.N_BOOLEAN</code>. 
	 */
	@javax.persistence.Column(name = "N_BOOLEAN", precision = 7)
	public java.lang.Integer getN_BOOLEAN();

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * Load data from another generated Record/POJO implementing the common interface T_BOOLEANS_INTERFACE
	 */
	public void from(org.jooq.test.oracle3.generatedclasses.tables.interfaces.T_BOOLEANS_INTERFACE from);

	/**
	 * Copy data into another generated Record/POJO implementing the common interface T_BOOLEANS_INTERFACE
	 */
	public <E extends org.jooq.test.oracle3.generatedclasses.tables.interfaces.T_BOOLEANS_INTERFACE> E into(E into);
}
