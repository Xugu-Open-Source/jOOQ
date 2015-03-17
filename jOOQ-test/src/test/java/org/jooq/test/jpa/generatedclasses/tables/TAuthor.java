/**
 * This class is generated by jOOQ
 */
package org.jooq.test.jpa.generatedclasses.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;
import org.jooq.test.jpa.generatedclasses.Keys;
import org.jooq.test.jpa.generatedclasses.Public;


/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.6.0"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TAuthor extends TableImpl<Record> {

	private static final long serialVersionUID = -2025438811;

	/**
	 * The reference instance of <code>PUBLIC.T_AUTHOR</code>
	 */
	public static final TAuthor T_AUTHOR = new TAuthor();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<Record> getRecordType() {
		return Record.class;
	}

	/**
	 * The column <code>PUBLIC.T_AUTHOR.ID</code>.
	 */
	public final TableField<Record, Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>PUBLIC.T_AUTHOR.FIRST_NAME</code>.
	 */
	public final TableField<Record, String> FIRST_NAME = createField("FIRST_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

	/**
	 * The column <code>PUBLIC.T_AUTHOR.LAST_NAME</code>.
	 */
	public final TableField<Record, String> LAST_NAME = createField("LAST_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

	/**
	 * Create a <code>PUBLIC.T_AUTHOR</code> table reference
	 */
	public TAuthor() {
		this("T_AUTHOR", null);
	}

	/**
	 * Create an aliased <code>PUBLIC.T_AUTHOR</code> table reference
	 */
	public TAuthor(String alias) {
		this(alias, T_AUTHOR);
	}

	private TAuthor(String alias, Table<Record> aliased) {
		this(alias, aliased, null);
	}

	private TAuthor(String alias, Table<Record> aliased, Field<?>[] parameters) {
		super(alias, Public.PUBLIC, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<Record> getPrimaryKey() {
		return Keys.CONSTRAINT_2;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<Record>> getKeys() {
		return Arrays.<UniqueKey<Record>>asList(Keys.CONSTRAINT_2);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TAuthor as(String alias) {
		return new TAuthor(alias, this);
	}

	/**
	 * Rename this table
	 */
	public TAuthor rename(String name) {
		return new TAuthor(name, null);
	}
}
