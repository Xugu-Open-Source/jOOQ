/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oraclescala.generatedclasses.multi_schema.udt.records


import java.lang.Integer

import org.jooq.Field
import org.jooq.Record3
import org.jooq.Row3
import org.jooq.impl.UDTRecordImpl
import org.jooq.test.oraclescala.generatedclasses.multi_schema.udt.NumberObject


/**
 * This class is generated by jOOQ.
 */
class NumberObjectRecord extends UDTRecordImpl[NumberObjectRecord](NumberObject.NUMBER_OBJECT) with Record3[Integer, Integer, Integer] {

	/**
	 * Setter for <code>MULTI_SCHEMA.NUMBER_OBJECT.A</code>.
	 */
	def setA(value : Integer) : Unit = {
		setValue(0, value)
	}

	/**
	 * Getter for <code>MULTI_SCHEMA.NUMBER_OBJECT.A</code>.
	 */
	def getA : Integer = {
		val r = getValue(0)
		if (r == null) null else r.asInstanceOf[Integer]
	}

	/**
	 * Setter for <code>MULTI_SCHEMA.NUMBER_OBJECT.B</code>.
	 */
	def setB(value : Integer) : Unit = {
		setValue(1, value)
	}

	/**
	 * Getter for <code>MULTI_SCHEMA.NUMBER_OBJECT.B</code>.
	 */
	def getB : Integer = {
		val r = getValue(1)
		if (r == null) null else r.asInstanceOf[Integer]
	}

	/**
	 * Setter for <code>MULTI_SCHEMA.NUMBER_OBJECT.C</code>.
	 */
	def setC(value : Integer) : Unit = {
		setValue(2, value)
	}

	/**
	 * Getter for <code>MULTI_SCHEMA.NUMBER_OBJECT.C</code>.
	 */
	def getC : Integer = {
		val r = getValue(2)
		if (r == null) null else r.asInstanceOf[Integer]
	}

	// -------------------------------------------------------------------------
	// Record3 type implementation
	// -------------------------------------------------------------------------

	override def fieldsRow : Row3[Integer, Integer, Integer] = {
		super.fieldsRow.asInstanceOf[ Row3[Integer, Integer, Integer] ]
	}

	override def valuesRow : Row3[Integer, Integer, Integer] = {
		super.valuesRow.asInstanceOf[ Row3[Integer, Integer, Integer] ]
	}
	override def field1 : Field[Integer] = NumberObject.A
	override def field2 : Field[Integer] = NumberObject.B
	override def field3 : Field[Integer] = NumberObject.C
	override def value1 : Integer = getA
	override def value2 : Integer = getB
	override def value3 : Integer = getC

	override def value1(value : Integer) : NumberObjectRecord = {
		setA(value)
		this
	}

	override def value2(value : Integer) : NumberObjectRecord = {
		setB(value)
		this
	}

	override def value3(value : Integer) : NumberObjectRecord = {
		setC(value)
		this
	}

	override def values(value1 : Integer, value2 : Integer, value3 : Integer) : NumberObjectRecord = {
		this.value1(value1)
		this.value2(value2)
		this.value3(value3)
		this
	}

	/**
	 * Create a detached, initialised NumberObjectRecord
	 */
	def this(a : Integer, b : Integer, c : Integer) = {
		this()

		setValue(0, a)
		setValue(1, b)
		setValue(2, c)
	}
}
