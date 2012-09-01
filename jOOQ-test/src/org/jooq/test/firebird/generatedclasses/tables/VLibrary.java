/**
 * This class is generated by jOOQ
 */
package org.jooq.test.firebird.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class VLibrary extends org.jooq.impl.TableImpl<org.jooq.test.firebird.generatedclasses.tables.records.VLibraryRecord> {

	private static final long serialVersionUID = 1599756330;

	/**
	 * The singleton instance of V_LIBRARY
	 */
	public static final org.jooq.test.firebird.generatedclasses.tables.VLibrary V_LIBRARY = new org.jooq.test.firebird.generatedclasses.tables.VLibrary();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.firebird.generatedclasses.tables.records.VLibraryRecord> getRecordType() {
		return org.jooq.test.firebird.generatedclasses.tables.records.VLibraryRecord.class;
	}

	/**
	 * The table column <code>V_LIBRARY.AUTHOR</code>
	 */
	public final org.jooq.TableField<org.jooq.test.firebird.generatedclasses.tables.records.VLibraryRecord, java.lang.String> AUTHOR = createField("AUTHOR", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>V_LIBRARY.TITLE</code>
	 */
	public final org.jooq.TableField<org.jooq.test.firebird.generatedclasses.tables.records.VLibraryRecord, java.lang.String> TITLE = createField("TITLE", org.jooq.impl.SQLDataType.VARCHAR, this);

	public VLibrary() {
		super("V_LIBRARY");
	}

	public VLibrary(java.lang.String alias) {
		super(alias, null, org.jooq.test.firebird.generatedclasses.tables.VLibrary.V_LIBRARY);
	}

	@Override
	public org.jooq.test.firebird.generatedclasses.tables.VLibrary as(java.lang.String alias) {
		return new org.jooq.test.firebird.generatedclasses.tables.VLibrary(alias);
	}
}
