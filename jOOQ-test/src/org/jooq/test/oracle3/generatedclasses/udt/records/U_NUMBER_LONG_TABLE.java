/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.udt.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class U_NUMBER_LONG_TABLE extends org.jooq.impl.ArrayRecordImpl<java.lang.Long> implements java.lang.Cloneable {

	private static final long serialVersionUID = -574913413;

	/**
	 * Create a new <code>U_NUMBER_LONG_TABLE</code> record
	 */
	public U_NUMBER_LONG_TABLE(org.jooq.Configuration configuration) {
		super(org.jooq.test.oracle3.generatedclasses.DefaultSchema.DEFAULT_SCHEMA, "U_NUMBER_LONG_TABLE", org.jooq.impl.SQLDataType.BIGINT, configuration);
	}

	/**
	 * Create a new <code>U_NUMBER_LONG_TABLE</code> record
	 */
	public U_NUMBER_LONG_TABLE(org.jooq.Configuration configuration, java.lang.Long... array) {
		this(configuration);
		set(array);
	}

	/**
	 * Create a new <code>U_NUMBER_LONG_TABLE</code> record
	 */
	public U_NUMBER_LONG_TABLE(org.jooq.Configuration configuration, java.util.List<? extends java.lang.Long> list) {
		this(configuration);
		setList(list);
	}
}
