/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
@javax.persistence.Entity
@javax.persistence.Table(name = "X_TEST_CASE_2025", schema = "TEST")
public class X_TEST_CASE_2025 extends org.jooq.impl.TableRecordImpl<org.jooq.test.oracle3.generatedclasses.tables.records.X_TEST_CASE_2025> implements java.lang.Cloneable, org.jooq.Record2<java.lang.Integer, java.lang.String> {

	private static final long serialVersionUID = 909090150;

	/**
	 * Setter for <code>TEST.X_TEST_CASE_2025.REF_ID</code>.
	 */
	public void setREF_ID(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>TEST.X_TEST_CASE_2025.REF_ID</code>.
	 */
	@javax.persistence.Column(name = "REF_ID", nullable = false, precision = 7)
	public java.lang.Integer getREF_ID() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>TEST.X_TEST_CASE_2025.REF_NAME</code>.
	 */
	public void setREF_NAME(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>TEST.X_TEST_CASE_2025.REF_NAME</code>.
	 */
	@javax.persistence.Column(name = "REF_NAME", nullable = false, length = 10)
	public java.lang.String getREF_NAME() {
		return (java.lang.String) getValue(1);
	}

	// -------------------------------------------------------------------------
	// Record2 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row2<java.lang.Integer, java.lang.String> fieldsRow() {
		return (org.jooq.Row2) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row2<java.lang.Integer, java.lang.String> valuesRow() {
		return (org.jooq.Row2) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return org.jooq.test.oracle3.generatedclasses.tables.X_TEST_CASE_2025.X_TEST_CASE_2025.REF_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return org.jooq.test.oracle3.generatedclasses.tables.X_TEST_CASE_2025.X_TEST_CASE_2025.REF_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getREF_ID();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getREF_NAME();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public X_TEST_CASE_2025 value1(java.lang.Integer value) {
		setREF_ID(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public X_TEST_CASE_2025 value2(java.lang.String value) {
		setREF_NAME(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public X_TEST_CASE_2025 values(java.lang.Integer value1, java.lang.String value2) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached X_TEST_CASE_2025
	 */
	public X_TEST_CASE_2025() {
		super(org.jooq.test.oracle3.generatedclasses.tables.X_TEST_CASE_2025.X_TEST_CASE_2025);
	}

	/**
	 * Create a detached, initialised X_TEST_CASE_2025
	 */
	public X_TEST_CASE_2025(java.lang.Integer REF_ID, java.lang.String REF_NAME) {
		super(org.jooq.test.oracle3.generatedclasses.tables.X_TEST_CASE_2025.X_TEST_CASE_2025);

		setValue(0, REF_ID);
		setValue(1, REF_NAME);
	}
}
