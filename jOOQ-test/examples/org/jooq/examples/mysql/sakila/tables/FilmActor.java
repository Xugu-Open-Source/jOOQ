/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.mysql.sakila.tables;

/**
 * This class is generated by jOOQ.
 */
public class FilmActor extends org.jooq.impl.UpdatableTableImpl<org.jooq.examples.mysql.sakila.tables.records.FilmActorRecord> {

	private static final long serialVersionUID = -512910996;

	/**
	 * The singleton instance of sakila.film_actor
	 */
	public static final org.jooq.examples.mysql.sakila.tables.FilmActor FILM_ACTOR = new org.jooq.examples.mysql.sakila.tables.FilmActor();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.examples.mysql.sakila.tables.records.FilmActorRecord> getRecordType() {
		return org.jooq.examples.mysql.sakila.tables.records.FilmActorRecord.class;
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * CONSTRAINT fk_film_actor_actor
	 * FOREIGN KEY (actor_id)
	 * REFERENCES sakila.actor (actor_id)
	 * </pre></code>
	 */
	public final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.FilmActorRecord, java.lang.Short> ACTOR_ID = createField("actor_id", org.jooq.impl.SQLDataType.SMALLINT, this);

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 * <p>
	 * <code><pre>
	 * CONSTRAINT fk_film_actor_film
	 * FOREIGN KEY (film_id)
	 * REFERENCES sakila.film (film_id)
	 * </pre></code>
	 */
	public final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.FilmActorRecord, java.lang.Short> FILM_ID = createField("film_id", org.jooq.impl.SQLDataType.SMALLINT, this);

	/**
	 * An uncommented item
	 */
	public final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.FilmActorRecord, java.sql.Timestamp> LAST_UPDATE = createField("last_update", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	public FilmActor() {
		super("film_actor", org.jooq.examples.mysql.sakila.Sakila.SAKILA);
	}

	public FilmActor(java.lang.String alias) {
		super(alias, org.jooq.examples.mysql.sakila.Sakila.SAKILA, org.jooq.examples.mysql.sakila.tables.FilmActor.FILM_ACTOR);
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.examples.mysql.sakila.tables.records.FilmActorRecord> getMainKey() {
		return org.jooq.examples.mysql.sakila.Keys.KEY_FILM_ACTOR_PRIMARY;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.examples.mysql.sakila.tables.records.FilmActorRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.examples.mysql.sakila.tables.records.FilmActorRecord>>asList(org.jooq.examples.mysql.sakila.Keys.KEY_FILM_ACTOR_PRIMARY);
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.ForeignKey<org.jooq.examples.mysql.sakila.tables.records.FilmActorRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<org.jooq.examples.mysql.sakila.tables.records.FilmActorRecord, ?>>asList(org.jooq.examples.mysql.sakila.Keys.FK_FILM_ACTOR_ACTOR, org.jooq.examples.mysql.sakila.Keys.FK_FILM_ACTOR_FILM);
	}

	@Override
	public org.jooq.examples.mysql.sakila.tables.FilmActor as(java.lang.String alias) {
		return new org.jooq.examples.mysql.sakila.tables.FilmActor(alias);
	}
}
