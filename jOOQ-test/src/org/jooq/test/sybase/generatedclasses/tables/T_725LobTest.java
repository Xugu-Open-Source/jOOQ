/**
 * This class is generated by jOOQ
 */
package org.jooq.test.sybase.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked" })
public class T_725LobTest extends org.jooq.impl.UpdatableTableImpl<org.jooq.test.sybase.generatedclasses.tables.records.T_725LobTestRecord> {

	private static final long serialVersionUID = 2020679294;

	/**
	 * The singleton instance of <code>DBA.t_725_lob_test</code>
	 */
	public static final org.jooq.test.sybase.generatedclasses.tables.T_725LobTest T_725_LOB_TEST = new org.jooq.test.sybase.generatedclasses.tables.T_725LobTest();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.sybase.generatedclasses.tables.records.T_725LobTestRecord> getRecordType() {
		return org.jooq.test.sybase.generatedclasses.tables.records.T_725LobTestRecord.class;
	}

	/**
	 * The column <code>DBA.t_725_lob_test.ID</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.sybase.generatedclasses.tables.records.T_725LobTestRecord, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>DBA.t_725_lob_test.LOB</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.sybase.generatedclasses.tables.records.T_725LobTestRecord, byte[]> LOB = createField("LOB", org.jooq.impl.SQLDataType.LONGVARBINARY, this);

	/**
	 * Create a <code>DBA.t_725_lob_test</code> table reference
	 */
	public T_725LobTest() {
		super("t_725_lob_test", org.jooq.test.sybase.generatedclasses.Dba.DBA);
	}

	/**
	 * Create an aliased <code>DBA.t_725_lob_test</code> table reference
	 */
	public T_725LobTest(java.lang.String alias) {
		super(alias, org.jooq.test.sybase.generatedclasses.Dba.DBA, org.jooq.test.sybase.generatedclasses.tables.T_725LobTest.T_725_LOB_TEST);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.jooq.test.sybase.generatedclasses.tables.records.T_725LobTestRecord> getPrimaryKey() {
		return org.jooq.test.sybase.generatedclasses.UniqueKeys.T_725LobTest.T_725_LOB_TEST__PK_T_725_LOB_TEST;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.sybase.generatedclasses.tables.records.T_725LobTestRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.sybase.generatedclasses.tables.records.T_725LobTestRecord>>asList(org.jooq.test.sybase.generatedclasses.UniqueKeys.T_725LobTest.T_725_LOB_TEST__PK_T_725_LOB_TEST);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.test.sybase.generatedclasses.tables.T_725LobTest as(java.lang.String alias) {
		return new org.jooq.test.sybase.generatedclasses.tables.T_725LobTest(alias);
	}
}
