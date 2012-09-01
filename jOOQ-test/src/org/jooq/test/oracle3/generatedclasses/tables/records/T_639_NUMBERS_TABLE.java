/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
@javax.persistence.Entity
@javax.persistence.Table(name = "T_639_NUMBERS_TABLE", schema = "TEST")
public class T_639_NUMBERS_TABLE extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.oracle3.generatedclasses.tables.records.T_639_NUMBERS_TABLE> implements java.lang.Cloneable, org.jooq.test.oracle3.generatedclasses.tables.interfaces.T_639_NUMBERS_TABLE_INTERFACE {

	private static final long serialVersionUID = -601335676;

	/**
	 * The table column <code>TEST.T_639_NUMBERS_TABLE.ID</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	@Override
	public void setID(java.lang.Integer value) {
		setValue(org.jooq.test.oracle3.generatedclasses.tables.T_639_NUMBERS_TABLE.T_639_NUMBERS_TABLE.ID, value);
	}

	/**
	 * The table column <code>TEST.T_639_NUMBERS_TABLE.ID</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "ID", unique = true, nullable = false, precision = 7)
	@Override
	public java.lang.Integer getID() {
		return getValue(org.jooq.test.oracle3.generatedclasses.tables.T_639_NUMBERS_TABLE.T_639_NUMBERS_TABLE.ID);
	}

	/**
	 * The table column <code>TEST.T_639_NUMBERS_TABLE.BYTE</code>
	 */
	@Override
	public void setBYTE(java.lang.Byte value) {
		setValue(org.jooq.test.oracle3.generatedclasses.tables.T_639_NUMBERS_TABLE.T_639_NUMBERS_TABLE.BYTE, value);
	}

	/**
	 * The table column <code>TEST.T_639_NUMBERS_TABLE.BYTE</code>
	 */
	@javax.persistence.Column(name = "BYTE", precision = 2)
	@Override
	public java.lang.Byte getBYTE() {
		return getValue(org.jooq.test.oracle3.generatedclasses.tables.T_639_NUMBERS_TABLE.T_639_NUMBERS_TABLE.BYTE);
	}

	/**
	 * The table column <code>TEST.T_639_NUMBERS_TABLE.SHORT</code>
	 */
	@Override
	public void setSHORT(java.lang.Short value) {
		setValue(org.jooq.test.oracle3.generatedclasses.tables.T_639_NUMBERS_TABLE.T_639_NUMBERS_TABLE.SHORT, value);
	}

	/**
	 * The table column <code>TEST.T_639_NUMBERS_TABLE.SHORT</code>
	 */
	@javax.persistence.Column(name = "SHORT", precision = 4)
	@Override
	public java.lang.Short getSHORT() {
		return getValue(org.jooq.test.oracle3.generatedclasses.tables.T_639_NUMBERS_TABLE.T_639_NUMBERS_TABLE.SHORT);
	}

	/**
	 * The table column <code>TEST.T_639_NUMBERS_TABLE.INTEGER</code>
	 */
	@Override
	public void setINTEGER(java.lang.Integer value) {
		setValue(org.jooq.test.oracle3.generatedclasses.tables.T_639_NUMBERS_TABLE.T_639_NUMBERS_TABLE.INTEGER, value);
	}

	/**
	 * The table column <code>TEST.T_639_NUMBERS_TABLE.INTEGER</code>
	 */
	@javax.persistence.Column(name = "INTEGER", precision = 7)
	@Override
	public java.lang.Integer getINTEGER() {
		return getValue(org.jooq.test.oracle3.generatedclasses.tables.T_639_NUMBERS_TABLE.T_639_NUMBERS_TABLE.INTEGER);
	}

	/**
	 * The table column <code>TEST.T_639_NUMBERS_TABLE.LONG</code>
	 */
	@Override
	public void setLONG(java.lang.Long value) {
		setValue(org.jooq.test.oracle3.generatedclasses.tables.T_639_NUMBERS_TABLE.T_639_NUMBERS_TABLE.LONG, value);
	}

	/**
	 * The table column <code>TEST.T_639_NUMBERS_TABLE.LONG</code>
	 */
	@javax.persistence.Column(name = "LONG", precision = 18)
	@Override
	public java.lang.Long getLONG() {
		return getValue(org.jooq.test.oracle3.generatedclasses.tables.T_639_NUMBERS_TABLE.T_639_NUMBERS_TABLE.LONG);
	}

	/**
	 * The table column <code>TEST.T_639_NUMBERS_TABLE.BYTE_DECIMAL</code>
	 */
	@Override
	public void setBYTE_DECIMAL(java.lang.Byte value) {
		setValue(org.jooq.test.oracle3.generatedclasses.tables.T_639_NUMBERS_TABLE.T_639_NUMBERS_TABLE.BYTE_DECIMAL, value);
	}

