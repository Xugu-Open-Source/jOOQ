/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.mysql.sakila.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class CountryRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.examples.mysql.sakila.tables.records.CountryRecord> {

	private static final long serialVersionUID = 113774157;

	/**
	 * The table column <code>sakila.country.country_id</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public void setCountryId(java.lang.Short value) {
		setValue(org.jooq.examples.mysql.sakila.tables.Country.COUNTRY.COUNTRY_ID, value);
	}

	/**
	 * The table column <code>sakila.country.country_id</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public java.lang.Short getCountryId() {
		return getValue(org.jooq.examples.mysql.sakila.tables.Country.COUNTRY.COUNTRY_ID);
	}

	/**
	 * The table column <code>sakila.country.country_id</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public java.util.List<org.jooq.examples.mysql.sakila.tables.records.CityRecord> fetchCityList() {
		return create()
			.selectFrom(org.jooq.examples.mysql.sakila.tables.City.CITY)
			.where(org.jooq.examples.mysql.sakila.tables.City.CITY.COUNTRY_ID.equal(getValue(org.jooq.examples.mysql.sakila.tables.Country.COUNTRY.COUNTRY_ID)))
			.fetch();
	}

	/**
	 * The table column <code>sakila.country.country</code>
	 */
	public void setCountry(java.lang.String value) {
		setValue(org.jooq.examples.mysql.sakila.tables.Country.COUNTRY.COUNTRY_, value);
	}

	/**
	 * The table column <code>sakila.country.country</code>
	 */
	public java.lang.String getCountry() {
		return getValue(org.jooq.examples.mysql.sakila.tables.Country.COUNTRY.COUNTRY_);
	}

	/**
	 * The table column <code>sakila.country.last_update</code>
	 */
	public void setLastUpdate(java.sql.Timestamp value) {
		setValue(org.jooq.examples.mysql.sakila.tables.Country.COUNTRY.LAST_UPDATE, value);
	}

	/**
	 * The table column <code>sakila.country.last_update</code>
	 */
	public java.sql.Timestamp getLastUpdate() {
		return getValue(org.jooq.examples.mysql.sakila.tables.Country.COUNTRY.LAST_UPDATE);
	}

	/**
	 * Create a detached CountryRecord
	 */
	public CountryRecord() {
		super(org.jooq.examples.mysql.sakila.tables.Country.COUNTRY);
	}
}
