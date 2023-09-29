/*
 * This file is generated by jOOQ.
 */
package org.jooq.example.testcontainers.db.tables.records;


import java.time.LocalDateTime;

import org.jooq.Record2;
import org.jooq.example.testcontainers.db.tables.FilmActor;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class FilmActorRecord extends UpdatableRecordImpl<FilmActorRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.film_actor.actor_id</code>.
     */
    public void setActorId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.film_actor.actor_id</code>.
     */
    public Long getActorId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.film_actor.film_id</code>.
     */
    public void setFilmId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.film_actor.film_id</code>.
     */
    public Long getFilmId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>public.film_actor.last_update</code>.
     */
    public void setLastUpdate(LocalDateTime value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.film_actor.last_update</code>.
     */
    public LocalDateTime getLastUpdate() {
        return (LocalDateTime) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record2<Long, Long> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached FilmActorRecord
     */
    public FilmActorRecord() {
        super(FilmActor.FILM_ACTOR);
    }

    /**
     * Create a detached, initialised FilmActorRecord
     */
    public FilmActorRecord(Long actorId, Long filmId, LocalDateTime lastUpdate) {
        super(FilmActor.FILM_ACTOR);

        setActorId(actorId);
        setFilmId(filmId);
        setLastUpdate(lastUpdate);
        resetChangedOnNotNull();
    }
}
