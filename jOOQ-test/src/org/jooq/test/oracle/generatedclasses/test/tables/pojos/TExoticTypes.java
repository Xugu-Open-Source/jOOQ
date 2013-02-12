/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.test.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
@javax.persistence.Entity
@javax.persistence.Table(name = "T_EXOTIC_TYPES", schema = "TEST")
public class TExoticTypes implements java.io.Serializable {

	private static final long serialVersionUID = -790312432;

	private java.lang.Integer id;
	private java.util.UUID    uu;

	@javax.persistence.Id
	@javax.persistence.Column(name = "ID", unique = true, nullable = false, precision = 7)
	@javax.validation.constraints.NotNull
	public java.lang.Integer getId() {
		return this.id;
	}

	public void setId(java.lang.Integer id) {
		this.id = id;
	}

	@javax.persistence.Column(name = "UU", length = 36)
	public java.util.UUID getUu() {
		return this.uu;
	}

	public void setUu(java.util.UUID uu) {
		this.uu = uu;
	}
}
