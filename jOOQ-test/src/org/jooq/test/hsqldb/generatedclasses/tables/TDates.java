/**
 * This class is generated by jOOQ
 */
package org.jooq.test.hsqldb.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class TDates extends org.jooq.impl.UpdatableTableImpl<org.jooq.test.hsqldb.generatedclasses.tables.records.TDatesRecord> {

	private static final long serialVersionUID = 876878098;

	/**
	 * The singleton instance of PUBLIC.T_DATES
	 */
	public static final org.jooq.test.hsqldb.generatedclasses.tables.TDates T_DATES = new org.jooq.test.hsqldb.generatedclasses.tables.TDates();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.hsqldb.generatedclasses.tables.records.TDatesRecord> getRecordType() {
		return org.jooq.test.hsqldb.generatedclasses.tables.records.TDatesRecord.class;
	}

	/**
	 * The table column <code>PUBLIC.T_DATES.ID</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public final org.jooq.TableField<org.jooq.test.hsqldb.generatedclasses.tables.records.TDatesRecord, java.lang.Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>PUBLIC.T_DATES.D</code>
	 */
	public final org.jooq.TableField<org.jooq.test.hsqldb.generatedclasses.tables.records.TDatesRecord, java.sql.Date> D = createField("D", org.jooq.impl.SQLDataType.DATE, this);

	/**
	 * The table column <code>PUBLIC.T_DATES.T</code>
	 */
	public final org.jooq.TableField<org.jooq.test.hsqldb.generatedclasses.tables.records.TDatesRecord, java.sql.Time> T = createField("T", org.jooq.impl.SQLDataType.TIME, this);

	/**
	 * The table column <code>PUBLIC.T_DATES.TS</code>
	 */
	public final org.jooq.TableField<org.jooq.test.hsqldb.generatedclasses.tables.records.TDatesRecord, java.sql.Timestamp> TS = createField("TS", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	/**
	 * The table column <code>PUBLIC.T_DATES.D_INT</code>
	 */
	public final org.jooq.TableField<org.jooq.test.hsqldb.generatedclasses.tables.records.TDatesRecord, java.lang.Integer> D_INT = createField("D_INT", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>PUBLIC.T_DATES.TS_BIGINT</code>
	 */
	public final org.jooq.TableField<org.jooq.test.hsqldb.generatedclasses.tables.records.TDatesRecord, java.lang.Long> TS_BIGINT = createField("TS_BIGINT", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The table column <code>PUBLIC.T_DATES.I_Y</code>
	 */
	public final org.jooq.TableField<org.jooq.test.hsqldb.generatedclasses.tables.records.TDatesRecord, org.jooq.types.YearToMonth> I_Y = createField("I_Y", org.jooq.impl.SQLDataType.INTERVALYEARTOMONTH, this);

	/**
	 * The table column <code>PUBLIC.T_DATES.I_D</code>
	 */
	public final org.jooq.TableField<org.jooq.test.hsqldb.generatedclasses.tables.records.TDatesRecord, org.jooq.types.DayToSecond> I_D = createField("I_D", org.jooq.impl.SQLDataType.INTERVALDAYTOSECOND, this);

	public TDates() {
		super("T_DATES", org.jooq.test.hsqldb.generatedclasses.Public.PUBLIC);
	}

	public TDates(java.lang.String alias) {
		super(alias, org.jooq.test.hsqldb.generatedclasses.Public.PUBLIC, org.jooq.test.hsqldb.generatedclasses.tables.TDates.T_DATES);
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.test.hsqldb.generatedclasses.tables.records.TDatesRecord> getMainKey() {
		return org.jooq.test.hsqldb.generatedclasses.Keys.PK_T_DATES;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.hsqldb.generatedclasses.tables.records.TDatesRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.hsqldb.generatedclasses.tables.records.TDatesRecord>>asList(org.jooq.test.hsqldb.generatedclasses.Keys.PK_T_DATES);
	}

	@Override
	public org.jooq.test.hsqldb.generatedclasses.tables.TDates as(java.lang.String alias) {
		return new org.jooq.test.hsqldb.generatedclasses.tables.TDates(alias);
	}
}
