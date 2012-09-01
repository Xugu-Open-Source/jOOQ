/**
 * This class is generated by jOOQ
 */
package org.jooq.test.db2.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class T_986_2Record extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.db2.generatedclasses.tables.records.T_986_2Record> {

	private static final long serialVersionUID = 1961549598;

	/**
	 * The table column <code>LUKAS.T_986_2.REF</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT T_986_2__FK_986
	 * FOREIGN KEY (REF)
	 * REFERENCES LUKAS.X_UNUSED (ID)
	 * </pre></code>
	 */
	public void setRef(java.lang.Integer value) {
		setValue(org.jooq.test.db2.generatedclasses.tables.T_986_2.REF, value);
	}

	/**
	 * The table column <code>LUKAS.T_986_2.REF</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT T_986_2__FK_986
	 * FOREIGN KEY (REF)
	 * REFERENCES LUKAS.X_UNUSED (ID)
	 * </pre></code>
	 */
	public java.lang.Integer getRef() {
		return getValue(org.jooq.test.db2.generatedclasses.tables.T_986_2.REF);
	}

	/**
	 * Link this record to a given {@link org.jooq.test.db2.generatedclasses.tables.records.XUnusedRecord 
	 * XUnusedRecord}
	 */
	public void setRef(org.jooq.test.db2.generatedclasses.tables.records.XUnusedRecord value) {
		if (value == null) {
			setValue(org.jooq.test.db2.generatedclasses.tables.T_986_2.REF, null);
		}
		else {
			setValue(org.jooq.test.db2.generatedclasses.tables.T_986_2.REF, value.getValue(org.jooq.test.db2.generatedclasses.tables.XUnused.ID));
		}
	}

	/**
	 * The table column <code>LUKAS.T_986_2.REF</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT T_986_2__FK_986
	 * FOREIGN KEY (REF)
	 * REFERENCES LUKAS.X_UNUSED (ID)
	 * </pre></code>
	 */
	public org.jooq.test.db2.generatedclasses.tables.records.XUnusedRecord fetchXUnused() {
		return create()
			.selectFrom(org.jooq.test.db2.generatedclasses.tables.XUnused.X_UNUSED)
			.where(org.jooq.test.db2.generatedclasses.tables.XUnused.ID.equal(getValue(org.jooq.test.db2.generatedclasses.tables.T_986_2.REF)))
			.fetchOne();
	}

	/**
	 * Create a detached T_986_2Record
	 */
	public T_986_2Record() {
		super(org.jooq.test.db2.generatedclasses.tables.T_986_2.T_986_2);
	}
}
