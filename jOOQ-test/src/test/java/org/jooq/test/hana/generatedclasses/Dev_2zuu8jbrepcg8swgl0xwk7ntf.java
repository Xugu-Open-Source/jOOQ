/**
 * This class is generated by jOOQ
 */
package org.jooq.test.hana.generatedclasses;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Dev_2zuu8jbrepcg8swgl0xwk7ntf extends org.jooq.impl.SchemaImpl {

	private static final long serialVersionUID = -1110359597;

	/**
	 * The reference instance of <code>DEV_2ZUU8JBREPCG8SWGL0XWK7NTF</code>
	 */
	public static final Dev_2zuu8jbrepcg8swgl0xwk7ntf DEV_2ZUU8JBREPCG8SWGL0XWK7NTF = new Dev_2zuu8jbrepcg8swgl0xwk7ntf();

	/**
	 * No further instances allowed
	 */
	private Dev_2zuu8jbrepcg8swgl0xwk7ntf() {
		super("DEV_2ZUU8JBREPCG8SWGL0XWK7NTF");
	}

	@Override
	public final java.util.List<org.jooq.Sequence<?>> getSequences() {
		java.util.List result = new java.util.ArrayList();
		result.addAll(getSequences0());
		return result;
	}

	private final java.util.List<org.jooq.Sequence<?>> getSequences0() {
		return java.util.Arrays.<org.jooq.Sequence<?>>asList(
			org.jooq.test.hana.generatedclasses.Sequences.S_AUTHOR_ID);
	}

	@Override
	public final java.util.List<org.jooq.Table<?>> getTables() {
		java.util.List result = new java.util.ArrayList();
		result.addAll(getTables0());
		return result;
	}

	private final java.util.List<org.jooq.Table<?>> getTables0() {
		return java.util.Arrays.<org.jooq.Table<?>>asList(
			org.jooq.test.hana.generatedclasses.tables.T_2845CaseSensitivity.T_2845_CASE_SENSITIVITY,
			org.jooq.test.hana.generatedclasses.tables.T_639NumbersTable.T_639_NUMBERS_TABLE,
			org.jooq.test.hana.generatedclasses.tables.T_725LobTest.T_725_LOB_TEST,
			org.jooq.test.hana.generatedclasses.tables.T_785.T_785,
			org.jooq.test.hana.generatedclasses.tables.TArrays.T_ARRAYS,
			org.jooq.test.hana.generatedclasses.tables.TAuthor.T_AUTHOR,
			org.jooq.test.hana.generatedclasses.tables.TBook.T_BOOK,
			org.jooq.test.hana.generatedclasses.tables.TBookDetails.T_BOOK_DETAILS,
			org.jooq.test.hana.generatedclasses.tables.TBookStore.T_BOOK_STORE,
			org.jooq.test.hana.generatedclasses.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE,
			org.jooq.test.hana.generatedclasses.tables.TBooleans.T_BOOLEANS,
			org.jooq.test.hana.generatedclasses.tables.TDates.T_DATES,
			org.jooq.test.hana.generatedclasses.tables.TExoticTypes.T_EXOTIC_TYPES,
			org.jooq.test.hana.generatedclasses.tables.TIdentity.T_IDENTITY,
			org.jooq.test.hana.generatedclasses.tables.TIdentityPk.T_IDENTITY_PK,
			org.jooq.test.hana.generatedclasses.tables.TLanguage.T_LANGUAGE,
			org.jooq.test.hana.generatedclasses.tables.TUnsigned.T_UNSIGNED,
			org.jooq.test.hana.generatedclasses.tables.VAuthor.V_AUTHOR,
			org.jooq.test.hana.generatedclasses.tables.VBook.V_BOOK,
			org.jooq.test.hana.generatedclasses.tables.VLibrary.V_LIBRARY,
			org.jooq.test.hana.generatedclasses.tables.XTestCase_2025.X_TEST_CASE_2025,
			org.jooq.test.hana.generatedclasses.tables.XTestCase_85.X_TEST_CASE_85,
			org.jooq.test.hana.generatedclasses.tables.XUnused.X_UNUSED);
	}
}
