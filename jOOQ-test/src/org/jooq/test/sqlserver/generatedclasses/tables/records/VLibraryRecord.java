/**
 * This class is generated by jOOQ
 */
package org.jooq.test.sqlserver.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class VLibraryRecord extends org.jooq.impl.TableRecordImpl<org.jooq.test.sqlserver.generatedclasses.tables.records.VLibraryRecord> implements org.jooq.Record2<java.lang.String, java.lang.String> {

	private static final long serialVersionUID = -1281355950;

	/**
	 * Setter for <code>dbo.v_library.author</code>. 
	 */
	public void setAuthor(java.lang.String value) {
		setValue(org.jooq.test.sqlserver.generatedclasses.tables.VLibrary.V_LIBRARY.AUTHOR, value);
	}

	/**
	 * Getter for <code>dbo.v_library.author</code>. 
	 */
	public java.lang.String getAuthor() {
		return getValue(org.jooq.test.sqlserver.generatedclasses.tables.VLibrary.V_LIBRARY.AUTHOR);
	}

	/**
	 * Setter for <code>dbo.v_library.title</code>. 
	 */
	public void setTitle(java.lang.String value) {
		setValue(org.jooq.test.sqlserver.generatedclasses.tables.VLibrary.V_LIBRARY.TITLE, value);
	}

	/**
	 * Getter for <code>dbo.v_library.title</code>. 
	 */
	public java.lang.String getTitle() {
		return getValue(org.jooq.test.sqlserver.generatedclasses.tables.VLibrary.V_LIBRARY.TITLE);
	}

	// -------------------------------------------------------------------------
	// Record2 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row2<java.lang.String, java.lang.String> fieldsRow() {
		return org.jooq.impl.Factory.row(field1(), field2());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row2<java.lang.String, java.lang.String> valuesRow() {
		return org.jooq.impl.Factory.row(value1(), value2());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field1() {
		return org.jooq.test.sqlserver.generatedclasses.tables.VLibrary.V_LIBRARY.AUTHOR;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return org.jooq.test.sqlserver.generatedclasses.tables.VLibrary.V_LIBRARY.TITLE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value1() {
		return getAuthor();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getTitle();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached VLibraryRecord
	 */
	public VLibraryRecord() {
		super(org.jooq.test.sqlserver.generatedclasses.tables.VLibrary.V_LIBRARY);
	}
}
