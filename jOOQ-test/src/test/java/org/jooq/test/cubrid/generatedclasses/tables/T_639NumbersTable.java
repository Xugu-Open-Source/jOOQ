/**
 * This class is generated by jOOQ
 */
package org.jooq.test.cubrid.generatedclasses.tables;


import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;
import org.jooq.test.cubrid.generatedclasses.DefaultSchema;
import org.jooq.test.cubrid.generatedclasses.Keys;
import org.jooq.test.cubrid.generatedclasses.tables.records.T_639NumbersTableRecord;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class T_639NumbersTable extends TableImpl<T_639NumbersTableRecord> {

	private static final long serialVersionUID = 169832644;

	/**
	 * The reference instance of <code>t_639_numbers_table</code>
	 */
	public static final T_639NumbersTable T_639_NUMBERS_TABLE = new T_639NumbersTable();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<T_639NumbersTableRecord> getRecordType() {
		return T_639NumbersTableRecord.class;
	}

	/**
	 * The column <code>t_639_numbers_table.id</code>.
	 */
	public static final TableField<T_639NumbersTableRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), T_639_NUMBERS_TABLE, "");

	/**
	 * The column <code>t_639_numbers_table.short</code>.
	 */
	public static final TableField<T_639NumbersTableRecord, Short> SHORT = createField("short", org.jooq.impl.SQLDataType.SMALLINT, T_639_NUMBERS_TABLE, "");

	/**
	 * The column <code>t_639_numbers_table.integer</code>.
	 */
	public static final TableField<T_639NumbersTableRecord, Integer> INTEGER = createField("integer", org.jooq.impl.SQLDataType.INTEGER, T_639_NUMBERS_TABLE, "");

	/**
	 * The column <code>t_639_numbers_table.long</code>.
	 */
	public static final TableField<T_639NumbersTableRecord, Long> LONG = createField("long", org.jooq.impl.SQLDataType.BIGINT, T_639_NUMBERS_TABLE, "");

	/**
	 * The column <code>t_639_numbers_table.byte_decimal</code>.
	 */
	public static final TableField<T_639NumbersTableRecord, Byte> BYTE_DECIMAL = createField("byte_decimal", org.jooq.impl.SQLDataType.TINYINT, T_639_NUMBERS_TABLE, "");

	/**
	 * The column <code>t_639_numbers_table.short_decimal</code>.
	 */
	public static final TableField<T_639NumbersTableRecord, Short> SHORT_DECIMAL = createField("short_decimal", org.jooq.impl.SQLDataType.SMALLINT, T_639_NUMBERS_TABLE, "");

	/**
	 * The column <code>t_639_numbers_table.integer_decimal</code>.
	 */
	public static final TableField<T_639NumbersTableRecord, Integer> INTEGER_DECIMAL = createField("integer_decimal", org.jooq.impl.SQLDataType.INTEGER, T_639_NUMBERS_TABLE, "");

	/**
	 * The column <code>t_639_numbers_table.long_decimal</code>.
	 */
	public static final TableField<T_639NumbersTableRecord, Long> LONG_DECIMAL = createField("long_decimal", org.jooq.impl.SQLDataType.BIGINT, T_639_NUMBERS_TABLE, "");

	/**
	 * The column <code>t_639_numbers_table.big_integer</code>.
	 */
	public static final TableField<T_639NumbersTableRecord, BigInteger> BIG_INTEGER = createField("big_integer", org.jooq.impl.SQLDataType.DECIMAL_INTEGER.precision(22), T_639_NUMBERS_TABLE, "");

	/**
	 * The column <code>t_639_numbers_table.big_decimal</code>.
	 */
	public static final TableField<T_639NumbersTableRecord, BigDecimal> BIG_DECIMAL = createField("big_decimal", org.jooq.impl.SQLDataType.DECIMAL.precision(22, 5), T_639_NUMBERS_TABLE, "");

	/**
	 * The column <code>t_639_numbers_table.float</code>.
	 */
	public static final TableField<T_639NumbersTableRecord, Float> FLOAT = createField("float", org.jooq.impl.SQLDataType.REAL, T_639_NUMBERS_TABLE, "");

	/**
	 * The column <code>t_639_numbers_table.double</code>.
	 */
	public static final TableField<T_639NumbersTableRecord, Double> DOUBLE = createField("double", org.jooq.impl.SQLDataType.DOUBLE, T_639_NUMBERS_TABLE, "");

	/**
	 * No further instances allowed
	 */
	private T_639NumbersTable() {
		this("t_639_numbers_table", null);
	}

	private T_639NumbersTable(String alias, Table<T_639NumbersTableRecord> aliased) {
		this(alias, aliased, null);
	}

	private T_639NumbersTable(String alias, Table<T_639NumbersTableRecord> aliased, Field<?>[] parameters) {
		super(alias, DefaultSchema.DEFAULT_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<T_639NumbersTableRecord> getPrimaryKey() {
		return Keys.T_639_NUMBERS_TABLE__PK_T_639_NUMBERS_TABLE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<T_639NumbersTableRecord>> getKeys() {
		return Arrays.<UniqueKey<T_639NumbersTableRecord>>asList(Keys.T_639_NUMBERS_TABLE__PK_T_639_NUMBERS_TABLE);
	}
}