	/**
	 * The table column <code>TEST.T_639_NUMBERS_TABLE.BYTE_DECIMAL</code>
	 */
	@javax.persistence.Column(name = "BYTE_DECIMAL", precision = 2)
	@Override
	public java.lang.Byte getBYTE_DECIMAL() {
		return getValue(org.jooq.test.oracle3.generatedclasses.tables.T_639_NUMBERS_TABLE.T_639_NUMBERS_TABLE.BYTE_DECIMAL);
	}

	/**
	 * The table column <code>TEST.T_639_NUMBERS_TABLE.SHORT_DECIMAL</code>
	 */
	@Override
	public void setSHORT_DECIMAL(java.lang.Short value) {
		setValue(org.jooq.test.oracle3.generatedclasses.tables.T_639_NUMBERS_TABLE.T_639_NUMBERS_TABLE.SHORT_DECIMAL, value);
	}

	/**
	 * The table column <code>TEST.T_639_NUMBERS_TABLE.SHORT_DECIMAL</code>
	 */
	@javax.persistence.Column(name = "SHORT_DECIMAL", precision = 4)
	@Override
	public java.lang.Short getSHORT_DECIMAL() {
		return getValue(org.jooq.test.oracle3.generatedclasses.tables.T_639_NUMBERS_TABLE.T_639_NUMBERS_TABLE.SHORT_DECIMAL);
	}

	/**
	 * The table column <code>TEST.T_639_NUMBERS_TABLE.INTEGER_DECIMAL</code>
	 */
	@Override
	public void setINTEGER_DECIMAL(java.lang.Integer value) {
		setValue(org.jooq.test.oracle3.generatedclasses.tables.T_639_NUMBERS_TABLE.T_639_NUMBERS_TABLE.INTEGER_DECIMAL, value);
	}

	/**
	 * The table column <code>TEST.T_639_NUMBERS_TABLE.INTEGER_DECIMAL</code>
	 */
	@javax.persistence.Column(name = "INTEGER_DECIMAL", precision = 9)
	@Override
	public java.lang.Integer getINTEGER_DECIMAL() {
		return getValue(org.jooq.test.oracle3.generatedclasses.tables.T_639_NUMBERS_TABLE.T_639_NUMBERS_TABLE.INTEGER_DECIMAL);
	}

	/**
	 * The table column <code>TEST.T_639_NUMBERS_TABLE.LONG_DECIMAL</code>
	 */
	@Override
	public void setLONG_DECIMAL(java.lang.Long value) {
		setValue(org.jooq.test.oracle3.generatedclasses.tables.T_639_NUMBERS_TABLE.T_639_NUMBERS_TABLE.LONG_DECIMAL, value);
	}

	/**
	 * The table column <code>TEST.T_639_NUMBERS_TABLE.LONG_DECIMAL</code>
	 */
	@javax.persistence.Column(name = "LONG_DECIMAL", precision = 18)
	@Override
	public java.lang.Long getLONG_DECIMAL() {
		return getValue(org.jooq.test.oracle3.generatedclasses.tables.T_639_NUMBERS_TABLE.T_639_NUMBERS_TABLE.LONG_DECIMAL);
	}

	/**
	 * The table column <code>TEST.T_639_NUMBERS_TABLE.BIG_INTEGER</code>
	 */
	@Override
	public void setBIG_INTEGER(java.math.BigInteger value) {
		setValue(org.jooq.test.oracle3.generatedclasses.tables.T_639_NUMBERS_TABLE.T_639_NUMBERS_TABLE.BIG_INTEGER, value);
	}

	/**
	 * The table column <code>TEST.T_639_NUMBERS_TABLE.BIG_INTEGER</code>
	 */
	@javax.persistence.Column(name = "BIG_INTEGER", precision = 22)
	@Override
	public java.math.BigInteger getBIG_INTEGER() {
		return getValue(org.jooq.test.oracle3.generatedclasses.tables.T_639_NUMBERS_TABLE.T_639_NUMBERS_TABLE.BIG_INTEGER);
	}

	/**
	 * The table column <code>TEST.T_639_NUMBERS_TABLE.BIG_DECIMAL</code>
	 */
	@Override
	public void setBIG_DECIMAL(java.math.BigDecimal value) {
		setValue(org.jooq.test.oracle3.generatedclasses.tables.T_639_NUMBERS_TABLE.T_639_NUMBERS_TABLE.BIG_DECIMAL, value);
	}

	/**
	 * The table column <code>TEST.T_639_NUMBERS_TABLE.BIG_DECIMAL</code>
	 */
	@javax.persistence.Column(name = "BIG_DECIMAL", precision = 22, scale = 5)
	@Override
	public java.math.BigDecimal getBIG_DECIMAL() {
		return getValue(org.jooq.test.oracle3.generatedclasses.tables.T_639_NUMBERS_TABLE.T_639_NUMBERS_TABLE.BIG_DECIMAL);
	}

	/**
	 * Create a detached T_639_NUMBERS_TABLE
	 */
	public T_639_NUMBERS_TABLE() {
		super(org.jooq.test.oracle3.generatedclasses.tables.T_639_NUMBERS_TABLE.T_639_NUMBERS_TABLE);
	}
}
