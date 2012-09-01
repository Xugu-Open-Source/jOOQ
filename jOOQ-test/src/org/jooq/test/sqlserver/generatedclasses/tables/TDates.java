/**
 * This class is generated by jOOQ
 */
package org.jooq.test.sqlserver.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class TDates extends org.jooq.impl.UpdatableTableImpl<org.jooq.test.sqlserver.generatedclasses.tables.records.TDatesRecord> {

	private static final long serialVersionUID = 59335507;

	/**
	 * The singleton instance of dbo.t_dates
	 */
	public static final org.jooq.test.sqlserver.generatedclasses.tables.TDates T_DATES = new org.jooq.test.sqlserver.generatedclasses.tables.TDates();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.sqlserver.generatedclasses.tables.records.TDatesRecord> getRecordType() {
		return org.jooq.test.sqlserver.generatedclasses.tables.records.TDatesRecord.class;
	}

	/**
	 * The table column <code>dbo.t_dates.id</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public final org.jooq.TableField<org.jooq.test.sqlserver.generatedclasses.tables.records.TDatesRecord, java.lang.Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>dbo.t_dates.d</code>
	 */
	public final org.jooq.TableField<org.jooq.test.sqlserver.generatedclasses.tables.records.TDatesRecord, java.sql.Date> D = createField("d", org.jooq.impl.SQLDataType.DATE, this);

	/**
	 * The table column <code>dbo.t_dates.t</code>
	 */
	public final org.jooq.TableField<org.jooq.test.sqlserver.generatedclasses.tables.records.TDatesRecord, java.sql.Time> T = createField("t", org.jooq.impl.SQLDataType.TIME, this);

	/**
	 * The table column <code>dbo.t_dates.ts</code>
	 */
	public final org.jooq.TableField<org.jooq.test.sqlserver.generatedclasses.tables.records.TDatesRecord, java.sql.Timestamp> TS = createField("ts", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * The table column <code>dbo.t_dates.d_int</code>
	 */
	public final org.jooq.TableField<org.jooq.test.sqlserver.generatedclasses.tables.records.TDatesRecord, java.lang.Integer> D_INT = createField("d_int", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>dbo.t_dates.ts_bigint</code>
	 */
	public final org.jooq.TableField<org.jooq.test.sqlserver.generatedclasses.tables.records.TDatesRecord, java.lang.Long> TS_BIGINT = createField("ts_bigint", org.jooq.impl.SQLDataType.BIGINT, this);

	public TDates() {
		super("t_dates", org.jooq.test.sqlserver.generatedclasses.Dbo.DBO);
	}

	public TDates(java.lang.String alias) {
		super(alias, org.jooq.test.sqlserver.generatedclasses.Dbo.DBO, org.jooq.test.sqlserver.generatedclasses.tables.TDates.T_DATES);
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.test.sqlserver.generatedclasses.tables.records.TDatesRecord> getMainKey() {
		return org.jooq.test.sqlserver.generatedclasses.Keys.PK_T_DATES;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.sqlserver.generatedclasses.tables.records.TDatesRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.sqlserver.generatedclasses.tables.records.TDatesRecord>>asList(org.jooq.test.sqlserver.generatedclasses.Keys.PK_T_DATES);
	}

	@Override
	public org.jooq.test.sqlserver.generatedclasses.tables.TDates as(java.lang.String alias) {
		return new org.jooq.test.sqlserver.generatedclasses.tables.TDates(alias);
	}
}
