/**
 * This class is generated by jOOQ
 */
package org.jooq.test.mysql.generatedclasses.tables.daos;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class TIdentityPkDao extends org.jooq.impl.DAOImpl<org.jooq.test.mysql.generatedclasses.tables.records.TIdentityPkRecord, org.jooq.test.mysql.generatedclasses.tables.pojos.TIdentityPk, java.lang.Integer> {

	/**
	 * Create a new TIdentityPkDao without any factory
	 */
	public TIdentityPkDao() {
		super(org.jooq.test.mysql.generatedclasses.tables.TIdentityPk.T_IDENTITY_PK, org.jooq.test.mysql.generatedclasses.tables.pojos.TIdentityPk.class);
	}

	/**
	 * Create a new TIdentityPkDao with an attached factory
	 */
	public TIdentityPkDao(org.jooq.impl.Factory factory) {
		super(org.jooq.test.mysql.generatedclasses.tables.TIdentityPk.T_IDENTITY_PK, org.jooq.test.mysql.generatedclasses.tables.pojos.TIdentityPk.class, factory);
	}

	@Override
	protected java.lang.Integer getId(org.jooq.test.mysql.generatedclasses.tables.pojos.TIdentityPk object) {
		return object.getId();
	}

	/**
	 * Fetch records that have <code>id IN (values)</code>
	 */
	public java.util.List<org.jooq.test.mysql.generatedclasses.tables.pojos.TIdentityPk> fetchById(java.lang.Integer... values) {
		return fetch(org.jooq.test.mysql.generatedclasses.tables.TIdentityPk.ID, values);
	}

	/**
	 * Fetch a unique that has <code>id = value</code>
	 */
	public org.jooq.test.mysql.generatedclasses.tables.pojos.TIdentityPk fetchOneById(java.lang.Integer value) {
		return fetchOne(org.jooq.test.mysql.generatedclasses.tables.TIdentityPk.ID, value);
	}

	/**
	 * Fetch records that have <code>val IN (values)</code>
	 */
	public java.util.List<org.jooq.test.mysql.generatedclasses.tables.pojos.TIdentityPk> fetchByVal(java.lang.Integer... values) {
		return fetch(org.jooq.test.mysql.generatedclasses.tables.TIdentityPk.VAL, values);
	}
}
