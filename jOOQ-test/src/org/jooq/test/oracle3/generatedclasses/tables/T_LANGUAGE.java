/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 *
 * An entity holding language master data
 */
@java.lang.SuppressWarnings("all")
public class T_LANGUAGE extends org.jooq.impl.UpdatableTableImpl<org.jooq.test.oracle3.generatedclasses.tables.records.T_LANGUAGE> implements java.lang.Cloneable {

	private static final long serialVersionUID = -1325735860;

	/**
	 * The singleton instance of <code>TEST.T_LANGUAGE</code>
	 */
	public static final org.jooq.test.oracle3.generatedclasses.tables.T_LANGUAGE T_LANGUAGE = new org.jooq.test.oracle3.generatedclasses.tables.T_LANGUAGE();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.oracle3.generatedclasses.tables.records.T_LANGUAGE> getRecordType() {
		return org.jooq.test.oracle3.generatedclasses.tables.records.T_LANGUAGE.class;
	}

	/**
	 * The column <code>TEST.T_LANGUAGE.CD</code>. The language ISO code
	 */
	public final org.jooq.TableField<org.jooq.test.oracle3.generatedclasses.tables.records.T_LANGUAGE, java.lang.String> CD = createField("CD", org.jooq.impl.SQLDataType.CHAR, this);

	/**
	 * The column <code>TEST.T_LANGUAGE.DESCRIPTION</code>. The language description
	 */
	public final org.jooq.TableField<org.jooq.test.oracle3.generatedclasses.tables.records.T_LANGUAGE, java.lang.String> DESCRIPTION = createField("DESCRIPTION", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The column <code>TEST.T_LANGUAGE.DESCRIPTION_ENGLISH</code>. 
	 */
	public final org.jooq.TableField<org.jooq.test.oracle3.generatedclasses.tables.records.T_LANGUAGE, java.lang.String> DESCRIPTION_ENGLISH = createField("DESCRIPTION_ENGLISH", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The column <code>TEST.T_LANGUAGE.ID</code>. The language ID
	 */
	public final org.jooq.TableField<org.jooq.test.oracle3.generatedclasses.tables.records.T_LANGUAGE, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * Create a <code>TEST.T_LANGUAGE</code> table reference
	 */
	public T_LANGUAGE() {
		super("T_LANGUAGE", org.jooq.test.oracle3.generatedclasses.TEST.TEST);
	}

	/**
	 * Create an aliased <code>TEST.T_LANGUAGE</code> table reference
	 */
	public T_LANGUAGE(java.lang.String alias) {
		super(alias, org.jooq.test.oracle3.generatedclasses.TEST.TEST, org.jooq.test.oracle3.generatedclasses.tables.T_LANGUAGE.T_LANGUAGE);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.jooq.test.oracle3.generatedclasses.tables.records.T_LANGUAGE> getMainKey() {
		return org.jooq.test.oracle3.generatedclasses.Keys.PK_T_LANGUAGE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.oracle3.generatedclasses.tables.records.T_LANGUAGE>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.oracle3.generatedclasses.tables.records.T_LANGUAGE>>asList(org.jooq.test.oracle3.generatedclasses.Keys.PK_T_LANGUAGE);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.test.oracle3.generatedclasses.tables.T_LANGUAGE as(java.lang.String alias) {
		return new org.jooq.test.oracle3.generatedclasses.tables.T_LANGUAGE(alias);
	}
}
