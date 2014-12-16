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
public class Procedures extends org.jooq.impl.TableImpl<org.jooq.Record> {

	private static final long serialVersionUID = 230367900;

	/**
	 * The reference instance of <code>SYS.PROCEDURES</code>
	 */
	public static final org.jooq.util.hana.sys.tables.Procedures PROCEDURES = new org.jooq.util.hana.sys.tables.Procedures();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.Record> getRecordType() {
		return org.jooq.Record.class;
	}

	/**
	 * The column <code>SYS.PROCEDURES.SCHEMA_NAME</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> SCHEMA_NAME = createField("SCHEMA_NAME", org.jooq.impl.SQLDataType.NVARCHAR.length(256).nullable(false), this, "");

	/**
	 * The column <code>SYS.PROCEDURES.PROCEDURE_NAME</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> PROCEDURE_NAME = createField("PROCEDURE_NAME", org.jooq.impl.SQLDataType.NVARCHAR.length(256).nullable(false), this, "");

	/**
	 * The column <code>SYS.PROCEDURES.PROCEDURE_OID</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Long> PROCEDURE_OID = createField("PROCEDURE_OID", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * The column <code>SYS.PROCEDURES.DEFAULT_SCHEMA_NAME</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> DEFAULT_SCHEMA_NAME = createField("DEFAULT_SCHEMA_NAME", org.jooq.impl.SQLDataType.NVARCHAR.length(256), this, "");

	/**
	 * The column <code>SYS.PROCEDURES.INPUT_PARAMETER_COUNT</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Integer> INPUT_PARAMETER_COUNT = createField("INPUT_PARAMETER_COUNT", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>SYS.PROCEDURES.OUTPUT_PARAMETER_COUNT</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Integer> OUTPUT_PARAMETER_COUNT = createField("OUTPUT_PARAMETER_COUNT", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>SYS.PROCEDURES.INOUT_PARAMETER_COUNT</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Integer> INOUT_PARAMETER_COUNT = createField("INOUT_PARAMETER_COUNT", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>SYS.PROCEDURES.RESULT_SET_COUNT</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Integer> RESULT_SET_COUNT = createField("RESULT_SET_COUNT", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>SYS.PROCEDURES.IS_UNICODE</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> IS_UNICODE = createField("IS_UNICODE", org.jooq.impl.SQLDataType.VARCHAR.length(5), this, "");

	/**
	 * The column <code>SYS.PROCEDURES.DEFINITION</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> DEFINITION = createField("DEFINITION", org.jooq.impl.SQLDataType.NCLOB.length(2147483647), this, "");

	/**
	 * The column <code>SYS.PROCEDURES.PROCEDURE_TYPE</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> PROCEDURE_TYPE = createField("PROCEDURE_TYPE", org.jooq.impl.SQLDataType.VARCHAR.length(10).nullable(false), this, "");

	/**
	 * The column <code>SYS.PROCEDURES.READ_ONLY</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> READ_ONLY = createField("READ_ONLY", org.jooq.impl.SQLDataType.VARCHAR.length(5), this, "");

	/**
	 * The column <code>SYS.PROCEDURES.IS_VALID</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> IS_VALID = createField("IS_VALID", org.jooq.impl.SQLDataType.VARCHAR.length(5).nullable(false), this, "");

	/**
	 * Create a <code>SYS.PROCEDURES</code> table reference
	 */
	public Procedures() {
		this("PROCEDURES", null);
	}

	/**
	 * Create an aliased <code>SYS.PROCEDURES</code> table reference
	 */
	public Procedures(java.lang.String alias) {
		this(alias, org.jooq.util.hana.sys.tables.Procedures.PROCEDURES);
	}

	private Procedures(java.lang.String alias, org.jooq.Table<org.jooq.Record> aliased) {
		this(alias, aliased, null);
	}

	private Procedures(java.lang.String alias, org.jooq.Table<org.jooq.Record> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, org.jooq.util.hana.sys.Sys.SYS, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.util.hana.sys.tables.Procedures as(java.lang.String alias) {
		return new org.jooq.util.hana.sys.tables.Procedures(alias, this);
	}

	/**
	 * Rename this table
	 */
	public org.jooq.util.hana.sys.tables.Procedures rename(java.lang.String name) {
		return new org.jooq.util.hana.sys.tables.Procedures(name, null);
	}
}
