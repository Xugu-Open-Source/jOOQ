/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.test.tables.records;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.test.oracle.generatedclasses.test.tables.TDirectory;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
@Entity
@Table(name = "T_DIRECTORY", schema = "TEST")
public class TDirectoryRecord extends UpdatableRecordImpl<TDirectoryRecord> implements Record4<Integer, Integer, Integer, String> {

	private static final long serialVersionUID = -817802550;

	/**
	 * Setter for <code>TEST.T_DIRECTORY.ID</code>.
	 */
	public void setId(Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>TEST.T_DIRECTORY.ID</code>.
	 */
	@Id
	@Column(name = "ID", unique = true, nullable = false, precision = 7)
	@NotNull
	public Integer getId() {
		return (Integer) getValue(0);
	}

	/**
	 * Setter for <code>TEST.T_DIRECTORY.PARENT_ID</code>.
	 */
	public void setParentId(Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>TEST.T_DIRECTORY.PARENT_ID</code>.
	 */
	@Column(name = "PARENT_ID", precision = 7)
	public Integer getParentId() {
		return (Integer) getValue(1);
	}

	/**
	 * Setter for <code>TEST.T_DIRECTORY.IS_DIRECTORY</code>.
	 */
	public void setIsDirectory(Integer value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>TEST.T_DIRECTORY.IS_DIRECTORY</code>.
	 */
	@Column(name = "IS_DIRECTORY", precision = 7)
	public Integer getIsDirectory() {
		return (Integer) getValue(2);
	}

	/**
	 * Setter for <code>TEST.T_DIRECTORY.name</code>.
	 */
	public void setName(String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>TEST.T_DIRECTORY.name</code>.
	 */
	@Column(name = "name", length = 50)
	@Size(max = 50)
	public String getName() {
		return (String) getValue(3);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record1<Integer> key() {
		return (Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record4 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row4<Integer, Integer, Integer, String> fieldsRow() {
		return (Row4) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row4<Integer, Integer, Integer, String> valuesRow() {
		return (Row4) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field1() {
		return TDirectory.T_DIRECTORY.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field2() {
		return TDirectory.T_DIRECTORY.PARENT_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field3() {
		return TDirectory.T_DIRECTORY.IS_DIRECTORY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field4() {
		return TDirectory.T_DIRECTORY.NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value2() {
		return getParentId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value3() {
		return getIsDirectory();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value4() {
		return getName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TDirectoryRecord value1(Integer value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TDirectoryRecord value2(Integer value) {
		setParentId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TDirectoryRecord value3(Integer value) {
		setIsDirectory(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TDirectoryRecord value4(String value) {
		setName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TDirectoryRecord values(Integer value1, Integer value2, Integer value3, String value4) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached TDirectoryRecord
	 */
	public TDirectoryRecord() {
		super(TDirectory.T_DIRECTORY);
	}

	/**
	 * Create a detached, initialised TDirectoryRecord
	 */
	public TDirectoryRecord(Integer id, Integer parentId, Integer isDirectory, String name) {
		super(TDirectory.T_DIRECTORY);

		setValue(0, id);
		setValue(1, parentId);
		setValue(2, isDirectory);
		setValue(3, name);
	}
}
