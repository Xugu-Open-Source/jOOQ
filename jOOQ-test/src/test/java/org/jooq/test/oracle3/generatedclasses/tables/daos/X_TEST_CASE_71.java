/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.tables.daos;


import java.util.List;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;
import org.jooq.test.oracle3.generatedclasses.tables.pojos.X_TEST_CASE_71_POJO;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class X_TEST_CASE_71 extends DAOImpl<org.jooq.test.oracle3.generatedclasses.tables.records.X_TEST_CASE_71, X_TEST_CASE_71_POJO, Integer> {

	/**
	 * Create a new X_TEST_CASE_71 without any configuration
	 */
	public X_TEST_CASE_71() {
		super(org.jooq.test.oracle3.generatedclasses.tables.X_TEST_CASE_71.X_TEST_CASE_71, X_TEST_CASE_71_POJO.class);
	}

	/**
	 * Create a new X_TEST_CASE_71 with an attached configuration
	 */
	public X_TEST_CASE_71(Configuration configuration) {
		super(org.jooq.test.oracle3.generatedclasses.tables.X_TEST_CASE_71.X_TEST_CASE_71, X_TEST_CASE_71_POJO.class, configuration);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected Integer getId(X_TEST_CASE_71_POJO object) {
		return object.getID();
	}

	/**
	 * Fetch records that have <code>ID IN (values)</code>
	 */
	public List<X_TEST_CASE_71_POJO> fetchByID(Integer... values) {
		return fetch(org.jooq.test.oracle3.generatedclasses.tables.X_TEST_CASE_71.X_TEST_CASE_71.ID, values);
	}

	/**
	 * Fetch a unique record that has <code>ID = value</code>
	 */
	public X_TEST_CASE_71_POJO fetchOneByID(Integer value) {
		return fetchOne(org.jooq.test.oracle3.generatedclasses.tables.X_TEST_CASE_71.X_TEST_CASE_71.ID, value);
	}

	/**
	 * Fetch records that have <code>TEST_CASE_64_69_ID IN (values)</code>
	 */
	public List<X_TEST_CASE_71_POJO> fetchByTEST_CASE_64_69_ID(Short... values) {
		return fetch(org.jooq.test.oracle3.generatedclasses.tables.X_TEST_CASE_71.X_TEST_CASE_71.TEST_CASE_64_69_ID, values);
	}
}
