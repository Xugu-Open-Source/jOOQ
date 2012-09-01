/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.person.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class ContactType extends org.jooq.impl.UpdatableTableImpl<org.jooq.examples.sqlserver.adventureworks.person.tables.records.ContactType> {

	private static final long serialVersionUID = 993446331;

	/**
	 * The singleton instance of Person.ContactType
	 */
	public static final org.jooq.examples.sqlserver.adventureworks.person.tables.ContactType ContactType = new org.jooq.examples.sqlserver.adventureworks.person.tables.ContactType();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.examples.sqlserver.adventureworks.person.tables.records.ContactType> getRecordType() {
		return org.jooq.examples.sqlserver.adventureworks.person.tables.records.ContactType.class;
	}

	/**
	 * The table column <code>Person.ContactType.ContactTypeID</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.person.tables.records.ContactType, java.lang.Integer> ContactTypeID = createField("ContactTypeID", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The table column <code>Person.ContactType.Name</code>
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.person.tables.records.ContactType, java.lang.String> Name = createField("Name", org.jooq.impl.SQLDataType.NVARCHAR, this);

	/**
	 * The table column <code>Person.ContactType.ModifiedDate</code>
	 */
	public final org.jooq.TableField<org.jooq.examples.sqlserver.adventureworks.person.tables.records.ContactType, java.sql.Timestamp> ModifiedDate = createField("ModifiedDate", org.jooq.impl.SQLDataType.TIMESTAMP, this);

	public ContactType() {
		super("ContactType", org.jooq.examples.sqlserver.adventureworks.person.Person.Person);
	}

	public ContactType(java.lang.String alias) {
		super(alias, org.jooq.examples.sqlserver.adventureworks.person.Person.Person, org.jooq.examples.sqlserver.adventureworks.person.tables.ContactType.ContactType);
	}

	@Override
	public org.jooq.Identity<org.jooq.examples.sqlserver.adventureworks.person.tables.records.ContactType, java.lang.Integer> getIdentity() {
		return org.jooq.examples.sqlserver.adventureworks.person.Keys.IDENTITY_ContactType;
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.person.tables.records.ContactType> getMainKey() {
		return org.jooq.examples.sqlserver.adventureworks.person.Keys.PK_ContactType_ContactTypeID;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.person.tables.records.ContactType>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.examples.sqlserver.adventureworks.person.tables.records.ContactType>>asList(org.jooq.examples.sqlserver.adventureworks.person.Keys.PK_ContactType_ContactTypeID);
	}

	@Override
	public org.jooq.examples.sqlserver.adventureworks.person.tables.ContactType as(java.lang.String alias) {
		return new org.jooq.examples.sqlserver.adventureworks.person.tables.ContactType(alias);
	}
}
