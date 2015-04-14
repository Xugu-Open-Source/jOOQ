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
public class Createxml5 extends AbstractRoutine<XmltypeRecord> {

	private static final long serialVersionUID = -123781771;

	/**
	 * The parameter <code>SYS.XMLTYPE.CREATEXML.RETURN_VALUE</code>.
	 */
	public static final Parameter<XmltypeRecord> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.test.oracle.generatedclasses.sys.udt.Xmltype.XMLTYPE.getDataType(), false);

	/**
	 * The parameter <code>SYS.XMLTYPE.CREATEXML.XMLDATA</code>.
	 */
	public static final Parameter<byte[]> XMLDATA = createParameter("XMLDATA", org.jooq.impl.SQLDataType.BLOB, false);

	/**
	 * The parameter <code>SYS.XMLTYPE.CREATEXML.CSID</code>.
	 */
	public static final Parameter<BigDecimal> CSID = createParameter("CSID", org.jooq.impl.SQLDataType.NUMERIC, false);

	/**
	 * The parameter <code>SYS.XMLTYPE.CREATEXML.SCHEMA</code>.
	 */
	public static final Parameter<String> SCHEMA = createParameter("SCHEMA", org.jooq.impl.SQLDataType.VARCHAR, false);

	/**
	 * The parameter <code>SYS.XMLTYPE.CREATEXML.VALIDATED</code>.
	 */
	public static final Parameter<BigDecimal> VALIDATED = createParameter("VALIDATED", org.jooq.impl.SQLDataType.NUMERIC.defaulted(true), true);

	/**
	 * The parameter <code>SYS.XMLTYPE.CREATEXML.WELLFORMED</code>.
	 */
	public static final Parameter<BigDecimal> WELLFORMED = createParameter("WELLFORMED", org.jooq.impl.SQLDataType.NUMERIC.defaulted(true), true);

	/**
	 * Create a new routine call instance
	 */
	public Createxml5() {
		super("CREATEXML", Sys.SYS, Xmltype.XMLTYPE, org.jooq.test.oracle.generatedclasses.sys.udt.Xmltype.XMLTYPE.getDataType());

		setReturnParameter(RETURN_VALUE);
		addInParameter(XMLDATA);
		addInParameter(CSID);
		addInParameter(SCHEMA);
		addInParameter(VALIDATED);
		addInParameter(WELLFORMED);
		setOverloaded(true);
	}

	/**
	 * Set the <code>XMLDATA</code> parameter IN value to the routine
	 */
	public void setXmldata(byte[] value) {
		setValue(XMLDATA, value);
	}

	/**
	 * Set the <code>XMLDATA</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setXmldata(Field<byte[]> field) {
		setField(XMLDATA, field);
	}

	/**
	 * Set the <code>CSID</code> parameter IN value to the routine
	 */
	public void setCsid(Number value) {
		setNumber(CSID, value);
	}

	/**
	 * Set the <code>CSID</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setCsid(Field<? extends Number> field) {
		setNumber(CSID, field);
	}

	/**
	 * Set the <code>SCHEMA</code> parameter IN value to the routine
	 */
	public void setSchema_(String value) {
		setValue(SCHEMA, value);
	}

	/**
	 * Set the <code>SCHEMA</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setSchema_(Field<String> field) {
		setField(SCHEMA, field);
	}

	/**
	 * Set the <code>VALIDATED</code> parameter IN value to the routine
	 */
	public void setValidated(Number value) {
		setNumber(VALIDATED, value);
	}

	/**
	 * Set the <code>VALIDATED</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setValidated(Field<? extends Number> field) {
		setNumber(VALIDATED, field);
	}

	/**
	 * Set the <code>WELLFORMED</code> parameter IN value to the routine
	 */
	public void setWellformed(Number value) {
		setNumber(WELLFORMED, value);
	}

	/**
	 * Set the <code>WELLFORMED</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setWellformed(Field<? extends Number> field) {
		setNumber(WELLFORMED, field);
	}
}
