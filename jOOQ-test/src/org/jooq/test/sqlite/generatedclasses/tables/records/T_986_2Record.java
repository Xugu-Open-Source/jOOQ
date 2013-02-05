/**
 * This class is generated by jOOQ
 */
package org.jooq.test.sqlite.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class T_986_2Record extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.sqlite.generatedclasses.tables.records.T_986_2Record> {

	private static final long serialVersionUID = 1221661525;

	/**
	 * The table column <code>t_986_2.REF</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT fk_t_986_2_X_UNUSED_1
	 * FOREIGN KEY (REF)
	 * REFERENCES x_unused (ID, NAME)
	 * </pre></code>
	 */
	public void setRef(java.lang.Integer value) {
		setValue(org.jooq.test.sqlite.generatedclasses.tables.T_986_2.REF, value);
	}

	/**
	 * The table column <code>t_986_2.REF</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 * <p>
	 * This column is part of a FOREIGN KEY: <code><pre>
	 * CONSTRAINT fk_t_986_2_X_UNUSED_1
	 * FOREIGN KEY (REF)
	 * REFERENCES x_unused (ID, NAME)
	 * </pre></code>
	 */
	public java.lang.Integer getRef() {
		return getValue(org.jooq.test.sqlite.generatedclasses.tables.T_986_2.REF);
	}

	/**
	 * Create a detached T_986_2Record
	 */
	public T_986_2Record() {
		super(org.jooq.test.sqlite.generatedclasses.tables.T_986_2.T_986_2);
	}
}
