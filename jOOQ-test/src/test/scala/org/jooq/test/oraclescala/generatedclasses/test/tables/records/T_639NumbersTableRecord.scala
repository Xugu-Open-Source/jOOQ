/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oraclescala.generatedclasses.test.tables.records


import java.lang.Byte
import java.lang.Double
import java.lang.Integer
import java.lang.Long
import java.lang.Short
import java.math.BigDecimal
import java.math.BigInteger

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table
import javax.validation.constraints.NotNull

import org.jooq.Field
import org.jooq.Record1
import org.jooq.Record13
import org.jooq.Row13
import org.jooq.impl.UpdatableRecordImpl
import org.jooq.test.oraclescala.generatedclasses.test.tables.T_639NumbersTable


/**
 * This class is generated by jOOQ.
 */
@Entity
@Table(name = "T_639_NUMBERS_TABLE", schema = "TEST")
class T_639NumbersTableRecord extends UpdatableRecordImpl[T_639NumbersTableRecord](T_639NumbersTable.T_639_NUMBERS_TABLE) with Record13[Integer, Byte, Short, Integer, Long, Byte, Short, Integer, Long, BigInteger, BigDecimal, Double, Double] {

	/**
	 * Setter for <code>TEST.T_639_NUMBERS_TABLE.ID</code>.
	 */
	def setId(value : Integer) : Unit = {
		setValue(0, value)
	}

	/**
	 * Getter for <code>TEST.T_639_NUMBERS_TABLE.ID</code>.
	 */
	@Id
	@Column(name = "ID", unique = true, nullable = false, precision = 7)
	@NotNull
	def getId : Integer = {
		val r = getValue(0)
		if (r == null) null else r.asInstanceOf[Integer]
	}

	/**
	 * Setter for <code>TEST.T_639_NUMBERS_TABLE.BYTE</code>.
	 */
	def setByte(value : Byte) : Unit = {
		setValue(1, value)
	}

	/**
	 * Getter for <code>TEST.T_639_NUMBERS_TABLE.BYTE</code>.
	 */
	@Column(name = "BYTE", precision = 2)
	def getByte : Byte = {
		val r = getValue(1)
		if (r == null) null else r.asInstanceOf[Byte]
	}

	/**
	 * Setter for <code>TEST.T_639_NUMBERS_TABLE.SHORT</code>.
	 */
	def setShort(value : Short) : Unit = {
		setValue(2, value)
	}

	/**
	 * Getter for <code>TEST.T_639_NUMBERS_TABLE.SHORT</code>.
	 */
	@Column(name = "SHORT", precision = 4)
	def getShort : Short = {
		val r = getValue(2)
		if (r == null) null else r.asInstanceOf[Short]
	}

	/**
	 * Setter for <code>TEST.T_639_NUMBERS_TABLE.INTEGER</code>.
	 */
	def setInteger(value : Integer) : Unit = {
		setValue(3, value)
	}

	/**
	 * Getter for <code>TEST.T_639_NUMBERS_TABLE.INTEGER</code>.
	 */
	@Column(name = "INTEGER", precision = 7)
	def getInteger : Integer = {
		val r = getValue(3)
		if (r == null) null else r.asInstanceOf[Integer]
	}

	/**
	 * Setter for <code>TEST.T_639_NUMBERS_TABLE.LONG</code>.
	 */
	def setLong(value : Long) : Unit = {
		setValue(4, value)
	}

	/**
	 * Getter for <code>TEST.T_639_NUMBERS_TABLE.LONG</code>.
	 */
	@Column(name = "LONG", precision = 18)
	def getLong : Long = {
		val r = getValue(4)
		if (r == null) null else r.asInstanceOf[Long]
	}

	/**
	 * Setter for <code>TEST.T_639_NUMBERS_TABLE.BYTE_DECIMAL</code>.
	 */
	def setByteDecimal(value : Byte) : Unit = {
		setValue(5, value)
	}

	/**
	 * Getter for <code>TEST.T_639_NUMBERS_TABLE.BYTE_DECIMAL</code>.
	 */
	@Column(name = "BYTE_DECIMAL", precision = 2)
	def getByteDecimal : Byte = {
		val r = getValue(5)
		if (r == null) null else r.asInstanceOf[Byte]
	}

	/**
	 * Setter for <code>TEST.T_639_NUMBERS_TABLE.SHORT_DECIMAL</code>.
	 */
	def setShortDecimal(value : Short) : Unit = {
		setValue(6, value)
	}

	/**
	 * Getter for <code>TEST.T_639_NUMBERS_TABLE.SHORT_DECIMAL</code>.
	 */
	@Column(name = "SHORT_DECIMAL", precision = 4)
	def getShortDecimal : Short = {
		val r = getValue(6)
		if (r == null) null else r.asInstanceOf[Short]
	}

