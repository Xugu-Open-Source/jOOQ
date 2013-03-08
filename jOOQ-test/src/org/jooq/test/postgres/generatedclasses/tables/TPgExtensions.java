/**
 * This class is generated by jOOQ
 */
package org.jooq.test.postgres.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked" })
public class TPgExtensions extends org.jooq.impl.UpdatableTableImpl<org.jooq.test.postgres.generatedclasses.tables.records.TPgExtensionsRecord> {

	private static final long serialVersionUID = -2096340914;

	/**
	 * The singleton instance of <code>public.t_pg_extensions</code>
	 */
	public static final org.jooq.test.postgres.generatedclasses.tables.TPgExtensions T_PG_EXTENSIONS = new org.jooq.test.postgres.generatedclasses.tables.TPgExtensions();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.postgres.generatedclasses.tables.records.TPgExtensionsRecord> getRecordType() {
		return org.jooq.test.postgres.generatedclasses.tables.records.TPgExtensionsRecord.class;
	}

	/**
	 * The column <code>public.t_pg_extensions.id</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.postgres.generatedclasses.tables.records.TPgExtensionsRecord, java.lang.Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>public.t_pg_extensions.pg_interval</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.postgres.generatedclasses.tables.records.TPgExtensionsRecord, java.lang.Object> PG_INTERVAL = createField("pg_interval", org.jooq.impl.DefaultDataType.getDefaultDataType("interval"), this);

	/**
	 * The column <code>public.t_pg_extensions.pg_box</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.postgres.generatedclasses.tables.records.TPgExtensionsRecord, java.lang.Object> PG_BOX = createField("pg_box", org.jooq.impl.DefaultDataType.getDefaultDataType("box"), this);

	/**
	 * The column <code>public.t_pg_extensions.pg_hstore</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.postgres.generatedclasses.tables.records.TPgExtensionsRecord, java.lang.Object> PG_HSTORE = createField("pg_hstore", org.jooq.impl.DefaultDataType.getDefaultDataType("USER-DEFINED"), this);

	/**
	 * The column <code>public.t_pg_extensions.pg_geometry</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.postgres.generatedclasses.tables.records.TPgExtensionsRecord, java.lang.Object> PG_GEOMETRY = createField("pg_geometry", org.jooq.impl.DefaultDataType.getDefaultDataType("USER-DEFINED"), this);

	/**
	 * Create a <code>public.t_pg_extensions</code> table reference
	 */
	public TPgExtensions() {
		super("t_pg_extensions", org.jooq.test.postgres.generatedclasses.Public.PUBLIC);
	}

	/**
	 * Create an aliased <code>public.t_pg_extensions</code> table reference
	 */
	public TPgExtensions(java.lang.String alias) {
		super(alias, org.jooq.test.postgres.generatedclasses.Public.PUBLIC, org.jooq.test.postgres.generatedclasses.tables.TPgExtensions.T_PG_EXTENSIONS);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<org.jooq.test.postgres.generatedclasses.tables.records.TPgExtensionsRecord, java.lang.Integer> getIdentity() {
		return org.jooq.test.postgres.generatedclasses.Keys.IDENTITY_T_PG_EXTENSIONS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.jooq.test.postgres.generatedclasses.tables.records.TPgExtensionsRecord> getPrimaryKey() {
		return org.jooq.test.postgres.generatedclasses.Keys.PK_T_PG_EXTENSIONS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.postgres.generatedclasses.tables.records.TPgExtensionsRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.postgres.generatedclasses.tables.records.TPgExtensionsRecord>>asList(org.jooq.test.postgres.generatedclasses.Keys.PK_T_PG_EXTENSIONS);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.test.postgres.generatedclasses.tables.TPgExtensions as(java.lang.String alias) {
		return new org.jooq.test.postgres.generatedclasses.tables.TPgExtensions(alias);
	}
}
