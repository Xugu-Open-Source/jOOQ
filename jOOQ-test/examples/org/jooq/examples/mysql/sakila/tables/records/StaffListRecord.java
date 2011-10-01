/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.mysql.sakila.tables.records;

/**
 * This class is generated by jOOQ.
 *
 * VIEW
 */
@javax.annotation.Generated(value    = "http://www.jooq.org",
                            comments = "This class is generated by jOOQ")
public class StaffListRecord extends org.jooq.impl.TableRecordImpl<org.jooq.examples.mysql.sakila.tables.records.StaffListRecord> {

	private static final long serialVersionUID = 365573754;

	/**
	 * An uncommented item
	 */
	public void setId(java.lang.Byte value) {
		setValue(org.jooq.examples.mysql.sakila.tables.StaffList.ID, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.Byte getId() {
		return getValue(org.jooq.examples.mysql.sakila.tables.StaffList.ID);
	}

	/**
	 * An uncommented item
	 */
	public void setName(java.lang.String value) {
		setValue(org.jooq.examples.mysql.sakila.tables.StaffList.NAME, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getName() {
		return getValue(org.jooq.examples.mysql.sakila.tables.StaffList.NAME);
	}

	/**
	 * An uncommented item
	 */
	public void setAddress(java.lang.String value) {
		setValue(org.jooq.examples.mysql.sakila.tables.StaffList.ADDRESS, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getAddress() {
		return getValue(org.jooq.examples.mysql.sakila.tables.StaffList.ADDRESS);
	}

	/**
	 * An uncommented item
	 */
	public void setZipCode(java.lang.String value) {
		setValue(org.jooq.examples.mysql.sakila.tables.StaffList.ZIP_CODE, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getZipCode() {
		return getValue(org.jooq.examples.mysql.sakila.tables.StaffList.ZIP_CODE);
	}

	/**
	 * An uncommented item
	 */
	public void setPhone(java.lang.String value) {
		setValue(org.jooq.examples.mysql.sakila.tables.StaffList.PHONE, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getPhone() {
		return getValue(org.jooq.examples.mysql.sakila.tables.StaffList.PHONE);
	}

	/**
	 * An uncommented item
	 */
	public void setCity(java.lang.String value) {
		setValue(org.jooq.examples.mysql.sakila.tables.StaffList.CITY, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getCity() {
		return getValue(org.jooq.examples.mysql.sakila.tables.StaffList.CITY);
	}

	/**
	 * An uncommented item
	 */
	public void setCountry(java.lang.String value) {
		setValue(org.jooq.examples.mysql.sakila.tables.StaffList.COUNTRY, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getCountry() {
		return getValue(org.jooq.examples.mysql.sakila.tables.StaffList.COUNTRY);
	}

	/**
	 * An uncommented item
	 */
	public void setSid(java.lang.Byte value) {
		setValue(org.jooq.examples.mysql.sakila.tables.StaffList.SID, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.Byte getSid() {
		return getValue(org.jooq.examples.mysql.sakila.tables.StaffList.SID);
	}

	/**
	 * Create a detached StaffListRecord
	 */
	public StaffListRecord() {
		super(org.jooq.examples.mysql.sakila.tables.StaffList.STAFF_LIST);
	}

	/**
	 * Create an attached StaffListRecord
	 * @deprecated - 1.6.4 [#363, #789] - use the other constructor instead for unattached
	 * records, or {@link org.jooq.impl.Factory#newRecord(org.jooq.Table)} for attached ones
	 */
	@Deprecated
	public StaffListRecord(org.jooq.Configuration configuration) {
		super(org.jooq.examples.mysql.sakila.tables.StaffList.STAFF_LIST, configuration);
	}
}
