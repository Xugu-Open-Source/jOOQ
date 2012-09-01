/**
 * This class is generated by jOOQ
 */
package org.jooq.test.sybase.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class VAuthor extends org.jooq.impl.TableImpl<org.jooq.test.sybase.generatedclasses.tables.records.VAuthorRecord> {

	private static final long serialVersionUID = -1169319825;

	/**
	 * The singleton instance of DBA.v_author
	 */
	public static final org.jooq.test.sybase.generatedclasses.tables.VAuthor V_AUTHOR = new org.jooq.test.sybase.generatedclasses.tables.VAuthor();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.sybase.generatedclasses.tables.records.VAuthorRecord> getRecordType() {
		return org.jooq.test.sybase.generatedclasses.tables.records.VAuthorRecord.class;
	}

	/**
	 * The table column <code>DBA.v_author.ID</code>
	 */
	public final org.jooq.TableField<org.jooq.test.sybase.generatedclasses.tables.records.VAuthorRecord, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>DBA.v_author.FIRST_NAME</code>
	 */
	public final org.jooq.TableField<org.jooq.test.sybase.generatedclasses.tables.records.VAuthorRecord, java.lang.String> FIRST_NAME = createField("FIRST_NAME", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>DBA.v_author.LAST_NAME</code>
	 */
	public final org.jooq.TableField<org.jooq.test.sybase.generatedclasses.tables.records.VAuthorRecord, java.lang.String> LAST_NAME = createField("LAST_NAME", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>DBA.v_author.DATE_OF_BIRTH</code>
	 */
	public final org.jooq.TableField<org.jooq.test.sybase.generatedclasses.tables.records.VAuthorRecord, java.sql.Date> DATE_OF_BIRTH = createField("DATE_OF_BIRTH", org.jooq.impl.SQLDataType.DATE, this);

	/**
	 * The table column <code>DBA.v_author.YEAR_OF_BIRTH</code>
	 */
	public final org.jooq.TableField<org.jooq.test.sybase.generatedclasses.tables.records.VAuthorRecord, java.lang.Integer> YEAR_OF_BIRTH = createField("YEAR_OF_BIRTH", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>DBA.v_author.ADDRESS</code>
	 */
	public final org.jooq.TableField<org.jooq.test.sybase.generatedclasses.tables.records.VAuthorRecord, java.lang.String> ADDRESS = createField("ADDRESS", org.jooq.impl.SQLDataType.VARCHAR, this);

	public VAuthor() {
		super("v_author", org.jooq.test.sybase.generatedclasses.Dba.DBA);
	}

	public VAuthor(java.lang.String alias) {
		super(alias, org.jooq.test.sybase.generatedclasses.Dba.DBA, org.jooq.test.sybase.generatedclasses.tables.VAuthor.V_AUTHOR);
	}

	@Override
	public org.jooq.test.sybase.generatedclasses.tables.VAuthor as(java.lang.String alias) {
		return new org.jooq.test.sybase.generatedclasses.tables.VAuthor(alias);
	}
}
