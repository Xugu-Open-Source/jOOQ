/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oraclescala.generatedclasses.test.packages.pls_objects


import java.lang.Object

import org.jooq.Parameter
import org.jooq.impl.AbstractRoutine
import org.jooq.test.oraclescala.generatedclasses.test.Test
import org.jooq.test.oraclescala.generatedclasses.test.packages.PlsObjects


object PBool {

	/**
	 * The parameter <code>TEST.PLS_OBJECTS.P_BOOL.I</code>.
	 */
	val I : Parameter[Object] = AbstractRoutine.createParameter("I", org.jooq.impl.DefaultDataType.getDefaultDataType("PL/SQL BOOLEAN"), false)

	/**
	 * The parameter <code>TEST.PLS_OBJECTS.P_BOOL.IO</code>.
	 */
	val IO : Parameter[Object] = AbstractRoutine.createParameter("IO", org.jooq.impl.DefaultDataType.getDefaultDataType("PL/SQL BOOLEAN"), false)

	/**
	 * The parameter <code>TEST.PLS_OBJECTS.P_BOOL.O</code>.
	 */
	val O : Parameter[Object] = AbstractRoutine.createParameter("O", org.jooq.impl.DefaultDataType.getDefaultDataType("PL/SQL BOOLEAN"), false)
}

/**
 * This class is generated by jOOQ.
 */
class PBool extends AbstractRoutine[java.lang.Void]("P_BOOL", Test.TEST, PlsObjects.PLS_OBJECTS) {
	{
		addInParameter(PBool.I)
		addInOutParameter(PBool.IO)
		addOutParameter(PBool.O)
	}

	/**
	 * Set the <code>I</code> parameter IN value to the routine
	 */
	def setI(value : Object) : Unit = {
		setValue(PBool.I, value)
	}

	/**
	 * Set the <code>IO</code> parameter IN value to the routine
	 */
	def setIo(value : Object) : Unit = {
		setValue(PBool.IO, value)
	}

	/**
	 * Get the <code>IO</code> parameter OUT value from the routine
	 */
	def getIo : Object = {
		getValue(PBool.IO)
	}

	/**
	 * Get the <code>O</code> parameter OUT value from the routine
	 */
	def getO : Object = {
		getValue(PBool.O)
	}
}
