/**
 * This class is generated by jOOQ
 */
package org.jooq.test.ingres.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = "http://www.jooq.org",
                            comments = "This class is generated by jOOQ")
public class XUnused extends org.jooq.impl.UpdatableTableImpl<org.jooq.test.ingres.generatedclasses.tables.records.XUnusedRecord> {

	private static final long serialVersionUID = 1029153320;

	/**
	 * The singleton instance of x_unused
	 */
	public static final org.jooq.test.ingres.generatedclasses.tables.XUnused X_UNUSED = new org.jooq.test.ingres.generatedclasses.tables.XUnused();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.test.ingres.generatedclasses.tables.records.XUnusedRecord> __RECORD_TYPE = org.jooq.test.ingres.generatedclasses.tables.records.XUnusedRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.ingres.generatedclasses.tables.records.XUnusedRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public static final org.jooq.TableField<org.jooq.test.ingres.generatedclasses.tables.records.XUnusedRecord, java.lang.Integer> ID = new org.jooq.impl.TableFieldImpl<org.jooq.test.ingres.generatedclasses.tables.records.XUnusedRecord, java.lang.Integer>("id", org.jooq.impl.SQLDataType.INTEGER, X_UNUSED);

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public static final org.jooq.TableField<org.jooq.test.ingres.generatedclasses.tables.records.XUnusedRecord, java.lang.String> NAME = new org.jooq.impl.TableFieldImpl<org.jooq.test.ingres.generatedclasses.tables.records.XUnusedRecord, java.lang.String>("name", org.jooq.impl.SQLDataType.VARCHAR, X_UNUSED);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.ingres.generatedclasses.tables.records.XUnusedRecord, java.math.BigInteger> BIG_INTEGER = new org.jooq.impl.TableFieldImpl<org.jooq.test.ingres.generatedclasses.tables.records.XUnusedRecord, java.math.BigInteger>("big_integer", org.jooq.impl.SQLDataType.DECIMAL_INTEGER, X_UNUSED);

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [test.x_unused.id_ref, test.x_unused.name_ref]
	 * REFERENCES x_unused [test.x_unused.id, test.x_unused.name]
	 * </pre></code>
	 */
	public static final org.jooq.TableField<org.jooq.test.ingres.generatedclasses.tables.records.XUnusedRecord, java.lang.Integer> ID_REF = new org.jooq.impl.TableFieldImpl<org.jooq.test.ingres.generatedclasses.tables.records.XUnusedRecord, java.lang.Integer>("id_ref", org.jooq.impl.SQLDataType.INTEGER, X_UNUSED);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.ingres.generatedclasses.tables.records.XUnusedRecord, java.lang.Integer> CLASS = new org.jooq.impl.TableFieldImpl<org.jooq.test.ingres.generatedclasses.tables.records.XUnusedRecord, java.lang.Integer>("class", org.jooq.impl.SQLDataType.INTEGER, X_UNUSED);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.ingres.generatedclasses.tables.records.XUnusedRecord, java.lang.Integer> FIELDS = new org.jooq.impl.TableFieldImpl<org.jooq.test.ingres.generatedclasses.tables.records.XUnusedRecord, java.lang.Integer>("fields", org.jooq.impl.SQLDataType.INTEGER, X_UNUSED);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.ingres.generatedclasses.tables.records.XUnusedRecord, java.lang.Integer> CONFIGURATION = new org.jooq.impl.TableFieldImpl<org.jooq.test.ingres.generatedclasses.tables.records.XUnusedRecord, java.lang.Integer>("configuration", org.jooq.impl.SQLDataType.INTEGER, X_UNUSED);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.ingres.generatedclasses.tables.records.XUnusedRecord, java.lang.Integer> U_D_T = new org.jooq.impl.TableFieldImpl<org.jooq.test.ingres.generatedclasses.tables.records.XUnusedRecord, java.lang.Integer>("u_d_t", org.jooq.impl.SQLDataType.INTEGER, X_UNUSED);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.ingres.generatedclasses.tables.records.XUnusedRecord, java.lang.Integer> META_DATA = new org.jooq.impl.TableFieldImpl<org.jooq.test.ingres.generatedclasses.tables.records.XUnusedRecord, java.lang.Integer>("meta_data", org.jooq.impl.SQLDataType.INTEGER, X_UNUSED);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.ingres.generatedclasses.tables.records.XUnusedRecord, java.lang.Integer> TYPE0 = new org.jooq.impl.TableFieldImpl<org.jooq.test.ingres.generatedclasses.tables.records.XUnusedRecord, java.lang.Integer>("type0", org.jooq.impl.SQLDataType.INTEGER, X_UNUSED);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.ingres.generatedclasses.tables.records.XUnusedRecord, java.lang.Integer> PRIMARY_KEY = new org.jooq.impl.TableFieldImpl<org.jooq.test.ingres.generatedclasses.tables.records.XUnusedRecord, java.lang.Integer>("primary_key", org.jooq.impl.SQLDataType.INTEGER, X_UNUSED);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.ingres.generatedclasses.tables.records.XUnusedRecord, java.lang.Integer> PRIMARYKEY = new org.jooq.impl.TableFieldImpl<org.jooq.test.ingres.generatedclasses.tables.records.XUnusedRecord, java.lang.Integer>("primarykey", org.jooq.impl.SQLDataType.INTEGER, X_UNUSED);

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [test.x_unused.id_ref, test.x_unused.name_ref]
	 * REFERENCES x_unused [test.x_unused.id, test.x_unused.name]
	 * </pre></code>
	 */
	public static final org.jooq.TableField<org.jooq.test.ingres.generatedclasses.tables.records.XUnusedRecord, java.lang.String> NAME_REF = new org.jooq.impl.TableFieldImpl<org.jooq.test.ingres.generatedclasses.tables.records.XUnusedRecord, java.lang.String>("name_ref", org.jooq.impl.SQLDataType.VARCHAR, X_UNUSED);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.ingres.generatedclasses.tables.records.XUnusedRecord, java.math.BigDecimal> FIELD_737 = new org.jooq.impl.TableFieldImpl<org.jooq.test.ingres.generatedclasses.tables.records.XUnusedRecord, java.math.BigDecimal>("field 737", org.jooq.impl.SQLDataType.DECIMAL, X_UNUSED);

	/**
	 * No further instances allowed
	 */
	private XUnused() {
		super("x_unused", org.jooq.test.ingres.generatedclasses.Test.TEST);
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.test.ingres.generatedclasses.tables.records.XUnusedRecord> getMainKey() {
		return org.jooq.test.ingres.generatedclasses.Keys.pk_x_unused;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.ingres.generatedclasses.tables.records.XUnusedRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.ingres.generatedclasses.tables.records.XUnusedRecord>>asList(org.jooq.test.ingres.generatedclasses.Keys.pk_x_unused, org.jooq.test.ingres.generatedclasses.Keys.uk_x_unused_id);
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.ForeignKey<org.jooq.test.ingres.generatedclasses.tables.records.XUnusedRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.test.ingres.generatedclasses.tables.records.XUnusedRecord, ?>>asList(org.jooq.test.ingres.generatedclasses.Keys.fk_x_unused_self);
	}
}
