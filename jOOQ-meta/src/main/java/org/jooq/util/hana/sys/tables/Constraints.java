/**
 * This class is generated by jOOQ
 */
package org.jooq.util.hana.sys.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.6.0"
	},
	comments = "This class is generated by jOOQ"
)
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Constraints extends org.jooq.impl.TableImpl<org.jooq.Record> {

	private static final long serialVersionUID = 734876841;

	/**
	 * The reference instance of <code>SYS.CONSTRAINTS</code>
	 */
	public static final org.jooq.util.hana.sys.tables.Constraints CONSTRAINTS = new org.jooq.util.hana.sys.tables.Constraints();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.Record> getRecordType() {
		return org.jooq.Record.class;
	}

	/**
	 * The column <code>SYS.CONSTRAINTS.SCHEMA_NAME</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> SCHEMA_NAME = createField("SCHEMA_NAME", org.jooq.impl.SQLDataType.NVARCHAR.length(256).nullable(false), this, "");

	/**
	 * The column <code>SYS.CONSTRAINTS.TABLE_NAME</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> TABLE_NAME = createField("TABLE_NAME", org.jooq.impl.SQLDataType.NVARCHAR.length(256).nullable(false), this, "");

	/**
	 * The column <code>SYS.CONSTRAINTS.COLUMN_NAME</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> COLUMN_NAME = createField("COLUMN_NAME", org.jooq.impl.SQLDataType.NVARCHAR.length(256).nullable(false), this, "");

	/**
	 * The column <code>SYS.CONSTRAINTS.POSITION</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Short> POSITION = createField("POSITION", org.jooq.impl.SQLDataType.SMALLINT, this, "");

	/**
	 * The column <code>SYS.CONSTRAINTS.CONSTRAINT_NAME</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> CONSTRAINT_NAME = createField("CONSTRAINT_NAME", org.jooq.impl.SQLDataType.NVARCHAR.length(256).nullable(false), this, "");

	/**
	 * The column <code>SYS.CONSTRAINTS.IS_PRIMARY_KEY</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> IS_PRIMARY_KEY = createField("IS_PRIMARY_KEY", org.jooq.impl.SQLDataType.VARCHAR.length(5).nullable(false), this, "");

	/**
	 * The column <code>SYS.CONSTRAINTS.IS_UNIQUE_KEY</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> IS_UNIQUE_KEY = createField("IS_UNIQUE_KEY", org.jooq.impl.SQLDataType.VARCHAR.length(5).nullable(false), this, "");

	/**
	 * Create a <code>SYS.CONSTRAINTS</code> table reference
	 */
	public Constraints() {
		this("CONSTRAINTS", null);
	}

	/**
	 * Create an aliased <code>SYS.CONSTRAINTS</code> table reference
	 */
	public Constraints(java.lang.String alias) {
		this(alias, org.jooq.util.hana.sys.tables.Constraints.CONSTRAINTS);
	}

	private Constraints(java.lang.String alias, org.jooq.Table<org.jooq.Record> aliased) {
		this(alias, aliased, null);
	}

	private Constraints(java.lang.String alias, org.jooq.Table<org.jooq.Record> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, org.jooq.util.hana.sys.Sys.SYS, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.util.hana.sys.tables.Constraints as(java.lang.String alias) {
		return new org.jooq.util.hana.sys.tables.Constraints(alias, this);
	}

	/**
	 * Rename this table
	 */
	public org.jooq.util.hana.sys.tables.Constraints rename(java.lang.String name) {
		return new org.jooq.util.hana.sys.tables.Constraints(name, null);
	}
}
