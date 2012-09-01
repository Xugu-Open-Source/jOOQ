/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.test.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class XTestCase_85 extends org.jooq.impl.UpdatableTableImpl<org.jooq.test.oracle.generatedclasses.test.tables.records.XTestCase_85Record> {

	private static final long serialVersionUID = 738213758;

	/**
	 * The singleton instance of TEST.X_TEST_CASE_85
	 */
	public static final org.jooq.test.oracle.generatedclasses.test.tables.XTestCase_85 X_TEST_CASE_85 = new org.jooq.test.oracle.generatedclasses.test.tables.XTestCase_85();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.oracle.generatedclasses.test.tables.records.XTestCase_85Record> getRecordType() {
		return org.jooq.test.oracle.generatedclasses.test.tables.records.XTestCase_85Record.class;
	}

	/**
	 * The table column <code>TEST.X_TEST_CASE_85.ID</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public final org.jooq.TableField<org.jooq.test.oracle.generatedclasses.test.tables.records.XTestCase_85Record, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>TEST.X_TEST_CASE_85.X_UNUSED_ID</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT FK_X_TEST_CASE_85
	 * FOREIGN KEY (X_UNUSED_ID, X_UNUSED_NAME)
	 * REFERENCES TEST.X_UNUSED (ID, NAME)
	 * </pre></code>
	 */
	public final org.jooq.TableField<org.jooq.test.oracle.generatedclasses.test.tables.records.XTestCase_85Record, java.lang.Integer> X_UNUSED_ID = createField("X_UNUSED_ID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>TEST.X_TEST_CASE_85.X_UNUSED_NAME</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT FK_X_TEST_CASE_85
	 * FOREIGN KEY (X_UNUSED_ID, X_UNUSED_NAME)
	 * REFERENCES TEST.X_UNUSED (ID, NAME)
	 * </pre></code>
	 */
	public final org.jooq.TableField<org.jooq.test.oracle.generatedclasses.test.tables.records.XTestCase_85Record, java.lang.String> X_UNUSED_NAME = createField("X_UNUSED_NAME", org.jooq.impl.SQLDataType.VARCHAR, this);

	public XTestCase_85() {
		super("X_TEST_CASE_85", org.jooq.test.oracle.generatedclasses.test.Test.TEST);
	}

	public XTestCase_85(java.lang.String alias) {
		super(alias, org.jooq.test.oracle.generatedclasses.test.Test.TEST, org.jooq.test.oracle.generatedclasses.test.tables.XTestCase_85.X_TEST_CASE_85);
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.test.oracle.generatedclasses.test.tables.records.XTestCase_85Record> getMainKey() {
		return org.jooq.test.oracle.generatedclasses.test.Keys.PK_X_TEST_CASE_85;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.oracle.generatedclasses.test.tables.records.XTestCase_85Record>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.oracle.generatedclasses.test.tables.records.XTestCase_85Record>>asList(org.jooq.test.oracle.generatedclasses.test.Keys.PK_X_TEST_CASE_85);
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.ForeignKey<org.jooq.test.oracle.generatedclasses.test.tables.records.XTestCase_85Record, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.test.oracle.generatedclasses.test.tables.records.XTestCase_85Record, ?>>asList(org.jooq.test.oracle.generatedclasses.test.Keys.FK_X_TEST_CASE_85);
	}

	@Override
	public org.jooq.test.oracle.generatedclasses.test.tables.XTestCase_85 as(java.lang.String alias) {
		return new org.jooq.test.oracle.generatedclasses.test.tables.XTestCase_85(alias);
	}
}
