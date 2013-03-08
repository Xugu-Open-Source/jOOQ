/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.tables.pojos;

/**
 * This class is generated by jOOQ.
 *
 * An unused table in the same schema.
 */
@java.lang.SuppressWarnings({ "all", "unchecked" })
@javax.persistence.Entity
@javax.persistence.Table(name = "X_UNUSED", uniqueConstraints = {
	@javax.persistence.UniqueConstraint(columnNames = {"ID", "NAME"})
})
public class X_UNUSED_POJO extends java.lang.ThreadDeath implements java.lang.Cloneable, org.jooq.test.oracle3.generatedclasses.tables.interfaces.X_UNUSED_INTERFACE {

	private static final long serialVersionUID = -1914831094;

	private java.lang.Integer    ID;
	private java.lang.String     NAME;
	private java.math.BigInteger BIG_INTEGER;
	private java.lang.Integer    ID_REF;
	private java.lang.Integer    CLASS;
	private java.lang.Integer    FIELDS;
	private java.lang.Integer    CONFIGURATION;
	private java.lang.Integer    U_D_T;
	private java.lang.Integer    META_DATA;
	private java.lang.Integer    TYPE0;
	private java.lang.Integer    PRIMARY_KEY;
	private java.lang.Integer    PRIMARYKEY;
	private java.lang.String     NAME_REF;
	private java.math.BigDecimal FIELD_737;
	private java.lang.Integer    MS_UNUSED_ID_REF;
	private java.lang.String     MS_UNUSED_NAME_REF;

	@javax.persistence.Column(name = "ID", unique = true, nullable = false, precision = 7)
	@Override
	public java.lang.Integer getID() {
		return this.ID;
	}

	@Override
	public void setID(java.lang.Integer ID) {
		this.ID = ID;
	}

	@javax.persistence.Column(name = "NAME", nullable = false, length = 10)
	@Override
	public java.lang.String getNAME() {
		return this.NAME;
	}

	@Override
	public void setNAME(java.lang.String NAME) {
		this.NAME = NAME;
	}

	@javax.persistence.Column(name = "BIG_INTEGER", precision = 38)
	@Override
	public java.math.BigInteger getBIG_INTEGER() {
		return this.BIG_INTEGER;
	}

	@Override
	public void setBIG_INTEGER(java.math.BigInteger BIG_INTEGER) {
		this.BIG_INTEGER = BIG_INTEGER;
	}

	@javax.persistence.Column(name = "ID_REF", precision = 7)
	@Override
	public java.lang.Integer getID_REF() {
		return this.ID_REF;
	}

	@Override
	public void setID_REF(java.lang.Integer ID_REF) {
		this.ID_REF = ID_REF;
	}

	@javax.persistence.Column(name = "CLASS", precision = 7)
	@Override
	public java.lang.Integer getCLASS() {
		return this.CLASS;
	}

	@Override
	public void setCLASS(java.lang.Integer CLASS) {
		this.CLASS = CLASS;
	}

	@javax.persistence.Column(name = "FIELDS", precision = 7)
	@Override
	public java.lang.Integer getFIELDS() {
		return this.FIELDS;
	}

	@Override
	public void setFIELDS(java.lang.Integer FIELDS) {
		this.FIELDS = FIELDS;
	}

	@javax.persistence.Column(name = "CONFIGURATION", precision = 7)
	@Override
	public java.lang.Integer getCONFIGURATION() {
		return this.CONFIGURATION;
	}

	@Override
	public void setCONFIGURATION(java.lang.Integer CONFIGURATION) {
		this.CONFIGURATION = CONFIGURATION;
	}

	@javax.persistence.Column(name = "U_D_T", precision = 7)
	@Override
	public java.lang.Integer getU_D_T() {
		return this.U_D_T;
	}

	@Override
	public void setU_D_T(java.lang.Integer U_D_T) {
		this.U_D_T = U_D_T;
	}

