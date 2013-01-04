/**
 * This class is generated by jOOQ
 */
package org.jooq.test.sqlserver.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class XTestCase_64_69 extends org.jooq.impl.UpdatableTableImpl<org.jooq.test.sqlserver.generatedclasses.tables.records.XTestCase_64_69Record> {

	private static final long serialVersionUID = -1345870072;

	/**
	 * The singleton instance of <code>dbo.x_test_case_64_69</code>
	 */
	public static final org.jooq.test.sqlserver.generatedclasses.tables.XTestCase_64_69 X_TEST_CASE_64_69 = new org.jooq.test.sqlserver.generatedclasses.tables.XTestCase_64_69();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.sqlserver.generatedclasses.tables.records.XTestCase_64_69Record> getRecordType() {
		return org.jooq.test.sqlserver.generatedclasses.tables.records.XTestCase_64_69Record.class;
	}

	/**
	 * The column <code>dbo.x_test_case_64_69.id</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.sqlserver.generatedclasses.tables.records.XTestCase_64_69Record, java.lang.Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>dbo.x_test_case_64_69.unused_id</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.sqlserver.generatedclasses.tables.records.XTestCase_64_69Record, java.lang.Integer> UNUSED_ID = createField("unused_id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * Create a <code>dbo.x_test_case_64_69</code> table reference
	 */
	public XTestCase_64_69() {
		super("x_test_case_64_69", org.jooq.test.sqlserver.generatedclasses.Dbo.DBO);
	}

	/**
	 * Create an aliased <code>dbo.x_test_case_64_69</code> table reference
	 */
	public XTestCase_64_69(java.lang.String alias) {
		super(alias, org.jooq.test.sqlserver.generatedclasses.Dbo.DBO, org.jooq.test.sqlserver.generatedclasses.tables.XTestCase_64_69.X_TEST_CASE_64_69);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.jooq.test.sqlserver.generatedclasses.tables.records.XTestCase_64_69Record> getMainKey() {
		return org.jooq.test.sqlserver.generatedclasses.Keys.PK_X_TEST_CASE_64_69;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.sqlserver.generatedclasses.tables.records.XTestCase_64_69Record>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.sqlserver.generatedclasses.tables.records.XTestCase_64_69Record>>asList(org.jooq.test.sqlserver.generatedclasses.Keys.PK_X_TEST_CASE_64_69);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<org.jooq.test.sqlserver.generatedclasses.tables.records.XTestCase_64_69Record, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.test.sqlserver.generatedclasses.tables.records.XTestCase_64_69Record, ?>>asList(org.jooq.test.sqlserver.generatedclasses.Keys.FK_X_TEST_CASE_64_69A, org.jooq.test.sqlserver.generatedclasses.Keys.FK_X_TEST_CASE_64_69B);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.test.sqlserver.generatedclasses.tables.XTestCase_64_69 as(java.lang.String alias) {
		return new org.jooq.test.sqlserver.generatedclasses.tables.XTestCase_64_69(alias);
	}
}
