/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
@javax.persistence.Entity
@javax.persistence.Table(name = "T_639_NUMBERS_TABLE")
public class T_639_NUMBERS_TABLE extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.oracle3.generatedclasses.tables.records.T_639_NUMBERS_TABLE> implements java.lang.Cloneable, org.jooq.Record11<java.lang.Integer, java.lang.Byte, java.lang.Short, java.lang.Integer, java.lang.Long, java.lang.Byte, java.lang.Short, java.lang.Integer, java.lang.Long, java.math.BigInteger, java.math.BigDecimal>, org.jooq.test.oracle3.generatedclasses.tables.interfaces.T_639_NUMBERS_TABLE_INTERFACE {

	private static final long serialVersionUID = -863427297;

	/**
	 * Setter for <code>T_639_NUMBERS_TABLE.ID</code>. 
	 */
	@Override
	public void setID(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>T_639_NUMBERS_TABLE.ID</code>. 
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "ID", unique = true, nullable = false, precision = 7)
	@Override
	public java.lang.Integer getID() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>T_639_NUMBERS_TABLE.BYTE</code>. 
	 */
	@Override
	public void setBYTE(java.lang.Byte value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>T_639_NUMBERS_TABLE.BYTE</code>. 
	 */
	@javax.persistence.Column(name = "BYTE", precision = 2)
	@Override
	public java.lang.Byte getBYTE() {
		return (java.lang.Byte) getValue(1);
	}

	/**
	 * Setter for <code>T_639_NUMBERS_TABLE.SHORT</code>. 
	 */
	@Override
	public void setSHORT(java.lang.Short value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>T_639_NUMBERS_TABLE.SHORT</code>. 
	 */
	@javax.persistence.Column(name = "SHORT", precision = 4)
	@Override
	public java.lang.Short getSHORT() {
		return (java.lang.Short) getValue(2);
	}

	/**
	 * Setter for <code>T_639_NUMBERS_TABLE.INTEGER</code>. 
	 */
	@Override
	public void setINTEGER(java.lang.Integer value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>T_639_NUMBERS_TABLE.INTEGER</code>. 
	 */
	@javax.persistence.Column(name = "INTEGER", precision = 7)
	@Override
	public java.lang.Integer getINTEGER() {
		return (java.lang.Integer) getValue(3);
	}

	/**
	 * Setter for <code>T_639_NUMBERS_TABLE.LONG</code>. 
	 */
	@Override
	public void setLONG(java.lang.Long value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>T_639_NUMBERS_TABLE.LONG</code>. 
	 */
	@javax.persistence.Column(name = "LONG", precision = 18)
	@Override
	public java.lang.Long getLONG() {
		return (java.lang.Long) getValue(4);
	}

	/**
	 * Setter for <code>T_639_NUMBERS_TABLE.BYTE_DECIMAL</code>. 
	 */
	@Override
	public void setBYTE_DECIMAL(java.lang.Byte value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>T_639_NUMBERS_TABLE.BYTE_DECIMAL</code>. 
	 */
	@javax.persistence.Column(name = "BYTE_DECIMAL", precision = 2)
	@Override
	public java.lang.Byte getBYTE_DECIMAL() {
		return (java.lang.Byte) getValue(5);
	}

	/**
	 * Setter for <code>T_639_NUMBERS_TABLE.SHORT_DECIMAL</code>. 
	 */
	@Override
	public void setSHORT_DECIMAL(java.lang.Short value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>T_639_NUMBERS_TABLE.SHORT_DECIMAL</code>. 
	 */
	@javax.persistence.Column(name = "SHORT_DECIMAL", precision = 4)
	@Override
	public java.lang.Short getSHORT_DECIMAL() {
		return (java.lang.Short) getValue(6);
	}

	/**
	 * Setter for <code>T_639_NUMBERS_TABLE.INTEGER_DECIMAL</code>. 
	 */
	@Override
	public void setINTEGER_DECIMAL(java.lang.Integer value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>T_639_NUMBERS_TABLE.INTEGER_DECIMAL</code>. 
	 */
	@javax.persistence.Column(name = "INTEGER_DECIMAL", precision = 9)
	@Override
	public java.lang.Integer getINTEGER_DECIMAL() {
		return (java.lang.Integer) getValue(7);
	}

	/**
	 * Setter for <code>T_639_NUMBERS_TABLE.LONG_DECIMAL</code>. 
	 */
	@Override
	public void setLONG_DECIMAL(java.lang.Long value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>T_639_NUMBERS_TABLE.LONG_DECIMAL</code>. 
	 */
	@javax.persistence.Column(name = "LONG_DECIMAL", precision = 18)
	@Override
	public java.lang.Long getLONG_DECIMAL() {
		return (java.lang.Long) getValue(8);
	}

	/**
	 * Setter for <code>T_639_NUMBERS_TABLE.BIG_INTEGER</code>. 
	 */
	@Override
	public void setBIG_INTEGER(java.math.BigInteger value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>T_639_NUMBERS_TABLE.BIG_INTEGER</code>. 
	 */
	@javax.persistence.Column(name = "BIG_INTEGER", precision = 22)
	@Override
	public java.math.BigInteger getBIG_INTEGER() {
		return (java.math.BigInteger) getValue(9);
	}

	/**
	 * Setter for <code>T_639_NUMBERS_TABLE.BIG_DECIMAL</code>. 
	 */
	@Override
	public void setBIG_DECIMAL(java.math.BigDecimal value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>T_639_NUMBERS_TABLE.BIG_DECIMAL</code>. 
	 */
	@javax.persistence.Column(name = "BIG_DECIMAL", precision = 22, scale = 5)
	@Override
	public java.math.BigDecimal getBIG_DECIMAL() {
		return (java.math.BigDecimal) getValue(10);
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
	// Record11 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row11<java.lang.Integer, java.lang.Byte, java.lang.Short, java.lang.Integer, java.lang.Long, java.lang.Byte, java.lang.Short, java.lang.Integer, java.lang.Long, java.math.BigInteger, java.math.BigDecimal> fieldsRow() {
		return (org.jooq.Row11) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row11<java.lang.Integer, java.lang.Byte, java.lang.Short, java.lang.Integer, java.lang.Long, java.lang.Byte, java.lang.Short, java.lang.Integer, java.lang.Long, java.math.BigInteger, java.math.BigDecimal> valuesRow() {
		return (org.jooq.Row11) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return org.jooq.test.oracle3.generatedclasses.tables.T_639_NUMBERS_TABLE.T_639_NUMBERS_TABLE.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Byte> field2() {
		return org.jooq.test.oracle3.generatedclasses.tables.T_639_NUMBERS_TABLE.T_639_NUMBERS_TABLE.BYTE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Short> field3() {
		return org.jooq.test.oracle3.generatedclasses.tables.T_639_NUMBERS_TABLE.T_639_NUMBERS_TABLE.SHORT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field4() {
		return org.jooq.test.oracle3.generatedclasses.tables.T_639_NUMBERS_TABLE.T_639_NUMBERS_TABLE.INTEGER;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field5() {
		return org.jooq.test.oracle3.generatedclasses.tables.T_639_NUMBERS_TABLE.T_639_NUMBERS_TABLE.LONG;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Byte> field6() {
		return org.jooq.test.oracle3.generatedclasses.tables.T_639_NUMBERS_TABLE.T_639_NUMBERS_TABLE.BYTE_DECIMAL;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Short> field7() {
		return org.jooq.test.oracle3.generatedclasses.tables.T_639_NUMBERS_TABLE.T_639_NUMBERS_TABLE.SHORT_DECIMAL;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field8() {
		return org.jooq.test.oracle3.generatedclasses.tables.T_639_NUMBERS_TABLE.T_639_NUMBERS_TABLE.INTEGER_DECIMAL;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field9() {
		return org.jooq.test.oracle3.generatedclasses.tables.T_639_NUMBERS_TABLE.T_639_NUMBERS_TABLE.LONG_DECIMAL;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.math.BigInteger> field10() {
		return org.jooq.test.oracle3.generatedclasses.tables.T_639_NUMBERS_TABLE.T_639_NUMBERS_TABLE.BIG_INTEGER;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.math.BigDecimal> field11() {
		return org.jooq.test.oracle3.generatedclasses.tables.T_639_NUMBERS_TABLE.T_639_NUMBERS_TABLE.BIG_DECIMAL;
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
	public java.lang.Byte value2() {
		return getBYTE();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Short value3() {
		return getSHORT();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value4() {
		return getINTEGER();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value5() {
		return getLONG();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Byte value6() {
		return getBYTE_DECIMAL();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Short value7() {
		return getSHORT_DECIMAL();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value8() {
		return getINTEGER_DECIMAL();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value9() {
		return getLONG_DECIMAL();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.math.BigInteger value10() {
		return getBIG_INTEGER();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.math.BigDecimal value11() {
		return getBIG_DECIMAL();
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(org.jooq.test.oracle3.generatedclasses.tables.interfaces.T_639_NUMBERS_TABLE_INTERFACE from) {
		setID(from.getID());
		setBYTE(from.getBYTE());
		setSHORT(from.getSHORT());
		setINTEGER(from.getINTEGER());
		setLONG(from.getLONG());
		setBYTE_DECIMAL(from.getBYTE_DECIMAL());
		setSHORT_DECIMAL(from.getSHORT_DECIMAL());
		setINTEGER_DECIMAL(from.getINTEGER_DECIMAL());
		setLONG_DECIMAL(from.getLONG_DECIMAL());
		setBIG_INTEGER(from.getBIG_INTEGER());
		setBIG_DECIMAL(from.getBIG_DECIMAL());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends org.jooq.test.oracle3.generatedclasses.tables.interfaces.T_639_NUMBERS_TABLE_INTERFACE> E into(E into) {
		into.from(this);
		return into;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached T_639_NUMBERS_TABLE
	 */
	public T_639_NUMBERS_TABLE() {
		super(org.jooq.test.oracle3.generatedclasses.tables.T_639_NUMBERS_TABLE.T_639_NUMBERS_TABLE);
	}
}
