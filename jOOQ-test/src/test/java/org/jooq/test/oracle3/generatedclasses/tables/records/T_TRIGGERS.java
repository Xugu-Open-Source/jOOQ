/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
@javax.persistence.Entity
@javax.persistence.Table(name = "T_TRIGGERS", schema = "TEST")
public class T_TRIGGERS extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.oracle3.generatedclasses.tables.records.T_TRIGGERS> implements java.lang.Cloneable, org.jooq.Record3<java.lang.Integer, java.lang.Integer, java.lang.Integer> {

	private static final long serialVersionUID = -617655286;

	/**
	 * Setter for <code>TEST.T_TRIGGERS.ID_GENERATED</code>.
	 */
	public void setID_GENERATED(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>TEST.T_TRIGGERS.ID_GENERATED</code>.
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "ID_GENERATED", unique = true, nullable = false, precision = 7)
	public java.lang.Integer getID_GENERATED() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>TEST.T_TRIGGERS.ID</code>.
	 */
	public void setID(java.lang.Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>TEST.T_TRIGGERS.ID</code>.
	 */
	@javax.persistence.Column(name = "ID", nullable = false, precision = 7)
	public java.lang.Integer getID() {
		return (java.lang.Integer) getValue(1);
	}

	/**
	 * Setter for <code>TEST.T_TRIGGERS.COUNTER</code>.
	 */
	public void setCOUNTER(java.lang.Integer value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>TEST.T_TRIGGERS.COUNTER</code>.
	 */
	@javax.persistence.Column(name = "COUNTER", nullable = false, precision = 7)
	public java.lang.Integer getCOUNTER() {
		return (java.lang.Integer) getValue(2);
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
	// Record3 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row3<java.lang.Integer, java.lang.Integer, java.lang.Integer> fieldsRow() {
		return (org.jooq.Row3) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row3<java.lang.Integer, java.lang.Integer, java.lang.Integer> valuesRow() {
		return (org.jooq.Row3) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return org.jooq.test.oracle3.generatedclasses.tables.T_TRIGGERS.T_TRIGGERS.ID_GENERATED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field2() {
		return org.jooq.test.oracle3.generatedclasses.tables.T_TRIGGERS.T_TRIGGERS.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field3() {
		return org.jooq.test.oracle3.generatedclasses.tables.T_TRIGGERS.T_TRIGGERS.COUNTER;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getID_GENERATED();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value2() {
		return getID();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value3() {
		return getCOUNTER();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public T_TRIGGERS value1(java.lang.Integer value) {
		setID_GENERATED(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public T_TRIGGERS value2(java.lang.Integer value) {
		setID(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public T_TRIGGERS value3(java.lang.Integer value) {
		setCOUNTER(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public T_TRIGGERS values(java.lang.Integer value1, java.lang.Integer value2, java.lang.Integer value3) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached T_TRIGGERS
	 */
	public T_TRIGGERS() {
		super(org.jooq.test.oracle3.generatedclasses.tables.T_TRIGGERS.T_TRIGGERS);
	}

	/**
	 * Create a detached, initialised T_TRIGGERS
	 */
	public T_TRIGGERS(java.lang.Integer ID_GENERATED, java.lang.Integer ID, java.lang.Integer COUNTER) {
		super(org.jooq.test.oracle3.generatedclasses.tables.T_TRIGGERS.T_TRIGGERS);

		setValue(0, ID_GENERATED);
		setValue(1, ID);
		setValue(2, COUNTER);
	}
}
