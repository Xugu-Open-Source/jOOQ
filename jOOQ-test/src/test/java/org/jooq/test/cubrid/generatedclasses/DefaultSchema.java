/**
 * This class is generated by jOOQ
 */
package org.jooq.test.cubrid.generatedclasses;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.jooq.Sequence;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;
import org.jooq.test.cubrid.generatedclasses.Sequences;
import org.jooq.test.cubrid.generatedclasses.tables.TAuthor;
import org.jooq.test.cubrid.generatedclasses.tables.TBook;
import org.jooq.test.cubrid.generatedclasses.tables.TBookStore;
import org.jooq.test.cubrid.generatedclasses.tables.TBookToBookStore;
import org.jooq.test.cubrid.generatedclasses.tables.TBooleans;
import org.jooq.test.cubrid.generatedclasses.tables.TDates;
import org.jooq.test.cubrid.generatedclasses.tables.TDirectory;
import org.jooq.test.cubrid.generatedclasses.tables.TExoticTypes;
import org.jooq.test.cubrid.generatedclasses.tables.TIdentity;
import org.jooq.test.cubrid.generatedclasses.tables.TIdentityPk;
import org.jooq.test.cubrid.generatedclasses.tables.TLanguage;
import org.jooq.test.cubrid.generatedclasses.tables.TTriggers;
import org.jooq.test.cubrid.generatedclasses.tables.TUnsigned;
import org.jooq.test.cubrid.generatedclasses.tables.T_639NumbersTable;
import org.jooq.test.cubrid.generatedclasses.tables.T_725LobTest;
import org.jooq.test.cubrid.generatedclasses.tables.T_785;
import org.jooq.test.cubrid.generatedclasses.tables.T_959;
import org.jooq.test.cubrid.generatedclasses.tables.T_986_1;
import org.jooq.test.cubrid.generatedclasses.tables.T_986_2;
import org.jooq.test.cubrid.generatedclasses.tables.VAuthor;
import org.jooq.test.cubrid.generatedclasses.tables.VBook;
import org.jooq.test.cubrid.generatedclasses.tables.VLibrary;
import org.jooq.test.cubrid.generatedclasses.tables.XTestCase_2025;
import org.jooq.test.cubrid.generatedclasses.tables.XTestCase_64_69;
import org.jooq.test.cubrid.generatedclasses.tables.XTestCase_71;
import org.jooq.test.cubrid.generatedclasses.tables.XTestCase_85;
import org.jooq.test.cubrid.generatedclasses.tables.XUnused;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DefaultSchema extends SchemaImpl {

	private static final long serialVersionUID = -1484447033;

	/**
	 * The reference instance of <code></code>
	 */
	public static final DefaultSchema DEFAULT_SCHEMA = new DefaultSchema();

	/**
	 * No further instances allowed
	 */
	private DefaultSchema() {
		super("");
	}

	@Override
	public final List<Sequence<?>> getSequences() {
		List result = new ArrayList();
		result.addAll(getSequences0());
		return result;
	}

	private final List<Sequence<?>> getSequences0() {
		return Arrays.<Sequence<?>>asList(
			Sequences.T_IDENTITY_PK_AI_ID,
			Sequences.T_IDENTITY_AI_ID,
			Sequences.T_TRIGGERS_AI_ID_GENERATED,
			Sequences.S_AUTHOR_ID);
	}

	@Override
	public final List<Table<?>> getTables() {
		List result = new ArrayList();
		result.addAll(getTables0());
		return result;
	}

	private final List<Table<?>> getTables0() {
		return Arrays.<Table<?>>asList(
			T_639NumbersTable.T_639_NUMBERS_TABLE,
			T_725LobTest.T_725_LOB_TEST,
			T_785.T_785,
			T_959.T_959,
			T_986_1.T_986_1,
			T_986_2.T_986_2,
			TAuthor.T_AUTHOR,
			TBook.T_BOOK,
			TBookStore.T_BOOK_STORE,
			TBookToBookStore.T_BOOK_TO_BOOK_STORE,
			TBooleans.T_BOOLEANS,
			TDates.T_DATES,
			TDirectory.T_DIRECTORY,
			TExoticTypes.T_EXOTIC_TYPES,
			TIdentity.T_IDENTITY,
			TIdentityPk.T_IDENTITY_PK,
			TLanguage.T_LANGUAGE,
			TTriggers.T_TRIGGERS,
			TUnsigned.T_UNSIGNED,
			VAuthor.V_AUTHOR,
			VBook.V_BOOK,
			VLibrary.V_LIBRARY,
			XTestCase_2025.X_TEST_CASE_2025,
			XTestCase_64_69.X_TEST_CASE_64_69,
			XTestCase_71.X_TEST_CASE_71,
			XTestCase_85.X_TEST_CASE_85,
			XUnused.X_UNUSED);
	}
}
