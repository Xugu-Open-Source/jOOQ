/**
 * This class is generated by jOOQ
 */
package org.jooq.test.sqlite.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class T_725LobTest extends org.jooq.impl.UpdatableTableImpl<org.jooq.test.sqlite.generatedclasses.tables.records.T_725LobTestRecord> {

	private static final long serialVersionUID = -559148120;

	/**
	 * The singleton instance of <code>t_725_lob_test</code>
	 */
	public static final org.jooq.test.sqlite.generatedclasses.tables.T_725LobTest T_725_LOB_TEST = new org.jooq.test.sqlite.generatedclasses.tables.T_725LobTest();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.sqlite.generatedclasses.tables.records.T_725LobTestRecord> getRecordType() {
		return org.jooq.test.sqlite.generatedclasses.tables.records.T_725LobTestRecord.class;
	}

	/**
	 * The column <code>t_725_lob_test.ID</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.sqlite.generatedclasses.tables.records.T_725LobTestRecord, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER, T_725_LOB_TEST);

	/**
	 * The column <code>t_725_lob_test.LOB</code>. 
	 */
	public static final org.jooq.TableField<org.jooq.test.sqlite.generatedclasses.tables.records.T_725LobTestRecord, byte[]> LOB = createField("LOB", org.jooq.impl.SQLDataType.LONGVARBINARY, T_725_LOB_TEST);

	/**
	 * No further instances allowed
	 */
	private T_725LobTest() {
		super("t_725_lob_test");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.jooq.test.sqlite.generatedclasses.tables.records.T_725LobTestRecord> getMainKey() {
		return org.jooq.test.sqlite.generatedclasses.Keys.PK_T_725_LOB_TEST_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.sqlite.generatedclasses.tables.records.T_725LobTestRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.sqlite.generatedclasses.tables.records.T_725LobTestRecord>>asList(org.jooq.test.sqlite.generatedclasses.Keys.PK_T_725_LOB_TEST_ID);
	}
}
