/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.humanresources.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class vEmployeeDepartment extends org.jooq.impl.TableImpl<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.vEmployeeDepartment> {

	private static final long serialVersionUID = -2068557149;

	/**
	 * The singleton instance of HumanResources.vEmployeeDepartment
	 */
	public static final org.jooq.examples.sqlserver.adventureworks.humanresources.tables.vEmployeeDepartment vEmployeeDepartment = new org.jooq.examples.sqlserver.adventureworks.humanresources.tables.vEmployeeDepartment();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.vEmployeeDepartment> getRecordType() {
		return org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.vEmployeeDepartment.class;
	}

	/**
	 * The table column <code>HumanResources.vEmployeeDepartment.EmployeeID</code>
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.vEmployeeDepartment, java.lang.Integer> EmployeeID = createField("EmployeeID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>HumanResources.vEmployeeDepartment.Title</code>
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.vEmployeeDepartment, java.lang.String> Title = createField("Title", org.jooq.impl.SQLDataType.NVARCHAR, this);

	/**
	 * The table column <code>HumanResources.vEmployeeDepartment.FirstName</code>
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.vEmployeeDepartment, java.lang.String> FirstName = createField("FirstName", org.jooq.impl.SQLDataType.NVARCHAR, this);

	/**
	 * The table column <code>HumanResources.vEmployeeDepartment.MiddleName</code>
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.vEmployeeDepartment, java.lang.String> MiddleName = createField("MiddleName", org.jooq.impl.SQLDataType.NVARCHAR, this);

	/**
	 * The table column <code>HumanResources.vEmployeeDepartment.LastName</code>
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.vEmployeeDepartment, java.lang.String> LastName = createField("LastName", org.jooq.impl.SQLDataType.NVARCHAR, this);

	/**
	 * The table column <code>HumanResources.vEmployeeDepartment.Suffix</code>
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.vEmployeeDepartment, java.lang.String> Suffix = createField("Suffix", org.jooq.impl.SQLDataType.NVARCHAR, this);

	/**
	 * The table column <code>HumanResources.vEmployeeDepartment.JobTitle</code>
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.vEmployeeDepartment, java.lang.String> JobTitle = createField("JobTitle", org.jooq.impl.SQLDataType.NVARCHAR, this);

	/**
	 * The table column <code>HumanResources.vEmployeeDepartment.Department</code>
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.vEmployeeDepartment, java.lang.String> Department = createField("Department", org.jooq.impl.SQLDataType.NVARCHAR, this);

	/**
	 * The table column <code>HumanResources.vEmployeeDepartment.GroupName</code>
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.vEmployeeDepartment, java.lang.String> GroupName = createField("GroupName", org.jooq.impl.SQLDataType.NVARCHAR, this);

	/**
	 * The table column <code>HumanResources.vEmployeeDepartment.StartDate</code>
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.humanresources.tables.records.vEmployeeDepartment, java.sql.Timestamp> StartDate = createField("StartDate", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	public vEmployeeDepartment() {
		super("vEmployeeDepartment", org.jooq.examples.sqlserver.adventureworks.humanresources.HumanResources.HumanResources);
	}

	public vEmployeeDepartment(java.lang.String alias) {
		super(alias, org.jooq.examples.sqlserver.adventureworks.humanresources.HumanResources.HumanResources, org.jooq.examples.sqlserver.adventureworks.humanresources.tables.vEmployeeDepartment.vEmployeeDepartment);
	}

	@Override
	public org.jooq.examples.sqlserver.adventureworks.humanresources.tables.vEmployeeDepartment as(java.lang.String alias) {
		return new org.jooq.examples.sqlserver.adventureworks.humanresources.tables.vEmployeeDepartment(alias);
	}
}
