/**
 * This class is generated by jOOQ
 */
package org.jooq.test.mysql.generatedclasses.tables.daos;

/**
 * This class is generated by jOOQ.
 *
 * An unused table in the same schema.
 */
@java.lang.SuppressWarnings("all")
public class XTestCase_85Dao extends org.jooq.impl.DAOImpl<org.jooq.test.mysql.generatedclasses.tables.records.XTestCase_85Record, org.jooq.test.mysql.generatedclasses.tables.pojos.XTestCase_85, java.lang.Integer> {

	/**
	 * Create a new XTestCase_85Dao without any factory
	 */
	public XTestCase_85Dao() {
		super(org.jooq.test.mysql.generatedclasses.tables.XTestCase_85.X_TEST_CASE_85, org.jooq.test.mysql.generatedclasses.tables.pojos.XTestCase_85.class);
	}

	/**
	 * Create a new XTestCase_85Dao with an attached factory
	 */
	public XTestCase_85Dao(org.jooq.impl.Factory factory) {
		super(org.jooq.test.mysql.generatedclasses.tables.XTestCase_85.X_TEST_CASE_85, org.jooq.test.mysql.generatedclasses.tables.pojos.XTestCase_85.class, factory);
	}

	@Override
	protected java.lang.Integer getId(org.jooq.test.mysql.generatedclasses.tables.pojos.XTestCase_85 object) {
		return object.getId();
	}

	/**
	 * Fetch records that have <code>id IN (values)</code>
	 */
	public java.util.List<org.jooq.test.mysql.generatedclasses.tables.pojos.XTestCase_85> fetchById(java.lang.Integer... values) {
		return fetch(org.jooq.test.mysql.generatedclasses.tables.XTestCase_85.ID, values);
	}

	/**
	 * Fetch a unique that has <code>id = value</code>
	 */
	public org.jooq.test.mysql.generatedclasses.tables.pojos.XTestCase_85 fetchOneById(java.lang.Integer value) {
		return fetchOne(org.jooq.test.mysql.generatedclasses.tables.XTestCase_85.ID, value);
	}

	/**
	 * Fetch records that have <code>x_unused_id IN (values)</code>
	 */
	public java.util.List<org.jooq.test.mysql.generatedclasses.tables.pojos.XTestCase_85> fetchByXUnusedId(java.lang.Integer... values) {
		return fetch(org.jooq.test.mysql.generatedclasses.tables.XTestCase_85.X_UNUSED_ID, values);
	}

	/**
	 * Fetch records that have <code>x_unused_name IN (values)</code>
	 */
	public java.util.List<org.jooq.test.mysql.generatedclasses.tables.pojos.XTestCase_85> fetchByXUnusedName(java.lang.String... values) {
		return fetch(org.jooq.test.mysql.generatedclasses.tables.XTestCase_85.X_UNUSED_NAME, values);
	}
}
