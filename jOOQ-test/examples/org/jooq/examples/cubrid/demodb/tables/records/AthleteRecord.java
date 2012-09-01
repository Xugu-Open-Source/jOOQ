/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.cubrid.demodb.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
@javax.persistence.Entity
@javax.persistence.Table(name = "athlete", schema = "PUBLIC")
public class AthleteRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.examples.cubrid.demodb.tables.records.AthleteRecord> {

	private static final long serialVersionUID = -466858055;

	/**
	 * The table column <code>PUBLIC.athlete.code</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public void setCode(java.lang.Integer value) {
		setValue(org.jooq.examples.cubrid.demodb.tables.Athlete.ATHLETE.CODE, value);
	}

	/**
	 * The table column <code>PUBLIC.athlete.code</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "code", unique = true, nullable = false)
	public java.lang.Integer getCode() {
		return getValue(org.jooq.examples.cubrid.demodb.tables.Athlete.ATHLETE.CODE);
	}

	/**
	 * The table column <code>PUBLIC.athlete.code</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public java.util.List<org.jooq.examples.cubrid.demodb.tables.records.GameRecord> fetchGameList() {
		return create()
			.selectFrom(org.jooq.examples.cubrid.demodb.tables.Game.GAME)
			.where(org.jooq.examples.cubrid.demodb.tables.Game.GAME.ATHLETE_CODE.equal(getValue(org.jooq.examples.cubrid.demodb.tables.Athlete.ATHLETE.CODE)))
			.fetch();
	}

	/**
	 * The table column <code>PUBLIC.athlete.name</code>
	 */
	public void setName(java.lang.String value) {
		setValue(org.jooq.examples.cubrid.demodb.tables.Athlete.ATHLETE.NAME, value);
	}

	/**
	 * The table column <code>PUBLIC.athlete.name</code>
	 */
	@javax.persistence.Column(name = "name", nullable = false, precision = 40)
	public java.lang.String getName() {
		return getValue(org.jooq.examples.cubrid.demodb.tables.Athlete.ATHLETE.NAME);
	}

	/**
	 * The table column <code>PUBLIC.athlete.gender</code>
	 */
	public void setGender(java.lang.String value) {
		setValue(org.jooq.examples.cubrid.demodb.tables.Athlete.ATHLETE.GENDER, value);
	}

	/**
	 * The table column <code>PUBLIC.athlete.gender</code>
	 */
	@javax.persistence.Column(name = "gender", length = 1)
	public java.lang.String getGender() {
		return getValue(org.jooq.examples.cubrid.demodb.tables.Athlete.ATHLETE.GENDER);
	}

	/**
	 * The table column <code>PUBLIC.athlete.nation_code</code>
	 */
	public void setNationCode(java.lang.String value) {
		setValue(org.jooq.examples.cubrid.demodb.tables.Athlete.ATHLETE.NATION_CODE, value);
	}

	/**
	 * The table column <code>PUBLIC.athlete.nation_code</code>
	 */
	@javax.persistence.Column(name = "nation_code", length = 3)
	public java.lang.String getNationCode() {
		return getValue(org.jooq.examples.cubrid.demodb.tables.Athlete.ATHLETE.NATION_CODE);
	}

	/**
	 * The table column <code>PUBLIC.athlete.event</code>
	 */
	public void setEvent(java.lang.String value) {
		setValue(org.jooq.examples.cubrid.demodb.tables.Athlete.ATHLETE.EVENT, value);
	}

	/**
	 * The table column <code>PUBLIC.athlete.event</code>
	 */
	@javax.persistence.Column(name = "event", precision = 30)
	public java.lang.String getEvent() {
		return getValue(org.jooq.examples.cubrid.demodb.tables.Athlete.ATHLETE.EVENT);
	}

	/**
	 * Create a detached AthleteRecord
	 */
	public AthleteRecord() {
		super(org.jooq.examples.cubrid.demodb.tables.Athlete.ATHLETE);
	}
}
