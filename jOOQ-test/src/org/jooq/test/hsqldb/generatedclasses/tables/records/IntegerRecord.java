/**
 * This class is generated by jOOQ
 */
package org.jooq.test.hsqldb.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class IntegerRecord extends org.jooq.impl.TableRecordImpl<org.jooq.test.hsqldb.generatedclasses.tables.records.IntegerRecord> implements org.jooq.test.hsqldb.generatedclasses.tables.interfaces.IInteger {

	private static final long serialVersionUID = -1520168801;

	/**
	 * The table column <code>PUBLIC.INTEGER.ID</code>
	 */
	@Override
	public void setId(java.lang.Integer value) {
		setValue(org.jooq.test.hsqldb.generatedclasses.tables.Integer.INTEGER.ID, value);
	}

	/**
	 * The table column <code>PUBLIC.INTEGER.ID</code>
	 */
	@Override
	public java.lang.Integer getId() {
		return getValue(org.jooq.test.hsqldb.generatedclasses.tables.Integer.INTEGER.ID);
	}

	/**
	 * Create a detached IntegerRecord
	 */
	public IntegerRecord() {
		super(org.jooq.test.hsqldb.generatedclasses.tables.Integer.INTEGER);
	}
}
