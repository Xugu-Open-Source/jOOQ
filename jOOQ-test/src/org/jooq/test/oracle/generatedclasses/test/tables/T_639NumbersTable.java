/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.test.tables;

/**
 * This class is generated by jOOQ.
 */
public class T_639NumbersTable extends org.jooq.impl.UpdatableTableImpl<org.jooq.test.oracle.generatedclasses.test.tables.records.T_639NumbersTableRecord> {

	private static final long serialVersionUID = 1375776;

	/**
	 * The singleton instance of T_639_NUMBERS_TABLE
	 */
	public static final org.jooq.test.oracle.generatedclasses.test.tables.T_639NumbersTable T_639_NUMBERS_TABLE = new org.jooq.test.oracle.generatedclasses.test.tables.T_639NumbersTable();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.test.oracle.generatedclasses.test.tables.records.T_639NumbersTableRecord> __RECORD_TYPE = org.jooq.test.oracle.generatedclasses.test.tables.records.T_639NumbersTableRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.oracle.generatedclasses.test.tables.records.T_639NumbersTableRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public final org.jooq.TableField<org.jooq.test.oracle.generatedclasses.test.tables.records.T_639NumbersTableRecord, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.test.oracle.generatedclasses.test.tables.records.T_639NumbersTableRecord, java.lang.Byte> BYTE = createField("BYTE", org.jooq.impl.SQLDataType.TINYINT, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.test.oracle.generatedclasses.test.tables.records.T_639NumbersTableRecord, java.lang.Short> SHORT = createField("SHORT", org.jooq.impl.SQLDataType.SMALLINT, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.test.oracle.generatedclasses.test.tables.records.T_639NumbersTableRecord, java.lang.Integer> INTEGER = createField("INTEGER", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.test.oracle.generatedclasses.test.tables.records.T_639NumbersTableRecord, java.lang.Long> LONG = createField("LONG", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.test.oracle.generatedclasses.test.tables.records.T_639NumbersTableRecord, java.lang.Byte> BYTE_DECIMAL = createField("BYTE_DECIMAL", org.jooq.impl.SQLDataType.TINYINT, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.test.oracle.generatedclasses.test.tables.records.T_639NumbersTableRecord, java.lang.Short> SHORT_DECIMAL = createField("SHORT_DECIMAL", org.jooq.impl.SQLDataType.SMALLINT, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.test.oracle.generatedclasses.test.tables.records.T_639NumbersTableRecord, java.lang.Integer> INTEGER_DECIMAL = createField("INTEGER_DECIMAL", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.test.oracle.generatedclasses.test.tables.records.T_639NumbersTableRecord, java.lang.Long> LONG_DECIMAL = createField("LONG_DECIMAL", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.test.oracle.generatedclasses.test.tables.records.T_639NumbersTableRecord, java.math.BigInteger> BIG_INTEGER = createField("BIG_INTEGER", org.jooq.impl.SQLDataType.DECIMAL_INTEGER, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.test.oracle.generatedclasses.test.tables.records.T_639NumbersTableRecord, java.math.BigDecimal> BIG_DECIMAL = createField("BIG_DECIMAL", org.jooq.impl.SQLDataType.NUMERIC, this);

	/**
	 * No further instances allowed
	 */
	private T_639NumbersTable() {
		super("T_639_NUMBERS_TABLE", org.jooq.test.oracle.generatedclasses.test.Test.TEST);
	}

	/**
	 * No further instances allowed
	 */
	private T_639NumbersTable(java.lang.String alias) {
		super(alias, org.jooq.test.oracle.generatedclasses.test.Test.TEST, org.jooq.test.oracle.generatedclasses.test.tables.T_639NumbersTable.T_639_NUMBERS_TABLE);
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.test.oracle.generatedclasses.test.tables.records.T_639NumbersTableRecord> getMainKey() {
		return org.jooq.test.oracle.generatedclasses.test.Keys.PK_T_639_NUMBERS_TABLE;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.oracle.generatedclasses.test.tables.records.T_639NumbersTableRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.oracle.generatedclasses.test.tables.records.T_639NumbersTableRecord>>asList(org.jooq.test.oracle.generatedclasses.test.Keys.PK_T_639_NUMBERS_TABLE);
	}

	@Override
	public org.jooq.test.oracle.generatedclasses.test.tables.T_639NumbersTable as(java.lang.String alias) {
		return new org.jooq.test.oracle.generatedclasses.test.tables.T_639NumbersTable(alias);
	}
}
