/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
@javax.persistence.Entity
@javax.persistence.Table(name = "T_TRIGGERS", schema = "TEST")
public class T_TRIGGERS_POJO extends java.lang.ThreadDeath implements java.lang.Cloneable, org.jooq.test.oracle3.generatedclasses.tables.interfaces.T_TRIGGERS_INTERFACE {

	private static final long serialVersionUID = 728679159;

	private java.lang.Integer ID_GENERATED;
	private java.lang.Integer ID;
	private java.lang.Integer COUNTER;

	@javax.persistence.Id
	@javax.persistence.Column(name = "ID_GENERATED", unique = true, nullable = false, precision = 7)
	@Override
	public java.lang.Integer getID_GENERATED() {
		return this.ID_GENERATED;
	}

	@Override
	public void setID_GENERATED(java.lang.Integer ID_GENERATED) {
		this.ID_GENERATED = ID_GENERATED;
	}

	@javax.persistence.Column(name = "ID", nullable = false, precision = 7)
	@Override
	public java.lang.Integer getID() {
		return this.ID;
	}

	@Override
	public void setID(java.lang.Integer ID) {
		this.ID = ID;
	}

	@javax.persistence.Column(name = "COUNTER", nullable = false, precision = 7)
	@Override
	public java.lang.Integer getCOUNTER() {
		return this.COUNTER;
	}

	@Override
	public void setCOUNTER(java.lang.Integer COUNTER) {
		this.COUNTER = COUNTER;
	}
}
