/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.test.tables.records;


import java.io.Serializable;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.test.oracle.generatedclasses.test.tables.TExoticTypes;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
@Entity
@Table(name = "T_EXOTIC_TYPES", schema = "TEST")
public class TExoticTypesRecord extends UpdatableRecordImpl<TExoticTypesRecord> implements Record5<Integer, UUID, Serializable, String, String> {

	private static final long serialVersionUID = 1629129797;

	/**
	 * Setter for <code>TEST.T_EXOTIC_TYPES.ID</code>.
	 */
	public void setId(Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>TEST.T_EXOTIC_TYPES.ID</code>.
	 */
	@Id
	@Column(name = "ID", unique = true, nullable = false, precision = 7)
	@NotNull
	public Integer getId() {
		return (Integer) getValue(0);
	}

	/**
	 * Setter for <code>TEST.T_EXOTIC_TYPES.UU</code>.
	 */
	public void setUu(UUID value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>TEST.T_EXOTIC_TYPES.UU</code>.
	 */
	@Column(name = "UU")
	public UUID getUu() {
		return (UUID) getValue(1);
	}

	/**
	 * Setter for <code>TEST.T_EXOTIC_TYPES.JAVA_IO_SERIALIZABLE</code>.
	 */
	public void setJavaIoSerializable(Serializable value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>TEST.T_EXOTIC_TYPES.JAVA_IO_SERIALIZABLE</code>.
	 */
	@Column(name = "JAVA_IO_SERIALIZABLE")
	public Serializable getJavaIoSerializable() {
		return (Serializable) getValue(2);
	}

	/**
	 * Setter for <code>TEST.T_EXOTIC_TYPES.PLAIN_SQL_CONVERTER_XML</code>.
	 */
	public void setPlainSqlConverterXml(String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>TEST.T_EXOTIC_TYPES.PLAIN_SQL_CONVERTER_XML</code>.
	 */
	@Column(name = "PLAIN_SQL_CONVERTER_XML")
	public String getPlainSqlConverterXml() {
		return (String) getValue(3);
	}

	/**
	 * Setter for <code>TEST.T_EXOTIC_TYPES.PLAIN_SQL_BINDING_XML</code>.
	 */
	public void setPlainSqlBindingXml(String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>TEST.T_EXOTIC_TYPES.PLAIN_SQL_BINDING_XML</code>.
	 */
	@Column(name = "PLAIN_SQL_BINDING_XML")
	public String getPlainSqlBindingXml() {
		return (String) getValue(4);
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
	// Record5 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row5<Integer, UUID, Serializable, String, String> fieldsRow() {
		return (Row5) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row5<Integer, UUID, Serializable, String, String> valuesRow() {
		return (Row5) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field1() {
		return TExoticTypes.T_EXOTIC_TYPES.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<UUID> field2() {
		return TExoticTypes.T_EXOTIC_TYPES.UU;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Serializable> field3() {
		return TExoticTypes.T_EXOTIC_TYPES.JAVA_IO_SERIALIZABLE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field4() {
		return TExoticTypes.T_EXOTIC_TYPES.PLAIN_SQL_CONVERTER_XML;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field5() {
		return TExoticTypes.T_EXOTIC_TYPES.PLAIN_SQL_BINDING_XML;
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
	public UUID value2() {
		return getUu();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Serializable value3() {
		return getJavaIoSerializable();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value4() {
		return getPlainSqlConverterXml();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value5() {
		return getPlainSqlBindingXml();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TExoticTypesRecord value1(Integer value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TExoticTypesRecord value2(UUID value) {
		setUu(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TExoticTypesRecord value3(Serializable value) {
		setJavaIoSerializable(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TExoticTypesRecord value4(String value) {
		setPlainSqlConverterXml(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TExoticTypesRecord value5(String value) {
		setPlainSqlBindingXml(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TExoticTypesRecord values(Integer value1, UUID value2, Serializable value3, String value4, String value5) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		value5(value5);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached TExoticTypesRecord
	 */
	public TExoticTypesRecord() {
		super(TExoticTypes.T_EXOTIC_TYPES);
	}

	/**
	 * Create a detached, initialised TExoticTypesRecord
	 */
	public TExoticTypesRecord(Integer id, UUID uu, Serializable javaIoSerializable, String plainSqlConverterXml, String plainSqlBindingXml) {
		super(TExoticTypes.T_EXOTIC_TYPES);

		setValue(0, id);
		setValue(1, uu);
		setValue(2, javaIoSerializable);
		setValue(3, plainSqlConverterXml);
		setValue(4, plainSqlBindingXml);
	}
}
