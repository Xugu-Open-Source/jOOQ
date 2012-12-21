/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
@javax.persistence.Entity
@javax.persistence.Table(name = "X_TEST_CASE_64_69", schema = "TEST")
public class X_TEST_CASE_64_69 extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.oracle3.generatedclasses.tables.records.X_TEST_CASE_64_69> implements java.lang.Cloneable, org.jooq.Record2<java.lang.Integer, java.lang.Integer>, org.jooq.test.oracle3.generatedclasses.tables.interfaces.X_TEST_CASE_64_69_INTERFACE {

	private static final long serialVersionUID = 1554434186;

	/**
	 * Setter for <code>TEST.X_TEST_CASE_64_69.ID</code>. 
	 */
	@Override
	public void setID(java.lang.Integer value) {
		setValue(org.jooq.test.oracle3.generatedclasses.tables.X_TEST_CASE_64_69.X_TEST_CASE_64_69.ID, value);
	}

	/**
	 * Getter for <code>TEST.X_TEST_CASE_64_69.ID</code>. 
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "ID", unique = true, nullable = false, precision = 7)
	@Override
	public java.lang.Integer getID() {
		return getValue(org.jooq.test.oracle3.generatedclasses.tables.X_TEST_CASE_64_69.X_TEST_CASE_64_69.ID);
	}

	/**
	 * Setter for <code>TEST.X_TEST_CASE_64_69.UNUSED_ID</code>. 
	 */
	@Override
	public void setUNUSED_ID(java.lang.Integer value) {
		setValue(org.jooq.test.oracle3.generatedclasses.tables.X_TEST_CASE_64_69.X_TEST_CASE_64_69.UNUSED_ID, value);
	}

	/**
	 * Link this record to a given {@link org.jooq.test.oracle3.generatedclasses.tables.records.X_UNUSED}
	 */
	public void setUNUSED_ID(org.jooq.test.oracle3.generatedclasses.tables.records.X_UNUSED value) {
		if (value == null) {
			setValue(org.jooq.test.oracle3.generatedclasses.tables.X_TEST_CASE_64_69.X_TEST_CASE_64_69.UNUSED_ID, null);
		}
		else {
			setValue(org.jooq.test.oracle3.generatedclasses.tables.X_TEST_CASE_64_69.X_TEST_CASE_64_69.UNUSED_ID, value.getValue(org.jooq.test.oracle3.generatedclasses.tables.X_UNUSED.X_UNUSED.ID));
		}
	}

	/**
	 * Getter for <code>TEST.X_TEST_CASE_64_69.UNUSED_ID</code>. 
	 */
	@javax.persistence.Column(name = "UNUSED_ID", precision = 7)
	@Override
	public java.lang.Integer getUNUSED_ID() {
		return getValue(org.jooq.test.oracle3.generatedclasses.tables.X_TEST_CASE_64_69.X_TEST_CASE_64_69.UNUSED_ID);
	}

	// -------------------------------------------------------------------------
	// Foreign key navigation methods
	// -------------------------------------------------------------------------

	/**
	 * Fetch a list of <code>TEST.X_TEST_CASE_71</code> referencing this <code>TEST.X_TEST_CASE_64_69</code>
	 */
	public org.jooq.Result<org.jooq.test.oracle3.generatedclasses.tables.records.X_TEST_CASE_71> fetchX_TEST_CASE_71List() {
		return create()
			.selectFrom(org.jooq.test.oracle3.generatedclasses.tables.X_TEST_CASE_71.X_TEST_CASE_71)
			.where(org.jooq.test.oracle3.generatedclasses.tables.X_TEST_CASE_71.X_TEST_CASE_71.TEST_CASE_64_69_ID.equal(getValue(org.jooq.test.oracle3.generatedclasses.tables.X_TEST_CASE_64_69.X_TEST_CASE_64_69.ID, Short.class)))
			.fetch();
	}

	/**
	 * Fetch a <code>TEST.X_UNUSED</code> referenced by this <code>TEST.X_TEST_CASE_64_69</code>
	 */
	public org.jooq.test.oracle3.generatedclasses.tables.records.X_UNUSED fetchX_UNUSED() {
		return create()
			.selectFrom(org.jooq.test.oracle3.generatedclasses.tables.X_UNUSED.X_UNUSED)
			.where(org.jooq.test.oracle3.generatedclasses.tables.X_UNUSED.X_UNUSED.ID.equal(getValue(org.jooq.test.oracle3.generatedclasses.tables.X_TEST_CASE_64_69.X_TEST_CASE_64_69.UNUSED_ID)))
			.fetchOne();
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
	public org.jooq.Row2<java.lang.Integer, java.lang.Integer> fieldsRow() {
		return org.jooq.impl.Factory.row(field1(), field2());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row2<java.lang.Integer, java.lang.Integer> valuesRow() {
		return org.jooq.impl.Factory.row(value1(), value2());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return org.jooq.test.oracle3.generatedclasses.tables.X_TEST_CASE_64_69.X_TEST_CASE_64_69.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field2() {
		return org.jooq.test.oracle3.generatedclasses.tables.X_TEST_CASE_64_69.X_TEST_CASE_64_69.UNUSED_ID;
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
	public java.lang.Integer value2() {
		return getUNUSED_ID();
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(org.jooq.test.oracle3.generatedclasses.tables.interfaces.X_TEST_CASE_64_69_INTERFACE from) {
		setID(from.getID());
		setUNUSED_ID(from.getUNUSED_ID());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends org.jooq.test.oracle3.generatedclasses.tables.interfaces.X_TEST_CASE_64_69_INTERFACE> E into(E into) {
		into.from(this);
		return into;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached X_TEST_CASE_64_69
	 */
	public X_TEST_CASE_64_69() {
		super(org.jooq.test.oracle3.generatedclasses.tables.X_TEST_CASE_64_69.X_TEST_CASE_64_69);
	}
}
