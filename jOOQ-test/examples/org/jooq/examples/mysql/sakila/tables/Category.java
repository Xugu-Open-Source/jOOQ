/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.mysql.sakila.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class Category extends org.jooq.impl.UpdatableTableImpl<org.jooq.examples.mysql.sakila.tables.records.CategoryRecord> {

	private static final long serialVersionUID = 603207873;

	/**
	 * The singleton instance of sakila.category
	 */
	public static final org.jooq.examples.mysql.sakila.tables.Category CATEGORY = new org.jooq.examples.mysql.sakila.tables.Category();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.examples.mysql.sakila.tables.records.CategoryRecord> getRecordType() {
		return org.jooq.examples.mysql.sakila.tables.records.CategoryRecord.class;
	}

	/**
	 * The table column <code>sakila.category.category_id</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.CategoryRecord, java.lang.Byte> CATEGORY_ID = createField("category_id", org.jooq.impl.SQLDataType.TINYINT, this);

	/**
	 * The table column <code>sakila.category.name</code>
	 */
	public final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.CategoryRecord, java.lang.String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * The table column <code>sakila.category.last_update</code>
	 */
	public final org.jooq.TableField<org.jooq.examples.mysql.sakila.tables.records.CategoryRecord, java.sql.Timestamp> LAST_UPDATE = createField("last_update", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	public Category() {
		super("category", org.jooq.examples.mysql.sakila.Sakila.SAKILA);
	}

	public Category(java.lang.String alias) {
		super(alias, org.jooq.examples.mysql.sakila.Sakila.SAKILA, org.jooq.examples.mysql.sakila.tables.Category.CATEGORY);
	}

	@Override
	public org.jooq.Identity<org.jooq.examples.mysql.sakila.tables.records.CategoryRecord, java.lang.Byte> getIdentity() {
		return org.jooq.examples.mysql.sakila.Keys.IDENTITY_CATEGORY;
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.examples.mysql.sakila.tables.records.CategoryRecord> getMainKey() {
		return org.jooq.examples.mysql.sakila.Keys.KEY_CATEGORY_PRIMARY;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.examples.mysql.sakila.tables.records.CategoryRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.examples.mysql.sakila.tables.records.CategoryRecord>>asList(org.jooq.examples.mysql.sakila.Keys.KEY_CATEGORY_PRIMARY);
	}

	@Override
	public org.jooq.examples.mysql.sakila.tables.Category as(java.lang.String alias) {
		return new org.jooq.examples.mysql.sakila.tables.Category(alias);
	}
}
