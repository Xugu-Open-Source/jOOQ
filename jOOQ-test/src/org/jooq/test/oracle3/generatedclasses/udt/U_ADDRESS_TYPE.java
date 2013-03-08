/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.udt;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked" })
public class U_ADDRESS_TYPE extends org.jooq.impl.UDTImpl<org.jooq.test.oracle3.generatedclasses.udt.records.U_ADDRESS_TYPE> implements java.lang.Cloneable {

	private static final long serialVersionUID = 661896213;

	/**
	 * The singleton instance of <code>U_ADDRESS_TYPE</code>
	 */
	public static final org.jooq.test.oracle3.generatedclasses.udt.U_ADDRESS_TYPE U_ADDRESS_TYPE = new org.jooq.test.oracle3.generatedclasses.udt.U_ADDRESS_TYPE();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.oracle3.generatedclasses.udt.records.U_ADDRESS_TYPE> getRecordType() {
		return org.jooq.test.oracle3.generatedclasses.udt.records.U_ADDRESS_TYPE.class;
	}

	/**
	 * The attribute <code>U_ADDRESS_TYPE.STREET</code>. 
	 */
	public static final org.jooq.UDTField<org.jooq.test.oracle3.generatedclasses.udt.records.U_ADDRESS_TYPE, org.jooq.test.oracle3.generatedclasses.udt.records.U_STREET_TYPE> STREET = createField("STREET", org.jooq.test.oracle3.generatedclasses.udt.U_STREET_TYPE.U_STREET_TYPE.getDataType(), U_ADDRESS_TYPE);

	/**
	 * The attribute <code>U_ADDRESS_TYPE.ZIP</code>. 
	 */
	public static final org.jooq.UDTField<org.jooq.test.oracle3.generatedclasses.udt.records.U_ADDRESS_TYPE, java.lang.String> ZIP = createField("ZIP", org.jooq.impl.SQLDataType.VARCHAR.length(50), U_ADDRESS_TYPE);

	/**
	 * The attribute <code>U_ADDRESS_TYPE.CITY</code>. 
	 */
	public static final org.jooq.UDTField<org.jooq.test.oracle3.generatedclasses.udt.records.U_ADDRESS_TYPE, java.lang.String> CITY = createField("CITY", org.jooq.impl.SQLDataType.VARCHAR.length(50), U_ADDRESS_TYPE);

	/**
	 * The attribute <code>U_ADDRESS_TYPE.COUNTRY</code>. 
	 */
	public static final org.jooq.UDTField<org.jooq.test.oracle3.generatedclasses.udt.records.U_ADDRESS_TYPE, java.lang.String> COUNTRY = createField("COUNTRY", org.jooq.impl.SQLDataType.VARCHAR.length(50), U_ADDRESS_TYPE);

	/**
	 * The attribute <code>U_ADDRESS_TYPE.SINCE</code>. 
	 */
	public static final org.jooq.UDTField<org.jooq.test.oracle3.generatedclasses.udt.records.U_ADDRESS_TYPE, java.sql.Date> SINCE = createField("SINCE", org.jooq.impl.SQLDataType.DATE, U_ADDRESS_TYPE);

	/**
	 * The attribute <code>U_ADDRESS_TYPE.CODE</code>. 
	 */
	public static final org.jooq.UDTField<org.jooq.test.oracle3.generatedclasses.udt.records.U_ADDRESS_TYPE, java.lang.Integer> CODE = createField("CODE", org.jooq.impl.SQLDataType.INTEGER, U_ADDRESS_TYPE);

	/**
	 * The attribute <code>U_ADDRESS_TYPE.F_1323</code>. 
	 */
	public static final org.jooq.UDTField<org.jooq.test.oracle3.generatedclasses.udt.records.U_ADDRESS_TYPE, byte[]> F_1323 = createField("F_1323", org.jooq.impl.SQLDataType.BLOB, U_ADDRESS_TYPE);

	/**
	 * The attribute <code>U_ADDRESS_TYPE.F_1326</code>. 
	 */
	public static final org.jooq.UDTField<org.jooq.test.oracle3.generatedclasses.udt.records.U_ADDRESS_TYPE, java.lang.String> F_1326 = createField("F_1326", org.jooq.impl.SQLDataType.CLOB, U_ADDRESS_TYPE);

	/**
	 * No further instances allowed
	 */
	private U_ADDRESS_TYPE() {
		super("U_ADDRESS_TYPE", org.jooq.test.oracle3.generatedclasses.DefaultSchema.DEFAULT_SCHEMA);

		// Initialise data type
		getDataType();
	}
}
