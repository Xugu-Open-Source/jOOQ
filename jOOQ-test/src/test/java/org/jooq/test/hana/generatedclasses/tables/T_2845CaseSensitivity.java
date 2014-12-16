/**
 * This class is generated by jOOQ
 */
package org.jooq.test.hana.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class T_2845CaseSensitivity extends org.jooq.impl.TableImpl<org.jooq.test.hana.generatedclasses.tables.records.T_2845CaseSensitivityRecord> {

	private static final long serialVersionUID = -1746780291;

	/**
	 * The reference instance of <code>DEV_2ZUU8JBREPCG8SWGL0XWK7NTF.T_2845_CASE_sensitivity</code>
	 */
	public static final org.jooq.test.hana.generatedclasses.tables.T_2845CaseSensitivity T_2845_CASE_SENSITIVITY = new org.jooq.test.hana.generatedclasses.tables.T_2845CaseSensitivity();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.hana.generatedclasses.tables.records.T_2845CaseSensitivityRecord> getRecordType() {
		return org.jooq.test.hana.generatedclasses.tables.records.T_2845CaseSensitivityRecord.class;
	}

	/**
	 * The column <code>DEV_2ZUU8JBREPCG8SWGL0XWK7NTF.T_2845_CASE_sensitivity.ID</code>.
	 */
	public final org.jooq.TableField<org.jooq.test.hana.generatedclasses.tables.records.T_2845CaseSensitivityRecord, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>DEV_2ZUU8JBREPCG8SWGL0XWK7NTF.T_2845_CASE_sensitivity.INSENSITIVE</code>.
	 */
	public final org.jooq.TableField<org.jooq.test.hana.generatedclasses.tables.records.T_2845CaseSensitivityRecord, java.lang.Integer> INSENSITIVE = createField("INSENSITIVE", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>DEV_2ZUU8JBREPCG8SWGL0XWK7NTF.T_2845_CASE_sensitivity.UPPER</code>.
	 */
	public final org.jooq.TableField<org.jooq.test.hana.generatedclasses.tables.records.T_2845CaseSensitivityRecord, java.lang.Integer> UPPER = createField("UPPER", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>DEV_2ZUU8JBREPCG8SWGL0XWK7NTF.T_2845_CASE_sensitivity.lower</code>.
	 */
	public final org.jooq.TableField<org.jooq.test.hana.generatedclasses.tables.records.T_2845CaseSensitivityRecord, java.lang.Integer> LOWER = createField("lower", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>DEV_2ZUU8JBREPCG8SWGL0XWK7NTF.T_2845_CASE_sensitivity.Mixed</code>.
	 */
	public final org.jooq.TableField<org.jooq.test.hana.generatedclasses.tables.records.T_2845CaseSensitivityRecord, java.lang.Integer> MIXED = createField("Mixed", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * Create a <code>DEV_2ZUU8JBREPCG8SWGL0XWK7NTF.T_2845_CASE_sensitivity</code> table reference
	 */
	public T_2845CaseSensitivity() {
		this("T_2845_CASE_sensitivity", null);
	}

	/**
	 * Create an aliased <code>DEV_2ZUU8JBREPCG8SWGL0XWK7NTF.T_2845_CASE_sensitivity</code> table reference
	 */
	public T_2845CaseSensitivity(java.lang.String alias) {
		this(alias, org.jooq.test.hana.generatedclasses.tables.T_2845CaseSensitivity.T_2845_CASE_SENSITIVITY);
	}

	private T_2845CaseSensitivity(java.lang.String alias, org.jooq.Table<org.jooq.test.hana.generatedclasses.tables.records.T_2845CaseSensitivityRecord> aliased) {
		this(alias, aliased, null);
	}

	private T_2845CaseSensitivity(java.lang.String alias, org.jooq.Table<org.jooq.test.hana.generatedclasses.tables.records.T_2845CaseSensitivityRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, org.jooq.test.hana.generatedclasses.Dev_2zuu8jbrepcg8swgl0xwk7ntf.DEV_2ZUU8JBREPCG8SWGL0XWK7NTF, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.jooq.test.hana.generatedclasses.tables.records.T_2845CaseSensitivityRecord> getPrimaryKey() {
		return org.jooq.test.hana.generatedclasses.Keys.PK_T_2845_CASE_SENSITIVITY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.hana.generatedclasses.tables.records.T_2845CaseSensitivityRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.hana.generatedclasses.tables.records.T_2845CaseSensitivityRecord>>asList(org.jooq.test.hana.generatedclasses.Keys.PK_T_2845_CASE_SENSITIVITY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.test.hana.generatedclasses.tables.T_2845CaseSensitivity as(java.lang.String alias) {
		return new org.jooq.test.hana.generatedclasses.tables.T_2845CaseSensitivity(alias, this);
	}

	/**
	 * Rename this table
	 */
	public org.jooq.test.hana.generatedclasses.tables.T_2845CaseSensitivity rename(java.lang.String name) {
		return new org.jooq.test.hana.generatedclasses.tables.T_2845CaseSensitivity(name, null);
	}
}
