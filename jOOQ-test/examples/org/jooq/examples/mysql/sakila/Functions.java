/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.mysql.sakila;

/**
 * This class is generated by jOOQ.
 *
 * Convenience access to all stored functions in sakila
 */
@javax.annotation.Generated(value    = "http://www.jooq.org",
                            comments = "This class is generated by jOOQ")
public final class Functions {

	/**
	 * Invoke GET_CUSTOMER_BALANCE
	 *
	 * @param pCustomerId
	 * @param pEffectiveDate
	 */
	public static java.math.BigDecimal getCustomerBalance(org.jooq.Configuration configuration, java.lang.Integer pCustomerId, java.sql.Timestamp pEffectiveDate) throws java.sql.SQLException {
		org.jooq.examples.mysql.sakila.functions.GetCustomerBalance f = new org.jooq.examples.mysql.sakila.functions.GetCustomerBalance();
		f.setPCustomerId(pCustomerId);
		f.setPEffectiveDate(pEffectiveDate);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get GET_CUSTOMER_BALANCE as a field
	 *
	 * @param pCustomerId
	 * @param pEffectiveDate
	 */
	public static org.jooq.Field<java.math.BigDecimal> getCustomerBalance(java.lang.Integer pCustomerId, java.sql.Timestamp pEffectiveDate) {
		org.jooq.examples.mysql.sakila.functions.GetCustomerBalance f = new org.jooq.examples.mysql.sakila.functions.GetCustomerBalance();
		f.setPCustomerId(pCustomerId);
		f.setPEffectiveDate(pEffectiveDate);

		return f.asField();
	}

	/**
	 * Get GET_CUSTOMER_BALANCE as a field
	 *
	 * @param pCustomerId
	 * @param pEffectiveDate
	 */
	public static org.jooq.Field<java.math.BigDecimal> getCustomerBalance(org.jooq.Field<java.lang.Integer> pCustomerId, org.jooq.Field<java.sql.Timestamp> pEffectiveDate) {
		org.jooq.examples.mysql.sakila.functions.GetCustomerBalance f = new org.jooq.examples.mysql.sakila.functions.GetCustomerBalance();
		f.setPCustomerId(pCustomerId);
		f.setPEffectiveDate(pEffectiveDate);

		return f.asField();
	}

	/**
	 * Invoke INVENTORY_HELD_BY_CUSTOMER
	 *
	 * @param pInventoryId
	 */
	public static java.lang.Integer inventoryHeldByCustomer(org.jooq.Configuration configuration, java.lang.Integer pInventoryId) throws java.sql.SQLException {
		org.jooq.examples.mysql.sakila.functions.InventoryHeldByCustomer f = new org.jooq.examples.mysql.sakila.functions.InventoryHeldByCustomer();
		f.setPInventoryId(pInventoryId);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get INVENTORY_HELD_BY_CUSTOMER as a field
	 *
	 * @param pInventoryId
	 */
	public static org.jooq.Field<java.lang.Integer> inventoryHeldByCustomer(java.lang.Integer pInventoryId) {
		org.jooq.examples.mysql.sakila.functions.InventoryHeldByCustomer f = new org.jooq.examples.mysql.sakila.functions.InventoryHeldByCustomer();
		f.setPInventoryId(pInventoryId);

		return f.asField();
	}

	/**
	 * Get INVENTORY_HELD_BY_CUSTOMER as a field
	 *
	 * @param pInventoryId
	 */
	public static org.jooq.Field<java.lang.Integer> inventoryHeldByCustomer(org.jooq.Field<java.lang.Integer> pInventoryId) {
		org.jooq.examples.mysql.sakila.functions.InventoryHeldByCustomer f = new org.jooq.examples.mysql.sakila.functions.InventoryHeldByCustomer();
		f.setPInventoryId(pInventoryId);

		return f.asField();
	}

	/**
	 * Invoke INVENTORY_IN_STOCK
	 *
	 * @param pInventoryId
	 */
	public static java.lang.Byte inventoryInStock(org.jooq.Configuration configuration, java.lang.Integer pInventoryId) throws java.sql.SQLException {
		org.jooq.examples.mysql.sakila.functions.InventoryInStock f = new org.jooq.examples.mysql.sakila.functions.InventoryInStock();
		f.setPInventoryId(pInventoryId);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get INVENTORY_IN_STOCK as a field
	 *
	 * @param pInventoryId
	 */
	public static org.jooq.Field<java.lang.Byte> inventoryInStock(java.lang.Integer pInventoryId) {
		org.jooq.examples.mysql.sakila.functions.InventoryInStock f = new org.jooq.examples.mysql.sakila.functions.InventoryInStock();
		f.setPInventoryId(pInventoryId);

		return f.asField();
	}

	/**
	 * Get INVENTORY_IN_STOCK as a field
	 *
	 * @param pInventoryId
	 */
	public static org.jooq.Field<java.lang.Byte> inventoryInStock(org.jooq.Field<java.lang.Integer> pInventoryId) {
		org.jooq.examples.mysql.sakila.functions.InventoryInStock f = new org.jooq.examples.mysql.sakila.functions.InventoryInStock();
		f.setPInventoryId(pInventoryId);

		return f.asField();
	}

	/**
	 * No instances
	 */
	private Functions() {}
}
