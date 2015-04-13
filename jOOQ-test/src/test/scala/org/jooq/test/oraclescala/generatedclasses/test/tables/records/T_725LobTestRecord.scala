/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oraclescala.generatedclasses.test.tables.records


import java.lang.Integer

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table
import javax.validation.constraints.NotNull

import org.jooq.Field
import org.jooq.Record1
import org.jooq.Record2
import org.jooq.Row2
import org.jooq.impl.UpdatableRecordImpl
import org.jooq.test.oraclescala.generatedclasses.test.tables.T_725LobTest

import scala.Array


/**
 * This class is generated by jOOQ.
 */
@Entity
@Table(name = "T_725_LOB_TEST", schema = "TEST")
class T_725LobTestRecord extends UpdatableRecordImpl[T_725LobTestRecord](T_725LobTest.T_725_LOB_TEST) with Record2[Integer, Array[scala.Byte]] {

	/**
	 * Setter for <code>TEST.T_725_LOB_TEST.ID</code>.
	 */
	def setId(value : Integer) : Unit = {
		setValue(0, value)
	}

	/**
	 * Getter for <code>TEST.T_725_LOB_TEST.ID</code>.
	 */
	@Id
	@Column(name = "ID", unique = true, nullable = false, precision = 7)
	@NotNull
	def getId : Integer = {
		val r = getValue(0)
		if (r == null) null else r.asInstanceOf[Integer]
	}

	/**
	 * Setter for <code>TEST.T_725_LOB_TEST.LOB</code>.
	 */
	def setLob(value : Array[scala.Byte]) : Unit = {
		setValue(1, value)
	}

	/**
	 * Getter for <code>TEST.T_725_LOB_TEST.LOB</code>.
	 */
	@Column(name = "LOB")
	def getLob : Array[scala.Byte] = {
		val r = getValue(1)
		if (r == null) null else r.asInstanceOf[Array[scala.Byte]]
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------
	override def key() : Record1[Integer] = {
		return super.key.asInstanceOf[ Record1[Integer] ]
	}

	// -------------------------------------------------------------------------
	// Record2 type implementation
	// -------------------------------------------------------------------------

	override def fieldsRow : Row2[Integer, Array[scala.Byte]] = {
		super.fieldsRow.asInstanceOf[ Row2[Integer, Array[scala.Byte]] ]
	}

	override def valuesRow : Row2[Integer, Array[scala.Byte]] = {
		super.valuesRow.asInstanceOf[ Row2[Integer, Array[scala.Byte]] ]
	}
	override def field1 : Field[Integer] = T_725LobTest.T_725_LOB_TEST.ID
	override def field2 : Field[Array[scala.Byte]] = T_725LobTest.T_725_LOB_TEST.LOB
	override def value1 : Integer = getId
	override def value2 : Array[scala.Byte] = getLob

	override def value1(value : Integer) : T_725LobTestRecord = {
		setId(value)
		this
	}

	override def value2(value : Array[scala.Byte]) : T_725LobTestRecord = {
		setLob(value)
		this
	}

	override def values(value1 : Integer, value2 : Array[scala.Byte]) : T_725LobTestRecord = {
		this.value1(value1)
		this.value2(value2)
		this
	}

	/**
	 * Create a detached, initialised T_725LobTestRecord
	 */
	def this(id : Integer, lob : Array[scala.Byte]) = {
		this()

		setValue(0, id)
		setValue(1, lob)
	}
}
