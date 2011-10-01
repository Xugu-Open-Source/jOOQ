/**
 * This class is generated by jOOQ
 */
package org.jooq.test.sqlserver.generatedclasses;

/**
 * This class is generated by jOOQ.
 *
 * Convenience access to all stored functions in dbo
 */
@javax.annotation.Generated(value    = "http://www.jooq.org",
                            comments = "This class is generated by jOOQ")
public final class Functions {

	/**
	 * Invoke F_AUTHOR_EXISTS
	 *
	 * @param authorName
	 */
	public static java.lang.Integer fAuthorExists(org.jooq.Configuration configuration, java.lang.String authorName) throws java.sql.SQLException {
		org.jooq.test.sqlserver.generatedclasses.functions.FAuthorExists f = new org.jooq.test.sqlserver.generatedclasses.functions.FAuthorExists();
		f.setAuthorName(authorName);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get F_AUTHOR_EXISTS as a field
	 *
	 * @param authorName
	 */
	public static org.jooq.Field<java.lang.Integer> fAuthorExists(java.lang.String authorName) {
		org.jooq.test.sqlserver.generatedclasses.functions.FAuthorExists f = new org.jooq.test.sqlserver.generatedclasses.functions.FAuthorExists();
		f.setAuthorName(authorName);

		return f.asField();
	}

	/**
	 * Get F_AUTHOR_EXISTS as a field
	 *
	 * @param authorName
	 */
	public static org.jooq.Field<java.lang.Integer> fAuthorExists(org.jooq.Field<java.lang.String> authorName) {
		org.jooq.test.sqlserver.generatedclasses.functions.FAuthorExists f = new org.jooq.test.sqlserver.generatedclasses.functions.FAuthorExists();
		f.setAuthorName(authorName);

		return f.asField();
	}

	/**
	 * Invoke F_NUMBER
	 *
	 * @param n
	 */
	public static java.lang.Integer fNumber(org.jooq.Configuration configuration, java.lang.Integer n) throws java.sql.SQLException {
		org.jooq.test.sqlserver.generatedclasses.functions.FNumber f = new org.jooq.test.sqlserver.generatedclasses.functions.FNumber();
		f.setN(n);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get F_NUMBER as a field
	 *
	 * @param n
	 */
	public static org.jooq.Field<java.lang.Integer> fNumber(java.lang.Integer n) {
		org.jooq.test.sqlserver.generatedclasses.functions.FNumber f = new org.jooq.test.sqlserver.generatedclasses.functions.FNumber();
		f.setN(n);

		return f.asField();
	}

	/**
	 * Get F_NUMBER as a field
	 *
	 * @param n
	 */
	public static org.jooq.Field<java.lang.Integer> fNumber(org.jooq.Field<java.lang.Integer> n) {
		org.jooq.test.sqlserver.generatedclasses.functions.FNumber f = new org.jooq.test.sqlserver.generatedclasses.functions.FNumber();
		f.setN(n);

		return f.asField();
	}

	/**
	 * Invoke F_ONE
	 *
	 */
	public static java.lang.Integer fOne(org.jooq.Configuration configuration) throws java.sql.SQLException {
		org.jooq.test.sqlserver.generatedclasses.functions.FOne f = new org.jooq.test.sqlserver.generatedclasses.functions.FOne();

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get F_ONE as a field
	 *
	 */
	public static org.jooq.Field<java.lang.Integer> fOne() {
		org.jooq.test.sqlserver.generatedclasses.functions.FOne f = new org.jooq.test.sqlserver.generatedclasses.functions.FOne();

		return f.asField();
	}

	/**
	 * Invoke F317
	 *
	 * @param p1
	 * @param p2
	 * @param p3
	 * @param p4
	 */
	public static java.lang.Integer f317(org.jooq.Configuration configuration, java.lang.Integer p1, java.lang.Integer p2, java.lang.Integer p3, java.lang.Integer p4) throws java.sql.SQLException {
		org.jooq.test.sqlserver.generatedclasses.functions.F317 f = new org.jooq.test.sqlserver.generatedclasses.functions.F317();
		f.setP1(p1);
		f.setP2(p2);
		f.setP3(p3);
		f.setP4(p4);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get F317 as a field
	 *
	 * @param p1
	 * @param p2
	 * @param p3
	 * @param p4
	 */
	public static org.jooq.Field<java.lang.Integer> f317(java.lang.Integer p1, java.lang.Integer p2, java.lang.Integer p3, java.lang.Integer p4) {
		org.jooq.test.sqlserver.generatedclasses.functions.F317 f = new org.jooq.test.sqlserver.generatedclasses.functions.F317();
		f.setP1(p1);
		f.setP2(p2);
		f.setP3(p3);
		f.setP4(p4);

		return f.asField();
	}

	/**
	 * Get F317 as a field
	 *
	 * @param p1
	 * @param p2
	 * @param p3
	 * @param p4
	 */
	public static org.jooq.Field<java.lang.Integer> f317(org.jooq.Field<java.lang.Integer> p1, org.jooq.Field<java.lang.Integer> p2, org.jooq.Field<java.lang.Integer> p3, org.jooq.Field<java.lang.Integer> p4) {
		org.jooq.test.sqlserver.generatedclasses.functions.F317 f = new org.jooq.test.sqlserver.generatedclasses.functions.F317();
		f.setP1(p1);
		f.setP2(p2);
		f.setP3(p3);
		f.setP4(p4);

		return f.asField();
	}

	/**
	 * No instances
	 */
	private Functions() {}
}
