/**
 * This class is generated by jOOQ
 */
package org.jooq.test.ase.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
public class T_986_1 extends org.jooq.impl.UpdatableTableImpl<org.jooq.test.ase.generatedclasses.tables.records.T_986_1Record> {

	private static final long serialVersionUID = -1789074649;

	/**
	 * The singleton instance of dbo.t_986_1
	 */
	public static final org.jooq.test.ase.generatedclasses.tables.T_986_1 T_986_1 = new org.jooq.test.ase.generatedclasses.tables.T_986_1();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.ase.generatedclasses.tables.records.T_986_1Record> getRecordType() {
		return org.jooq.test.ase.generatedclasses.tables.records.T_986_1Record.class;
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public static final org.jooq.TableField<org.jooq.test.ase.generatedclasses.tables.records.T_986_1Record, java.lang.Integer> REF = createField("REF", org.jooq.impl.SQLDataType.INTEGER, T_986_1);

	/**
	 * No further instances allowed
	 */
	private T_986_1() {
		super("t_986_1", org.jooq.test.ase.generatedclasses.Dbo.DBO);
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.test.ase.generatedclasses.tables.records.T_986_1Record> getMainKey() {
		return org.jooq.test.ase.generatedclasses.Keys.T_986_1__PK_986;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.ase.generatedclasses.tables.records.T_986_1Record>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.ase.generatedclasses.tables.records.T_986_1Record>>asList(org.jooq.test.ase.generatedclasses.Keys.T_986_1__PK_986);
	}
}
