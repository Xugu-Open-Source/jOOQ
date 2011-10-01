/**
 * This class is generated by jOOQ
 */
package org.jooq.test.postgres.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = "http://www.jooq.org",
                            comments = "This class is generated by jOOQ")
public class TBookToBookStore extends org.jooq.impl.UpdatableTableImpl<org.jooq.test.postgres.generatedclasses.tables.records.TBookToBookStoreRecord> {

	private static final long serialVersionUID = 492327282;

	/**
	 * The singleton instance of t_book_to_book_store
	 */
	public static final org.jooq.test.postgres.generatedclasses.tables.TBookToBookStore T_BOOK_TO_BOOK_STORE = new org.jooq.test.postgres.generatedclasses.tables.TBookToBookStore();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.test.postgres.generatedclasses.tables.records.TBookToBookStoreRecord> __RECORD_TYPE = org.jooq.test.postgres.generatedclasses.tables.records.TBookToBookStoreRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.postgres.generatedclasses.tables.records.TBookToBookStoreRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [public.t_book_to_book_store.book_store_name]
	 * REFERENCES t_book_store [public.t_book_store.name]
	 * </pre></code>
	 */
	public static final org.jooq.TableField<org.jooq.test.postgres.generatedclasses.tables.records.TBookToBookStoreRecord, java.lang.String> BOOK_STORE_NAME = new org.jooq.impl.TableFieldImpl<org.jooq.test.postgres.generatedclasses.tables.records.TBookToBookStoreRecord, java.lang.String>("book_store_name", org.jooq.impl.SQLDataType.VARCHAR, T_BOOK_TO_BOOK_STORE);

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [public.t_book_to_book_store.book_id]
	 * REFERENCES t_book [public.t_book.id]
	 * </pre></code>
	 */
	public static final org.jooq.TableField<org.jooq.test.postgres.generatedclasses.tables.records.TBookToBookStoreRecord, java.lang.Integer> BOOK_ID = new org.jooq.impl.TableFieldImpl<org.jooq.test.postgres.generatedclasses.tables.records.TBookToBookStoreRecord, java.lang.Integer>("book_id", org.jooq.impl.SQLDataType.INTEGER, T_BOOK_TO_BOOK_STORE);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.postgres.generatedclasses.tables.records.TBookToBookStoreRecord, java.lang.Integer> STOCK = new org.jooq.impl.TableFieldImpl<org.jooq.test.postgres.generatedclasses.tables.records.TBookToBookStoreRecord, java.lang.Integer>("stock", org.jooq.impl.SQLDataType.INTEGER, T_BOOK_TO_BOOK_STORE);

	/**
	 * No further instances allowed
	 */
	private TBookToBookStore() {
		super("t_book_to_book_store", org.jooq.test.postgres.generatedclasses.Public.PUBLIC);
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.test.postgres.generatedclasses.tables.records.TBookToBookStoreRecord> getMainKey() {
		return org.jooq.test.postgres.generatedclasses.Keys.pk_b2bs;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.postgres.generatedclasses.tables.records.TBookToBookStoreRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.postgres.generatedclasses.tables.records.TBookToBookStoreRecord>>asList(org.jooq.test.postgres.generatedclasses.Keys.pk_b2bs);
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.ForeignKey<org.jooq.test.postgres.generatedclasses.tables.records.TBookToBookStoreRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.test.postgres.generatedclasses.tables.records.TBookToBookStoreRecord, ?>>asList(org.jooq.test.postgres.generatedclasses.Keys.fk_b2bs_bs_name, org.jooq.test.postgres.generatedclasses.Keys.fk_b2bs_b_id);
	}
}
