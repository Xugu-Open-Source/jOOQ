/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.multi_schema.tables.daos;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked" })
public class TBookSaleDao extends org.jooq.impl.DAOImpl<org.jooq.test.oracle.generatedclasses.multi_schema.tables.records.TBookSaleRecord, org.jooq.test.oracle.generatedclasses.multi_schema.tables.pojos.TBookSale, java.lang.Integer> {

	/**
	 * Create a new TBookSaleDao without any factory
	 */
	public TBookSaleDao() {
		super(org.jooq.test.oracle.generatedclasses.multi_schema.tables.TBookSale.T_BOOK_SALE, org.jooq.test.oracle.generatedclasses.multi_schema.tables.pojos.TBookSale.class);
	}

	/**
	 * Create a new TBookSaleDao with an attached factory
	 */
	public TBookSaleDao(org.jooq.impl.Executor factory) {
		super(org.jooq.test.oracle.generatedclasses.multi_schema.tables.TBookSale.T_BOOK_SALE, org.jooq.test.oracle.generatedclasses.multi_schema.tables.pojos.TBookSale.class, factory);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected java.lang.Integer getId(org.jooq.test.oracle.generatedclasses.multi_schema.tables.pojos.TBookSale object) {
		return object.getId();
	}

	/**
	 * Fetch records that have <code>ID IN (values)</code>
	 */
	public java.util.List<org.jooq.test.oracle.generatedclasses.multi_schema.tables.pojos.TBookSale> fetchById(java.lang.Integer... values) {
		return fetch(org.jooq.test.oracle.generatedclasses.multi_schema.tables.TBookSale.T_BOOK_SALE.ID, values);
	}

	/**
	 * Fetch a unique record that has <code>ID = value</code>
	 */
	public org.jooq.test.oracle.generatedclasses.multi_schema.tables.pojos.TBookSale fetchOneById(java.lang.Integer value) {
		return fetchOne(org.jooq.test.oracle.generatedclasses.multi_schema.tables.TBookSale.T_BOOK_SALE.ID, value);
	}

	/**
	 * Fetch records that have <code>BOOK_ID IN (values)</code>
	 */
	public java.util.List<org.jooq.test.oracle.generatedclasses.multi_schema.tables.pojos.TBookSale> fetchByBookId(java.lang.Integer... values) {
		return fetch(org.jooq.test.oracle.generatedclasses.multi_schema.tables.TBookSale.T_BOOK_SALE.BOOK_ID, values);
	}

	/**
	 * Fetch records that have <code>BOOK_STORE_NAME IN (values)</code>
	 */
	public java.util.List<org.jooq.test.oracle.generatedclasses.multi_schema.tables.pojos.TBookSale> fetchByBookStoreName(java.lang.String... values) {
		return fetch(org.jooq.test.oracle.generatedclasses.multi_schema.tables.TBookSale.T_BOOK_SALE.BOOK_STORE_NAME, values);
	}

	/**
	 * Fetch records that have <code>SOLD_AT IN (values)</code>
	 */
	public java.util.List<org.jooq.test.oracle.generatedclasses.multi_schema.tables.pojos.TBookSale> fetchBySoldAt(java.sql.Date... values) {
		return fetch(org.jooq.test.oracle.generatedclasses.multi_schema.tables.TBookSale.T_BOOK_SALE.SOLD_AT, values);
	}

	/**
	 * Fetch records that have <code>SOLD_FOR IN (values)</code>
	 */
	public java.util.List<org.jooq.test.oracle.generatedclasses.multi_schema.tables.pojos.TBookSale> fetchBySoldFor(java.math.BigDecimal... values) {
		return fetch(org.jooq.test.oracle.generatedclasses.multi_schema.tables.TBookSale.T_BOOK_SALE.SOLD_FOR, values);
	}
}
