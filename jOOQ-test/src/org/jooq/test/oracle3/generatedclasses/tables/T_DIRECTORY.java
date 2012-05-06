/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
public class T_DIRECTORY extends org.jooq.impl.UpdatableTableImpl<org.jooq.Record> implements java.lang.Cloneable {

	private static final long serialVersionUID = -1049923835;

	/**
	 * The singleton instance of TEST.T_DIRECTORY
	 */
	public static final org.jooq.test.oracle3.generatedclasses.tables.T_DIRECTORY T_DIRECTORY = new org.jooq.test.oracle3.generatedclasses.tables.T_DIRECTORY();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.Record> getRecordType() {
		return org.jooq.Record.class;
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * CONSTRAINT PK_T_DIRECTORY_SELF
	 * FOREIGN KEY (PARENT_ID)
	 * REFERENCES TEST.T_DIRECTORY (ID)
	 * </pre></code>
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Integer> PARENT_ID = createField("PARENT_ID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Integer> IS_DIRECTORY = createField("IS_DIRECTORY", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> name = createField("name", org.jooq.impl.SQLDataType.VARCHAR, this);

	public T_DIRECTORY() {
		super("T_DIRECTORY", org.jooq.test.oracle3.generatedclasses.TEST.TEST);
	}

	public T_DIRECTORY(java.lang.String alias) {
		super(alias, org.jooq.test.oracle3.generatedclasses.TEST.TEST, org.jooq.test.oracle3.generatedclasses.tables.T_DIRECTORY.T_DIRECTORY);
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.Record> getMainKey() {
		return org.jooq.test.oracle3.generatedclasses.Keys.PK_T_DIRECTORY;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.Record>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.Record>>asList(org.jooq.test.oracle3.generatedclasses.Keys.PK_T_DIRECTORY);
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.ForeignKey<org.jooq.Record, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.Record, ?>>asList(org.jooq.test.oracle3.generatedclasses.Keys.PK_T_DIRECTORY_SELF);
	}

	@Override
	public org.jooq.test.oracle3.generatedclasses.tables.T_DIRECTORY as(java.lang.String alias) {
		return new org.jooq.test.oracle3.generatedclasses.tables.T_DIRECTORY(alias);
	}
}
