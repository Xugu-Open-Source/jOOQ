/**
 * This class is generated by jOOQ
 */
package org.jooq.test.sqlserver.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class T_3084 extends org.jooq.impl.TableImpl<org.jooq.test.sqlserver.generatedclasses.tables.records.T_3084Record> {

	private static final long serialVersionUID = 1007734009;

	/**
	 * The singleton instance of <code>dbo.t_3084</code>
	 */
	public static final org.jooq.test.sqlserver.generatedclasses.tables.T_3084 T_3084 = new org.jooq.test.sqlserver.generatedclasses.tables.T_3084();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.sqlserver.generatedclasses.tables.records.T_3084Record> getRecordType() {
		return org.jooq.test.sqlserver.generatedclasses.tables.records.T_3084Record.class;
	}

	/**
	 * The column <code>dbo.t_3084.ID</code>.
	 */
	public final org.jooq.TableField<org.jooq.test.sqlserver.generatedclasses.tables.records.T_3084Record, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * Create a <code>dbo.t_3084</code> table reference
	 */
	public T_3084() {
		this("t_3084", null);
	}

	/**
	 * Create an aliased <code>dbo.t_3084</code> table reference
	 */
	public T_3084(java.lang.String alias) {
		this(alias, org.jooq.test.sqlserver.generatedclasses.tables.T_3084.T_3084);
	}

	private T_3084(java.lang.String alias, org.jooq.Table<org.jooq.test.sqlserver.generatedclasses.tables.records.T_3084Record> aliased) {
		this(alias, aliased, null);
	}

	private T_3084(java.lang.String alias, org.jooq.Table<org.jooq.test.sqlserver.generatedclasses.tables.records.T_3084Record> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, org.jooq.test.sqlserver.generatedclasses.Dbo.DBO, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.jooq.test.sqlserver.generatedclasses.tables.records.T_3084Record> getPrimaryKey() {
		return org.jooq.test.sqlserver.generatedclasses.Keys.UK_T_3084;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.sqlserver.generatedclasses.tables.records.T_3084Record>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.sqlserver.generatedclasses.tables.records.T_3084Record>>asList(org.jooq.test.sqlserver.generatedclasses.Keys.UK_T_3084);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.test.sqlserver.generatedclasses.tables.T_3084 as(java.lang.String alias) {
		return new org.jooq.test.sqlserver.generatedclasses.tables.T_3084(alias, this);
	}

	/**
	 * Rename this table
	 */
	public org.jooq.test.sqlserver.generatedclasses.tables.T_3084 rename(java.lang.String name) {
		return new org.jooq.test.sqlserver.generatedclasses.tables.T_3084(name, null);
	}
}
