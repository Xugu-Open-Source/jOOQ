/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 *
 * An unused table in the same schema.
 */
@java.lang.SuppressWarnings({ "all", "unchecked" })
public class X_UNUSED extends org.jooq.impl.UpdatableTableImpl<org.jooq.test.oracle3.generatedclasses.tables.records.X_UNUSED> implements java.lang.Cloneable {

	private static final long serialVersionUID = 850970485;

	/**
	 * The singleton instance of <code>X_UNUSED</code>
	 */
	public static final org.jooq.test.oracle3.generatedclasses.tables.X_UNUSED X_UNUSED = new org.jooq.test.oracle3.generatedclasses.tables.X_UNUSED();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.oracle3.generatedclasses.tables.records.X_UNUSED> getRecordType() {
		return org.jooq.test.oracle3.generatedclasses.tables.records.X_UNUSED.class;
	}

	/**
	 * The column <code>X_UNUSED.ID</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.oracle3.generatedclasses.tables.records.X_UNUSED, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>X_UNUSED.NAME</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.oracle3.generatedclasses.tables.records.X_UNUSED, java.lang.String> NAME = createField("NAME", org.jooq.impl.SQLDataType.VARCHAR.length(10), this);

	/**
	 * The column <code>X_UNUSED.BIG_INTEGER</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.oracle3.generatedclasses.tables.records.X_UNUSED, java.math.BigInteger> BIG_INTEGER = createField("BIG_INTEGER", org.jooq.impl.SQLDataType.DECIMAL_INTEGER.precision(38), this);

	/**
	 * The column <code>X_UNUSED.ID_REF</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.oracle3.generatedclasses.tables.records.X_UNUSED, java.lang.Integer> ID_REF = createField("ID_REF", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>X_UNUSED.CLASS</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.oracle3.generatedclasses.tables.records.X_UNUSED, java.lang.Integer> CLASS = createField("CLASS", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>X_UNUSED.FIELDS</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.oracle3.generatedclasses.tables.records.X_UNUSED, java.lang.Integer> FIELDS = createField("FIELDS", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>X_UNUSED.CONFIGURATION</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.oracle3.generatedclasses.tables.records.X_UNUSED, java.lang.Integer> CONFIGURATION = createField("CONFIGURATION", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>X_UNUSED.U_D_T</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.oracle3.generatedclasses.tables.records.X_UNUSED, java.lang.Integer> U_D_T = createField("U_D_T", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>X_UNUSED.META_DATA</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.oracle3.generatedclasses.tables.records.X_UNUSED, java.lang.Integer> META_DATA = createField("META_DATA", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>X_UNUSED.TYPE0</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.oracle3.generatedclasses.tables.records.X_UNUSED, java.lang.Integer> TYPE0 = createField("TYPE0", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>X_UNUSED.PRIMARY_KEY</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.oracle3.generatedclasses.tables.records.X_UNUSED, java.lang.Integer> PRIMARY_KEY = createField("PRIMARY_KEY", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>X_UNUSED.PRIMARYKEY</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.oracle3.generatedclasses.tables.records.X_UNUSED, java.lang.Integer> PRIMARYKEY = createField("PRIMARYKEY", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>X_UNUSED.NAME_REF</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.oracle3.generatedclasses.tables.records.X_UNUSED, java.lang.String> NAME_REF = createField("NAME_REF", org.jooq.impl.SQLDataType.VARCHAR.length(10), this);

	/**
	 * The column <code>X_UNUSED.FIELD 737</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.oracle3.generatedclasses.tables.records.X_UNUSED, java.math.BigDecimal> FIELD_737 = createField("FIELD 737", org.jooq.impl.SQLDataType.NUMERIC.precision(25, 2), this);

	/**
	 * The column <code>X_UNUSED.MS_UNUSED_ID_REF</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.oracle3.generatedclasses.tables.records.X_UNUSED, java.lang.Integer> MS_UNUSED_ID_REF = createField("MS_UNUSED_ID_REF", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>X_UNUSED.MS_UNUSED_NAME_REF</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.oracle3.generatedclasses.tables.records.X_UNUSED, java.lang.String> MS_UNUSED_NAME_REF = createField("MS_UNUSED_NAME_REF", org.jooq.impl.SQLDataType.VARCHAR.length(10), this);

	/**
	 * Create a <code>X_UNUSED</code> table reference
	 */
	public X_UNUSED() {
		super("X_UNUSED", org.jooq.test.oracle3.generatedclasses.DefaultSchema.DEFAULT_SCHEMA);
	}

	/**
	 * Create an aliased <code>X_UNUSED</code> table reference
	 */
	public X_UNUSED(java.lang.String alias) {
		super(alias, org.jooq.test.oracle3.generatedclasses.DefaultSchema.DEFAULT_SCHEMA, org.jooq.test.oracle3.generatedclasses.tables.X_UNUSED.X_UNUSED);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.jooq.test.oracle3.generatedclasses.tables.records.X_UNUSED> getPrimaryKey() {
		return org.jooq.test.oracle3.generatedclasses.Keys.PK_X_UNUSED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.oracle3.generatedclasses.tables.records.X_UNUSED>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.oracle3.generatedclasses.tables.records.X_UNUSED>>asList(org.jooq.test.oracle3.generatedclasses.Keys.PK_X_UNUSED, org.jooq.test.oracle3.generatedclasses.Keys.UK_X_UNUSED_ID);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<org.jooq.test.oracle3.generatedclasses.tables.records.X_UNUSED, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.test.oracle3.generatedclasses.tables.records.X_UNUSED, ?>>asList(org.jooq.test.oracle3.generatedclasses.Keys.FK_X_UNUSED_SELF);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.test.oracle3.generatedclasses.tables.X_UNUSED as(java.lang.String alias) {
		return new org.jooq.test.oracle3.generatedclasses.tables.X_UNUSED(alias);
	}
}
