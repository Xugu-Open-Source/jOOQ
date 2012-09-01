/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.tables.interfaces;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
@javax.persistence.Entity
@javax.persistence.Table(name = "V_AUTHOR", schema = "TEST")
public interface V_AUTHOR_INTERFACE extends java.lang.Cloneable, java.io.Serializable {

	/**
	 * The table column <code>TEST.V_AUTHOR.ID</code>
	 */
	public void setID(java.lang.Integer value);

	/**
	 * The table column <code>TEST.V_AUTHOR.ID</code>
	 */
	@javax.persistence.Column(name = "ID", nullable = false, precision = 7)
	public java.lang.Integer getID();

	/**
	 * The table column <code>TEST.V_AUTHOR.FIRST_NAME</code>
	 */
	public void setFIRST_NAME(java.lang.String value);

	/**
	 * The table column <code>TEST.V_AUTHOR.FIRST_NAME</code>
	 */
	@javax.persistence.Column(name = "FIRST_NAME", length = 50)
	public java.lang.String getFIRST_NAME();

	/**
	 * The table column <code>TEST.V_AUTHOR.LAST_NAME</code>
	 */
	public void setLAST_NAME(java.lang.String value);

	/**
	 * The table column <code>TEST.V_AUTHOR.LAST_NAME</code>
	 */
	@javax.persistence.Column(name = "LAST_NAME", nullable = false, length = 50)
	public java.lang.String getLAST_NAME();

	/**
	 * The table column <code>TEST.V_AUTHOR.DATE_OF_BIRTH</code>
	 */
	public void setDATE_OF_BIRTH(java.sql.Date value);

	/**
	 * The table column <code>TEST.V_AUTHOR.DATE_OF_BIRTH</code>
	 */
	@javax.persistence.Column(name = "DATE_OF_BIRTH", length = 7)
	public java.sql.Date getDATE_OF_BIRTH();

	/**
	 * The table column <code>TEST.V_AUTHOR.YEAR_OF_BIRTH</code>
	 */
	public void setYEAR_OF_BIRTH(java.lang.Integer value);

	/**
	 * The table column <code>TEST.V_AUTHOR.YEAR_OF_BIRTH</code>
	 */
	@javax.persistence.Column(name = "YEAR_OF_BIRTH", precision = 7)
	public java.lang.Integer getYEAR_OF_BIRTH();

	/**
	 * The table column <code>TEST.V_AUTHOR.ADDRESS</code>
	 */
	public void setADDRESS(org.jooq.test.oracle3.generatedclasses.udt.records.U_ADDRESS_TYPE value);

	/**
	 * The table column <code>TEST.V_AUTHOR.ADDRESS</code>
	 */
	@javax.persistence.Column(name = "ADDRESS", length = 40)
	public org.jooq.test.oracle3.generatedclasses.udt.records.U_ADDRESS_TYPE getADDRESS();
}
