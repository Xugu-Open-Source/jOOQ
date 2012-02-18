/**
 * This class is generated by jOOQ
 */
package org.jooq.test.ase.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
public class TBookToBookStore extends org.jooq.impl.UpdatableTableImpl<org.jooq.test.ase.generatedclasses.tables.records.TBookToBookStoreRecord> {

	private static final long serialVersionUID = -864046311;

	/**
	 * The singleton instance of t_book_to_book_store
	 */
	public static final org.jooq.test.ase.generatedclasses.tables.TBookToBookStore T_BOOK_TO_BOOK_STORE = new org.jooq.test.ase.generatedclasses.tables.TBookToBookStore();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.test.ase.generatedclasses.tables.records.TBookToBookStoreRecord> __RECORD_TYPE = org.jooq.test.ase.generatedclasses.tables.records.TBookToBookStoreRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.ase.generatedclasses.tables.records.TBookToBookStoreRecord> getRecordType() {
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
	 * REFERENCES dbo.t_book_store (name)
	 * </pre></code>
	 */
	public static final org.jooq.TableField<org.jooq.test.ase.generatedclasses.tables.records.TBookToBookStoreRecord, java.lang.String> BOOK_STORE_NAME = createField("book_store_name", org.jooq.impl.SQLDataType.VARCHAR, T_BOOK_TO_BOOK_STORE);

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * CONSTRAINT t_book_to_book_store__fk_b2bs_b_id
	 * FOREIGN KEY (book_id)
	 * REFERENCES dbo.t_book (id)
	 * </pre></code>
	 */
	public static final org.jooq.TableField<org.jooq.test.ase.generatedclasses.tables.records.TBookToBookStoreRecord, java.lang.Integer> BOOK_ID = createField("book_id", org.jooq.impl.SQLDataType.INTEGER, T_BOOK_TO_BOOK_STORE);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.ase.generatedclasses.tables.records.TBookToBookStoreRecord, java.lang.Integer> STOCK = createField("stock", org.jooq.impl.SQLDataType.INTEGER, T_BOOK_TO_BOOK_STORE);

	/**
	 * No further instances allowed
	 */
	private TBookToBookStore() {
		super("t_book_to_book_store", org.jooq.test.ase.generatedclasses.Dbo.DBO);
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.test.ase.generatedclasses.tables.records.TBookToBookStoreRecord> getMainKey() {
		return org.jooq.test.ase.generatedclasses.Keys.T_BOOK_TO_BOOK_STORE__PK_B2BS;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.ase.generatedclasses.tables.records.TBookToBookStoreRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.ase.generatedclasses.tables.records.TBookToBookStoreRecord>>asList(org.jooq.test.ase.generatedclasses.Keys.T_BOOK_TO_BOOK_STORE__PK_B2BS);
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.ForeignKey<org.jooq.test.ase.generatedclasses.tables.records.TBookToBookStoreRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.test.ase.generatedclasses.tables.records.TBookToBookStoreRecord, ?>>asList(org.jooq.test.ase.generatedclasses.Keys.T_BOOK_TO_BOOK_STORE__FK_B2BS_BS_NAME, org.jooq.test.ase.generatedclasses.Keys.T_BOOK_TO_BOOK_STORE__FK_B2BS_B_ID);
	}
}
