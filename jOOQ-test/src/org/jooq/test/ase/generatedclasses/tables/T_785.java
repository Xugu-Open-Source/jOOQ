/**
 * This class is generated by jOOQ
 */
package org.jooq.test.ase.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = "http://www.jooq.org",
                            comments = "This class is generated by jOOQ")
public class T_785 extends org.jooq.impl.TableImpl<org.jooq.test.ase.generatedclasses.tables.records.T_785Record> {

	private static final long serialVersionUID = -529898876;

	/**
	 * The singleton instance of t_785
	 */
	public static final org.jooq.test.ase.generatedclasses.tables.T_785 T_785 = new org.jooq.test.ase.generatedclasses.tables.T_785();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.test.ase.generatedclasses.tables.records.T_785Record> __RECORD_TYPE = org.jooq.test.ase.generatedclasses.tables.records.T_785Record.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.ase.generatedclasses.tables.records.T_785Record> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.ase.generatedclasses.tables.records.T_785Record, java.lang.Integer> ID = new org.jooq.impl.TableFieldImpl<org.jooq.test.ase.generatedclasses.tables.records.T_785Record, java.lang.Integer>("ID", org.jooq.impl.SQLDataType.INTEGER, T_785);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.ase.generatedclasses.tables.records.T_785Record, java.lang.String> NAME = new org.jooq.impl.TableFieldImpl<org.jooq.test.ase.generatedclasses.tables.records.T_785Record, java.lang.String>("NAME", org.jooq.impl.SQLDataType.VARCHAR, T_785);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.ase.generatedclasses.tables.records.T_785Record, java.lang.String> VALUE = new org.jooq.impl.TableFieldImpl<org.jooq.test.ase.generatedclasses.tables.records.T_785Record, java.lang.String>("VALUE", org.jooq.impl.SQLDataType.VARCHAR, T_785);

	/**
	 * No further instances allowed
	 */
	private T_785() {
		super("t_785", org.jooq.test.ase.generatedclasses.Dbo.DBO);
	}
}
