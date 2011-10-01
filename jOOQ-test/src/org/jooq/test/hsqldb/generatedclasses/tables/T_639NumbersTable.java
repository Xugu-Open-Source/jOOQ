/**
 * This class is generated by jOOQ
 */
package org.jooq.test.hsqldb.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = "http://www.jooq.org",
                            comments = "This class is generated by jOOQ")
public class T_639NumbersTable extends org.jooq.impl.UpdatableTableImpl<org.jooq.test.hsqldb.generatedclasses.tables.records.T_639NumbersTableRecord> {

	private static final long serialVersionUID = 2077622599;

	/**
	 * The singleton instance of T_639_NUMBERS_TABLE
	 */
	public static final org.jooq.test.hsqldb.generatedclasses.tables.T_639NumbersTable T_639_NUMBERS_TABLE = new org.jooq.test.hsqldb.generatedclasses.tables.T_639NumbersTable();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.test.hsqldb.generatedclasses.tables.records.T_639NumbersTableRecord> __RECORD_TYPE = org.jooq.test.hsqldb.generatedclasses.tables.records.T_639NumbersTableRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.hsqldb.generatedclasses.tables.records.T_639NumbersTableRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public static final org.jooq.TableField<org.jooq.test.hsqldb.generatedclasses.tables.records.T_639NumbersTableRecord, java.lang.Integer> ID = new org.jooq.impl.TableFieldImpl<org.jooq.test.hsqldb.generatedclasses.tables.records.T_639NumbersTableRecord, java.lang.Integer>("ID", org.jooq.impl.SQLDataType.INTEGER, T_639_NUMBERS_TABLE);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.hsqldb.generatedclasses.tables.records.T_639NumbersTableRecord, java.lang.Byte> BYTE = new org.jooq.impl.TableFieldImpl<org.jooq.test.hsqldb.generatedclasses.tables.records.T_639NumbersTableRecord, java.lang.Byte>("BYTE", org.jooq.impl.SQLDataType.TINYINT, T_639_NUMBERS_TABLE);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.hsqldb.generatedclasses.tables.records.T_639NumbersTableRecord, java.lang.Short> SHORT = new org.jooq.impl.TableFieldImpl<org.jooq.test.hsqldb.generatedclasses.tables.records.T_639NumbersTableRecord, java.lang.Short>("SHORT", org.jooq.impl.SQLDataType.SMALLINT, T_639_NUMBERS_TABLE);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.hsqldb.generatedclasses.tables.records.T_639NumbersTableRecord, java.lang.Integer> INTEGER = new org.jooq.impl.TableFieldImpl<org.jooq.test.hsqldb.generatedclasses.tables.records.T_639NumbersTableRecord, java.lang.Integer>("INTEGER", org.jooq.impl.SQLDataType.INTEGER, T_639_NUMBERS_TABLE);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.hsqldb.generatedclasses.tables.records.T_639NumbersTableRecord, java.lang.Long> LONG = new org.jooq.impl.TableFieldImpl<org.jooq.test.hsqldb.generatedclasses.tables.records.T_639NumbersTableRecord, java.lang.Long>("LONG", org.jooq.impl.SQLDataType.BIGINT, T_639_NUMBERS_TABLE);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.hsqldb.generatedclasses.tables.records.T_639NumbersTableRecord, java.lang.Byte> BYTE_DECIMAL = new org.jooq.impl.TableFieldImpl<org.jooq.test.hsqldb.generatedclasses.tables.records.T_639NumbersTableRecord, java.lang.Byte>("BYTE_DECIMAL", org.jooq.impl.SQLDataType.TINYINT, T_639_NUMBERS_TABLE);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.hsqldb.generatedclasses.tables.records.T_639NumbersTableRecord, java.lang.Short> SHORT_DECIMAL = new org.jooq.impl.TableFieldImpl<org.jooq.test.hsqldb.generatedclasses.tables.records.T_639NumbersTableRecord, java.lang.Short>("SHORT_DECIMAL", org.jooq.impl.SQLDataType.SMALLINT, T_639_NUMBERS_TABLE);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.hsqldb.generatedclasses.tables.records.T_639NumbersTableRecord, java.lang.Integer> INTEGER_DECIMAL = new org.jooq.impl.TableFieldImpl<org.jooq.test.hsqldb.generatedclasses.tables.records.T_639NumbersTableRecord, java.lang.Integer>("INTEGER_DECIMAL", org.jooq.impl.SQLDataType.INTEGER, T_639_NUMBERS_TABLE);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.hsqldb.generatedclasses.tables.records.T_639NumbersTableRecord, java.lang.Long> LONG_DECIMAL = new org.jooq.impl.TableFieldImpl<org.jooq.test.hsqldb.generatedclasses.tables.records.T_639NumbersTableRecord, java.lang.Long>("LONG_DECIMAL", org.jooq.impl.SQLDataType.BIGINT, T_639_NUMBERS_TABLE);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.hsqldb.generatedclasses.tables.records.T_639NumbersTableRecord, java.math.BigInteger> BIG_INTEGER = new org.jooq.impl.TableFieldImpl<org.jooq.test.hsqldb.generatedclasses.tables.records.T_639NumbersTableRecord, java.math.BigInteger>("BIG_INTEGER", org.jooq.impl.SQLDataType.DECIMAL_INTEGER, T_639_NUMBERS_TABLE);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.hsqldb.generatedclasses.tables.records.T_639NumbersTableRecord, java.math.BigDecimal> BIG_DECIMAL = new org.jooq.impl.TableFieldImpl<org.jooq.test.hsqldb.generatedclasses.tables.records.T_639NumbersTableRecord, java.math.BigDecimal>("BIG_DECIMAL", org.jooq.impl.SQLDataType.DECIMAL, T_639_NUMBERS_TABLE);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.hsqldb.generatedclasses.tables.records.T_639NumbersTableRecord, java.lang.Double> FLOAT = new org.jooq.impl.TableFieldImpl<org.jooq.test.hsqldb.generatedclasses.tables.records.T_639NumbersTableRecord, java.lang.Double>("FLOAT", org.jooq.impl.SQLDataType.DOUBLE, T_639_NUMBERS_TABLE);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.hsqldb.generatedclasses.tables.records.T_639NumbersTableRecord, java.lang.Double> DOUBLE = new org.jooq.impl.TableFieldImpl<org.jooq.test.hsqldb.generatedclasses.tables.records.T_639NumbersTableRecord, java.lang.Double>("DOUBLE", org.jooq.impl.SQLDataType.DOUBLE, T_639_NUMBERS_TABLE);

	/**
	 * No further instances allowed
	 */
	private T_639NumbersTable() {
		super("T_639_NUMBERS_TABLE", org.jooq.test.hsqldb.generatedclasses.Public.PUBLIC);
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.test.hsqldb.generatedclasses.tables.records.T_639NumbersTableRecord> getMainKey() {
		return org.jooq.test.hsqldb.generatedclasses.Keys.PK_T_639_NUMBERS_TABLE;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.hsqldb.generatedclasses.tables.records.T_639NumbersTableRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.hsqldb.generatedclasses.tables.records.T_639NumbersTableRecord>>asList(org.jooq.test.hsqldb.generatedclasses.Keys.PK_T_639_NUMBERS_TABLE);
	}
}