	/**
	 * Setter for <code>TEST.T_639_NUMBERS_TABLE.INTEGER_DECIMAL</code>.
	 */
	def setIntegerDecimal(value : Integer) : Unit = {
		setValue(7, value)
	}

	/**
	 * Getter for <code>TEST.T_639_NUMBERS_TABLE.INTEGER_DECIMAL</code>.
	 */
	@Column(name = "INTEGER_DECIMAL", precision = 9)
	def getIntegerDecimal : Integer = {
		val r = getValue(7)
		if (r == null) null else r.asInstanceOf[Integer]
	}

	/**
	 * Setter for <code>TEST.T_639_NUMBERS_TABLE.LONG_DECIMAL</code>.
	 */
	def setLongDecimal(value : Long) : Unit = {
		setValue(8, value)
	}

	/**
	 * Getter for <code>TEST.T_639_NUMBERS_TABLE.LONG_DECIMAL</code>.
	 */
	@Column(name = "LONG_DECIMAL", precision = 18)
	def getLongDecimal : Long = {
		val r = getValue(8)
		if (r == null) null else r.asInstanceOf[Long]
	}

	/**
	 * Setter for <code>TEST.T_639_NUMBERS_TABLE.BIG_INTEGER</code>.
	 */
	def setBigInteger(value : BigInteger) : Unit = {
		setValue(9, value)
	}

	/**
	 * Getter for <code>TEST.T_639_NUMBERS_TABLE.BIG_INTEGER</code>.
	 */
	@Column(name = "BIG_INTEGER", precision = 22)
	def getBigInteger : BigInteger = {
		val r = getValue(9)
		if (r == null) null else r.asInstanceOf[BigInteger]
	}

	/**
	 * Setter for <code>TEST.T_639_NUMBERS_TABLE.BIG_DECIMAL</code>.
	 */
	def setBigDecimal(value : BigDecimal) : Unit = {
		setValue(10, value)
	}

	/**
	 * Getter for <code>TEST.T_639_NUMBERS_TABLE.BIG_DECIMAL</code>.
	 */
	@Column(name = "BIG_DECIMAL", precision = 22, scale = 5)
	def getBigDecimal : BigDecimal = {
		val r = getValue(10)
		if (r == null) null else r.asInstanceOf[BigDecimal]
	}

	/**
	 * Setter for <code>TEST.T_639_NUMBERS_TABLE.FLOAT</code>.
	 */
	def setFloat(value : Double) : Unit = {
		setValue(11, value)
	}

	/**
	 * Getter for <code>TEST.T_639_NUMBERS_TABLE.FLOAT</code>.
	 */
	@Column(name = "FLOAT", precision = 126)
	def getFloat : Double = {
		val r = getValue(11)
		if (r == null) null else r.asInstanceOf[Double]
	}

	/**
	 * Setter for <code>TEST.T_639_NUMBERS_TABLE.REAL</code>.
	 */
	def setReal(value : Double) : Unit = {
		setValue(12, value)
	}

