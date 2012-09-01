/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.sales.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
@javax.persistence.Entity
@javax.persistence.Table(name = "CurrencyRate", schema = "Sales")
public class CurrencyRate extends org.jooq.impl.UpdatableRecordImpl<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.CurrencyRate> {

	private static final long serialVersionUID = 1027890738;

	/**
	 * The table column <code>Sales.CurrencyRate.CurrencyRateID</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public void setCurrencyRateID(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.CurrencyRate.CurrencyRate.CurrencyRateID, value);
	}

	/**
	 * The table column <code>Sales.CurrencyRate.CurrencyRateID</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "CurrencyRateID", unique = true, nullable = false, precision = 10)
	public java.lang.Integer getCurrencyRateID() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.CurrencyRate.CurrencyRate.CurrencyRateID);
	}

	/**
	 * The table column <code>Sales.CurrencyRate.CurrencyRateDate</code>
	 */
	public void setCurrencyRateDate(java.sql.Timestamp value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.CurrencyRate.CurrencyRate.CurrencyRateDate, value);
	}

	/**
	 * The table column <code>Sales.CurrencyRate.CurrencyRateDate</code>
	 */
	@javax.persistence.Column(name = "CurrencyRateDate", nullable = false)
	public java.sql.Timestamp getCurrencyRateDate() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.CurrencyRate.CurrencyRate.CurrencyRateDate);
	}

	/**
	 * The table column <code>Sales.CurrencyRate.FromCurrencyCode</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT FK_CurrencyRate_Currency_FromCurrencyCode
	 * FOREIGN KEY (FromCurrencyCode)
	 * REFERENCES Sales.Currency (CurrencyCode)
	 * </pre></code>
	 */
	public void setFromCurrencyCode(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.CurrencyRate.CurrencyRate.FromCurrencyCode, value);
	}

	/**
	 * The table column <code>Sales.CurrencyRate.FromCurrencyCode</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT FK_CurrencyRate_Currency_FromCurrencyCode
	 * FOREIGN KEY (FromCurrencyCode)
	 * REFERENCES Sales.Currency (CurrencyCode)
	 * </pre></code>
	 */
	@javax.persistence.Column(name = "FromCurrencyCode", nullable = false, length = 3)
	public java.lang.String getFromCurrencyCode() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.CurrencyRate.CurrencyRate.FromCurrencyCode);
	}

	/**
	 * The table column <code>Sales.CurrencyRate.ToCurrencyCode</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT FK_CurrencyRate_Currency_ToCurrencyCode
	 * FOREIGN KEY (ToCurrencyCode)
	 * REFERENCES Sales.Currency (CurrencyCode)
	 * </pre></code>
	 */
	public void setToCurrencyCode(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.CurrencyRate.CurrencyRate.ToCurrencyCode, value);
	}

	/**
	 * The table column <code>Sales.CurrencyRate.ToCurrencyCode</code>
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT FK_CurrencyRate_Currency_ToCurrencyCode
	 * FOREIGN KEY (ToCurrencyCode)
	 * REFERENCES Sales.Currency (CurrencyCode)
	 * </pre></code>
	 */
	@javax.persistence.Column(name = "ToCurrencyCode", nullable = false, length = 3)
	public java.lang.String getToCurrencyCode() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.CurrencyRate.CurrencyRate.ToCurrencyCode);
	}

	/**
	 * The table column <code>Sales.CurrencyRate.AverageRate</code>
	 */
	public void setAverageRate(java.math.BigDecimal value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.CurrencyRate.CurrencyRate.AverageRate, value);
	}

	/**
	 * The table column <code>Sales.CurrencyRate.AverageRate</code>
	 */
	@javax.persistence.Column(name = "AverageRate", nullable = false, precision = 19, scale = 4)
	public java.math.BigDecimal getAverageRate() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.CurrencyRate.CurrencyRate.AverageRate);
	}

	/**
	 * The table column <code>Sales.CurrencyRate.EndOfDayRate</code>
	 */
	public void setEndOfDayRate(java.math.BigDecimal value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.CurrencyRate.CurrencyRate.EndOfDayRate, value);
	}

	/**
	 * The table column <code>Sales.CurrencyRate.EndOfDayRate</code>
	 */
	@javax.persistence.Column(name = "EndOfDayRate", nullable = false, precision = 19, scale = 4)
	public java.math.BigDecimal getEndOfDayRate() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.CurrencyRate.CurrencyRate.EndOfDayRate);
	}

	/**
	 * The table column <code>Sales.CurrencyRate.ModifiedDate</code>
	 */
	public void setModifiedDate(java.sql.Timestamp value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.CurrencyRate.CurrencyRate.ModifiedDate, value);
	}

	/**
	 * The table column <code>Sales.CurrencyRate.ModifiedDate</code>
	 */
	@javax.persistence.Column(name = "ModifiedDate", nullable = false)
	public java.sql.Timestamp getModifiedDate() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.sales.tables.CurrencyRate.CurrencyRate.ModifiedDate);
	}

	/**
	 * Create a detached CurrencyRate
	 */
	public CurrencyRate() {
		super(org.jooq.examples.sqlserver.adventureworks.sales.tables.CurrencyRate.CurrencyRate);
	}
}
