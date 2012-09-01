/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.humanresources.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class EmployeeAddress extends org.jooq.impl.UpdatableTableImpl<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.EmployeeAddress> {

	private static final long serialVersionUID = -668168756;

	/**
	 * The singleton instance of HumanResources.EmployeeAddress
	 */
	public static final org.jooq.examples.sqlserver.adventureworks.humanresources.tables.EmployeeAddress EmployeeAddress = new org.jooq.examples.sqlserver.adventureworks.humanresources.tables.EmployeeAddress();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.EmployeeAddress> getRecordType() {
		return org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.EmployeeAddress.class;
	}

	/**
	 * The table column <code>HumanResources.EmployeeAddress.EmployeeID</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT FK_EmployeeAddress_Employee_EmployeeID
	 * FOREIGN KEY (EmployeeID)
	 * REFERENCES HumanResources.Employee (EmployeeID)
	 * </pre></code>
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.EmployeeAddress, java.lang.Integer> EmployeeID = createField("EmployeeID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>HumanResources.EmployeeAddress.AddressID</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT FK_EmployeeAddress_Address_AddressID
	 * FOREIGN KEY (AddressID)
	 * REFERENCES Person.Address (AddressID)
	 * </pre></code>
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.EmployeeAddress, java.lang.Integer> AddressID = createField("AddressID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>HumanResources.EmployeeAddress.rowguid</code>
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.EmployeeAddress, java.lang.String> rowguid = createField("rowguid", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>HumanResources.EmployeeAddress.ModifiedDate</code>
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.EmployeeAddress, java.sql.Timestamp> ModifiedDate = createField("ModifiedDate", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	public EmployeeAddress() {
		super("EmployeeAddress", org.jooq.examples.sqlserver.adventureworks.humanresources.HumanResources.HumanResources);
	}

	public EmployeeAddress(java.lang.String alias) {
		super(alias, org.jooq.examples.sqlserver.adventureworks.humanresources.HumanResources.HumanResources, org.jooq.examples.sqlserver.adventureworks.humanresources.tables.EmployeeAddress.EmployeeAddress);
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.EmployeeAddress> getMainKey() {
		return org.jooq.examples.sqlserver.adventureworks.humanresources.Keys.PK_EmployeeAddress_EmployeeID_AddressID;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.EmployeeAddress>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.EmployeeAddress>>asList(org.jooq.examples.sqlserver.adventureworks.humanresources.Keys.PK_EmployeeAddress_EmployeeID_AddressID);
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.EmployeeAddress, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.EmployeeAddress, ?>>asList(org.jooq.examples.sqlserver.adventureworks.humanresources.Keys.FK_EmployeeAddress_Employee_EmployeeID, org.jooq.examples.sqlserver.adventureworks.humanresources.Keys.FK_EmployeeAddress_Address_AddressID);
	}

	@Override
	public org.jooq.examples.sqlserver.adventureworks.humanresources.tables.EmployeeAddress as(java.lang.String alias) {
		return new org.jooq.examples.sqlserver.adventureworks.humanresources.tables.EmployeeAddress(alias);
	}
}
