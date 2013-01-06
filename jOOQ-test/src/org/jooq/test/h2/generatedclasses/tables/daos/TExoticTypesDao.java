/**
 * This class is generated by jOOQ
 */
package org.jooq.test.h2.generatedclasses.tables.daos;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class TExoticTypesDao extends org.jooq.impl.DAOImpl<org.jooq.test.h2.generatedclasses.tables.records.TExoticTypesRecord, org.jooq.test.h2.generatedclasses.tables.pojos.TExoticTypes, java.lang.Integer> {

	/**
	 * Create a new TExoticTypesDao without any factory
	 */
	public TExoticTypesDao() {
		super(org.jooq.test.h2.generatedclasses.tables.TExoticTypes.T_EXOTIC_TYPES, org.jooq.test.h2.generatedclasses.tables.pojos.TExoticTypes.class);
	}

	/**
	 * Create a new TExoticTypesDao with an attached factory
	 */
	public TExoticTypesDao(org.jooq.impl.Executor factory) {
		super(org.jooq.test.h2.generatedclasses.tables.TExoticTypes.T_EXOTIC_TYPES, org.jooq.test.h2.generatedclasses.tables.pojos.TExoticTypes.class, factory);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected java.lang.Integer getId(org.jooq.test.h2.generatedclasses.tables.pojos.TExoticTypes object) {
		return object.getId();
	}

	/**
	 * Fetch records that have <code>ID IN (values)</code>
	 */
	public java.util.List<org.jooq.test.h2.generatedclasses.tables.pojos.TExoticTypes> fetchById(java.lang.Integer... values) {
		return fetch(org.jooq.test.h2.generatedclasses.tables.TExoticTypes.ID, values);
	}

	/**
	 * Fetch a unique record that has <code>ID = value</code>
	 */
	public org.jooq.test.h2.generatedclasses.tables.pojos.TExoticTypes fetchOneById(java.lang.Integer value) {
		return fetchOne(org.jooq.test.h2.generatedclasses.tables.TExoticTypes.ID, value);
	}

	/**
	 * Fetch records that have <code>UU IN (values)</code>
	 */
	public java.util.List<org.jooq.test.h2.generatedclasses.tables.pojos.TExoticTypes> fetchByUu(java.util.UUID... values) {
		return fetch(org.jooq.test.h2.generatedclasses.tables.TExoticTypes.UU, values);
	}
}
