/**
 * This class is generated by jOOQ
 */
package org.jooq.test.derby.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = "http://www.jooq.org",
                            comments = "This class is generated by jOOQ")
public class VLibrary extends org.jooq.impl.TableImpl<org.jooq.test.derby.generatedclasses.tables.records.VLibraryRecord> {

	private static final long serialVersionUID = -443299608;

	/**
	 * The singleton instance of V_LIBRARY
	 */
	public static final org.jooq.test.derby.generatedclasses.tables.VLibrary V_LIBRARY = new org.jooq.test.derby.generatedclasses.tables.VLibrary();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.test.derby.generatedclasses.tables.records.VLibraryRecord> __RECORD_TYPE = org.jooq.test.derby.generatedclasses.tables.records.VLibraryRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.derby.generatedclasses.tables.records.VLibraryRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.derby.generatedclasses.tables.records.VLibraryRecord, java.lang.String> AUTHOR = new org.jooq.impl.TableFieldImpl<org.jooq.test.derby.generatedclasses.tables.records.VLibraryRecord, java.lang.String>("AUTHOR", org.jooq.impl.SQLDataType.VARCHAR, V_LIBRARY);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.derby.generatedclasses.tables.records.VLibraryRecord, java.lang.String> TITLE = new org.jooq.impl.TableFieldImpl<org.jooq.test.derby.generatedclasses.tables.records.VLibraryRecord, java.lang.String>("TITLE", org.jooq.impl.SQLDataType.VARCHAR, V_LIBRARY);

	/**
	 * No further instances allowed
	 */
	private VLibrary() {
		super("V_LIBRARY", org.jooq.test.derby.generatedclasses.Test.TEST);
	}
}
