/**
 * This class is generated by jOOQ
 */
package org.jooq.test.hana.generatedclasses;

/**
 * Convenience access to all stored procedures and functions in DEV_2ZUU8JBREPCG8SWGL0XWK7NTF
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Routines {

	/**
	 * Call <code>DEV_2ZUU8JBREPCG8SWGL0XWK7NTF.F317</code>
	 */
	public static java.lang.Integer f317(org.jooq.Configuration configuration, java.lang.Integer p1, java.lang.Integer p2, java.lang.Integer p3, java.lang.Integer p4) {
		org.jooq.test.hana.generatedclasses.routines.F317 f = new org.jooq.test.hana.generatedclasses.routines.F317();
		f.setP1(p1);
		f.setP2(p2);
		f.setP3(p3);
		f.setP4(p4);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>DEV_2ZUU8JBREPCG8SWGL0XWK7NTF.F317</code> as a field
	 */
	public static org.jooq.Field<java.lang.Integer> f317(java.lang.Integer p1, java.lang.Integer p2, java.lang.Integer p3, java.lang.Integer p4) {
		org.jooq.test.hana.generatedclasses.routines.F317 f = new org.jooq.test.hana.generatedclasses.routines.F317();
		f.setP1(p1);
		f.setP2(p2);
		f.setP3(p3);
		f.setP4(p4);

		return f.asField();
	}

	/**
	 * Get <code>DEV_2ZUU8JBREPCG8SWGL0XWK7NTF.F317</code> as a field
	 */
	public static org.jooq.Field<java.lang.Integer> f317(org.jooq.Field<java.lang.Integer> p1, org.jooq.Field<java.lang.Integer> p2, org.jooq.Field<java.lang.Integer> p3, org.jooq.Field<java.lang.Integer> p4) {
		org.jooq.test.hana.generatedclasses.routines.F317 f = new org.jooq.test.hana.generatedclasses.routines.F317();
		f.setP1(p1);
		f.setP2(p2);
		f.setP3(p3);
		f.setP4(p4);

		return f.asField();
	}

	/**
	 * Call <code>DEV_2ZUU8JBREPCG8SWGL0XWK7NTF.F_BOOK</code>
	 */
	public static java.lang.Integer fBook(org.jooq.Configuration configuration, java.lang.Object pIn) {
		org.jooq.test.hana.generatedclasses.routines.FBook p = new org.jooq.test.hana.generatedclasses.routines.FBook();
		p.setPIn(pIn);

		p.execute(configuration);
		return p.getPOut();
	}

	/**
	 * Call <code>DEV_2ZUU8JBREPCG8SWGL0XWK7NTF.F_NUMBER</code>
	 */
	public static java.lang.Integer fNumber(org.jooq.Configuration configuration, java.lang.Integer n) {
		org.jooq.test.hana.generatedclasses.routines.FNumber f = new org.jooq.test.hana.generatedclasses.routines.FNumber();
		f.setN(n);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>DEV_2ZUU8JBREPCG8SWGL0XWK7NTF.F_NUMBER</code> as a field
	 */
	public static org.jooq.Field<java.lang.Integer> fNumber(java.lang.Integer n) {
		org.jooq.test.hana.generatedclasses.routines.FNumber f = new org.jooq.test.hana.generatedclasses.routines.FNumber();
		f.setN(n);

		return f.asField();
	}

	/**
	 * Get <code>DEV_2ZUU8JBREPCG8SWGL0XWK7NTF.F_NUMBER</code> as a field
	 */
	public static org.jooq.Field<java.lang.Integer> fNumber(org.jooq.Field<java.lang.Integer> n) {
		org.jooq.test.hana.generatedclasses.routines.FNumber f = new org.jooq.test.hana.generatedclasses.routines.FNumber();
		f.setN(n);

		return f.asField();
	}

	/**
	 * Call <code>DEV_2ZUU8JBREPCG8SWGL0XWK7NTF.F_ONE</code>
	 */
	public static java.lang.Integer fOne(org.jooq.Configuration configuration) {
		org.jooq.test.hana.generatedclasses.routines.FOne f = new org.jooq.test.hana.generatedclasses.routines.FOne();

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>DEV_2ZUU8JBREPCG8SWGL0XWK7NTF.F_ONE</code> as a field
	 */
	public static org.jooq.Field<java.lang.Integer> fOne() {
		org.jooq.test.hana.generatedclasses.routines.FOne f = new org.jooq.test.hana.generatedclasses.routines.FOne();

		return f.asField();
	}

	/**
	 * Call <code>DEV_2ZUU8JBREPCG8SWGL0XWK7NTF.F_ONE_TWO</code>
	 */
	public static void fOneTwo(org.jooq.Configuration configuration) {
		org.jooq.test.hana.generatedclasses.routines.FOneTwo p = new org.jooq.test.hana.generatedclasses.routines.FOneTwo();

		p.execute(configuration);
	}

	/**
	 * Call <code>DEV_2ZUU8JBREPCG8SWGL0XWK7NTF.F_TABLES1</code>
	 */
	public static java.lang.Object fTables1(org.jooq.Configuration configuration) {
		org.jooq.test.hana.generatedclasses.routines.FTables1 f = new org.jooq.test.hana.generatedclasses.routines.FTables1();

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>DEV_2ZUU8JBREPCG8SWGL0XWK7NTF.F_TABLES1</code> as a field
	 */
	public static org.jooq.Field<java.lang.Object> fTables1() {
		org.jooq.test.hana.generatedclasses.routines.FTables1 f = new org.jooq.test.hana.generatedclasses.routines.FTables1();

		return f.asField();
	}

	/**
	 * Call <code>DEV_2ZUU8JBREPCG8SWGL0XWK7NTF.F_TABLES2</code>
	 */
	public static java.lang.Object fTables2(org.jooq.Configuration configuration) {
		org.jooq.test.hana.generatedclasses.routines.FTables2 f = new org.jooq.test.hana.generatedclasses.routines.FTables2();

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>DEV_2ZUU8JBREPCG8SWGL0XWK7NTF.F_TABLES2</code> as a field
	 */
	public static org.jooq.Field<java.lang.Object> fTables2() {
		org.jooq.test.hana.generatedclasses.routines.FTables2 f = new org.jooq.test.hana.generatedclasses.routines.FTables2();

		return f.asField();
	}

	/**
	 * Call <code>DEV_2ZUU8JBREPCG8SWGL0XWK7NTF.F_TABLES3</code>
	 */
	public static java.lang.Object fTables3(org.jooq.Configuration configuration) {
		org.jooq.test.hana.generatedclasses.routines.FTables3 f = new org.jooq.test.hana.generatedclasses.routines.FTables3();

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>DEV_2ZUU8JBREPCG8SWGL0XWK7NTF.F_TABLES3</code> as a field
	 */
	public static org.jooq.Field<java.lang.Object> fTables3() {
		org.jooq.test.hana.generatedclasses.routines.FTables3 f = new org.jooq.test.hana.generatedclasses.routines.FTables3();

		return f.asField();
	}

	/**
	 * Call <code>DEV_2ZUU8JBREPCG8SWGL0XWK7NTF.F_TABLES4</code>
	 */
	public static java.lang.Object fTables4(org.jooq.Configuration configuration, java.lang.Integer inId) {
		org.jooq.test.hana.generatedclasses.routines.FTables4 f = new org.jooq.test.hana.generatedclasses.routines.FTables4();
		f.setInId(inId);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>DEV_2ZUU8JBREPCG8SWGL0XWK7NTF.F_TABLES4</code> as a field
	 */
	public static org.jooq.Field<java.lang.Object> fTables4(java.lang.Integer inId) {
		org.jooq.test.hana.generatedclasses.routines.FTables4 f = new org.jooq.test.hana.generatedclasses.routines.FTables4();
		f.setInId(inId);

		return f.asField();
	}

	/**
	 * Get <code>DEV_2ZUU8JBREPCG8SWGL0XWK7NTF.F_TABLES4</code> as a field
	 */
	public static org.jooq.Field<java.lang.Object> fTables4(org.jooq.Field<java.lang.Integer> inId) {
		org.jooq.test.hana.generatedclasses.routines.FTables4 f = new org.jooq.test.hana.generatedclasses.routines.FTables4();
		f.setInId(inId);

		return f.asField();
	}

	/**
	 * Call <code>DEV_2ZUU8JBREPCG8SWGL0XWK7NTF.F_TABLES5</code>
	 */
	public static java.lang.Object fTables5(org.jooq.Configuration configuration, java.lang.Integer v1, java.lang.Integer v2, java.lang.Integer v3) {
		org.jooq.test.hana.generatedclasses.routines.FTables5 f = new org.jooq.test.hana.generatedclasses.routines.FTables5();
		f.setV1(v1);
		f.setV2(v2);
		f.setV3(v3);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>DEV_2ZUU8JBREPCG8SWGL0XWK7NTF.F_TABLES5</code> as a field
	 */
	public static org.jooq.Field<java.lang.Object> fTables5(java.lang.Integer v1, java.lang.Integer v2, java.lang.Integer v3) {
		org.jooq.test.hana.generatedclasses.routines.FTables5 f = new org.jooq.test.hana.generatedclasses.routines.FTables5();
		f.setV1(v1);
		f.setV2(v2);
		f.setV3(v3);

		return f.asField();
	}

	/**
	 * Get <code>DEV_2ZUU8JBREPCG8SWGL0XWK7NTF.F_TABLES5</code> as a field
	 */
	public static org.jooq.Field<java.lang.Object> fTables5(org.jooq.Field<java.lang.Integer> v1, org.jooq.Field<java.lang.Integer> v2, org.jooq.Field<java.lang.Integer> v3) {
		org.jooq.test.hana.generatedclasses.routines.FTables5 f = new org.jooq.test.hana.generatedclasses.routines.FTables5();
		f.setV1(v1);
		f.setV2(v2);
		f.setV3(v3);

		return f.asField();
	}

	/**
	 * Call <code>DEV_2ZUU8JBREPCG8SWGL0XWK7NTF.P391</code>
	 */
	public static org.jooq.test.hana.generatedclasses.routines.P391 p391(org.jooq.Configuration configuration, java.lang.Integer i1, java.lang.Integer io1, java.lang.Integer io2, java.lang.Integer i2) {
		org.jooq.test.hana.generatedclasses.routines.P391 p = new org.jooq.test.hana.generatedclasses.routines.P391();
		p.setI1(i1);
		p.setIo1(io1);
		p.setIo2(io2);
		p.setI2(i2);

		p.execute(configuration);
		return p;
	}

	/**
	 * Call <code>DEV_2ZUU8JBREPCG8SWGL0XWK7NTF.P_AUTHOR_EXISTS</code>
	 */
	public static java.lang.Integer pAuthorExists(org.jooq.Configuration configuration, java.lang.String authorName) {
		org.jooq.test.hana.generatedclasses.routines.PAuthorExists p = new org.jooq.test.hana.generatedclasses.routines.PAuthorExists();
		p.setAuthorName(authorName);

		p.execute(configuration);
		return p.getResult();
	}

	/**
	 * Call <code>DEV_2ZUU8JBREPCG8SWGL0XWK7NTF.P_CREATE_AUTHOR</code>
	 */
	public static void pCreateAuthor(org.jooq.Configuration configuration) {
		org.jooq.test.hana.generatedclasses.routines.PCreateAuthor p = new org.jooq.test.hana.generatedclasses.routines.PCreateAuthor();

		p.execute(configuration);
	}

	/**
	 * Call <code>DEV_2ZUU8JBREPCG8SWGL0XWK7NTF.P_CREATE_AUTHOR_BY_NAME</code>
	 */
	public static void pCreateAuthorByName(org.jooq.Configuration configuration, java.lang.String firstName, java.lang.String lastName) {
		org.jooq.test.hana.generatedclasses.routines.PCreateAuthorByName p = new org.jooq.test.hana.generatedclasses.routines.PCreateAuthorByName();
		p.setFirstName(firstName);
		p.setLastName(lastName);

		p.execute(configuration);
	}

	/**
	 * Call <code>DEV_2ZUU8JBREPCG8SWGL0XWK7NTF.P_UNUSED</code>
	 */
	public static org.jooq.test.hana.generatedclasses.routines.PUnused pUnused(org.jooq.Configuration configuration, java.lang.String in1, java.lang.Integer out2) {
		org.jooq.test.hana.generatedclasses.routines.PUnused p = new org.jooq.test.hana.generatedclasses.routines.PUnused();
		p.setIn1(in1);
		p.setOut2(out2);

		p.execute(configuration);
		return p;
	}
}
