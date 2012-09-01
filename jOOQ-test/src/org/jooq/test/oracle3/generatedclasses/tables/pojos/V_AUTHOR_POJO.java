/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
@javax.persistence.Entity
@javax.persistence.Table(name = "V_AUTHOR", schema = "TEST")
public class V_AUTHOR_POJO extends java.lang.ThreadDeath implements java.lang.Cloneable, org.jooq.test.oracle3.generatedclasses.tables.interfaces.V_AUTHOR_INTERFACE {

	private static final long serialVersionUID = 407022752;

	private java.lang.Integer                                                 ID;
	private java.lang.String                                                  FIRST_NAME;
	private java.lang.String                                                  LAST_NAME;
	private java.sql.Date                                                     DATE_OF_BIRTH;
	private java.lang.Integer                                                 YEAR_OF_BIRTH;
	private org.jooq.test.oracle3.generatedclasses.udt.records.U_ADDRESS_TYPE ADDRESS;

	@javax.persistence.Column(name = "ID", nullable = false, precision = 7)
	@Override
	public java.lang.Integer getID() {
		return this.ID;
	}

	@Override
	public void setID(java.lang.Integer ID) {
		this.ID = ID;
	}

	@javax.persistence.Column(name = "FIRST_NAME", length = 50)
	@Override
	public java.lang.String getFIRST_NAME() {
		return this.FIRST_NAME;
	}

	@Override
	public void setFIRST_NAME(java.lang.String FIRST_NAME) {
		this.FIRST_NAME = FIRST_NAME;
	}

	@javax.persistence.Column(name = "LAST_NAME", nullable = false, length = 50)
	@Override
	public java.lang.String getLAST_NAME() {
		return this.LAST_NAME;
	}

	@Override
	public void setLAST_NAME(java.lang.String LAST_NAME) {
		this.LAST_NAME = LAST_NAME;
	}

	@javax.persistence.Column(name = "DATE_OF_BIRTH", length = 7)
	@Override
	public java.sql.Date getDATE_OF_BIRTH() {
		return this.DATE_OF_BIRTH;
	}

	@Override
	public void setDATE_OF_BIRTH(java.sql.Date DATE_OF_BIRTH) {
		this.DATE_OF_BIRTH = DATE_OF_BIRTH;
	}

	@javax.persistence.Column(name = "YEAR_OF_BIRTH", precision = 7)
	@Override
	public java.lang.Integer getYEAR_OF_BIRTH() {
		return this.YEAR_OF_BIRTH;
	}

	@Override
	public void setYEAR_OF_BIRTH(java.lang.Integer YEAR_OF_BIRTH) {
		this.YEAR_OF_BIRTH = YEAR_OF_BIRTH;
	}

	@javax.persistence.Column(name = "ADDRESS", length = 40)
	@Override
	public org.jooq.test.oracle3.generatedclasses.udt.records.U_ADDRESS_TYPE getADDRESS() {
		return this.ADDRESS;
	}

	@Override
	public void setADDRESS(org.jooq.test.oracle3.generatedclasses.udt.records.U_ADDRESS_TYPE ADDRESS) {
		this.ADDRESS = ADDRESS;
	}
}
