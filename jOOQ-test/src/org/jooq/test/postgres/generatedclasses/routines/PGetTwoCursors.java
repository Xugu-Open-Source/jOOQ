/**
 * This class is generated by jOOQ
 */
package org.jooq.test.postgres.generatedclasses.routines;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked" })
public class PGetTwoCursors extends org.jooq.impl.AbstractRoutine<java.lang.Void> {

	private static final long serialVersionUID = -1563510349;

	/**
	 * The parameter <code>public.p_get_two_cursors.books</code>. 
	 */
	public static final org.jooq.Parameter<org.jooq.Result<org.jooq.Record>> BOOKS = createParameter("books", org.jooq.impl.SQLDataType.RESULT);

	/**
	 * The parameter <code>public.p_get_two_cursors.authors</code>. 
	 */
	public static final org.jooq.Parameter<org.jooq.Result<org.jooq.Record>> AUTHORS = createParameter("authors", org.jooq.impl.SQLDataType.RESULT);

	/**
	 * Create a new routine call instance
	 */
	public PGetTwoCursors() {
		super("p_get_two_cursors", org.jooq.test.postgres.generatedclasses.Public.PUBLIC);

		addOutParameter(BOOKS);
		addOutParameter(AUTHORS);
	}

	/**
	 * Get the <code>books</code> parameter OUT value from the routine
	 */
	public org.jooq.Result<org.jooq.Record> getBooks() {
		return getValue(BOOKS);
	}

	/**
	 * Get the <code>authors</code> parameter OUT value from the routine
	 */
	public org.jooq.Result<org.jooq.Record> getAuthors() {
		return getValue(AUTHORS);
	}
}
