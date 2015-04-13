/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oraclescala.generatedclasses.test.tables.records


import java.io.Serializable
import java.lang.Integer
import java.lang.String
import java.util.UUID

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table
import javax.validation.constraints.NotNull

import org.jooq.Field
import org.jooq.Record1
import org.jooq.Record5
import org.jooq.Row5
import org.jooq.impl.UpdatableRecordImpl
import org.jooq.test.oraclescala.generatedclasses.test.tables.TExoticTypes


/**
 * This class is generated by jOOQ.
 */
@Entity
@Table(name = "T_EXOTIC_TYPES", schema = "TEST")
class TExoticTypesRecord extends UpdatableRecordImpl[TExoticTypesRecord](TExoticTypes.T_EXOTIC_TYPES) with Record5[Integer, UUID, Serializable, String, String] {

	/**
	 * Setter for <code>TEST.T_EXOTIC_TYPES.ID</code>.
	 */
	def setId(value : Integer) : Unit = {
		setValue(0, value)
	}

	/**
	 * Getter for <code>TEST.T_EXOTIC_TYPES.ID</code>.
	 */
	@Id
	@Column(name = "ID", unique = true, nullable = false, precision = 7)
	@NotNull
	def getId : Integer = {
		val r = getValue(0)
		if (r == null) null else r.asInstanceOf[Integer]
	}

	/**
	 * Setter for <code>TEST.T_EXOTIC_TYPES.UU</code>.
	 */
	def setUu(value : UUID) : Unit = {
		setValue(1, value)
	}

	/**
	 * Getter for <code>TEST.T_EXOTIC_TYPES.UU</code>.
	 */
	@Column(name = "UU")
	def getUu : UUID = {
		val r = getValue(1)
		if (r == null) null else r.asInstanceOf[UUID]
	}

	/**
	 * Setter for <code>TEST.T_EXOTIC_TYPES.JAVA_IO_SERIALIZABLE</code>.
	 */
	def setJavaIoSerializable(value : Serializable) : Unit = {
		setValue(2, value)
	}

	/**
	 * Getter for <code>TEST.T_EXOTIC_TYPES.JAVA_IO_SERIALIZABLE</code>.
	 */
	@Column(name = "JAVA_IO_SERIALIZABLE")
	def getJavaIoSerializable : Serializable = {
		val r = getValue(2)
		if (r == null) null else r.asInstanceOf[Serializable]
	}

	/**
	 * Setter for <code>TEST.T_EXOTIC_TYPES.PLAIN_SQL_CONVERTER_XML</code>.
	 */
	def setPlainSqlConverterXml(value : String) : Unit = {
		setValue(3, value)
	}

	/**
	 * Getter for <code>TEST.T_EXOTIC_TYPES.PLAIN_SQL_CONVERTER_XML</code>.
	 */
	@Column(name = "PLAIN_SQL_CONVERTER_XML")
	def getPlainSqlConverterXml : String = {
		val r = getValue(3)
		if (r == null) null else r.asInstanceOf[String]
	}

	/**
	 * Setter for <code>TEST.T_EXOTIC_TYPES.PLAIN_SQL_BINDING_XML</code>.
	 */
	def setPlainSqlBindingXml(value : String) : Unit = {
		setValue(4, value)
	}

	/**
	 * Getter for <code>TEST.T_EXOTIC_TYPES.PLAIN_SQL_BINDING_XML</code>.
	 */
	@Column(name = "PLAIN_SQL_BINDING_XML")
	def getPlainSqlBindingXml : String = {
		val r = getValue(4)
		if (r == null) null else r.asInstanceOf[String]
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------
	override def key() : Record1[Integer] = {
		return super.key.asInstanceOf[ Record1[Integer] ]
	}

	// -------------------------------------------------------------------------
	// Record5 type implementation
	// -------------------------------------------------------------------------

	override def fieldsRow : Row5[Integer, UUID, Serializable, String, String] = {
		super.fieldsRow.asInstanceOf[ Row5[Integer, UUID, Serializable, String, String] ]
	}

	override def valuesRow : Row5[Integer, UUID, Serializable, String, String] = {
		super.valuesRow.asInstanceOf[ Row5[Integer, UUID, Serializable, String, String] ]
	}
	override def field1 : Field[Integer] = TExoticTypes.T_EXOTIC_TYPES.ID
	override def field2 : Field[UUID] = TExoticTypes.T_EXOTIC_TYPES.UU
	override def field3 : Field[Serializable] = TExoticTypes.T_EXOTIC_TYPES.JAVA_IO_SERIALIZABLE
	override def field4 : Field[String] = TExoticTypes.T_EXOTIC_TYPES.PLAIN_SQL_CONVERTER_XML
	override def field5 : Field[String] = TExoticTypes.T_EXOTIC_TYPES.PLAIN_SQL_BINDING_XML
	override def value1 : Integer = getId
	override def value2 : UUID = getUu
	override def value3 : Serializable = getJavaIoSerializable
	override def value4 : String = getPlainSqlConverterXml
	override def value5 : String = getPlainSqlBindingXml

	override def value1(value : Integer) : TExoticTypesRecord = {
		setId(value)
		this
	}

	override def value2(value : UUID) : TExoticTypesRecord = {
		setUu(value)
		this
	}

	override def value3(value : Serializable) : TExoticTypesRecord = {
		setJavaIoSerializable(value)
		this
	}

	override def value4(value : String) : TExoticTypesRecord = {
		setPlainSqlConverterXml(value)
		this
	}

	override def value5(value : String) : TExoticTypesRecord = {
		setPlainSqlBindingXml(value)
		this
	}

	override def values(value1 : Integer, value2 : UUID, value3 : Serializable, value4 : String, value5 : String) : TExoticTypesRecord = {
		this.value1(value1)
		this.value2(value2)
		this.value3(value3)
		this.value4(value4)
		this.value5(value5)
		this
	}

	/**
	 * Create a detached, initialised TExoticTypesRecord
	 */
	def this(id : Integer, uu : UUID, javaIoSerializable : Serializable, plainSqlConverterXml : String, plainSqlBindingXml : String) = {
		this()

		setValue(0, id)
		setValue(1, uu)
		setValue(2, javaIoSerializable)
		setValue(3, plainSqlConverterXml)
		setValue(4, plainSqlBindingXml)
	}
}
