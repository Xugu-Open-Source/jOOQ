/**
 * This class is generated by jOOQ
 */
package org.jooq.test.sqlite.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class TBookStoreRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.sqlite.generatedclasses.tables.records.TBookStoreRecord> {

	private static final long serialVersionUID = -1340764778;

	/**
	 * The table column <code>t_book_store.name</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public void setName(java.lang.String value) {
		setValue(org.jooq.test.sqlite.generatedclasses.tables.TBookStore.NAME, value);
	}

	/**
	 * The table column <code>t_book_store.name</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public java.lang.String getName() {
		return getValue(org.jooq.test.sqlite.generatedclasses.tables.TBookStore.NAME);
	}

	/**
	 * The table column <code>t_book_store.name</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public java.util.List<org.jooq.test.sqlite.generatedclasses.tables.records.TBookToBookStoreRecord> fetchTBookToBookStoreList() {
		return create()
			.selectFrom(org.jooq.test.sqlite.generatedclasses.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE)
			.where(org.jooq.test.sqlite.generatedclasses.tables.TBookToBookStore.BOOK_STORE_NAME.equal(getValue(org.jooq.test.sqlite.generatedclasses.tables.TBookStore.NAME)))
			.fetch();
	}

	/**
	 * Create a detached TBookStoreRecord
	 */
	public TBookStoreRecord() {
		super(org.jooq.test.sqlite.generatedclasses.tables.TBookStore.T_BOOK_STORE);
	}
}
