/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
@javax.persistence.Entity
@javax.persistence.Table(name = "V_INCOMPLETE", schema = "TEST")
public class V_INCOMPLETE extends org.jooq.impl.TableRecordImpl<org.jooq.test.oracle3.generatedclasses.tables.records.V_INCOMPLETE> implements java.lang.Cloneable, org.jooq.Record11<java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object> {

	private static final long serialVersionUID = -333141894;

	/**
	 * Setter for <code>TEST.V_INCOMPLETE.ID</code>.
	 */
	public void setID(java.lang.Object value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>TEST.V_INCOMPLETE.ID</code>.
	 */
	@javax.persistence.Column(name = "ID")
	public java.lang.Object getID() {
		return (java.lang.Object) getValue(0);
	}

	/**
	 * Setter for <code>TEST.V_INCOMPLETE.AUTHOR_ID</code>.
	 */
	public void setAUTHOR_ID(java.lang.Object value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>TEST.V_INCOMPLETE.AUTHOR_ID</code>.
	 */
	@javax.persistence.Column(name = "AUTHOR_ID")
	public java.lang.Object getAUTHOR_ID() {
		return (java.lang.Object) getValue(1);
	}

	/**
	 * Setter for <code>TEST.V_INCOMPLETE.CO_AUTHOR_ID</code>.
	 */
	public void setCO_AUTHOR_ID(java.lang.Object value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>TEST.V_INCOMPLETE.CO_AUTHOR_ID</code>.
	 */
	@javax.persistence.Column(name = "CO_AUTHOR_ID")
	public java.lang.Object getCO_AUTHOR_ID() {
		return (java.lang.Object) getValue(2);
	}

	/**
	 * Setter for <code>TEST.V_INCOMPLETE.DETAILS_ID</code>.
	 */
	public void setDETAILS_ID(java.lang.Object value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>TEST.V_INCOMPLETE.DETAILS_ID</code>.
	 */
	@javax.persistence.Column(name = "DETAILS_ID")
	public java.lang.Object getDETAILS_ID() {
		return (java.lang.Object) getValue(3);
	}

	/**
	 * Setter for <code>TEST.V_INCOMPLETE.TITLE</code>.
	 */
	public void setTITLE(java.lang.Object value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>TEST.V_INCOMPLETE.TITLE</code>.
	 */
	@javax.persistence.Column(name = "TITLE")
	public java.lang.Object getTITLE() {
		return (java.lang.Object) getValue(4);
	}

	/**
	 * Setter for <code>TEST.V_INCOMPLETE.PUBLISHED_IN</code>.
	 */
	public void setPUBLISHED_IN(java.lang.Object value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>TEST.V_INCOMPLETE.PUBLISHED_IN</code>.
	 */
	@javax.persistence.Column(name = "PUBLISHED_IN")
	public java.lang.Object getPUBLISHED_IN() {
		return (java.lang.Object) getValue(5);
	}

	/**
	 * Setter for <code>TEST.V_INCOMPLETE.LANGUAGE_ID</code>.
	 */
	public void setLANGUAGE_ID(java.lang.Object value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>TEST.V_INCOMPLETE.LANGUAGE_ID</code>.
	 */
	@javax.persistence.Column(name = "LANGUAGE_ID")
	public java.lang.Object getLANGUAGE_ID() {
		return (java.lang.Object) getValue(6);
	}

	/**
	 * Setter for <code>TEST.V_INCOMPLETE.CONTENT_TEXT</code>.
	 */
	public void setCONTENT_TEXT(java.lang.Object value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>TEST.V_INCOMPLETE.CONTENT_TEXT</code>.
	 */
	@javax.persistence.Column(name = "CONTENT_TEXT")
	public java.lang.Object getCONTENT_TEXT() {
		return (java.lang.Object) getValue(7);
	}

	/**
	 * Setter for <code>TEST.V_INCOMPLETE.CONTENT_PDF</code>.
	 */
	public void setCONTENT_PDF(java.lang.Object value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>TEST.V_INCOMPLETE.CONTENT_PDF</code>.
	 */
	@javax.persistence.Column(name = "CONTENT_PDF")
	public java.lang.Object getCONTENT_PDF() {
		return (java.lang.Object) getValue(8);
	}

	/**
	 * Setter for <code>TEST.V_INCOMPLETE.REC_VERSION</code>.
	 */
	public void setREC_VERSION(java.lang.Object value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>TEST.V_INCOMPLETE.REC_VERSION</code>.
	 */
	@javax.persistence.Column(name = "REC_VERSION")
	public java.lang.Object getREC_VERSION() {
		return (java.lang.Object) getValue(9);
	}

	/**
	 * Setter for <code>TEST.V_INCOMPLETE.REC_TIMESTAMP</code>.
	 */
	public void setREC_TIMESTAMP(java.lang.Object value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>TEST.V_INCOMPLETE.REC_TIMESTAMP</code>.
	 */
	@javax.persistence.Column(name = "REC_TIMESTAMP")
	public java.lang.Object getREC_TIMESTAMP() {
		return (java.lang.Object) getValue(10);
	}

	// -------------------------------------------------------------------------
	// Record11 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row11<java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object> fieldsRow() {
		return (org.jooq.Row11) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row11<java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object> valuesRow() {
		return (org.jooq.Row11) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Object> field1() {
		return org.jooq.test.oracle3.generatedclasses.tables.V_INCOMPLETE.V_INCOMPLETE.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Object> field2() {
		return org.jooq.test.oracle3.generatedclasses.tables.V_INCOMPLETE.V_INCOMPLETE.AUTHOR_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Object> field3() {
		return org.jooq.test.oracle3.generatedclasses.tables.V_INCOMPLETE.V_INCOMPLETE.CO_AUTHOR_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Object> field4() {
		return org.jooq.test.oracle3.generatedclasses.tables.V_INCOMPLETE.V_INCOMPLETE.DETAILS_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Object> field5() {
		return org.jooq.test.oracle3.generatedclasses.tables.V_INCOMPLETE.V_INCOMPLETE.TITLE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Object> field6() {
		return org.jooq.test.oracle3.generatedclasses.tables.V_INCOMPLETE.V_INCOMPLETE.PUBLISHED_IN;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Object> field7() {
		return org.jooq.test.oracle3.generatedclasses.tables.V_INCOMPLETE.V_INCOMPLETE.LANGUAGE_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Object> field8() {
		return org.jooq.test.oracle3.generatedclasses.tables.V_INCOMPLETE.V_INCOMPLETE.CONTENT_TEXT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Object> field9() {
		return org.jooq.test.oracle3.generatedclasses.tables.V_INCOMPLETE.V_INCOMPLETE.CONTENT_PDF;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Object> field10() {
		return org.jooq.test.oracle3.generatedclasses.tables.V_INCOMPLETE.V_INCOMPLETE.REC_VERSION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Object> field11() {
		return org.jooq.test.oracle3.generatedclasses.tables.V_INCOMPLETE.V_INCOMPLETE.REC_TIMESTAMP;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Object value1() {
		return getID();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Object value2() {
		return getAUTHOR_ID();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Object value3() {
		return getCO_AUTHOR_ID();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Object value4() {
		return getDETAILS_ID();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Object value5() {
		return getTITLE();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Object value6() {
		return getPUBLISHED_IN();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Object value7() {
		return getLANGUAGE_ID();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Object value8() {
		return getCONTENT_TEXT();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Object value9() {
		return getCONTENT_PDF();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Object value10() {
		return getREC_VERSION();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Object value11() {
		return getREC_TIMESTAMP();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public V_INCOMPLETE value1(java.lang.Object value) {
		setID(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public V_INCOMPLETE value2(java.lang.Object value) {
		setAUTHOR_ID(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public V_INCOMPLETE value3(java.lang.Object value) {
		setCO_AUTHOR_ID(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public V_INCOMPLETE value4(java.lang.Object value) {
		setDETAILS_ID(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public V_INCOMPLETE value5(java.lang.Object value) {
		setTITLE(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public V_INCOMPLETE value6(java.lang.Object value) {
		setPUBLISHED_IN(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public V_INCOMPLETE value7(java.lang.Object value) {
		setLANGUAGE_ID(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public V_INCOMPLETE value8(java.lang.Object value) {
		setCONTENT_TEXT(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public V_INCOMPLETE value9(java.lang.Object value) {
		setCONTENT_PDF(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public V_INCOMPLETE value10(java.lang.Object value) {
		setREC_VERSION(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public V_INCOMPLETE value11(java.lang.Object value) {
		setREC_TIMESTAMP(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public V_INCOMPLETE values(java.lang.Object value1, java.lang.Object value2, java.lang.Object value3, java.lang.Object value4, java.lang.Object value5, java.lang.Object value6, java.lang.Object value7, java.lang.Object value8, java.lang.Object value9, java.lang.Object value10, java.lang.Object value11) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached V_INCOMPLETE
	 */
	public V_INCOMPLETE() {
		super(org.jooq.test.oracle3.generatedclasses.tables.V_INCOMPLETE.V_INCOMPLETE);
	}

	/**
	 * Create a detached, initialised V_INCOMPLETE
	 */
	public V_INCOMPLETE(java.lang.Object ID, java.lang.Object AUTHOR_ID, java.lang.Object CO_AUTHOR_ID, java.lang.Object DETAILS_ID, java.lang.Object TITLE, java.lang.Object PUBLISHED_IN, java.lang.Object LANGUAGE_ID, java.lang.Object CONTENT_TEXT, java.lang.Object CONTENT_PDF, java.lang.Object REC_VERSION, java.lang.Object REC_TIMESTAMP) {
		super(org.jooq.test.oracle3.generatedclasses.tables.V_INCOMPLETE.V_INCOMPLETE);

		setValue(0, ID);
		setValue(1, AUTHOR_ID);
		setValue(2, CO_AUTHOR_ID);
		setValue(3, DETAILS_ID);
		setValue(4, TITLE);
		setValue(5, PUBLISHED_IN);
		setValue(6, LANGUAGE_ID);
		setValue(7, CONTENT_TEXT);
		setValue(8, CONTENT_PDF);
		setValue(9, REC_VERSION);
		setValue(10, REC_TIMESTAMP);
	}
}
