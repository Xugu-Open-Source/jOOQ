/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.tables.daos;


import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;
import org.jooq.test.oracle3.generatedclasses.tables.pojos.T_DATES_POJO;
import org.jooq.types.DayToSecond;
import org.jooq.types.YearToMonth;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class T_DATES extends DAOImpl<org.jooq.test.oracle3.generatedclasses.tables.records.T_DATES, T_DATES_POJO, Integer> {

	/**
	 * Create a new T_DATES without any configuration
	 */
	public T_DATES() {
		super(org.jooq.test.oracle3.generatedclasses.tables.T_DATES.T_DATES, T_DATES_POJO.class);
	}

	/**
	 * Create a new T_DATES with an attached configuration
	 */
	public T_DATES(Configuration configuration) {
		super(org.jooq.test.oracle3.generatedclasses.tables.T_DATES.T_DATES, T_DATES_POJO.class, configuration);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected Integer getId(T_DATES_POJO object) {
		return object.getID();
	}

	/**
	 * Fetch records that have <code>ID IN (values)</code>
	 */
	public List<T_DATES_POJO> fetchByID(Integer... values) {
		return fetch(org.jooq.test.oracle3.generatedclasses.tables.T_DATES.T_DATES.ID, values);
	}

	/**
	 * Fetch a unique record that has <code>ID = value</code>
	 */
	public T_DATES_POJO fetchOneByID(Integer value) {
		return fetchOne(org.jooq.test.oracle3.generatedclasses.tables.T_DATES.T_DATES.ID, value);
	}

	/**
	 * Fetch records that have <code>D IN (values)</code>
	 */
	public List<T_DATES_POJO> fetchByD(Date... values) {
		return fetch(org.jooq.test.oracle3.generatedclasses.tables.T_DATES.T_DATES.D, values);
	}

	/**
	 * Fetch records that have <code>T IN (values)</code>
	 */
	public List<T_DATES_POJO> fetchByT(Timestamp... values) {
		return fetch(org.jooq.test.oracle3.generatedclasses.tables.T_DATES.T_DATES.T, values);
	}

	/**
	 * Fetch records that have <code>TS IN (values)</code>
	 */
	public List<T_DATES_POJO> fetchByTS(Timestamp... values) {
		return fetch(org.jooq.test.oracle3.generatedclasses.tables.T_DATES.T_DATES.TS, values);
	}

	/**
	 * Fetch records that have <code>D_INT IN (values)</code>
	 */
	public List<T_DATES_POJO> fetchByD_INT(Integer... values) {
		return fetch(org.jooq.test.oracle3.generatedclasses.tables.T_DATES.T_DATES.D_INT, values);
	}

	/**
	 * Fetch records that have <code>TS_BIGINT IN (values)</code>
	 */
	public List<T_DATES_POJO> fetchByTS_BIGINT(Long... values) {
		return fetch(org.jooq.test.oracle3.generatedclasses.tables.T_DATES.T_DATES.TS_BIGINT, values);
	}

	/**
	 * Fetch records that have <code>I_Y IN (values)</code>
	 */
	public List<T_DATES_POJO> fetchByI_Y(YearToMonth... values) {
		return fetch(org.jooq.test.oracle3.generatedclasses.tables.T_DATES.T_DATES.I_Y, values);
	}

	/**
	 * Fetch records that have <code>I_D IN (values)</code>
	 */
	public List<T_DATES_POJO> fetchByI_D(DayToSecond... values) {
		return fetch(org.jooq.test.oracle3.generatedclasses.tables.T_DATES.T_DATES.I_D, values);
	}
}
