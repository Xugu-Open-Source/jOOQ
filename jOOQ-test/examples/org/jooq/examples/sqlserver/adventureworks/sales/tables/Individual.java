/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.sales.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class Individual extends org.jooq.impl.UpdatableTableImpl<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.Individual> {

	private static final long serialVersionUID = -170745494;

	/**
	 * The singleton instance of <code>Sales.Individual</code>
	 */
	public static final org.jooq.examples.sqlserver.adventureworks.sales.tables.Individual Individual = new org.jooq.examples.sqlserver.adventureworks.sales.tables.Individual();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.Individual> getRecordType() {
		return org.jooq.examples.sqlserver.adventureworks.sales.tables.records.Individual.class;
	}

	/**
	 * The column <code>Sales.Individual.CustomerID</code>.
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.Individual, java.lang.Integer> CustomerID = createField("CustomerID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>Sales.Individual.ContactID</code>.
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.Individual, java.lang.Integer> ContactID = createField("ContactID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>Sales.Individual.Demographics</code>.
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.Individual, java.lang.Object> Demographics = createField("Demographics", org.jooq.impl.DefaultDataType.getDefaultDataType("xml"), this);

	/**
	 * The column <code>Sales.Individual.ModifiedDate</code>.
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.Individual, java.sql.Timestamp> ModifiedDate = createField("ModifiedDate", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * Create a <code>Sales.Individual</code> table reference
	 */
	public Individual() {
		super("Individual", org.jooq.examples.sqlserver.adventureworks.sales.Sales.Sales);
	}

	/**
	 * Create an aliased <code>Sales.Individual</code> table reference
	 */
	public Individual(java.lang.String alias) {
		super(alias, org.jooq.examples.sqlserver.adventureworks.sales.Sales.Sales, org.jooq.examples.sqlserver.adventureworks.sales.tables.Individual.Individual);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.Individual> getMainKey() {
		return org.jooq.examples.sqlserver.adventureworks.sales.Keys.PK_Individual_CustomerID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.Individual>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.Individual>>asList(org.jooq.examples.sqlserver.adventureworks.sales.Keys.PK_Individual_CustomerID);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.Individual, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.examples.sqlserver.adventureworks.sales.tables.records.Individual, ?>>asList(org.jooq.examples.sqlserver.adventureworks.sales.Keys.FK_Individual_Customer_CustomerID, org.jooq.examples.sqlserver.adventureworks.sales.Keys.FK_Individual_Contact_ContactID);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.examples.sqlserver.adventureworks.sales.tables.Individual as(java.lang.String alias) {
		return new org.jooq.examples.sqlserver.adventureworks.sales.tables.Individual(alias);
	}
}
