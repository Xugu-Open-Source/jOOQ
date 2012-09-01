/**
 * This class is generated by jOOQ
 */
package org.jooq.test.mysql.generatedclasses;

/**
 * This class is generated by jOOQ.
 *
 * Convenience access to all stored procedures and functions in test
 */
@java.lang.SuppressWarnings("all")
public final class Routines {

	/**
	 * Call test.f317
	 *
	 * @param p1
	 * @param p2
	 * @param p3
	 * @param p4
	 * @throws org.jooq.exception.DataAccessException if something went wrong executing the query
	 */
	public static java.lang.Integer f317(org.jooq.Configuration configuration, java.lang.Integer p1, java.lang.Integer p2, java.lang.Integer p3, java.lang.Integer p4) {
		org.jooq.test.mysql.generatedclasses.routines.F317 f = new org.jooq.test.mysql.generatedclasses.routines.F317();
		f.setP1(p1);
		f.setP2(p2);
		f.setP3(p3);
		f.setP4(p4);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get test.f317 as a field
	 *
	 * @param p1
	 * @param p2
	 * @param p3
	 * @param p4
	 */
	public static org.jooq.Field<java.lang.Integer> f317(java.lang.Integer p1, java.lang.Integer p2, java.lang.Integer p3, java.lang.Integer p4) {
		org.jooq.test.mysql.generatedclasses.routines.F317 f = new org.jooq.test.mysql.generatedclasses.routines.F317();
		f.setP1(p1);
		f.setP2(p2);
		f.setP3(p3);
		f.setP4(p4);

		return f.asField();
	}

	/**
	 * Get test.f317 as a field
	 *
	 * @param p1
	 * @param p2
	 * @param p3
	 * @param p4
	 */
	public static org.jooq.Field<java.lang.Integer> f317(org.jooq.Field<java.lang.Integer> p1, org.jooq.Field<java.lang.Integer> p2, org.jooq.Field<java.lang.Integer> p3, org.jooq.Field<java.lang.Integer> p4) {
		org.jooq.test.mysql.generatedclasses.routines.F317 f = new org.jooq.test.mysql.generatedclasses.routines.F317();
		f.setP1(p1);
		f.setP2(p2);
		f.setP3(p3);
		f.setP4(p4);

		return f.asField();
	}

	/**
	 * Call test.f_author_exists
	 *
	 * @param authorName
	 * @throws org.jooq.exception.DataAccessException if something went wrong executing the query
	 */
	public static java.lang.Integer fAuthorExists(org.jooq.Configuration configuration, java.lang.String authorName) {
		org.jooq.test.mysql.generatedclasses.routines.FAuthorExists f = new org.jooq.test.mysql.generatedclasses.routines.FAuthorExists();
		f.setAuthorName(authorName);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get test.f_author_exists as a field
	 *
	 * @param authorName
	 */
	public static org.jooq.Field<java.lang.Integer> fAuthorExists(java.lang.String authorName) {
		org.jooq.test.mysql.generatedclasses.routines.FAuthorExists f = new org.jooq.test.mysql.generatedclasses.routines.FAuthorExists();
		f.setAuthorName(authorName);

		return f.asField();
	}

	/**
	 * Get test.f_author_exists as a field
	 *
	 * @param authorName
	 */
	public static org.jooq.Field<java.lang.Integer> fAuthorExists(org.jooq.Field<java.lang.String> authorName) {
		org.jooq.test.mysql.generatedclasses.routines.FAuthorExists f = new org.jooq.test.mysql.generatedclasses.routines.FAuthorExists();
		f.setAuthorName(authorName);

		return f.asField();
	}

	/**
	 * Call test.f_number
	 *
	 * @param n
	 * @throws org.jooq.exception.DataAccessException if something went wrong executing the query
	 */
	public static java.lang.Integer fNumber(org.jooq.Configuration configuration, java.lang.Integer n) {
		org.jooq.test.mysql.generatedclasses.routines.FNumber f = new org.jooq.test.mysql.generatedclasses.routines.FNumber();
		f.setN(n);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get test.f_number as a field
	 *
	 * @param n
	 */
	public static org.jooq.Field<java.lang.Integer> fNumber(java.lang.Integer n) {
		org.jooq.test.mysql.generatedclasses.routines.FNumber f = new org.jooq.test.mysql.generatedclasses.routines.FNumber();
		f.setN(n);

		return f.asField();
	}

	/**
	 * Get test.f_number as a field
	 *
	 * @param n
	 */
	public static org.jooq.Field<java.lang.Integer> fNumber(org.jooq.Field<java.lang.Integer> n) {
		org.jooq.test.mysql.generatedclasses.routines.FNumber f = new org.jooq.test.mysql.generatedclasses.routines.FNumber();
		f.setN(n);

		return f.asField();
	}

	/**
	 * Call test.f_one
	 *
	 * @throws org.jooq.exception.DataAccessException if something went wrong executing the query
	 */
	public static java.lang.Integer fOne(org.jooq.Configuration configuration) {
		org.jooq.test.mysql.generatedclasses.routines.FOne f = new org.jooq.test.mysql.generatedclasses.routines.FOne();

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get test.f_one as a field
	 *
	 */
	public static org.jooq.Field<java.lang.Integer> fOne() {
		org.jooq.test.mysql.generatedclasses.routines.FOne f = new org.jooq.test.mysql.generatedclasses.routines.FOne();

		return f.asField();
	}

	/**
	 * Call test.p391
	 *
	 * @param i1 IN parameter
	 * @param io1 IN OUT parameter
	 * @param o1 OUT parameter
	 * @param o2 OUT parameter
	 * @param io2 IN OUT parameter
	 * @param i2 IN parameter
	 * @throws org.jooq.exception.DataAccessException if something went wrong executing the query
	 */
	public static org.jooq.test.mysql.generatedclasses.routines.P391 p391(org.jooq.Configuration configuration, java.lang.Integer i1, java.lang.Integer io1, java.lang.Integer io2, java.lang.Integer i2) {
		org.jooq.test.mysql.generatedclasses.routines.P391 p = new org.jooq.test.mysql.generatedclasses.routines.P391();
		p.setI1(i1);
		p.setIo1(io1);
		p.setIo2(io2);
		p.setI2(i2);

		p.execute(configuration);
		return p;
	}

	/**
	 * Call test.p_author_exists
	 *
	 * @param authorName IN parameter
	 * @param result OUT parameter
	 * @throws org.jooq.exception.DataAccessException if something went wrong executing the query
	 */
	public static java.lang.Integer pAuthorExists(org.jooq.Configuration configuration, java.lang.String authorName) {
		org.jooq.test.mysql.generatedclasses.routines.PAuthorExists p = new org.jooq.test.mysql.generatedclasses.routines.PAuthorExists();
		p.setAuthorName(authorName);

		p.execute(configuration);
		return p.getResult();
	}

	/**
	 * Call test.p_create_author
	 *
	 * @throws org.jooq.exception.DataAccessException if something went wrong executing the query
	 */
	public static void pCreateAuthor(org.jooq.Configuration configuration) {
		org.jooq.test.mysql.generatedclasses.routines.PCreateAuthor p = new org.jooq.test.mysql.generatedclasses.routines.PCreateAuthor();

		p.execute(configuration);
	}

	/**
	 * Call test.p_create_author_by_name
	 *
	 * @param firstName IN parameter
	 * @param lastName IN parameter
	 * @throws org.jooq.exception.DataAccessException if something went wrong executing the query
	 */
	public static void pCreateAuthorByName(org.jooq.Configuration configuration, java.lang.String firstName, java.lang.String lastName) {
		org.jooq.test.mysql.generatedclasses.routines.PCreateAuthorByName p = new org.jooq.test.mysql.generatedclasses.routines.PCreateAuthorByName();
		p.setFirstName(firstName);
		p.setLastName(lastName);

		p.execute(configuration);
	}

	/**
	 * Call test.p_unused
	 *
	 * @param in1 IN parameter
	 * @param out1 OUT parameter
	 * @param out2 IN OUT parameter
	 * @throws org.jooq.exception.DataAccessException if something went wrong executing the query
	 */
	public static org.jooq.test.mysql.generatedclasses.routines.PUnused pUnused(org.jooq.Configuration configuration, java.lang.String in1, java.lang.Boolean out2) {
		org.jooq.test.mysql.generatedclasses.routines.PUnused p = new org.jooq.test.mysql.generatedclasses.routines.PUnused();
		p.setIn1(in1);
		p.setOut2(out2);

		p.execute(configuration);
		return p;
	}

	/**
	 * No instances
	 */
	private Routines() {}
}
