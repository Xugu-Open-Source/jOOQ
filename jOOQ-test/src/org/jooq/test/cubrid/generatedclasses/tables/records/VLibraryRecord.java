/**
 * This class is generated by jOOQ
 */
package org.jooq.test.cubrid.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class VLibraryRecord extends org.jooq.impl.TableRecordImpl<org.jooq.test.cubrid.generatedclasses.tables.records.VLibraryRecord> {

	private static final long serialVersionUID = 946473767;

	/**
	 * The table column <code>DBA.v_library.author</code>
	 */
	public void setAuthor(java.lang.String value) {
		setValue(org.jooq.test.cubrid.generatedclasses.tables.VLibrary.AUTHOR, value);
	}

	/**
	 * The table column <code>DBA.v_library.author</code>
	 */
	public java.lang.String getAuthor() {
		return getValue(org.jooq.test.cubrid.generatedclasses.tables.VLibrary.AUTHOR);
	}

	/**
	 * The table column <code>DBA.v_library.title</code>
	 */
	public void setTitle(java.lang.String value) {
		setValue(org.jooq.test.cubrid.generatedclasses.tables.VLibrary.TITLE, value);
	}

	/**
	 * The table column <code>DBA.v_library.title</code>
	 */
	public java.lang.String getTitle() {
		return getValue(org.jooq.test.cubrid.generatedclasses.tables.VLibrary.TITLE);
	}

	/**
	 * Create a detached VLibraryRecord
	 */
	public VLibraryRecord() {
		super(org.jooq.test.cubrid.generatedclasses.tables.VLibrary.V_LIBRARY);
	}
}
