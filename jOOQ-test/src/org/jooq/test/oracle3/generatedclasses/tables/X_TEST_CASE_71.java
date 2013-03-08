/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked" })
public class X_TEST_CASE_71 extends org.jooq.impl.UpdatableTableImpl<org.jooq.test.oracle3.generatedclasses.tables.records.X_TEST_CASE_71> implements java.lang.Cloneable {

	private static final long serialVersionUID = 1749327710;

	/**
	 * The singleton instance of <code>X_TEST_CASE_71</code>
	 */
	public static final org.jooq.test.oracle3.generatedclasses.tables.X_TEST_CASE_71 X_TEST_CASE_71 = new org.jooq.test.oracle3.generatedclasses.tables.X_TEST_CASE_71();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.oracle3.generatedclasses.tables.records.X_TEST_CASE_71> getRecordType() {
		return org.jooq.test.oracle3.generatedclasses.tables.records.X_TEST_CASE_71.class;
	}

	/**
	 * The column <code>X_TEST_CASE_71.ID</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.oracle3.generatedclasses.tables.records.X_TEST_CASE_71, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>X_TEST_CASE_71.TEST_CASE_64_69_ID</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.oracle3.generatedclasses.tables.records.X_TEST_CASE_71, java.lang.Short> TEST_CASE_64_69_ID = createField("TEST_CASE_64_69_ID", org.jooq.impl.SQLDataType.SMALLINT, this);

	/**
	 * Create a <code>X_TEST_CASE_71</code> table reference
	 */
	public X_TEST_CASE_71() {
		super("X_TEST_CASE_71", org.jooq.test.oracle3.generatedclasses.DefaultSchema.DEFAULT_SCHEMA);
	}

	/**
	 * Create an aliased <code>X_TEST_CASE_71</code> table reference
	 */
	public X_TEST_CASE_71(java.lang.String alias) {
		super(alias, org.jooq.test.oracle3.generatedclasses.DefaultSchema.DEFAULT_SCHEMA, org.jooq.test.oracle3.generatedclasses.tables.X_TEST_CASE_71.X_TEST_CASE_71);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.jooq.test.oracle3.generatedclasses.tables.records.X_TEST_CASE_71> getPrimaryKey() {
		return org.jooq.test.oracle3.generatedclasses.Keys.PK_X_TEST_CASE_71;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.oracle3.generatedclasses.tables.records.X_TEST_CASE_71>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.oracle3.generatedclasses.tables.records.X_TEST_CASE_71>>asList(org.jooq.test.oracle3.generatedclasses.Keys.PK_X_TEST_CASE_71);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<org.jooq.test.oracle3.generatedclasses.tables.records.X_TEST_CASE_71, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.test.oracle3.generatedclasses.tables.records.X_TEST_CASE_71, ?>>asList(org.jooq.test.oracle3.generatedclasses.Keys.FK_X_TEST_CASE_71);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.test.oracle3.generatedclasses.tables.X_TEST_CASE_71 as(java.lang.String alias) {
		return new org.jooq.test.oracle3.generatedclasses.tables.X_TEST_CASE_71(alias);
	}
}
