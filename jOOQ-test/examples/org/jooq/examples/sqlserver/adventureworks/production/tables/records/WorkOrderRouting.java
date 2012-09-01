/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.production.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
@javax.persistence.Entity
@javax.persistence.Table(name = "WorkOrderRouting", schema = "Production", uniqueConstraints = {
	@javax.persistence.UniqueConstraint(columnNames = {"WorkOrderID", "ProductID", "OperationSequence"})
})
public class WorkOrderRouting extends org.jooq.impl.UpdatableRecordImpl<org.jooq.examples.sqlserver.adventureworks.production.tables.records.WorkOrderRouting> {

	private static final long serialVersionUID = -2138758610;

	/**
	 * The table column <code>Production.WorkOrderRouting.WorkOrderID</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT FK_WorkOrderRouting_WorkOrder_WorkOrderID
	 * FOREIGN KEY (WorkOrderID)
	 * REFERENCES Production.WorkOrder (WorkOrderID)
	 * </pre></code>
	 */
	public void setWorkOrderID(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.WorkOrderRouting.WorkOrderRouting.WorkOrderID, value);
	}

	/**
	 * The table column <code>Production.WorkOrderRouting.WorkOrderID</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT FK_WorkOrderRouting_WorkOrder_WorkOrderID
	 * FOREIGN KEY (WorkOrderID)
	 * REFERENCES Production.WorkOrder (WorkOrderID)
	 * </pre></code>
	 */
	@javax.persistence.Column(name = "WorkOrderID", nullable = false, precision = 10)
	public java.lang.Integer getWorkOrderID() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.WorkOrderRouting.WorkOrderRouting.WorkOrderID);
	}

	/**
	 * The table column <code>Production.WorkOrderRouting.ProductID</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public void setProductID(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.WorkOrderRouting.WorkOrderRouting.ProductID, value);
	}

	/**
	 * The table column <code>Production.WorkOrderRouting.ProductID</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	@javax.persistence.Column(name = "ProductID", nullable = false, precision = 10)
	public java.lang.Integer getProductID() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.WorkOrderRouting.WorkOrderRouting.ProductID);
	}

	/**
	 * The table column <code>Production.WorkOrderRouting.OperationSequence</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public void setOperationSequence(java.lang.Short value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.WorkOrderRouting.WorkOrderRouting.OperationSequence, value);
	}

	/**
	 * The table column <code>Production.WorkOrderRouting.OperationSequence</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	@javax.persistence.Column(name = "OperationSequence", nullable = false, precision = 5)
	public java.lang.Short getOperationSequence() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.WorkOrderRouting.WorkOrderRouting.OperationSequence);
	}

	/**
	 * The table column <code>Production.WorkOrderRouting.LocationID</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT FK_WorkOrderRouting_Location_LocationID
	 * FOREIGN KEY (LocationID)
	 * REFERENCES Production.Location (LocationID)
	 * </pre></code>
	 */
	public void setLocationID(java.lang.Short value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.WorkOrderRouting.WorkOrderRouting.LocationID, value);
	}

	/**
	 * The table column <code>Production.WorkOrderRouting.LocationID</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT FK_WorkOrderRouting_Location_LocationID
	 * FOREIGN KEY (LocationID)
	 * REFERENCES Production.Location (LocationID)
	 * </pre></code>
	 */
	@javax.persistence.Column(name = "LocationID", nullable = false, precision = 5)
	public java.lang.Short getLocationID() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.WorkOrderRouting.WorkOrderRouting.LocationID);
	}

	/**
	 * The table column <code>Production.WorkOrderRouting.ScheduledStartDate</code>
	 */
	public void setScheduledStartDate(java.sql.Timestamp value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.WorkOrderRouting.WorkOrderRouting.ScheduledStartDate, value);
	}

	/**
	 * The table column <code>Production.WorkOrderRouting.ScheduledStartDate</code>
	 */
	@javax.persistence.Column(name = "ScheduledStartDate", nullable = false)
	public java.sql.Timestamp getScheduledStartDate() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.WorkOrderRouting.WorkOrderRouting.ScheduledStartDate);
	}

	/**
	 * The table column <code>Production.WorkOrderRouting.ScheduledEndDate</code>
	 */
	public void setScheduledEndDate(java.sql.Timestamp value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.WorkOrderRouting.WorkOrderRouting.ScheduledEndDate, value);
	}

	/**
	 * The table column <code>Production.WorkOrderRouting.ScheduledEndDate</code>
	 */
	@javax.persistence.Column(name = "ScheduledEndDate", nullable = false)
	public java.sql.Timestamp getScheduledEndDate() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.WorkOrderRouting.WorkOrderRouting.ScheduledEndDate);
	}

	/**
	 * The table column <code>Production.WorkOrderRouting.ActualStartDate</code>
	 */
	public void setActualStartDate(java.sql.Timestamp value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.WorkOrderRouting.WorkOrderRouting.ActualStartDate, value);
	}

	/**
	 * The table column <code>Production.WorkOrderRouting.ActualStartDate</code>
	 */
	@javax.persistence.Column(name = "ActualStartDate")
	public java.sql.Timestamp getActualStartDate() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.WorkOrderRouting.WorkOrderRouting.ActualStartDate);
	}

	/**
	 * The table column <code>Production.WorkOrderRouting.ActualEndDate</code>
	 */
	public void setActualEndDate(java.sql.Timestamp value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.WorkOrderRouting.WorkOrderRouting.ActualEndDate, value);
	}

	/**
	 * The table column <code>Production.WorkOrderRouting.ActualEndDate</code>
	 */
	@javax.persistence.Column(name = "ActualEndDate")
	public java.sql.Timestamp getActualEndDate() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.WorkOrderRouting.WorkOrderRouting.ActualEndDate);
	}

	/**
	 * The table column <code>Production.WorkOrderRouting.ActualResourceHrs</code>
	 */
	public void setActualResourceHrs(java.math.BigDecimal value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.WorkOrderRouting.WorkOrderRouting.ActualResourceHrs, value);
	}

	/**
	 * The table column <code>Production.WorkOrderRouting.ActualResourceHrs</code>
	 */
	@javax.persistence.Column(name = "ActualResourceHrs", precision = 9, scale = 4)
	public java.math.BigDecimal getActualResourceHrs() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.WorkOrderRouting.WorkOrderRouting.ActualResourceHrs);
	}

	/**
	 * The table column <code>Production.WorkOrderRouting.PlannedCost</code>
	 */
	public void setPlannedCost(java.math.BigDecimal value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.WorkOrderRouting.WorkOrderRouting.PlannedCost, value);
	}

	/**
	 * The table column <code>Production.WorkOrderRouting.PlannedCost</code>
	 */
	@javax.persistence.Column(name = "PlannedCost", nullable = false, precision = 19, scale = 4)
	public java.math.BigDecimal getPlannedCost() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.WorkOrderRouting.WorkOrderRouting.PlannedCost);
	}

	/**
	 * The table column <code>Production.WorkOrderRouting.ActualCost</code>
	 */
	public void setActualCost(java.math.BigDecimal value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.WorkOrderRouting.WorkOrderRouting.ActualCost, value);
	}

	/**
	 * The table column <code>Production.WorkOrderRouting.ActualCost</code>
	 */
	@javax.persistence.Column(name = "ActualCost", precision = 19, scale = 4)
	public java.math.BigDecimal getActualCost() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.WorkOrderRouting.WorkOrderRouting.ActualCost);
	}

	/**
	 * The table column <code>Production.WorkOrderRouting.ModifiedDate</code>
	 */
	public void setModifiedDate(java.sql.Timestamp value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.WorkOrderRouting.WorkOrderRouting.ModifiedDate, value);
	}

	/**
	 * The table column <code>Production.WorkOrderRouting.ModifiedDate</code>
	 */
	@javax.persistence.Column(name = "ModifiedDate", nullable = false)
	public java.sql.Timestamp getModifiedDate() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.WorkOrderRouting.WorkOrderRouting.ModifiedDate);
	}

	/**
	 * Create a detached WorkOrderRouting
	 */
	public WorkOrderRouting() {
		super(org.jooq.examples.sqlserver.adventureworks.production.tables.WorkOrderRouting.WorkOrderRouting);
	}
}
