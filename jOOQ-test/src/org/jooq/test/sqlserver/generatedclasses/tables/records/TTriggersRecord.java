/**
 * This class is generated by jOOQ
 */
package org.jooq.test.sqlserver.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class TTriggersRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.sqlserver.generatedclasses.tables.records.TTriggersRecord> implements org.jooq.Record3<java.lang.Integer, java.lang.Integer, java.lang.Integer> {

	private static final long serialVersionUID = -1494122927;

	/**
	 * Setter for <code>dbo.t_triggers.id_generated</code>. 
	 */
	public void setIdGenerated(java.lang.Integer value) {
		setValue(org.jooq.test.sqlserver.generatedclasses.tables.TTriggers.T_TRIGGERS.ID_GENERATED, value);
	}

	/**
	 * Getter for <code>dbo.t_triggers.id_generated</code>. 
	 */
	public java.lang.Integer getIdGenerated() {
		return getValue(org.jooq.test.sqlserver.generatedclasses.tables.TTriggers.T_TRIGGERS.ID_GENERATED);
	}

	/**
	 * Setter for <code>dbo.t_triggers.id</code>. 
	 */
	public void setId(java.lang.Integer value) {
		setValue(org.jooq.test.sqlserver.generatedclasses.tables.TTriggers.T_TRIGGERS.ID, value);
	}

	/**
	 * Getter for <code>dbo.t_triggers.id</code>. 
	 */
	public java.lang.Integer getId() {
		return getValue(org.jooq.test.sqlserver.generatedclasses.tables.TTriggers.T_TRIGGERS.ID);
	}

	/**
	 * Setter for <code>dbo.t_triggers.counter</code>. 
	 */
	public void setCounter(java.lang.Integer value) {
		setValue(org.jooq.test.sqlserver.generatedclasses.tables.TTriggers.T_TRIGGERS.COUNTER, value);
	}

	/**
	 * Getter for <code>dbo.t_triggers.counter</code>. 
	 */
	public java.lang.Integer getCounter() {
		return getValue(org.jooq.test.sqlserver.generatedclasses.tables.TTriggers.T_TRIGGERS.COUNTER);
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
		return org.jooq.impl.Factory.row(field1(), field2(), field3());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row3<java.lang.Integer, java.lang.Integer, java.lang.Integer> valuesRow() {
		return org.jooq.impl.Factory.row(value1(), value2(), value3());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return org.jooq.test.sqlserver.generatedclasses.tables.TTriggers.T_TRIGGERS.ID_GENERATED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field2() {
		return org.jooq.test.sqlserver.generatedclasses.tables.TTriggers.T_TRIGGERS.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field3() {
		return org.jooq.test.sqlserver.generatedclasses.tables.TTriggers.T_TRIGGERS.COUNTER;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getIdGenerated();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value2() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value3() {
		return getCounter();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached TTriggersRecord
	 */
	public TTriggersRecord() {
		super(org.jooq.test.sqlserver.generatedclasses.tables.TTriggers.T_TRIGGERS);
	}
}
