/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
@javax.persistence.Entity
@javax.persistence.Table(name = "X_TEST_CASE_71")
public class X_TEST_CASE_71_POJO extends java.lang.ThreadDeath implements java.lang.Cloneable, org.jooq.test.oracle3.generatedclasses.tables.interfaces.X_TEST_CASE_71_INTERFACE {

	private static final long serialVersionUID = -1880228003;

	private java.lang.Integer ID;
	private java.lang.Short   TEST_CASE_64_69_ID;

	@javax.persistence.Id
	@javax.persistence.Column(name = "ID", unique = true, nullable = false, precision = 7)
	@Override
	public java.lang.Integer getID() {
		return this.ID;
	}

	@Override
	public void setID(java.lang.Integer ID) {
		this.ID = ID;
	}

	@javax.persistence.Column(name = "TEST_CASE_64_69_ID", precision = 4)
	@Override
	public java.lang.Short getTEST_CASE_64_69_ID() {
		return this.TEST_CASE_64_69_ID;
	}

	@Override
	public void setTEST_CASE_64_69_ID(java.lang.Short TEST_CASE_64_69_ID) {
		this.TEST_CASE_64_69_ID = TEST_CASE_64_69_ID;
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(org.jooq.test.oracle3.generatedclasses.tables.interfaces.X_TEST_CASE_71_INTERFACE from) {
		setID(from.getID());
		setTEST_CASE_64_69_ID(from.getTEST_CASE_64_69_ID());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends org.jooq.test.oracle3.generatedclasses.tables.interfaces.X_TEST_CASE_71_INTERFACE> E into(E into) {
		into.from(this);
		return into;
	}
}
