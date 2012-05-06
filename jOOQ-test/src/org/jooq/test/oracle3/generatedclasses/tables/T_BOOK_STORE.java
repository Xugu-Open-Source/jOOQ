/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 *
 * A book store
 */
public class T_BOOK_STORE extends org.jooq.impl.UpdatableTableImpl<org.jooq.Record> implements java.lang.Cloneable {

	private static final long serialVersionUID = 1926923875;

	/**
	 * The singleton instance of TEST.T_BOOK_STORE
	 */
	public static final org.jooq.test.oracle3.generatedclasses.tables.T_BOOK_STORE T_BOOK_STORE = new org.jooq.test.oracle3.generatedclasses.tables.T_BOOK_STORE();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.Record> getRecordType() {
		return org.jooq.Record.class;
	}

	/**
	 * The books store name
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> NAME = createField("NAME", org.jooq.impl.SQLDataType.VARCHAR, this);

	public T_BOOK_STORE() {
		super("T_BOOK_STORE", org.jooq.test.oracle3.generatedclasses.TEST.TEST);
	}

	public T_BOOK_STORE(java.lang.String alias) {
		super(alias, org.jooq.test.oracle3.generatedclasses.TEST.TEST, org.jooq.test.oracle3.generatedclasses.tables.T_BOOK_STORE.T_BOOK_STORE);
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.Record> getMainKey() {
		return org.jooq.test.oracle3.generatedclasses.Keys.UK_T_BOOK_STORE_NAME;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.Record>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.Record>>asList(org.jooq.test.oracle3.generatedclasses.Keys.UK_T_BOOK_STORE_NAME);
	}

	@Override
	public org.jooq.test.oracle3.generatedclasses.tables.T_BOOK_STORE as(java.lang.String alias) {
		return new org.jooq.test.oracle3.generatedclasses.tables.T_BOOK_STORE(alias);
	}
}
