/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.mysql.sakila.tables.records;

/**
 * This class is generated by jOOQ.
 *
 * VIEW
 */
@java.lang.SuppressWarnings("all")
public class ActorInfoRecord extends org.jooq.impl.TableRecordImpl<org.jooq.examples.mysql.sakila.tables.records.ActorInfoRecord> {

	private static final long serialVersionUID = -194384196;

	/**
	 * The table column <code>sakila.actor_info.actor_id</code>
	 */
	public void setActorId(java.lang.Short value) {
		setValue(org.jooq.examples.mysql.sakila.tables.ActorInfo.ACTOR_INFO.ACTOR_ID, value);
	}

	/**
	 * The table column <code>sakila.actor_info.actor_id</code>
	 */
	public java.lang.Short getActorId() {
		return getValue(org.jooq.examples.mysql.sakila.tables.ActorInfo.ACTOR_INFO.ACTOR_ID);
	}

	/**
	 * The table column <code>sakila.actor_info.first_name</code>
	 */
	public void setFirstName(java.lang.String value) {
		setValue(org.jooq.examples.mysql.sakila.tables.ActorInfo.ACTOR_INFO.FIRST_NAME, value);
	}

	/**
	 * The table column <code>sakila.actor_info.first_name</code>
	 */
	public java.lang.String getFirstName() {
		return getValue(org.jooq.examples.mysql.sakila.tables.ActorInfo.ACTOR_INFO.FIRST_NAME);
	}

	/**
	 * The table column <code>sakila.actor_info.last_name</code>
	 */
	public void setLastName(java.lang.String value) {
		setValue(org.jooq.examples.mysql.sakila.tables.ActorInfo.ACTOR_INFO.LAST_NAME, value);
	}

	/**
	 * The table column <code>sakila.actor_info.last_name</code>
	 */
	public java.lang.String getLastName() {
		return getValue(org.jooq.examples.mysql.sakila.tables.ActorInfo.ACTOR_INFO.LAST_NAME);
	}

	/**
	 * The table column <code>sakila.actor_info.film_info</code>
	 */
	public void setFilmInfo(java.lang.String value) {
		setValue(org.jooq.examples.mysql.sakila.tables.ActorInfo.ACTOR_INFO.FILM_INFO, value);
	}

	/**
	 * The table column <code>sakila.actor_info.film_info</code>
	 */
	public java.lang.String getFilmInfo() {
		return getValue(org.jooq.examples.mysql.sakila.tables.ActorInfo.ACTOR_INFO.FILM_INFO);
	}

	/**
	 * Create a detached ActorInfoRecord
	 */
	public ActorInfoRecord() {
		super(org.jooq.examples.mysql.sakila.tables.ActorInfo.ACTOR_INFO);
	}
}
