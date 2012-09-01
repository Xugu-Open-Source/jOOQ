/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.mysql.sakila;

/**
 * This class is generated by jOOQ.
 *
 * A Factory for specific use with the <code>sakila</code> schema.
 * <p>
 * This Factory will not render the <code>sakila</code> schema's schema name 
 * in rendered SQL (assuming that you use it as the default schema on your 
 * connection!). Use the more generic {@link org.jooq.util.mysql.MySQLFactory} 
 * or the {@link org.jooq.impl.Factory} instead, if you want to fully qualify 
 * tables, routines, etc.
 */
@java.lang.SuppressWarnings("all")
public class SakilaFactory extends org.jooq.util.mysql.MySQLFactory {

	private static final long serialVersionUID = -1871846986;

	/**
	 * Create a factory with a connection
	 *
	 * @param connection The connection to use with objects created from this factory
	 */
	public SakilaFactory(java.sql.Connection connection) {
		super(connection);

		initDefaultSchema();
	}

	/**
	 * Create a factory with a data source
	 *
	 * @param dataSource The data source to use with objects created from this factory
	 */
	public SakilaFactory(javax.sql.DataSource dataSource) {
		super(dataSource);

		initDefaultSchema();
	}

	/**
	 * Create a factory with a connection and a schema mapping
	 * 
	 * @deprecated - 2.0.5 - Use {@link #SakilaFactory(java.sql.Connection, org.jooq.conf.Settings)} instead
	 */
	@Deprecated
	public SakilaFactory(java.sql.Connection connection, org.jooq.SchemaMapping mapping) {
		super(connection, mapping);

		initDefaultSchema();
	}

	/**
	 * Create a factory with a connection and some settings
	 *
	 * @param connection The connection to use with objects created from this factory
	 * @param settings The settings to apply to objects created from this factory
	 */
	public SakilaFactory(java.sql.Connection connection, org.jooq.conf.Settings settings) {
		super(connection, settings);

		initDefaultSchema();
	}

	/**
	 * Create a factory with a data source and some settings
	 *
	 * @param dataSource The data source to use with objects created from this factory
	 * @param settings The settings to apply to objects created from this factory
	 */
	public SakilaFactory(javax.sql.DataSource dataSource, org.jooq.conf.Settings settings) {
		super(dataSource, settings);

		initDefaultSchema();
	}

	/**
	 * Initialise the render mapping's default schema.
	 * <p>
	 * For convenience, this schema-specific factory should override any pre-existing setting
	 */
	private final void initDefaultSchema() {
		org.jooq.conf.SettingsTools.getRenderMapping(getSettings()).setDefaultSchema(org.jooq.examples.mysql.sakila.Sakila.SAKILA.getName());
	}
}
