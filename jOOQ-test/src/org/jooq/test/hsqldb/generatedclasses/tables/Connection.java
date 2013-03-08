/**
 * This class is generated by jOOQ
 */
package org.jooq.test.hsqldb.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked" })
public class Connection extends org.jooq.impl.TableImpl<org.jooq.test.hsqldb.generatedclasses.tables.records.ConnectionRecord> {

	private static final long serialVersionUID = -1925367787;

	/**
	 * The singleton instance of <code>PUBLIC.CONNECTION</code>
	 */
	public static final org.jooq.test.hsqldb.generatedclasses.tables.Connection CONNECTION = new org.jooq.test.hsqldb.generatedclasses.tables.Connection();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.hsqldb.generatedclasses.tables.records.ConnectionRecord> getRecordType() {
		return org.jooq.test.hsqldb.generatedclasses.tables.records.ConnectionRecord.class;
	}

	/**
	 * The column <code>PUBLIC.CONNECTION.ID</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.hsqldb.generatedclasses.tables.records.ConnectionRecord, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * Create a <code>PUBLIC.CONNECTION</code> table reference
	 */
	public Connection() {
		super("CONNECTION", org.jooq.test.hsqldb.generatedclasses.Public.PUBLIC);
	}

	/**
	 * Create an aliased <code>PUBLIC.CONNECTION</code> table reference
	 */
	public Connection(java.lang.String alias) {
		super(alias, org.jooq.test.hsqldb.generatedclasses.Public.PUBLIC, org.jooq.test.hsqldb.generatedclasses.tables.Connection.CONNECTION);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.test.hsqldb.generatedclasses.tables.Connection as(java.lang.String alias) {
		return new org.jooq.test.hsqldb.generatedclasses.tables.Connection(alias);
	}
}
