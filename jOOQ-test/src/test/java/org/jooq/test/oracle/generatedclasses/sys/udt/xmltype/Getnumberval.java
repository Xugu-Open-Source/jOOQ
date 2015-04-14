/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.sys.udt.xmltype;


import java.math.BigDecimal;

import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;
import org.jooq.test.oracle.generatedclasses.sys.Sys;
import org.jooq.test.oracle.generatedclasses.sys.udt.Xmltype;
import org.jooq.test.oracle.generatedclasses.sys.udt.records.XmltypeRecord;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Getnumberval extends AbstractRoutine<BigDecimal> {

	private static final long serialVersionUID = 407140761;

	/**
	 * The parameter <code>SYS.XMLTYPE.GETNUMBERVAL.RETURN_VALUE</code>.
	 */
	public static final Parameter<BigDecimal> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>SYS.XMLTYPE.GETNUMBERVAL.SELF</code>.
	 */
	public static final Parameter<XmltypeRecord> SELF = createParameter("SELF", org.jooq.test.oracle.generatedclasses.sys.udt.Xmltype.XMLTYPE.getDataType(), false);

	/**
	 * Create a new routine call instance
	 */
	public Getnumberval() {
		super("GETNUMBERVAL", Sys.SYS, Xmltype.XMLTYPE, org.jooq.impl.SQLDataType.NUMERIC);

		setReturnParameter(RETURN_VALUE);
		addInParameter(SELF);
	}

	/**
	 * Set the <code>SELF</code> parameter IN value to the routine
	 */
	public void setSelf(XmltypeRecord value) {
		setValue(SELF, value);
	}

	/**
	 * Set the <code>SELF</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setSelf(Field<XmltypeRecord> field) {
		setField(SELF, field);
	}
}
