/**
 * This class is generated by jOOQ
 */
package org.jooq.util.informix.sys.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.5.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Sysindexes extends org.jooq.impl.TableImpl<org.jooq.Record> {

	private static final long serialVersionUID = 793075650;

	/**
	 * The singleton instance of <code>informix.sysindexes</code>
	 */
	public static final org.jooq.util.informix.sys.tables.Sysindexes SYSINDEXES = new org.jooq.util.informix.sys.tables.Sysindexes();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.Record> getRecordType() {
		return org.jooq.Record.class;
	}

	/**
	 * The column <code>informix.sysindexes.idxname</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> IDXNAME = createField("idxname", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false), this, "");

	/**
	 * The column <code>informix.sysindexes.owner</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> OWNER = createField("owner", org.jooq.impl.SQLDataType.CHAR.length(32).nullable(false), this, "");

	/**
	 * The column <code>informix.sysindexes.tabid</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Integer> TABID = createField("tabid", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>informix.sysindexes.idxtype</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> IDXTYPE = createField("idxtype", org.jooq.impl.SQLDataType.CHAR.length(1).nullable(false), this, "");

	/**
	 * The column <code>informix.sysindexes.clustered</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> CLUSTERED = createField("clustered", org.jooq.impl.SQLDataType.CHAR.length(1).nullable(false), this, "");

	/**
	 * The column <code>informix.sysindexes.part1</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Short> PART1 = createField("part1", org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "");

	/**
	 * The column <code>informix.sysindexes.part2</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Short> PART2 = createField("part2", org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "");

	/**
	 * The column <code>informix.sysindexes.part3</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Short> PART3 = createField("part3", org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "");

	/**
	 * The column <code>informix.sysindexes.part4</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Short> PART4 = createField("part4", org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "");

	/**
	 * The column <code>informix.sysindexes.part5</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Short> PART5 = createField("part5", org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "");

	/**
	 * The column <code>informix.sysindexes.part6</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Short> PART6 = createField("part6", org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "");

	/**
	 * The column <code>informix.sysindexes.part7</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Short> PART7 = createField("part7", org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "");

	/**
	 * The column <code>informix.sysindexes.part8</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Short> PART8 = createField("part8", org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "");

	/**
	 * The column <code>informix.sysindexes.part9</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Short> PART9 = createField("part9", org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "");

	/**
	 * The column <code>informix.sysindexes.part10</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Short> PART10 = createField("part10", org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "");

	/**
	 * The column <code>informix.sysindexes.part11</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Short> PART11 = createField("part11", org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "");

	/**
	 * The column <code>informix.sysindexes.part12</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Short> PART12 = createField("part12", org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "");

	/**
	 * The column <code>informix.sysindexes.part13</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Short> PART13 = createField("part13", org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "");

	/**
	 * The column <code>informix.sysindexes.part14</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Short> PART14 = createField("part14", org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "");

	/**
	 * The column <code>informix.sysindexes.part15</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Short> PART15 = createField("part15", org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "");

	/**
	 * The column <code>informix.sysindexes.part16</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Short> PART16 = createField("part16", org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "");

	/**
	 * The column <code>informix.sysindexes.levels</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Short> LEVELS = createField("levels", org.jooq.impl.SQLDataType.SMALLINT.nullable(false), this, "");

	/**
	 * The column <code>informix.sysindexes.leaves</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Double> LEAVES = createField("leaves", org.jooq.impl.SQLDataType.DOUBLE.nullable(false), this, "");

	/**
	 * The column <code>informix.sysindexes.nunique</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Double> NUNIQUE = createField("nunique", org.jooq.impl.SQLDataType.DOUBLE.nullable(false), this, "");

	/**
	 * The column <code>informix.sysindexes.clust</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Double> CLUST = createField("clust", org.jooq.impl.SQLDataType.DOUBLE.nullable(false), this, "");

	/**
	 * Create a <code>informix.sysindexes</code> table reference
	 */
	public Sysindexes() {
		this("sysindexes", null);
	}

	/**
	 * Create an aliased <code>informix.sysindexes</code> table reference
	 */
	public Sysindexes(java.lang.String alias) {
		this(alias, org.jooq.util.informix.sys.tables.Sysindexes.SYSINDEXES);
	}

	private Sysindexes(java.lang.String alias, org.jooq.Table<org.jooq.Record> aliased) {
		this(alias, aliased, null);
	}

	private Sysindexes(java.lang.String alias, org.jooq.Table<org.jooq.Record> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, org.jooq.util.informix.sys.Informix.INFORMIX, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.util.informix.sys.tables.Sysindexes as(java.lang.String alias) {
		return new org.jooq.util.informix.sys.tables.Sysindexes(alias, this);
	}

	/**
	 * Rename this table
	 */
	public org.jooq.util.informix.sys.tables.Sysindexes rename(java.lang.String name) {
		return new org.jooq.util.informix.sys.tables.Sysindexes(name, null);
	}
}
