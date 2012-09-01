/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.production.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
@javax.persistence.Entity
@javax.persistence.Table(name = "TransactionHistoryArchive", schema = "Production")
public class TransactionHistoryArchive extends org.jooq.impl.UpdatableRecordImpl<org.jooq.examples.sqlserver.adventureworks.production.tables.records.TransactionHistoryArchive> {

	private static final long serialVersionUID = -906047125;

	/**
	 * The table column <code>Production.TransactionHistoryArchive.TransactionID</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public void setTransactionID(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.TransactionHistoryArchive.TransactionHistoryArchive.TransactionID, value);
	}

	/**
	 * The table column <code>Production.TransactionHistoryArchive.TransactionID</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "TransactionID", unique = true, nullable = false, precision = 10)
	public java.lang.Integer getTransactionID() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.TransactionHistoryArchive.TransactionHistoryArchive.TransactionID);
	}

	/**
	 * The table column <code>Production.TransactionHistoryArchive.ProductID</code>
	 */
	public void setProductID(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.TransactionHistoryArchive.TransactionHistoryArchive.ProductID, value);
	}

	/**
	 * The table column <code>Production.TransactionHistoryArchive.ProductID</code>
	 */
	@javax.persistence.Column(name = "ProductID", nullable = false, precision = 10)
	public java.lang.Integer getProductID() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.TransactionHistoryArchive.TransactionHistoryArchive.ProductID);
	}

	/**
	 * The table column <code>Production.TransactionHistoryArchive.ReferenceOrderID</code>
	 */
	public void setReferenceOrderID(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.TransactionHistoryArchive.TransactionHistoryArchive.ReferenceOrderID, value);
	}

	/**
	 * The table column <code>Production.TransactionHistoryArchive.ReferenceOrderID</code>
	 */
	@javax.persistence.Column(name = "ReferenceOrderID", nullable = false, precision = 10)
	public java.lang.Integer getReferenceOrderID() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.TransactionHistoryArchive.TransactionHistoryArchive.ReferenceOrderID);
	}

	/**
	 * The table column <code>Production.TransactionHistoryArchive.ReferenceOrderLineID</code>
	 */
	public void setReferenceOrderLineID(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.TransactionHistoryArchive.TransactionHistoryArchive.ReferenceOrderLineID, value);
	}

	/**
	 * The table column <code>Production.TransactionHistoryArchive.ReferenceOrderLineID</code>
	 */
	@javax.persistence.Column(name = "ReferenceOrderLineID", nullable = false, precision = 10)
	public java.lang.Integer getReferenceOrderLineID() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.TransactionHistoryArchive.TransactionHistoryArchive.ReferenceOrderLineID);
	}

	/**
	 * The table column <code>Production.TransactionHistoryArchive.TransactionDate</code>
	 */
	public void setTransactionDate(java.sql.Timestamp value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.TransactionHistoryArchive.TransactionHistoryArchive.TransactionDate, value);
	}

	/**
	 * The table column <code>Production.TransactionHistoryArchive.TransactionDate</code>
	 */
	@javax.persistence.Column(name = "TransactionDate", nullable = false)
	public java.sql.Timestamp getTransactionDate() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.TransactionHistoryArchive.TransactionHistoryArchive.TransactionDate);
	}

	/**
	 * The table column <code>Production.TransactionHistoryArchive.TransactionType</code>
	 */
	public void setTransactionType(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.TransactionHistoryArchive.TransactionHistoryArchive.TransactionType, value);
	}

	/**
	 * The table column <code>Production.TransactionHistoryArchive.TransactionType</code>
	 */
	@javax.persistence.Column(name = "TransactionType", nullable = false, length = 1)
	public java.lang.String getTransactionType() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.TransactionHistoryArchive.TransactionHistoryArchive.TransactionType);
	}

	/**
	 * The table column <code>Production.TransactionHistoryArchive.Quantity</code>
	 */
	public void setQuantity(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.TransactionHistoryArchive.TransactionHistoryArchive.Quantity, value);
	}

	/**
	 * The table column <code>Production.TransactionHistoryArchive.Quantity</code>
	 */
	@javax.persistence.Column(name = "Quantity", nullable = false, precision = 10)
	public java.lang.Integer getQuantity() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.TransactionHistoryArchive.TransactionHistoryArchive.Quantity);
	}

	/**
	 * The table column <code>Production.TransactionHistoryArchive.ActualCost</code>
	 */
	public void setActualCost(java.math.BigDecimal value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.TransactionHistoryArchive.TransactionHistoryArchive.ActualCost, value);
	}

	/**
	 * The table column <code>Production.TransactionHistoryArchive.ActualCost</code>
	 */
	@javax.persistence.Column(name = "ActualCost", nullable = false, precision = 19, scale = 4)
	public java.math.BigDecimal getActualCost() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.TransactionHistoryArchive.TransactionHistoryArchive.ActualCost);
	}

	/**
	 * The table column <code>Production.TransactionHistoryArchive.ModifiedDate</code>
	 */
	public void setModifiedDate(java.sql.Timestamp value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.TransactionHistoryArchive.TransactionHistoryArchive.ModifiedDate, value);
	}

	/**
	 * The table column <code>Production.TransactionHistoryArchive.ModifiedDate</code>
	 */
	@javax.persistence.Column(name = "ModifiedDate", nullable = false)
	public java.sql.Timestamp getModifiedDate() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.TransactionHistoryArchive.TransactionHistoryArchive.ModifiedDate);
	}

	/**
	 * Create a detached TransactionHistoryArchive
	 */
	public TransactionHistoryArchive() {
		super(org.jooq.examples.sqlserver.adventureworks.production.tables.TransactionHistoryArchive.TransactionHistoryArchive);
	}
}
