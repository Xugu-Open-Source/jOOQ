/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.test.tables.daos;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked" })
public class T_725LobTestDao extends org.jooq.impl.DAOImpl<org.jooq.test.oracle.generatedclasses.test.tables.records.T_725LobTestRecord, org.jooq.test.oracle.generatedclasses.test.tables.pojos.T_725LobTest, java.lang.Integer> {

	/**
	 * Create a new T_725LobTestDao without any factory
	 */
	public T_725LobTestDao() {
		super(org.jooq.test.oracle.generatedclasses.test.tables.T_725LobTest.T_725_LOB_TEST, org.jooq.test.oracle.generatedclasses.test.tables.pojos.T_725LobTest.class);
	}

	/**
	 * Create a new T_725LobTestDao with an attached factory
	 */
	public T_725LobTestDao(org.jooq.impl.Executor factory) {
		super(org.jooq.test.oracle.generatedclasses.test.tables.T_725LobTest.T_725_LOB_TEST, org.jooq.test.oracle.generatedclasses.test.tables.pojos.T_725LobTest.class, factory);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected java.lang.Integer getId(org.jooq.test.oracle.generatedclasses.test.tables.pojos.T_725LobTest object) {
		return object.getId();
	}

	/**
	 * Fetch records that have <code>ID IN (values)</code>
	 */
	public java.util.List<org.jooq.test.oracle.generatedclasses.test.tables.pojos.T_725LobTest> fetchById(java.lang.Integer... values) {
		return fetch(org.jooq.test.oracle.generatedclasses.test.tables.T_725LobTest.T_725_LOB_TEST.ID, values);
	}

	/**
	 * Fetch a unique record that has <code>ID = value</code>
	 */
	public org.jooq.test.oracle.generatedclasses.test.tables.pojos.T_725LobTest fetchOneById(java.lang.Integer value) {
		return fetchOne(org.jooq.test.oracle.generatedclasses.test.tables.T_725LobTest.T_725_LOB_TEST.ID, value);
	}

	/**
	 * Fetch records that have <code>LOB IN (values)</code>
	 */
	public java.util.List<org.jooq.test.oracle.generatedclasses.test.tables.pojos.T_725LobTest> fetchByLob(byte[]... values) {
		return fetch(org.jooq.test.oracle.generatedclasses.test.tables.T_725LobTest.T_725_LOB_TEST.LOB, values);
	}
}
