/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.cubrid.demodb.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class Olympic extends org.jooq.impl.UpdatableTableImpl<org.jooq.examples.cubrid.demodb.tables.records.OlympicRecord> {

	private static final long serialVersionUID = -310243297;

	/**
	 * The singleton instance of PUBLIC.olympic
	 */
	public static final org.jooq.examples.cubrid.demodb.tables.Olympic OLYMPIC = new org.jooq.examples.cubrid.demodb.tables.Olympic();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.examples.cubrid.demodb.tables.records.OlympicRecord> getRecordType() {
		return org.jooq.examples.cubrid.demodb.tables.records.OlympicRecord.class;
	}

	/**
	 * The table column <code>PUBLIC.olympic.host_year</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public final org.jooq.TableField<org.jooq.examples.cubrid.demodb.tables.records.OlympicRecord, java.lang.Integer> HOST_YEAR = createField("host_year", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>PUBLIC.olympic.host_nation</code>
	 */
	public final org.jooq.TableField<org.jooq.examples.cubrid.demodb.tables.records.OlympicRecord, java.lang.String> HOST_NATION = createField("host_nation", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>PUBLIC.olympic.host_city</code>
	 */
	public final org.jooq.TableField<org.jooq.examples.cubrid.demodb.tables.records.OlympicRecord, java.lang.String> HOST_CITY = createField("host_city", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>PUBLIC.olympic.opening_date</code>
	 */
	public final org.jooq.TableField<org.jooq.examples.cubrid.demodb.tables.records.OlympicRecord, java.sql.Date> OPENING_DATE = createField("opening_date", org.jooq.impl.SQLDataType.DATE, this);

	/**
	 * The table column <code>PUBLIC.olympic.closing_date</code>
	 */
	public final org.jooq.TableField<org.jooq.examples.cubrid.demodb.tables.records.OlympicRecord, java.sql.Date> CLOSING_DATE = createField("closing_date", org.jooq.impl.SQLDataType.DATE, this);

	/**
	 * The table column <code>PUBLIC.olympic.mascot</code>
	 */
	public final org.jooq.TableField<org.jooq.examples.cubrid.demodb.tables.records.OlympicRecord, java.lang.String> MASCOT = createField("mascot", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>PUBLIC.olympic.slogan</code>
	 */
	public final org.jooq.TableField<org.jooq.examples.cubrid.demodb.tables.records.OlympicRecord, java.lang.String> SLOGAN = createField("slogan", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>PUBLIC.olympic.introduction</code>
	 */
	public final org.jooq.TableField<org.jooq.examples.cubrid.demodb.tables.records.OlympicRecord, java.lang.String> INTRODUCTION = createField("introduction", org.jooq.impl.SQLDataType.VARCHAR, this);

	public Olympic() {
		super("olympic", org.jooq.examples.cubrid.demodb.Public.PUBLIC);
	}

	public Olympic(java.lang.String alias) {
		super(alias, org.jooq.examples.cubrid.demodb.Public.PUBLIC, org.jooq.examples.cubrid.demodb.tables.Olympic.OLYMPIC);
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.examples.cubrid.demodb.tables.records.OlympicRecord> getMainKey() {
		return org.jooq.examples.cubrid.demodb.Keys.OLYMPIC__PK_OLYMPIC_HOST_YEAR;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.examples.cubrid.demodb.tables.records.OlympicRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.examples.cubrid.demodb.tables.records.OlympicRecord>>asList(org.jooq.examples.cubrid.demodb.Keys.OLYMPIC__PK_OLYMPIC_HOST_YEAR);
	}

	@Override
	public org.jooq.examples.cubrid.demodb.tables.Olympic as(java.lang.String alias) {
		return new org.jooq.examples.cubrid.demodb.tables.Olympic(alias);
	}
}
