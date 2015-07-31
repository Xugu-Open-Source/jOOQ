/**
 * This class is generated by jOOQ
 */
package org.jooq.test.cubrid.generatedclasses.tables;


import org.jooq.Field;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.TableImpl;
import org.jooq.test.cubrid.generatedclasses.DefaultSchema;
import org.jooq.test.cubrid.generatedclasses.enums.VBookStatus;
import org.jooq.test.cubrid.generatedclasses.tables.records.VBookRecord;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class VBook extends TableImpl<VBookRecord> {

	private static final long serialVersionUID = -670896959;

	/**
	 * The reference instance of <code>v_book</code>
	 */
	public static final VBook V_BOOK = new VBook();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<VBookRecord> getRecordType() {
		return VBookRecord.class;
	}

	/**
	 * The column <code>v_book.id</code>.
	 */
	public static final TableField<VBookRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER, V_BOOK, "");

	/**
	 * The column <code>v_book.author_id</code>.
	 */
	public static final TableField<VBookRecord, Integer> AUTHOR_ID = createField("author_id", org.jooq.impl.SQLDataType.INTEGER, V_BOOK, "");

	/**
	 * The column <code>v_book.co_author_id</code>.
	 */
	public static final TableField<VBookRecord, Integer> CO_AUTHOR_ID = createField("co_author_id", org.jooq.impl.SQLDataType.INTEGER, V_BOOK, "");

	/**
	 * The column <code>v_book.details_id</code>.
	 */
	public static final TableField<VBookRecord, Integer> DETAILS_ID = createField("details_id", org.jooq.impl.SQLDataType.INTEGER, V_BOOK, "");

	/**
	 * The column <code>v_book.title</code>.
	 */
	public static final TableField<VBookRecord, String> TITLE = createField("title", org.jooq.impl.SQLDataType.VARCHAR.length(400), V_BOOK, "");

	/**
	 * The column <code>v_book.published_in</code>.
	 */
	public static final TableField<VBookRecord, Integer> PUBLISHED_IN = createField("published_in", org.jooq.impl.SQLDataType.INTEGER, V_BOOK, "");

	/**
	 * The column <code>v_book.language_id</code>.
	 */
	public static final TableField<VBookRecord, Integer> LANGUAGE_ID = createField("language_id", org.jooq.impl.SQLDataType.INTEGER.defaulted(true), V_BOOK, "");

	/**
	 * The column <code>v_book.content_text</code>.
	 */
	public static final TableField<VBookRecord, String> CONTENT_TEXT = createField("content_text", org.jooq.impl.SQLDataType.CLOB, V_BOOK, "");

	/**
	 * The column <code>v_book.content_pdf</code>.
	 */
	public static final TableField<VBookRecord, byte[]> CONTENT_PDF = createField("content_pdf", org.jooq.impl.SQLDataType.BLOB, V_BOOK, "");

	/**
	 * The column <code>v_book.status</code>.
	 */
	public static final TableField<VBookRecord, VBookStatus> STATUS = createField("status", org.jooq.util.cubrid.CUBRIDDataType.VARCHAR.asEnumDataType(org.jooq.test.cubrid.generatedclasses.enums.VBookStatus.class), V_BOOK, "");

	/**
	 * No further instances allowed
	 */
	private VBook() {
		this("v_book", null);
	}

	private VBook(String alias, Table<VBookRecord> aliased) {
		this(alias, aliased, null);
	}

	private VBook(String alias, Table<VBookRecord> aliased, Field<?>[] parameters) {
		super(alias, DefaultSchema.DEFAULT_SCHEMA, aliased, parameters, "");
	}
}
