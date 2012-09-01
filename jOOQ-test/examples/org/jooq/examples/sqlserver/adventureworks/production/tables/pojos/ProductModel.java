/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.production.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
@javax.persistence.Entity
@javax.persistence.Table(name = "ProductModel", schema = "Production")
public class ProductModel implements java.io.Serializable {

	private static final long serialVersionUID = 422121931;


	@javax.validation.constraints.NotNull
	private java.lang.Integer  ProductModelID;

	@javax.validation.constraints.NotNull
	@javax.validation.constraints.Size(max = 50)
	private java.lang.String   Name;
	private java.lang.Object   CatalogDescription;
	private java.lang.Object   Instructions;

	@javax.validation.constraints.NotNull
	private java.lang.String   rowguid;

	@javax.validation.constraints.NotNull
	private java.sql.Timestamp ModifiedDate;

	@javax.persistence.Id
	@javax.persistence.Column(name = "ProductModelID", unique = true, nullable = false, precision = 10)
	public java.lang.Integer getProductModelID() {
		return this.ProductModelID;
	}

	public void setProductModelID(java.lang.Integer ProductModelID) {
		this.ProductModelID = ProductModelID;
	}

	@javax.persistence.Column(name = "Name", nullable = false, length = 50)
	public java.lang.String getName() {
		return this.Name;
	}

	public void setName(java.lang.String Name) {
		this.Name = Name;
	}

	@javax.persistence.Column(name = "CatalogDescription")
	public java.lang.Object getCatalogDescription() {
		return this.CatalogDescription;
	}

	public void setCatalogDescription(java.lang.Object CatalogDescription) {
		this.CatalogDescription = CatalogDescription;
	}

	@javax.persistence.Column(name = "Instructions")
	public java.lang.Object getInstructions() {
		return this.Instructions;
	}

	public void setInstructions(java.lang.Object Instructions) {
		this.Instructions = Instructions;
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
