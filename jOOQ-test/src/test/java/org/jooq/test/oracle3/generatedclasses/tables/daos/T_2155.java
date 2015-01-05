/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.tables.daos;


import java.sql.Date;
import java.util.List;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;
import org.jooq.test.oracle3.generatedclasses.tables.pojos.T_2155_POJO;
import org.jooq.test.oracle3.generatedclasses.udt.records.U_2155_ARRAY;
import org.jooq.test.oracle3.generatedclasses.udt.records.U_2155_OBJECT;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class T_2155 extends DAOImpl<org.jooq.test.oracle3.generatedclasses.tables.records.T_2155, T_2155_POJO, Integer> {

	/**
	 * Create a new T_2155 without any configuration
	 */
	public T_2155() {
		super(org.jooq.test.oracle3.generatedclasses.tables.T_2155.T_2155, T_2155_POJO.class);
	}

	/**
	 * Create a new T_2155 with an attached configuration
	 */
	public T_2155(Configuration configuration) {
		super(org.jooq.test.oracle3.generatedclasses.tables.T_2155.T_2155, T_2155_POJO.class, configuration);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected Integer getId(T_2155_POJO object) {
		return object.getID();
	}

	/**
	 * Fetch records that have <code>ID IN (values)</code>
	 */
	public List<T_2155_POJO> fetchByID(Integer... values) {
		return fetch(org.jooq.test.oracle3.generatedclasses.tables.T_2155.T_2155.ID, values);
	}

	/**
	 * Fetch a unique record that has <code>ID = value</code>
	 */
	public T_2155_POJO fetchOneByID(Integer value) {
		return fetchOne(org.jooq.test.oracle3.generatedclasses.tables.T_2155.T_2155.ID, value);
	}

	/**
	 * Fetch records that have <code>D1 IN (values)</code>
	 */
	public List<T_2155_POJO> fetchByD1(Date... values) {
		return fetch(org.jooq.test.oracle3.generatedclasses.tables.T_2155.T_2155.D1, values);
	}

	/**
	 * Fetch records that have <code>D2 IN (values)</code>
	 */
	public List<T_2155_POJO> fetchByD2(U_2155_OBJECT... values) {
		return fetch(org.jooq.test.oracle3.generatedclasses.tables.T_2155.T_2155.D2, values);
	}

	/**
	 * Fetch records that have <code>D3 IN (values)</code>
	 */
	public List<T_2155_POJO> fetchByD3(U_2155_ARRAY... values) {
		return fetch(org.jooq.test.oracle3.generatedclasses.tables.T_2155.T_2155.D3, values);
	}
}
