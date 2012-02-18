/**
 * This class is generated by jOOQ
 */
package org.jooq.test.postgres.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
public class TBookToBookStore extends org.jooq.impl.UpdatableTableImpl<org.jooq.test.postgres.generatedclasses.tables.records.TBookToBookStoreRecord> {

	private static final long serialVersionUID = -647448628;

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
	 * CONSTRAINT t_book_to_book_store__fk_b2bs_bs_name
	 * FOREIGN KEY (book_store_name)
	 * REFERENCES public.t_book_store (name)
	 * </pre></code>
	 */
	public final org.jooq.TableField<org.jooq.test.postgres.generatedclasses.tables.records.TBookToBookStoreRecord, java.lang.String> BOOK_STORE_NAME = createField("book_store_name", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * CONSTRAINT t_book_to_book_store__fk_b2bs_b_id
	 * FOREIGN KEY (book_id)
	 * REFERENCES public.t_book (id)
	 * </pre></code>
	 */
	public final org.jooq.TableField<org.jooq.test.postgres.generatedclasses.tables.records.TBookToBookStoreRecord, java.lang.Integer> BOOK_ID = createField("book_id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.test.postgres.generatedclasses.tables.records.TBookToBookStoreRecord, java.lang.Integer> STOCK = createField("stock", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * No further instances allowed
	 */
	private TBookToBookStore() {
		super("t_book_to_book_store", org.jooq.test.postgres.generatedclasses.Public.PUBLIC);
	}

	/**
	 * No further instances allowed
	 */
	private TBookToBookStore(java.lang.String alias) {
		super(alias, org.jooq.test.postgres.generatedclasses.Public.PUBLIC, org.jooq.test.postgres.generatedclasses.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE);
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.test.postgres.generatedclasses.tables.records.TBookToBookStoreRecord> getMainKey() {
		return org.jooq.test.postgres.generatedclasses.Keys.PK_B2BS;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.postgres.generatedclasses.tables.records.TBookToBookStoreRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.postgres.generatedclasses.tables.records.TBookToBookStoreRecord>>asList(org.jooq.test.postgres.generatedclasses.Keys.PK_B2BS);
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.ForeignKey<org.jooq.test.postgres.generatedclasses.tables.records.TBookToBookStoreRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.test.postgres.generatedclasses.tables.records.TBookToBookStoreRecord, ?>>asList(org.jooq.test.postgres.generatedclasses.Keys.T_BOOK_TO_BOOK_STORE__FK_B2BS_BS_NAME, org.jooq.test.postgres.generatedclasses.Keys.T_BOOK_TO_BOOK_STORE__FK_B2BS_B_ID);
	}

	@Override
	public org.jooq.test.postgres.generatedclasses.tables.TBookToBookStore as(java.lang.String alias) {
		return new org.jooq.test.postgres.generatedclasses.tables.TBookToBookStore(alias);
	}
}
