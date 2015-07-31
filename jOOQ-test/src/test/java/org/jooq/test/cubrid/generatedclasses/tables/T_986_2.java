/**
 * This class is generated by jOOQ
 */
package org.jooq.test.cubrid.generatedclasses.tables;


import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;
import org.jooq.test.cubrid.generatedclasses.DefaultSchema;
import org.jooq.test.cubrid.generatedclasses.Keys;
import org.jooq.test.cubrid.generatedclasses.tables.records.T_986_2Record;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class T_986_2 extends TableImpl<T_986_2Record> {

	private static final long serialVersionUID = 1035125882;

	/**
	 * The reference instance of <code>t_986_2</code>
	 */
	public static final T_986_2 T_986_2 = new T_986_2();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<T_986_2Record> getRecordType() {
		return T_986_2Record.class;
	}

	/**
	 * The column <code>t_986_2.ref</code>.
	 */
	public static final TableField<T_986_2Record, Integer> REF = createField("ref", org.jooq.impl.SQLDataType.INTEGER.nullable(false), T_986_2, "");

	/**
	 * No further instances allowed
	 */
	private T_986_2() {
		this("t_986_2", null);
	}

	private T_986_2(String alias, Table<T_986_2Record> aliased) {
		this(alias, aliased, null);
	}

	private T_986_2(String alias, Table<T_986_2Record> aliased, Field<?>[] parameters) {
		super(alias, DefaultSchema.DEFAULT_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<T_986_2Record> getPrimaryKey() {
		return Keys.T_986_2__PK_986;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<T_986_2Record>> getKeys() {
		return Arrays.<UniqueKey<T_986_2Record>>asList(Keys.T_986_2__PK_986);
	}
}