	/**
	 * Getter for <code>TEST.T_639_NUMBERS_TABLE.REAL</code>.
	 */
	@Column(name = "REAL", precision = 63)
	def getReal : Double = {
		val r = getValue(12)
		if (r == null) null else r.asInstanceOf[Double]
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------
	override def key() : Record1[Integer] = {
		return super.key.asInstanceOf[ Record1[Integer] ]
	}

	// -------------------------------------------------------------------------
	// Record13 type implementation
	// -------------------------------------------------------------------------

	override def fieldsRow : Row13[Integer, Byte, Short, Integer, Long, Byte, Short, Integer, Long, BigInteger, BigDecimal, Double, Double] = {
		super.fieldsRow.asInstanceOf[ Row13[Integer, Byte, Short, Integer, Long, Byte, Short, Integer, Long, BigInteger, BigDecimal, Double, Double] ]
	}

	override def valuesRow : Row13[Integer, Byte, Short, Integer, Long, Byte, Short, Integer, Long, BigInteger, BigDecimal, Double, Double] = {
		super.valuesRow.asInstanceOf[ Row13[Integer, Byte, Short, Integer, Long, Byte, Short, Integer, Long, BigInteger, BigDecimal, Double, Double] ]
	}
	override def field1 : Field[Integer] = T_639NumbersTable.T_639_NUMBERS_TABLE.ID
	override def field2 : Field[Byte] = T_639NumbersTable.T_639_NUMBERS_TABLE.BYTE
	override def field3 : Field[Short] = T_639NumbersTable.T_639_NUMBERS_TABLE.SHORT
	override def field4 : Field[Integer] = T_639NumbersTable.T_639_NUMBERS_TABLE.INTEGER
	override def field5 : Field[Long] = T_639NumbersTable.T_639_NUMBERS_TABLE.LONG
	override def field6 : Field[Byte] = T_639NumbersTable.T_639_NUMBERS_TABLE.BYTE_DECIMAL
	override def field7 : Field[Short] = T_639NumbersTable.T_639_NUMBERS_TABLE.SHORT_DECIMAL
	override def field8 : Field[Integer] = T_639NumbersTable.T_639_NUMBERS_TABLE.INTEGER_DECIMAL
	override def field9 : Field[Long] = T_639NumbersTable.T_639_NUMBERS_TABLE.LONG_DECIMAL
	override def field10 : Field[BigInteger] = T_639NumbersTable.T_639_NUMBERS_TABLE.BIG_INTEGER
	override def field11 : Field[BigDecimal] = T_639NumbersTable.T_639_NUMBERS_TABLE.BIG_DECIMAL
	override def field12 : Field[Double] = T_639NumbersTable.T_639_NUMBERS_TABLE.FLOAT
	override def field13 : Field[Double] = T_639NumbersTable.T_639_NUMBERS_TABLE.REAL
	override def value1 : Integer = getId
	override def value2 : Byte = getByte
	override def value3 : Short = getShort
	override def value4 : Integer = getInteger
	override def value5 : Long = getLong
	override def value6 : Byte = getByteDecimal
	override def value7 : Short = getShortDecimal
	override def value8 : Integer = getIntegerDecimal
	override def value9 : Long = getLongDecimal
	override def value10 : BigInteger = getBigInteger
	override def value11 : BigDecimal = getBigDecimal
	override def value12 : Double = getFloat
	override def value13 : Double = getReal

	override def value1(value : Integer) : T_639NumbersTableRecord = {
		setId(value)
		this
	}

	override def value2(value : Byte) : T_639NumbersTableRecord = {
		setByte(value)
		this
	}

	override def value3(value : Short) : T_639NumbersTableRecord = {
		setShort(value)
		this
	}

	override def value4(value : Integer) : T_639NumbersTableRecord = {
		setInteger(value)
		this
	}

	override def value5(value : Long) : T_639NumbersTableRecord = {
		setLong(value)
		this
	}

	override def value6(value : Byte) : T_639NumbersTableRecord = {
		setByteDecimal(value)
		this
	}

	override def value7(value : Short) : T_639NumbersTableRecord = {
		setShortDecimal(value)
		this
	}

	override def value8(value : Integer) : T_639NumbersTableRecord = {
		setIntegerDecimal(value)
		this
	}

	override def value9(value : Long) : T_639NumbersTableRecord = {
		setLongDecimal(value)
		this
	}

	override def value10(value : BigInteger) : T_639NumbersTableRecord = {
		setBigInteger(value)
		this
	}

	override def value11(value : BigDecimal) : T_639NumbersTableRecord = {
		setBigDecimal(value)
		this
	}

	override def value12(value : Double) : T_639NumbersTableRecord = {
		setFloat(value)
		this
	}

	override def value13(value : Double) : T_639NumbersTableRecord = {
		setReal(value)
		this
	}

	override def values(value1 : Integer, value2 : Byte, value3 : Short, value4 : Integer, value5 : Long, value6 : Byte, value7 : Short, value8 : Integer, value9 : Long, value10 : BigInteger, value11 : BigDecimal, value12 : Double, value13 : Double) : T_639NumbersTableRecord = {
		this.value1(value1)
		this.value2(value2)
		this.value3(value3)
		this.value4(value4)
		this.value5(value5)
		this.value6(value6)
		this.value7(value7)
		this.value8(value8)
		this.value9(value9)
		this.value10(value10)
		this.value11(value11)
		this.value12(value12)
		this.value13(value13)
		this
	}

	/**
	 * Create a detached, initialised T_639NumbersTableRecord
	 */
	def this(id : Integer, byte_ : Byte, short_ : Short, integer : Integer, long_ : Long, byteDecimal : Byte, shortDecimal : Short, integerDecimal : Integer, longDecimal : Long, bigInteger : BigInteger, bigDecimal : BigDecimal, float_ : Double, real : Double) = {
		this()

		setValue(0, id)
		setValue(1, byte_)
		setValue(2, short_)
		setValue(3, integer)
		setValue(4, long_)
		setValue(5, byteDecimal)
		setValue(6, shortDecimal)
		setValue(7, integerDecimal)
		setValue(8, longDecimal)
		setValue(9, bigInteger)
		setValue(10, bigDecimal)
		setValue(11, float_)
		setValue(12, real)
	}
}
