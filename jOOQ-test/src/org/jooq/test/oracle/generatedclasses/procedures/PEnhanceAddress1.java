/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.procedures;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = "http://www.jooq.org",
                            comments = "This class is generated by jOOQ")
public class PEnhanceAddress1 extends org.jooq.impl.StoredProcedureImpl {

	private static final long serialVersionUID = 1767104414;


	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<org.jooq.test.oracle.generatedclasses.udt.records.UAddressTypeRecord> ADDRESS = new org.jooq.impl.ParameterImpl<org.jooq.test.oracle.generatedclasses.udt.records.UAddressTypeRecord>("ADDRESS", org.jooq.test.oracle.generatedclasses.udt.UAddressType.U_ADDRESS_TYPE.getDataType());

	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.lang.String> NO = new org.jooq.impl.ParameterImpl<java.lang.String>("NO", org.jooq.impl.SQLDataType.VARCHAR);

	/**
	 * Create a new procedure call instance
	 */
	public PEnhanceAddress1() {
		super(org.jooq.SQLDialect.ORACLE, "P_ENHANCE_ADDRESS1", org.jooq.test.oracle.generatedclasses.Test.TEST);

		addInParameter(ADDRESS);
		addOutParameter(NO);
	}

	public void setAddress(org.jooq.test.oracle.generatedclasses.udt.records.UAddressTypeRecord value) {
		setValue(ADDRESS, value);
	}

	public java.lang.String getNo() {
		return getValue(NO);
	}
}
