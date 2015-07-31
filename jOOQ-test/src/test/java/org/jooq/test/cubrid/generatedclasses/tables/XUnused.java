/**
 * This class is generated by jOOQ
 */
package org.jooq.test.cubrid.generatedclasses.tables;


import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;
import org.jooq.test.cubrid.generatedclasses.DefaultSchema;
import org.jooq.test.cubrid.generatedclasses.Keys;
import org.jooq.test.cubrid.generatedclasses.tables.records.XUnusedRecord;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class XUnused extends TableImpl<XUnusedRecord> {

	private static final long serialVersionUID = 379277314;

	/**
	 * The reference instance of <code>x_unused</code>
	 */
	public static final XUnused X_UNUSED = new XUnused();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<XUnusedRecord> getRecordType() {
		return XUnusedRecord.class;
	}

	/**
	 * The column <code>x_unused.id</code>.
	 */
	public static final TableField<XUnusedRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), X_UNUSED, "");

	/**
	 * The column <code>x_unused.name</code>.
	 */
	public static final TableField<XUnusedRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(10).nullable(false), X_UNUSED, "");

	/**
	 * The column <code>x_unused.big_integer</code>.
	 */
	public static final TableField<XUnusedRecord, BigInteger> BIG_INTEGER = createField("big_integer", org.jooq.impl.SQLDataType.DECIMAL_INTEGER.precision(25), X_UNUSED, "");

	/**
	 * The column <code>x_unused.id_ref</code>.
	 */
	public static final TableField<XUnusedRecord, Integer> ID_REF = createField("id_ref", org.jooq.impl.SQLDataType.INTEGER, X_UNUSED, "");

	/**
	 * The column <code>x_unused.name_ref</code>.
	 */
	public static final TableField<XUnusedRecord, String> NAME_REF = createField("name_ref", org.jooq.impl.SQLDataType.VARCHAR.length(10), X_UNUSED, "");

	/**
	 * The column <code>x_unused.class</code>.
	 */
	public static final TableField<XUnusedRecord, Integer> CLASS = createField("class", org.jooq.impl.SQLDataType.INTEGER, X_UNUSED, "");

	/**
	 * The column <code>x_unused.fields</code>.
	 */
	public static final TableField<XUnusedRecord, Integer> FIELDS = createField("fields", org.jooq.impl.SQLDataType.INTEGER, X_UNUSED, "");

	/**
	 * The column <code>x_unused.configuration</code>.
	 */
	public static final TableField<XUnusedRecord, Integer> CONFIGURATION = createField("configuration", org.jooq.impl.SQLDataType.INTEGER, X_UNUSED, "");

	/**
	 * The column <code>x_unused.u_d_t</code>.
	 */
	public static final TableField<XUnusedRecord, Integer> U_D_T = createField("u_d_t", org.jooq.impl.SQLDataType.INTEGER, X_UNUSED, "");

	/**
	 * The column <code>x_unused.meta_data</code>.
	 */
	public static final TableField<XUnusedRecord, Integer> META_DATA = createField("meta_data", org.jooq.impl.SQLDataType.INTEGER, X_UNUSED, "");

	/**
	 * The column <code>x_unused.type0</code>.
	 */
	public static final TableField<XUnusedRecord, Integer> TYPE0 = createField("type0", org.jooq.impl.SQLDataType.INTEGER, X_UNUSED, "");

	/**
	 * The column <code>x_unused.primary_key</code>.
	 */
	public static final TableField<XUnusedRecord, Integer> PRIMARY_KEY = createField("primary_key", org.jooq.impl.SQLDataType.INTEGER, X_UNUSED, "");

	/**
	 * The column <code>x_unused.primarykey</code>.
	 */
	public static final TableField<XUnusedRecord, Integer> PRIMARYKEY = createField("primarykey", org.jooq.impl.SQLDataType.INTEGER, X_UNUSED, "");

	/**
	 * The column <code>x_unused.field 737</code>.
	 */
	public static final TableField<XUnusedRecord, BigDecimal> FIELD_737 = createField("field 737", org.jooq.impl.SQLDataType.DECIMAL.precision(25, 2), X_UNUSED, "");

	/**
	 * No further instances allowed
	 */
	private XUnused() {
		this("x_unused", null);
	}

	private XUnused(String alias, Table<XUnusedRecord> aliased) {
		this(alias, aliased, null);
	}

	private XUnused(String alias, Table<XUnusedRecord> aliased, Field<?>[] parameters) {
		super(alias, DefaultSchema.DEFAULT_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<XUnusedRecord> getPrimaryKey() {
		return Keys.X_UNUSED__PK_X_UNUSED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<XUnusedRecord>> getKeys() {
		return Arrays.<UniqueKey<XUnusedRecord>>asList(Keys.X_UNUSED__UK_X_UNUSED_ID, Keys.X_UNUSED__PK_X_UNUSED);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<ForeignKey<XUnusedRecord, ?>> getReferences() {
		return Arrays.<ForeignKey<XUnusedRecord, ?>>asList(Keys.X_UNUSED__FK_X_UNUSED_SELF);
	}
}
