/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.tables.interfaces;

/**
 * This class is generated by jOOQ.
 *
 * An unused table in the same schema.
 */
@java.lang.SuppressWarnings({ "all", "unchecked" })
@javax.persistence.Entity
@javax.persistence.Table(name = "X_UNUSED", uniqueConstraints = {
	@javax.persistence.UniqueConstraint(columnNames = {"ID", "NAME"})
})
public interface X_UNUSED_INTERFACE extends java.lang.Cloneable, java.io.Serializable {

	/**
	 * Setter for <code>X_UNUSED.ID</code>. 
	 */
	public void setID(java.lang.Integer value);

	/**
	 * Getter for <code>X_UNUSED.ID</code>. 
	 */
	@javax.persistence.Column(name = "ID", unique = true, nullable = false, precision = 7)
	public java.lang.Integer getID();

	/**
	 * Setter for <code>X_UNUSED.NAME</code>. 
	 */
	public void setNAME(java.lang.String value);

	/**
	 * Getter for <code>X_UNUSED.NAME</code>. 
	 */
	@javax.persistence.Column(name = "NAME", nullable = false, length = 10)
	public java.lang.String getNAME();

	/**
	 * Setter for <code>X_UNUSED.BIG_INTEGER</code>. 
	 */
	public void setBIG_INTEGER(java.math.BigInteger value);

	/**
	 * Getter for <code>X_UNUSED.BIG_INTEGER</code>. 
	 */
	@javax.persistence.Column(name = "BIG_INTEGER", precision = 38)
	public java.math.BigInteger getBIG_INTEGER();

	/**
	 * Setter for <code>X_UNUSED.ID_REF</code>. 
	 */
	public void setID_REF(java.lang.Integer value);

	/**
	 * Getter for <code>X_UNUSED.ID_REF</code>. 
	 */
	@javax.persistence.Column(name = "ID_REF", precision = 7)
	public java.lang.Integer getID_REF();

	/**
	 * Setter for <code>X_UNUSED.CLASS</code>. 
	 */
	public void setCLASS(java.lang.Integer value);

	/**
	 * Getter for <code>X_UNUSED.CLASS</code>. 
	 */
	@javax.persistence.Column(name = "CLASS", precision = 7)
	public java.lang.Integer getCLASS();

	/**
	 * Setter for <code>X_UNUSED.FIELDS</code>. 
	 */
	public void setFIELDS(java.lang.Integer value);

	/**
	 * Getter for <code>X_UNUSED.FIELDS</code>. 
	 */
	@javax.persistence.Column(name = "FIELDS", precision = 7)
	public java.lang.Integer getFIELDS();

	/**
	 * Setter for <code>X_UNUSED.CONFIGURATION</code>. 
	 */
	public void setCONFIGURATION(java.lang.Integer value);

	/**
	 * Getter for <code>X_UNUSED.CONFIGURATION</code>. 
	 */
	@javax.persistence.Column(name = "CONFIGURATION", precision = 7)
	public java.lang.Integer getCONFIGURATION();

	/**
	 * Setter for <code>X_UNUSED.U_D_T</code>. 
	 */
	public void setU_D_T(java.lang.Integer value);

	/**
	 * Getter for <code>X_UNUSED.U_D_T</code>. 
	 */
	@javax.persistence.Column(name = "U_D_T", precision = 7)
	public java.lang.Integer getU_D_T();

	/**
	 * Setter for <code>X_UNUSED.META_DATA</code>. 
	 */
	public void setMETA_DATA(java.lang.Integer value);

	/**
	 * Getter for <code>X_UNUSED.META_DATA</code>. 
	 */
	@javax.persistence.Column(name = "META_DATA", precision = 7)
	public java.lang.Integer getMETA_DATA();

	/**
	 * Setter for <code>X_UNUSED.TYPE0</code>. 
	 */
	public void setTYPE0(java.lang.Integer value);

	/**
	 * Getter for <code>X_UNUSED.TYPE0</code>. 
	 */
	@javax.persistence.Column(name = "TYPE0", precision = 7)
	public java.lang.Integer getTYPE0();

	/**
	 * Setter for <code>X_UNUSED.PRIMARY_KEY</code>. 
	 */
	public void setPRIMARY_KEY(java.lang.Integer value);

	/**
	 * Getter for <code>X_UNUSED.PRIMARY_KEY</code>. 
	 */
	@javax.persistence.Column(name = "PRIMARY_KEY", precision = 7)
	public java.lang.Integer getPRIMARY_KEY();

	/**
	 * Setter for <code>X_UNUSED.PRIMARYKEY</code>. 
	 */
	public void setPRIMARYKEY(java.lang.Integer value);

	/**
	 * Getter for <code>X_UNUSED.PRIMARYKEY</code>. 
	 */
	@javax.persistence.Column(name = "PRIMARYKEY", precision = 7)
	public java.lang.Integer getPRIMARYKEY();

	/**
	 * Setter for <code>X_UNUSED.NAME_REF</code>. 
	 */
	public void setNAME_REF(java.lang.String value);

	/**
	 * Getter for <code>X_UNUSED.NAME_REF</code>. 
	 */
	@javax.persistence.Column(name = "NAME_REF", length = 10)
	public java.lang.String getNAME_REF();

	/**
	 * Setter for <code>X_UNUSED.FIELD 737</code>. 
	 */
	public void setFIELD_737(java.math.BigDecimal value);

	/**
	 * Getter for <code>X_UNUSED.FIELD 737</code>. 
	 */
	@javax.persistence.Column(name = "FIELD 737", precision = 25, scale = 2)
	public java.math.BigDecimal getFIELD_737();

	/**
	 * Setter for <code>X_UNUSED.MS_UNUSED_ID_REF</code>. 
	 */
	public void setMS_UNUSED_ID_REF(java.lang.Integer value);

	/**
	 * Getter for <code>X_UNUSED.MS_UNUSED_ID_REF</code>. 
	 */
	@javax.persistence.Column(name = "MS_UNUSED_ID_REF", precision = 7)
	public java.lang.Integer getMS_UNUSED_ID_REF();

	/**
	 * Setter for <code>X_UNUSED.MS_UNUSED_NAME_REF</code>. 
	 */
	public void setMS_UNUSED_NAME_REF(java.lang.String value);

	/**
	 * Getter for <code>X_UNUSED.MS_UNUSED_NAME_REF</code>. 
	 */
	@javax.persistence.Column(name = "MS_UNUSED_NAME_REF", length = 10)
	public java.lang.String getMS_UNUSED_NAME_REF();

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * Load data from another generated Record/POJO implementing the common interface X_UNUSED_INTERFACE
	 */
	public void from(org.jooq.test.oracle3.generatedclasses.tables.interfaces.X_UNUSED_INTERFACE from);

	/**
	 * Copy data into another generated Record/POJO implementing the common interface X_UNUSED_INTERFACE
	 */
	public <E extends org.jooq.test.oracle3.generatedclasses.tables.interfaces.X_UNUSED_INTERFACE> E into(E into);
}
