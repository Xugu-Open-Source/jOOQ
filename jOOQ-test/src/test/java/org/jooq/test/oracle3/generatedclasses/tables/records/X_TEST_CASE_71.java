/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
@javax.persistence.Entity
@javax.persistence.Table(name = "X_TEST_CASE_71", schema = "TEST")
public class X_TEST_CASE_71 extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.oracle3.generatedclasses.tables.records.X_TEST_CASE_71> implements java.lang.Cloneable, org.jooq.Record2<java.lang.Integer, java.lang.Short> {

	private static final long serialVersionUID = 1329064519;

	/**
	 * Setter for <code>TEST.X_TEST_CASE_71.ID</code>.
	 */
	public void setID(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>TEST.X_TEST_CASE_71.ID</code>.
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "ID", unique = true, nullable = false, precision = 7)
	public java.lang.Integer getID() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>TEST.X_TEST_CASE_71.TEST_CASE_64_69_ID</code>.
	 */
	public void setTEST_CASE_64_69_ID(java.lang.Short value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>TEST.X_TEST_CASE_71.TEST_CASE_64_69_ID</code>.
	 */
	@javax.persistence.Column(name = "TEST_CASE_64_69_ID", precision = 4)
	public java.lang.Short getTEST_CASE_64_69_ID() {
		return (java.lang.Short) getValue(1);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<java.lang.Integer> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record2 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row2<java.lang.Integer, java.lang.Short> fieldsRow() {
		return (org.jooq.Row2) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row2<java.lang.Integer, java.lang.Short> valuesRow() {
		return (org.jooq.Row2) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return org.jooq.test.oracle3.generatedclasses.tables.X_TEST_CASE_71.X_TEST_CASE_71.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Short> field2() {
		return org.jooq.test.oracle3.generatedclasses.tables.X_TEST_CASE_71.X_TEST_CASE_71.TEST_CASE_64_69_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getID();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Short value2() {
		return getTEST_CASE_64_69_ID();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public X_TEST_CASE_71 value1(java.lang.Integer value) {
		setID(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public X_TEST_CASE_71 value2(java.lang.Short value) {
		setTEST_CASE_64_69_ID(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public X_TEST_CASE_71 values(java.lang.Integer value1, java.lang.Short value2) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached X_TEST_CASE_71
	 */
	public X_TEST_CASE_71() {
		super(org.jooq.test.oracle3.generatedclasses.tables.X_TEST_CASE_71.X_TEST_CASE_71);
	}

	/**
	 * Create a detached, initialised X_TEST_CASE_71
	 */
	public X_TEST_CASE_71(java.lang.Integer ID, java.lang.Short TEST_CASE_64_69_ID) {
		super(org.jooq.test.oracle3.generatedclasses.tables.X_TEST_CASE_71.X_TEST_CASE_71);

		setValue(0, ID);
		setValue(1, TEST_CASE_64_69_ID);
	}
}
