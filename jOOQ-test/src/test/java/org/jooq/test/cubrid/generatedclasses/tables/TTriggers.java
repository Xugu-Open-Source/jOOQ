/**
 * This class is generated by jOOQ
 */
package org.jooq.test.cubrid.generatedclasses.tables;


import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;
import org.jooq.test.cubrid.generatedclasses.DefaultSchema;
import org.jooq.test.cubrid.generatedclasses.Keys;
import org.jooq.test.cubrid.generatedclasses.tables.records.TTriggersRecord;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TTriggers extends TableImpl<TTriggersRecord> {

	private static final long serialVersionUID = -113335682;

	/**
	 * The reference instance of <code>t_triggers</code>
	 */
	public static final TTriggers T_TRIGGERS = new TTriggers();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<TTriggersRecord> getRecordType() {
		return TTriggersRecord.class;
	}

	/**
	 * The column <code>t_triggers.id_generated</code>.
	 */
	public static final TableField<TTriggersRecord, Integer> ID_GENERATED = createField("id_generated", org.jooq.impl.SQLDataType.INTEGER.nullable(false), T_TRIGGERS, "");

	/**
	 * The column <code>t_triggers.id</code>.
	 */
	public static final TableField<TTriggersRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER, T_TRIGGERS, "");

	/**
	 * The column <code>t_triggers.counter</code>.
	 */
	public static final TableField<TTriggersRecord, Integer> COUNTER = createField("counter", org.jooq.impl.SQLDataType.INTEGER, T_TRIGGERS, "");

	/**
	 * No further instances allowed
	 */
	private TTriggers() {
		this("t_triggers", null);
	}

	private TTriggers(String alias, Table<TTriggersRecord> aliased) {
		this(alias, aliased, null);
	}

	private TTriggers(String alias, Table<TTriggersRecord> aliased, Field<?>[] parameters) {
		super(alias, DefaultSchema.DEFAULT_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Identity<TTriggersRecord, Integer> getIdentity() {
		return Keys.IDENTITY_T_TRIGGERS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<TTriggersRecord> getPrimaryKey() {
		return Keys.T_TRIGGERS__PK_T_TRIGGERS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<TTriggersRecord>> getKeys() {
		return Arrays.<UniqueKey<TTriggersRecord>>asList(Keys.T_TRIGGERS__PK_T_TRIGGERS);
	}
}
