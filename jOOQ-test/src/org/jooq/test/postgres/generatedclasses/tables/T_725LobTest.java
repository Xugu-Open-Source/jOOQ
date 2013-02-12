/**
 * This class is generated by jOOQ
 */
package org.jooq.test.postgres.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class T_725LobTest extends org.jooq.impl.UpdatableTableImpl<org.jooq.test.postgres.generatedclasses.tables.records.T_725LobTestRecord> {

	private static final long serialVersionUID = 388645801;

	/**
	 * The singleton instance of <code>public.t_725_lob_test</code>
	 */
	public static final org.jooq.test.postgres.generatedclasses.tables.T_725LobTest T_725_LOB_TEST = new org.jooq.test.postgres.generatedclasses.tables.T_725LobTest();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.postgres.generatedclasses.tables.records.T_725LobTestRecord> getRecordType() {
		return org.jooq.test.postgres.generatedclasses.tables.records.T_725LobTestRecord.class;
	}

	/**
	 * The column <code>public.t_725_lob_test.id</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.postgres.generatedclasses.tables.records.T_725LobTestRecord, java.lang.Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>public.t_725_lob_test.lob</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.postgres.generatedclasses.tables.records.T_725LobTestRecord, byte[]> LOB = createField("lob", org.jooq.impl.SQLDataType.BLOB, this);

	/**
	 * Create a <code>public.t_725_lob_test</code> table reference
	 */
	public T_725LobTest() {
		super("t_725_lob_test", org.jooq.test.postgres.generatedclasses.Public.PUBLIC);
	}

	/**
	 * Create an aliased <code>public.t_725_lob_test</code> table reference
	 */
	public T_725LobTest(java.lang.String alias) {
		super(alias, org.jooq.test.postgres.generatedclasses.Public.PUBLIC, org.jooq.test.postgres.generatedclasses.tables.T_725LobTest.T_725_LOB_TEST);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.jooq.test.postgres.generatedclasses.tables.records.T_725LobTestRecord> getPrimaryKey() {
		return org.jooq.test.postgres.generatedclasses.Keys.PK_T_725_LOB_TEST;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.postgres.generatedclasses.tables.records.T_725LobTestRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.postgres.generatedclasses.tables.records.T_725LobTestRecord>>asList(org.jooq.test.postgres.generatedclasses.Keys.PK_T_725_LOB_TEST);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.test.postgres.generatedclasses.tables.T_725LobTest as(java.lang.String alias) {
		return new org.jooq.test.postgres.generatedclasses.tables.T_725LobTest(alias);
	}
}
