/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.sys.udt.xmltype;


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
public class Extract2 extends AbstractRoutine<XmltypeRecord> {

	private static final long serialVersionUID = 1471340718;

	/**
	 * The parameter <code>SYS.XMLTYPE.EXTRACT.RETURN_VALUE</code>.
	 */
	public static final Parameter<XmltypeRecord> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.test.oracle.generatedclasses.sys.udt.Xmltype.XMLTYPE.getDataType(), false);

	/**
	 * The parameter <code>SYS.XMLTYPE.EXTRACT.SELF</code>.
	 */
	public static final Parameter<XmltypeRecord> SELF = createParameter("SELF", org.jooq.test.oracle.generatedclasses.sys.udt.Xmltype.XMLTYPE.getDataType(), false);

	/**
	 * The parameter <code>SYS.XMLTYPE.EXTRACT.XPATH</code>.
	 */
	public static final Parameter<String> XPATH = createParameter("XPATH", org.jooq.impl.SQLDataType.VARCHAR, false);

	/**
	 * The parameter <code>SYS.XMLTYPE.EXTRACT.NSMAP</code>.
	 */
	public static final Parameter<String> NSMAP = createParameter("NSMAP", org.jooq.impl.SQLDataType.VARCHAR, false);

	/**
	 * Create a new routine call instance
	 */
	public Extract2() {
		super("EXTRACT", Sys.SYS, Xmltype.XMLTYPE, org.jooq.test.oracle.generatedclasses.sys.udt.Xmltype.XMLTYPE.getDataType());

		setReturnParameter(RETURN_VALUE);
		addInParameter(SELF);
		addInParameter(XPATH);
		addInParameter(NSMAP);
		setOverloaded(true);
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

	/**
	 * Set the <code>XPATH</code> parameter IN value to the routine
	 */
	public void setXpath(String value) {
		setValue(XPATH, value);
	}

	/**
	 * Set the <code>XPATH</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setXpath(Field<String> field) {
		setField(XPATH, field);
	}

	/**
	 * Set the <code>NSMAP</code> parameter IN value to the routine
	 */
	public void setNsmap(String value) {
		setValue(NSMAP, value);
	}

	/**
	 * Set the <code>NSMAP</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setNsmap(Field<String> field) {
		setField(NSMAP, field);
	}
}
