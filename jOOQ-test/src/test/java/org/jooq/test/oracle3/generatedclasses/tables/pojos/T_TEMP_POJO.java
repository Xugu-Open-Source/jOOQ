/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
@javax.persistence.Entity
@javax.persistence.Table(name = "T_TEMP", schema = "TEST")
public class T_TEMP_POJO extends java.lang.ThreadDeath implements java.lang.Cloneable, java.io.Serializable {

	private static final long serialVersionUID = 1929579072;

	private java.lang.Integer ID;

	public T_TEMP_POJO() {}

	public T_TEMP_POJO(
		java.lang.Integer ID
	) {
		this.ID = ID;
	}

	@javax.persistence.Id
	@javax.persistence.Column(name = "ID", unique = true, nullable = false, precision = 7)
	public java.lang.Integer getID() {
		return this.ID;
	}

	public void setID(java.lang.Integer ID) {
		this.ID = ID;
	}
}
