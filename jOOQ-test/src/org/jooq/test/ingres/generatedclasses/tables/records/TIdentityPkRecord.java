/**
 * This class is generated by jOOQ
 */
package org.jooq.test.ingres.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class TIdentityPkRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.ingres.generatedclasses.tables.records.TIdentityPkRecord> {

	private static final long serialVersionUID = -1915213435;

	/**
	 * The table column <code>test.t_identity_pk.id</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public void setId(java.lang.Integer value) {
		setValue(org.jooq.test.ingres.generatedclasses.tables.TIdentityPk.ID, value);
	}

	/**
	 * The table column <code>test.t_identity_pk.id</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public java.lang.Integer getId() {
		return getValue(org.jooq.test.ingres.generatedclasses.tables.TIdentityPk.ID);
	}

	/**
	 * The table column <code>test.t_identity_pk.val</code>
	 */
	public void setVal(java.lang.Integer value) {
		setValue(org.jooq.test.ingres.generatedclasses.tables.TIdentityPk.VAL, value);
	}

	/**
	 * The table column <code>test.t_identity_pk.val</code>
	 */
	public java.lang.Integer getVal() {
		return getValue(org.jooq.test.ingres.generatedclasses.tables.TIdentityPk.VAL);
	}

	/**
	 * Create a detached TIdentityPkRecord
	 */
	public TIdentityPkRecord() {
		super(org.jooq.test.ingres.generatedclasses.tables.TIdentityPk.T_IDENTITY_PK);
	}
}
