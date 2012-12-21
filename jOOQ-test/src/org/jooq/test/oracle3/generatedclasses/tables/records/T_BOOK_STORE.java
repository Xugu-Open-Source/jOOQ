/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 *
 * A book store
 */
@java.lang.SuppressWarnings("all")
@javax.persistence.Entity
@javax.persistence.Table(name = "T_BOOK_STORE", schema = "TEST")
public class T_BOOK_STORE extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.oracle3.generatedclasses.tables.records.T_BOOK_STORE> implements java.lang.Cloneable, org.jooq.Record1<java.lang.String>, org.jooq.test.oracle3.generatedclasses.tables.interfaces.T_BOOK_STORE_INTERFACE {

	private static final long serialVersionUID = -199871703;

	/**
	 * Setter for <code>TEST.T_BOOK_STORE.NAME</code>. The books store name
	 */
	@Override
	public void setNAME(java.lang.String value) {
		setValue(org.jooq.test.oracle3.generatedclasses.tables.T_BOOK_STORE.T_BOOK_STORE.NAME, value);
	}

	/**
	 * Getter for <code>TEST.T_BOOK_STORE.NAME</code>. The books store name
	 */
	@javax.persistence.Column(name = "NAME", unique = true, nullable = false, length = 400)
	@Override
	public java.lang.String getNAME() {
		return getValue(org.jooq.test.oracle3.generatedclasses.tables.T_BOOK_STORE.T_BOOK_STORE.NAME);
	}

	// -------------------------------------------------------------------------
	// Foreign key navigation methods
	// -------------------------------------------------------------------------

	/**
	 * Fetch a list of <code>TEST.T_BOOK_TO_BOOK_STORE</code> referencing this <code>TEST.T_BOOK_STORE</code>
	 */
	public org.jooq.Result<org.jooq.test.oracle3.generatedclasses.tables.records.T_BOOK_TO_BOOK_STORE> fetchT_BOOK_TO_BOOK_STOREList() {
		return create()
			.selectFrom(org.jooq.test.oracle3.generatedclasses.tables.T_BOOK_TO_BOOK_STORE.T_BOOK_TO_BOOK_STORE)
			.where(org.jooq.test.oracle3.generatedclasses.tables.T_BOOK_TO_BOOK_STORE.T_BOOK_TO_BOOK_STORE.BOOK_STORE_NAME.equal(getValue(org.jooq.test.oracle3.generatedclasses.tables.T_BOOK_STORE.T_BOOK_STORE.NAME)))
			.fetch();
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<java.lang.String> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record1 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row1<java.lang.String> fieldsRow() {
		return org.jooq.impl.Factory.row(field1());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row1<java.lang.String> valuesRow() {
		return org.jooq.impl.Factory.row(value1());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field1() {
		return org.jooq.test.oracle3.generatedclasses.tables.T_BOOK_STORE.T_BOOK_STORE.NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value1() {
		return getNAME();
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(org.jooq.test.oracle3.generatedclasses.tables.interfaces.T_BOOK_STORE_INTERFACE from) {
		setNAME(from.getNAME());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends org.jooq.test.oracle3.generatedclasses.tables.interfaces.T_BOOK_STORE_INTERFACE> E into(E into) {
		into.from(this);
		return into;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached T_BOOK_STORE
	 */
	public T_BOOK_STORE() {
		super(org.jooq.test.oracle3.generatedclasses.tables.T_BOOK_STORE.T_BOOK_STORE);
	}
}
