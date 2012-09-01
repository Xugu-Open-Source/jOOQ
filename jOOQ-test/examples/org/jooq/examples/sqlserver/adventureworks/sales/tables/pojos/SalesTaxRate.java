/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.sales.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
@javax.persistence.Entity
@javax.persistence.Table(name = "SalesTaxRate", schema = "Sales")
public class SalesTaxRate implements java.io.Serializable {

	private static final long serialVersionUID = -28085637;


	@javax.validation.constraints.NotNull
	private java.lang.Integer    SalesTaxRateID;

	@javax.validation.constraints.NotNull
	private java.lang.Integer    StateProvinceID;

	@javax.validation.constraints.NotNull
	private java.lang.Byte       TaxType;

	@javax.validation.constraints.NotNull
	private java.math.BigDecimal TaxRate;

	@javax.validation.constraints.NotNull
	@javax.validation.constraints.Size(max = 50)
	private java.lang.String     Name;

	@javax.validation.constraints.NotNull
	private java.lang.String     rowguid;

	@javax.validation.constraints.NotNull
	private java.sql.Timestamp   ModifiedDate;

	@javax.persistence.Id
	@javax.persistence.Column(name = "SalesTaxRateID", unique = true, nullable = false, precision = 10)
	public java.lang.Integer getSalesTaxRateID() {
		return this.SalesTaxRateID;
	}

	public void setSalesTaxRateID(java.lang.Integer SalesTaxRateID) {
		this.SalesTaxRateID = SalesTaxRateID;
	}

	@javax.persistence.Column(name = "StateProvinceID", nullable = false, precision = 10)
	public java.lang.Integer getStateProvinceID() {
		return this.StateProvinceID;
	}

	public void setStateProvinceID(java.lang.Integer StateProvinceID) {
		this.StateProvinceID = StateProvinceID;
	}

	@javax.persistence.Column(name = "TaxType", nullable = false, precision = 3)
	public java.lang.Byte getTaxType() {
		return this.TaxType;
	}

	public void setTaxType(java.lang.Byte TaxType) {
		this.TaxType = TaxType;
	}

	@javax.persistence.Column(name = "TaxRate", nullable = false, precision = 10, scale = 4)
	public java.math.BigDecimal getTaxRate() {
		return this.TaxRate;
	}

	public void setTaxRate(java.math.BigDecimal TaxRate) {
		this.TaxRate = TaxRate;
	}

	@javax.persistence.Column(name = "Name", nullable = false, length = 50)
	public java.lang.String getName() {
		return this.Name;
	}

	public void setName(java.lang.String Name) {
		this.Name = Name;
	}

	@javax.persistence.Column(name = "rowguid", nullable = false)
	public java.lang.String getrowguid() {
		return this.rowguid;
	}

	public void setrowguid(java.lang.String rowguid) {
		this.rowguid = rowguid;
	}

	@javax.persistence.Column(name = "ModifiedDate", nullable = false)
	public java.sql.Timestamp getModifiedDate() {
		return this.ModifiedDate;
	}

	public void setModifiedDate(java.sql.Timestamp ModifiedDate) {
		this.ModifiedDate = ModifiedDate;
	}
}
