/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.purchasing.tables;

/**
 * This class is generated by jOOQ.
 */
public class Vendor extends org.jooq.impl.UpdatableTableImpl<org.jooq.examples.sqlserver.adventureworks.purchasing.tables.records.VendorRecord> {

	private static final long serialVersionUID = 1429593029;

	/**
	 * The singleton instance of Vendor
	 */
	public static final org.jooq.examples.sqlserver.adventureworks.purchasing.tables.Vendor VENDOR = new org.jooq.examples.sqlserver.adventureworks.purchasing.tables.Vendor();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.examples.sqlserver.adventureworks.purchasing.tables.records.VendorRecord> __RECORD_TYPE = org.jooq.examples.sqlserver.adventureworks.purchasing.tables.records.VendorRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.examples.sqlserver.adventureworks.purchasing.tables.records.VendorRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.purchasing.tables.records.VendorRecord, java.lang.Integer> VENDORID = createField("VendorID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.purchasing.tables.records.VendorRecord, java.lang.String> ACCOUNTNUMBER = createField("AccountNumber", org.jooq.impl.SQLDataType.NVARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.purchasing.tables.records.VendorRecord, java.lang.String> NAME = createField("Name", org.jooq.impl.SQLDataType.NVARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.purchasing.tables.records.VendorRecord, java.lang.Byte> CREDITRATING = createField("CreditRating", org.jooq.impl.SQLDataType.TINYINT, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.purchasing.tables.records.VendorRecord, java.lang.Boolean> PREFERREDVENDORSTATUS = createField("PreferredVendorStatus", org.jooq.impl.SQLDataType.BIT, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.purchasing.tables.records.VendorRecord, java.lang.Boolean> ACTIVEFLAG = createField("ActiveFlag", org.jooq.impl.SQLDataType.BIT, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.purchasing.tables.records.VendorRecord, java.lang.String> PURCHASINGWEBSERVICEURL = createField("PurchasingWebServiceURL", org.jooq.impl.SQLDataType.NVARCHAR, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.purchasing.tables.records.VendorRecord, java.sql.Timestamp> MODIFIEDDATE = createField("ModifiedDate", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * No further instances allowed
	 */
	private Vendor() {
		super("Vendor", org.jooq.examples.sqlserver.adventureworks.purchasing.Purchasing.PURCHASING);
	}

	/**
	 * No further instances allowed
	 */
	private Vendor(java.lang.String alias) {
		super(alias, org.jooq.examples.sqlserver.adventureworks.purchasing.Purchasing.PURCHASING, org.jooq.examples.sqlserver.adventureworks.purchasing.tables.Vendor.VENDOR);
	}

	@Override
	public org.jooq.Identity<org.jooq.examples.sqlserver.adventureworks.purchasing.tables.records.VendorRecord, java.lang.Integer> getIdentity() {
		return org.jooq.examples.sqlserver.adventureworks.purchasing.Keys.IDENTITY_VENDOR;
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.purchasing.tables.records.VendorRecord> getMainKey() {
		return org.jooq.examples.sqlserver.adventureworks.purchasing.Keys.PK_VENDOR_VENDORID;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.purchasing.tables.records.VendorRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.purchasing.tables.records.VendorRecord>>asList(org.jooq.examples.sqlserver.adventureworks.purchasing.Keys.PK_VENDOR_VENDORID);
	}

	@Override
	public org.jooq.examples.sqlserver.adventureworks.purchasing.tables.Vendor as(java.lang.String alias) {
		return new org.jooq.examples.sqlserver.adventureworks.purchasing.tables.Vendor(alias);
	}
}
