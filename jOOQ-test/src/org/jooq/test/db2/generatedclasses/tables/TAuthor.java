/**
 * This class is generated by jOOQ
 */
package org.jooq.test.db2.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
public class TAuthor extends org.jooq.impl.UpdatableTableImpl<org.jooq.test.db2.generatedclasses.tables.records.TAuthorRecord> {

	private static final long serialVersionUID = -197702527;

	/**
	 * The singleton instance of T_AUTHOR
	 */
	public static final org.jooq.test.db2.generatedclasses.tables.TAuthor T_AUTHOR = new org.jooq.test.db2.generatedclasses.tables.TAuthor();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.test.db2.generatedclasses.tables.records.TAuthorRecord> __RECORD_TYPE = org.jooq.test.db2.generatedclasses.tables.records.TAuthorRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.db2.generatedclasses.tables.records.TAuthorRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public static final org.jooq.TableField<org.jooq.test.db2.generatedclasses.tables.records.TAuthorRecord, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER, T_AUTHOR);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.db2.generatedclasses.tables.records.TAuthorRecord, java.lang.String> FIRST_NAME = createField("FIRST_NAME", org.jooq.impl.SQLDataType.VARCHAR, T_AUTHOR);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.db2.generatedclasses.tables.records.TAuthorRecord, java.lang.String> LAST_NAME = createField("LAST_NAME", org.jooq.impl.SQLDataType.VARCHAR, T_AUTHOR);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.db2.generatedclasses.tables.records.TAuthorRecord, java.sql.Date> DATE_OF_BIRTH = createField("DATE_OF_BIRTH", org.jooq.impl.SQLDataType.DATE, T_AUTHOR);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.db2.generatedclasses.tables.records.TAuthorRecord, java.lang.Integer> YEAR_OF_BIRTH = createField("YEAR_OF_BIRTH", org.jooq.impl.SQLDataType.INTEGER, T_AUTHOR);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.db2.generatedclasses.tables.records.TAuthorRecord, java.lang.String> ADDRESS = createField("ADDRESS", org.jooq.impl.SQLDataType.VARCHAR, T_AUTHOR);

	/**
	 * No further instances allowed
	 */
	private TAuthor() {
		super("T_AUTHOR", org.jooq.test.db2.generatedclasses.Lukas.LUKAS);
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.test.db2.generatedclasses.tables.records.TAuthorRecord> getMainKey() {
		return org.jooq.test.db2.generatedclasses.Keys.T_AUTHOR__PK_T_AUTHOR;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.db2.generatedclasses.tables.records.TAuthorRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.db2.generatedclasses.tables.records.TAuthorRecord>>asList(org.jooq.test.db2.generatedclasses.Keys.T_AUTHOR__PK_T_AUTHOR);
	}
}
