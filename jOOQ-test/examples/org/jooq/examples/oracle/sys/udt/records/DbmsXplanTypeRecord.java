/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.oracle.sys.udt.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DbmsXplanTypeRecord extends org.jooq.impl.UDTRecordImpl<org.jooq.examples.oracle.sys.udt.records.DbmsXplanTypeRecord> {

	private static final long serialVersionUID = -585976388;


	/**
	 * Setter for <code>SYS.DBMS_XPLAN_TYPE.PLAN_TABLE_OUTPUT</code>. 
	 */
	public void setPlanTableOutput(java.lang.String value) {
		setValue(org.jooq.examples.oracle.sys.udt.DbmsXplanType.PLAN_TABLE_OUTPUT, value);
	}

	/**
	 * Getter for <code>SYS.DBMS_XPLAN_TYPE.PLAN_TABLE_OUTPUT</code>. 
	 */
	public java.lang.String getPlanTableOutput() {
		return getValue(org.jooq.examples.oracle.sys.udt.DbmsXplanType.PLAN_TABLE_OUTPUT);
	}

	/**
	 * Create a new <code>SYS.DBMS_XPLAN_TYPE</code> record
	 */
	public DbmsXplanTypeRecord() {
		super(org.jooq.examples.oracle.sys.udt.DbmsXplanType.DBMS_XPLAN_TYPE);
	}
}