	@javax.persistence.Column(name = "META_DATA", precision = 7)
	@Override
	public java.lang.Integer getMETA_DATA() {
		return this.META_DATA;
	}

	@Override
	public void setMETA_DATA(java.lang.Integer META_DATA) {
		this.META_DATA = META_DATA;
	}

	@javax.persistence.Column(name = "TYPE0", precision = 7)
	@Override
	public java.lang.Integer getTYPE0() {
		return this.TYPE0;
	}

	@Override
	public void setTYPE0(java.lang.Integer TYPE0) {
		this.TYPE0 = TYPE0;
	}

	@javax.persistence.Column(name = "PRIMARY_KEY", precision = 7)
	@Override
	public java.lang.Integer getPRIMARY_KEY() {
		return this.PRIMARY_KEY;
	}

	@Override
	public void setPRIMARY_KEY(java.lang.Integer PRIMARY_KEY) {
		this.PRIMARY_KEY = PRIMARY_KEY;
	}

	@javax.persistence.Column(name = "PRIMARYKEY", precision = 7)
	@Override
	public java.lang.Integer getPRIMARYKEY() {
		return this.PRIMARYKEY;
	}

	@Override
	public void setPRIMARYKEY(java.lang.Integer PRIMARYKEY) {
		this.PRIMARYKEY = PRIMARYKEY;
	}

	@javax.persistence.Column(name = "NAME_REF", length = 10)
	@Override
	public java.lang.String getNAME_REF() {
		return this.NAME_REF;
	}

	@Override
	public void setNAME_REF(java.lang.String NAME_REF) {
		this.NAME_REF = NAME_REF;
	}

	@javax.persistence.Column(name = "FIELD 737", precision = 25, scale = 2)
	@Override
	public java.math.BigDecimal getFIELD_737() {
		return this.FIELD_737;
	}

	@Override
	public void setFIELD_737(java.math.BigDecimal FIELD_737) {
		this.FIELD_737 = FIELD_737;
	}

	@javax.persistence.Column(name = "MS_UNUSED_ID_REF", precision = 7)
	@Override
	public java.lang.Integer getMS_UNUSED_ID_REF() {
		return this.MS_UNUSED_ID_REF;
	}

	@Override
	public void setMS_UNUSED_ID_REF(java.lang.Integer MS_UNUSED_ID_REF) {
		this.MS_UNUSED_ID_REF = MS_UNUSED_ID_REF;
	}

	@javax.persistence.Column(name = "MS_UNUSED_NAME_REF", length = 10)
	@Override
	public java.lang.String getMS_UNUSED_NAME_REF() {
		return this.MS_UNUSED_NAME_REF;
	}

	@Override
	public void setMS_UNUSED_NAME_REF(java.lang.String MS_UNUSED_NAME_REF) {
		this.MS_UNUSED_NAME_REF = MS_UNUSED_NAME_REF;
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(org.jooq.test.oracle3.generatedclasses.tables.interfaces.X_UNUSED_INTERFACE from) {
		setID(from.getID());
		setNAME(from.getNAME());
		setBIG_INTEGER(from.getBIG_INTEGER());
		setID_REF(from.getID_REF());
		setCLASS(from.getCLASS());
		setFIELDS(from.getFIELDS());
		setCONFIGURATION(from.getCONFIGURATION());
		setU_D_T(from.getU_D_T());
		setMETA_DATA(from.getMETA_DATA());
		setTYPE0(from.getTYPE0());
		setPRIMARY_KEY(from.getPRIMARY_KEY());
		setPRIMARYKEY(from.getPRIMARYKEY());
		setNAME_REF(from.getNAME_REF());
		setFIELD_737(from.getFIELD_737());
		setMS_UNUSED_ID_REF(from.getMS_UNUSED_ID_REF());
		setMS_UNUSED_NAME_REF(from.getMS_UNUSED_NAME_REF());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends org.jooq.test.oracle3.generatedclasses.tables.interfaces.X_UNUSED_INTERFACE> E into(E into) {
		into.from(this);
		return into;
	}
}
