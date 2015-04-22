/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.udt.records;


import java.sql.Date;

import org.jooq.Field;
import org.jooq.Record8;
import org.jooq.Row;
import org.jooq.Row8;
import org.jooq.impl.UDTRecordImpl;
import org.jooq.test.oracle3.generatedclasses.udt.interfaces.U_ADDRESS_TYPE_INTERFACE;
import org.jooq.test.oracle3.generatedclasses.udt.interfaces.U_STREET_TYPE_INTERFACE;
import org.jooq.test.oracle3.generatedclasses.udt.records.U_STREET_TYPE;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class U_ADDRESS_TYPE extends UDTRecordImpl<U_ADDRESS_TYPE> implements Cloneable, Record8<U_STREET_TYPE, String, String, String, Date, Integer, byte[], String>, U_ADDRESS_TYPE_INTERFACE {

	private static final long serialVersionUID = -1358296491;

	/**
	 * Setter for <code>U_ADDRESS_TYPE.STREET</code>.
	 */
	public void setSTREET(U_STREET_TYPE value) {
		setValue(0, value);
	}

	/**
	 * Setter for <code>U_ADDRESS_TYPE.STREET</code>.
	 */
	@Override
	public void setSTREET(U_STREET_TYPE_INTERFACE value) {
		if (value == null)
			setValue(0, null);
		else
			setValue(0, value.into(new U_STREET_TYPE()));
	}

	/**
	 * Getter for <code>U_ADDRESS_TYPE.STREET</code>.
	 */
	@Override
	public U_STREET_TYPE getSTREET() {
		return (U_STREET_TYPE) getValue(0);
	}

	/**
	 * Setter for <code>U_ADDRESS_TYPE.ZIP</code>.
	 */
	@Override
	public void setZIP(String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>U_ADDRESS_TYPE.ZIP</code>.
	 */
	@Override
	public String getZIP() {
		return (String) getValue(1);
	}

	/**
	 * Setter for <code>U_ADDRESS_TYPE.CITY</code>.
	 */
	@Override
	public void setCITY(String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>U_ADDRESS_TYPE.CITY</code>.
	 */
	@Override
	public String getCITY() {
		return (String) getValue(2);
	}

	/**
	 * Setter for <code>U_ADDRESS_TYPE.COUNTRY</code>.
	 */
	@Override
	public void setCOUNTRY(String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>U_ADDRESS_TYPE.COUNTRY</code>.
	 */
	@Override
	public String getCOUNTRY() {
		return (String) getValue(3);
	}

	/**
	 * Setter for <code>U_ADDRESS_TYPE.SINCE</code>.
	 */
	@Override
	public void setSINCE(Date value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>U_ADDRESS_TYPE.SINCE</code>.
	 */
	@Override
	public Date getSINCE() {
		return (Date) getValue(4);
	}

	/**
	 * Setter for <code>U_ADDRESS_TYPE.CODE</code>.
	 */
	@Override
	public void setCODE(Integer value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>U_ADDRESS_TYPE.CODE</code>.
	 */
	@Override
	public Integer getCODE() {
		return (Integer) getValue(5);
	}

	/**
	 * Setter for <code>U_ADDRESS_TYPE.F_1323</code>.
	 */
	@Override
	public void setF_1323(byte[] value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>U_ADDRESS_TYPE.F_1323</code>.
	 */
	@Override
	public byte[] getF_1323() {
		return (byte[]) getValue(6);
	}

	/**
	 * Setter for <code>U_ADDRESS_TYPE.F_1326</code>.
	 */
	@Override
	public void setF_1326(String value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>U_ADDRESS_TYPE.F_1326</code>.
	 */
	@Override
	public String getF_1326() {
		return (String) getValue(7);
	}

	// -------------------------------------------------------------------------
	// Record8 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row8<U_STREET_TYPE, String, String, String, Date, Integer, byte[], String> fieldsRow() {
		return (Row8) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row8<U_STREET_TYPE, String, String, String, Date, Integer, byte[], String> valuesRow() {
		return (Row8) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<U_STREET_TYPE> field1() {
		return org.jooq.test.oracle3.generatedclasses.udt.U_ADDRESS_TYPE.STREET;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field2() {
		return org.jooq.test.oracle3.generatedclasses.udt.U_ADDRESS_TYPE.ZIP;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field3() {
		return org.jooq.test.oracle3.generatedclasses.udt.U_ADDRESS_TYPE.CITY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field4() {
		return org.jooq.test.oracle3.generatedclasses.udt.U_ADDRESS_TYPE.COUNTRY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Date> field5() {
		return org.jooq.test.oracle3.generatedclasses.udt.U_ADDRESS_TYPE.SINCE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field6() {
		return org.jooq.test.oracle3.generatedclasses.udt.U_ADDRESS_TYPE.CODE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<byte[]> field7() {
		return org.jooq.test.oracle3.generatedclasses.udt.U_ADDRESS_TYPE.F_1323;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field8() {
		return org.jooq.test.oracle3.generatedclasses.udt.U_ADDRESS_TYPE.F_1326;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public U_STREET_TYPE value1() {
		return getSTREET();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value2() {
		return getZIP();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value3() {
		return getCITY();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value4() {
		return getCOUNTRY();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Date value5() {
		return getSINCE();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value6() {
		return getCODE();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public byte[] value7() {
		return getF_1323();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value8() {
		return getF_1326();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public U_ADDRESS_TYPE value1(U_STREET_TYPE value) {
		setSTREET(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public U_ADDRESS_TYPE value2(String value) {
		setZIP(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public U_ADDRESS_TYPE value3(String value) {
		setCITY(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public U_ADDRESS_TYPE value4(String value) {
		setCOUNTRY(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public U_ADDRESS_TYPE value5(Date value) {
		setSINCE(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public U_ADDRESS_TYPE value6(Integer value) {
		setCODE(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public U_ADDRESS_TYPE value7(byte[] value) {
		setF_1323(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public U_ADDRESS_TYPE value8(String value) {
		setF_1326(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public U_ADDRESS_TYPE values(U_STREET_TYPE value1, String value2, String value3, String value4, Date value5, Integer value6, byte[] value7, String value8) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		value5(value5);
		value6(value6);
		value7(value7);
		value8(value8);
		return this;
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(U_ADDRESS_TYPE_INTERFACE from) {
		setSTREET(from.getSTREET());
		setZIP(from.getZIP());
		setCITY(from.getCITY());
		setCOUNTRY(from.getCOUNTRY());
		setSINCE(from.getSINCE());
		setCODE(from.getCODE());
		setF_1323(from.getF_1323());
		setF_1326(from.getF_1326());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends U_ADDRESS_TYPE_INTERFACE> E into(E into) {
		into.from(this);
		return into;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached U_ADDRESS_TYPE
	 */
	public U_ADDRESS_TYPE() {
		super(org.jooq.test.oracle3.generatedclasses.udt.U_ADDRESS_TYPE.U_ADDRESS_TYPE);
	}

	/**
	 * Create a detached, initialised U_ADDRESS_TYPE
	 */
	public U_ADDRESS_TYPE(U_STREET_TYPE STREET, String ZIP, String CITY, String COUNTRY, Date SINCE, Integer CODE, byte[] F_1323, String F_1326) {
		super(org.jooq.test.oracle3.generatedclasses.udt.U_ADDRESS_TYPE.U_ADDRESS_TYPE);

		setValue(0, STREET);
		setValue(1, ZIP);
		setValue(2, CITY);
		setValue(3, COUNTRY);
		setValue(4, SINCE);
		setValue(5, CODE);
		setValue(6, F_1323);
		setValue(7, F_1326);
	}
}
