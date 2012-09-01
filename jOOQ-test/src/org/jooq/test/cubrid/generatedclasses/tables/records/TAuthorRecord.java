/**
 * This class is generated by jOOQ
 */
package org.jooq.test.cubrid.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class TAuthorRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.cubrid.generatedclasses.tables.records.TAuthorRecord> {

	private static final long serialVersionUID = -812507340;

	/**
	 * The table column <code>DBA.t_author.id</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public void setId(java.lang.Integer value) {
		setValue(org.jooq.test.cubrid.generatedclasses.tables.TAuthor.ID, value);
	}

	/**
	 * The table column <code>DBA.t_author.id</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public java.lang.Integer getId() {
		return getValue(org.jooq.test.cubrid.generatedclasses.tables.TAuthor.ID);
	}

	/**
	 * The table column <code>DBA.t_author.id</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public java.util.List<org.jooq.test.cubrid.generatedclasses.tables.records.TBookRecord> fetchTBookListByAuthorId() {
		return create()
			.selectFrom(org.jooq.test.cubrid.generatedclasses.tables.TBook.T_BOOK)
			.where(org.jooq.test.cubrid.generatedclasses.tables.TBook.AUTHOR_ID.equal(getValue(org.jooq.test.cubrid.generatedclasses.tables.TAuthor.ID)))
			.fetch();
	}

	/**
	 * The table column <code>DBA.t_author.id</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public java.util.List<org.jooq.test.cubrid.generatedclasses.tables.records.TBookRecord> fetchTBookListByCoAuthorId() {
		return create()
			.selectFrom(org.jooq.test.cubrid.generatedclasses.tables.TBook.T_BOOK)
			.where(org.jooq.test.cubrid.generatedclasses.tables.TBook.CO_AUTHOR_ID.equal(getValue(org.jooq.test.cubrid.generatedclasses.tables.TAuthor.ID)))
			.fetch();
	}

	/**
	 * The table column <code>DBA.t_author.first_name</code>
	 */
	public void setFirstName(java.lang.String value) {
		setValue(org.jooq.test.cubrid.generatedclasses.tables.TAuthor.FIRST_NAME, value);
	}

	/**
	 * The table column <code>DBA.t_author.first_name</code>
	 */
	public java.lang.String getFirstName() {
		return getValue(org.jooq.test.cubrid.generatedclasses.tables.TAuthor.FIRST_NAME);
	}

	/**
	 * The table column <code>DBA.t_author.last_name</code>
	 */
	public void setLastName(java.lang.String value) {
		setValue(org.jooq.test.cubrid.generatedclasses.tables.TAuthor.LAST_NAME, value);
	}

	/**
	 * The table column <code>DBA.t_author.last_name</code>
	 */
	public java.lang.String getLastName() {
		return getValue(org.jooq.test.cubrid.generatedclasses.tables.TAuthor.LAST_NAME);
	}

	/**
	 * The table column <code>DBA.t_author.date_of_birth</code>
	 */
	public void setDateOfBirth(java.sql.Date value) {
		setValue(org.jooq.test.cubrid.generatedclasses.tables.TAuthor.DATE_OF_BIRTH, value);
	}

	/**
	 * The table column <code>DBA.t_author.date_of_birth</code>
	 */
	public java.sql.Date getDateOfBirth() {
		return getValue(org.jooq.test.cubrid.generatedclasses.tables.TAuthor.DATE_OF_BIRTH);
	}

	/**
	 * The table column <code>DBA.t_author.year_of_birth</code>
	 */
	public void setYearOfBirth(java.lang.Integer value) {
		setValue(org.jooq.test.cubrid.generatedclasses.tables.TAuthor.YEAR_OF_BIRTH, value);
	}

	/**
	 * The table column <code>DBA.t_author.year_of_birth</code>
	 */
	public java.lang.Integer getYearOfBirth() {
		return getValue(org.jooq.test.cubrid.generatedclasses.tables.TAuthor.YEAR_OF_BIRTH);
	}

	/**
	 * The table column <code>DBA.t_author.address</code>
	 */
	public void setAddress(java.lang.String value) {
		setValue(org.jooq.test.cubrid.generatedclasses.tables.TAuthor.ADDRESS, value);
	}

	/**
	 * The table column <code>DBA.t_author.address</code>
	 */
	public java.lang.String getAddress() {
		return getValue(org.jooq.test.cubrid.generatedclasses.tables.TAuthor.ADDRESS);
	}

	/**
	 * Create a detached TAuthorRecord
	 */
	public TAuthorRecord() {
		super(org.jooq.test.cubrid.generatedclasses.tables.TAuthor.T_AUTHOR);
	}
}
