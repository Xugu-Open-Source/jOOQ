/**
 * This class is generated by jOOQ
 */
package org.jooq.util.hana.sys;

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
public class Sys extends org.jooq.impl.SchemaImpl {

	private static final long serialVersionUID = 893492844;

	/**
	 * The reference instance of <code>SYS</code>
	 */
	public static final Sys SYS = new Sys();

	/**
	 * No further instances allowed
	 */
	private Sys() {
		super("SYS");
	}

	@Override
	public final java.util.List<org.jooq.Table<?>> getTables() {
		java.util.List result = new java.util.ArrayList();
		result.addAll(getTables0());
		return result;
	}

	private final java.util.List<org.jooq.Table<?>> getTables0() {
		return java.util.Arrays.<org.jooq.Table<?>>asList(
			org.jooq.util.hana.sys.tables.Constraints.CONSTRAINTS,
			org.jooq.util.hana.sys.tables.ElementTypes.ELEMENT_TYPES,
			org.jooq.util.hana.sys.tables.Functions.FUNCTIONS,
			org.jooq.util.hana.sys.tables.FunctionParameters.FUNCTION_PARAMETERS,
			org.jooq.util.hana.sys.tables.Procedures.PROCEDURES,
			org.jooq.util.hana.sys.tables.ProcedureParameters.PROCEDURE_PARAMETERS,
			org.jooq.util.hana.sys.tables.ReferentialConstraints.REFERENTIAL_CONSTRAINTS,
			org.jooq.util.hana.sys.tables.Schemas.SCHEMAS,
			org.jooq.util.hana.sys.tables.Sequences.SEQUENCES,
			org.jooq.util.hana.sys.tables.Tables.TABLES,
			org.jooq.util.hana.sys.tables.TableColumns.TABLE_COLUMNS,
			org.jooq.util.hana.sys.tables.Views.VIEWS,
			org.jooq.util.hana.sys.tables.ViewColumns.VIEW_COLUMNS);
	}
}
