/**
 * This class is generated by jOOQ
 */
package org.jooq.test.mysql2.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 *
 * An m:n relation between books and book stores
 */
@java.lang.SuppressWarnings("all")
@javax.persistence.Entity
@javax.persistence.Table(name = "t_book_to_book_store", schema = "test2", uniqueConstraints = {
	@javax.persistence.UniqueConstraint(columnNames = {"book_store_name", "book_id"})
})
public class TBookToBookStoreRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.mysql2.generatedclasses.tables.records.TBookToBookStoreRecord> implements org.jooq.Record3<java.lang.String, java.lang.Integer, java.lang.Integer> {

	private static final long serialVersionUID = -373407959;

	/**
	 * Setter for <code>test2.t_book_to_book_store.book_store_name</code>. The book store name
	 */
	public void setBookStoreName(java.lang.String value) {
		setValue(org.jooq.test.mysql2.generatedclasses.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE.BOOK_STORE_NAME, value);
	}

	/**
	 * Getter for <code>test2.t_book_to_book_store.book_store_name</code>. The book store name
	 */
	@javax.persistence.Column(name = "book_store_name", nullable = false, length = 400)
	public java.lang.String getBookStoreName() {
		return getValue(org.jooq.test.mysql2.generatedclasses.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE.BOOK_STORE_NAME);
	}

	/**
	 * Setter for <code>test2.t_book_to_book_store.book_id</code>. The book ID
	 */
	public void setBookId(java.lang.Integer value) {
		setValue(org.jooq.test.mysql2.generatedclasses.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE.BOOK_ID, value);
	}

	/**
	 * Getter for <code>test2.t_book_to_book_store.book_id</code>. The book ID
	 */
	@javax.persistence.Column(name = "book_id", nullable = false, precision = 10)
	public java.lang.Integer getBookId() {
		return getValue(org.jooq.test.mysql2.generatedclasses.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE.BOOK_ID);
	}

	/**
	 * Setter for <code>test2.t_book_to_book_store.stock</code>. The number of books on stock
	 */
	public void setStock(java.lang.Integer value) {
		setValue(org.jooq.test.mysql2.generatedclasses.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE.STOCK, value);
	}

	/**
	 * Getter for <code>test2.t_book_to_book_store.stock</code>. The number of books on stock
	 */
	@javax.persistence.Column(name = "stock", precision = 10)
	public java.lang.Integer getStock() {
		return getValue(org.jooq.test.mysql2.generatedclasses.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE.STOCK);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record2<java.lang.String, java.lang.Integer> key() {
		return (org.jooq.Record2) super.key();
	}

	// -------------------------------------------------------------------------
	// Record3 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row3<java.lang.String, java.lang.Integer, java.lang.Integer> fieldsRow() {
		return org.jooq.impl.Factory.row(field1(), field2(), field3());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row3<java.lang.String, java.lang.Integer, java.lang.Integer> valuesRow() {
		return org.jooq.impl.Factory.row(value1(), value2(), value3());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field1() {
		return org.jooq.test.mysql2.generatedclasses.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE.BOOK_STORE_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field2() {
		return org.jooq.test.mysql2.generatedclasses.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE.BOOK_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field3() {
		return org.jooq.test.mysql2.generatedclasses.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE.STOCK;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value1() {
		return getBookStoreName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value2() {
		return getBookId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value3() {
		return getStock();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached TBookToBookStoreRecord
	 */
	public TBookToBookStoreRecord() {
		super(org.jooq.test.mysql2.generatedclasses.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE);
	}
}
