/**
 * This class is generated by jOOQ
 */
package org.jooq.test.postgres.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class TArraysRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.postgres.generatedclasses.tables.records.TArraysRecord> implements org.jooq.Record7<java.lang.Integer, java.lang.String[], java.lang.Integer[], java.sql.Date[], org.jooq.test.postgres.generatedclasses.udt.records.UStreetTypeRecord[], org.jooq.test.postgres.generatedclasses.enums.UCountry[], java.lang.Integer[]> {

	private static final long serialVersionUID = 1378808487;

	/**
	 * Setter for <code>public.t_arrays.id</code>. 
	 */
	public void setId(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>public.t_arrays.id</code>. 
	 */
	public java.lang.Integer getId() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>public.t_arrays.string_array</code>. 
	 */
	public void setStringArray(java.lang.String[] value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>public.t_arrays.string_array</code>. 
	 */
	public java.lang.String[] getStringArray() {
		return (java.lang.String[]) getValue(1);
	}

	/**
	 * Setter for <code>public.t_arrays.number_array</code>. 
	 */
	public void setNumberArray(java.lang.Integer[] value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>public.t_arrays.number_array</code>. 
	 */
	public java.lang.Integer[] getNumberArray() {
		return (java.lang.Integer[]) getValue(2);
	}

	/**
	 * Setter for <code>public.t_arrays.date_array</code>. 
	 */
	public void setDateArray(java.sql.Date[] value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>public.t_arrays.date_array</code>. 
	 */
	public java.sql.Date[] getDateArray() {
		return (java.sql.Date[]) getValue(3);
	}

	/**
	 * Setter for <code>public.t_arrays.udt_array</code>. 
	 */
	public void setUdtArray(org.jooq.test.postgres.generatedclasses.udt.records.UStreetTypeRecord[] value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>public.t_arrays.udt_array</code>. 
	 */
	public org.jooq.test.postgres.generatedclasses.udt.records.UStreetTypeRecord[] getUdtArray() {
		return (org.jooq.test.postgres.generatedclasses.udt.records.UStreetTypeRecord[]) getValue(4);
	}

	/**
	 * Setter for <code>public.t_arrays.enum_array</code>. 
	 */
	public void setEnumArray(org.jooq.test.postgres.generatedclasses.enums.UCountry[] value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>public.t_arrays.enum_array</code>. 
	 */
	public org.jooq.test.postgres.generatedclasses.enums.UCountry[] getEnumArray() {
		return (org.jooq.test.postgres.generatedclasses.enums.UCountry[]) getValue(5);
	}

	/**
	 * Setter for <code>public.t_arrays.array_array</code>. 
	 */
	public void setArrayArray(java.lang.Integer[] value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>public.t_arrays.array_array</code>. 
	 */
	public java.lang.Integer[] getArrayArray() {
		return (java.lang.Integer[]) getValue(6);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<java.lang.Integer> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record7 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row7<java.lang.Integer, java.lang.String[], java.lang.Integer[], java.sql.Date[], org.jooq.test.postgres.generatedclasses.udt.records.UStreetTypeRecord[], org.jooq.test.postgres.generatedclasses.enums.UCountry[], java.lang.Integer[]> fieldsRow() {
		return (org.jooq.Row7) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row7<java.lang.Integer, java.lang.String[], java.lang.Integer[], java.sql.Date[], org.jooq.test.postgres.generatedclasses.udt.records.UStreetTypeRecord[], org.jooq.test.postgres.generatedclasses.enums.UCountry[], java.lang.Integer[]> valuesRow() {
		return (org.jooq.Row7) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return org.jooq.test.postgres.generatedclasses.tables.TArrays.T_ARRAYS.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String[]> field2() {
		return org.jooq.test.postgres.generatedclasses.tables.TArrays.T_ARRAYS.STRING_ARRAY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer[]> field3() {
		return org.jooq.test.postgres.generatedclasses.tables.TArrays.T_ARRAYS.NUMBER_ARRAY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.sql.Date[]> field4() {
		return org.jooq.test.postgres.generatedclasses.tables.TArrays.T_ARRAYS.DATE_ARRAY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<org.jooq.test.postgres.generatedclasses.udt.records.UStreetTypeRecord[]> field5() {
		return org.jooq.test.postgres.generatedclasses.tables.TArrays.T_ARRAYS.UDT_ARRAY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<org.jooq.test.postgres.generatedclasses.enums.UCountry[]> field6() {
		return org.jooq.test.postgres.generatedclasses.tables.TArrays.T_ARRAYS.ENUM_ARRAY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer[]> field7() {
		return org.jooq.test.postgres.generatedclasses.tables.TArrays.T_ARRAYS.ARRAY_ARRAY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String[] value2() {
		return getStringArray();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer[] value3() {
		return getNumberArray();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.sql.Date[] value4() {
		return getDateArray();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.test.postgres.generatedclasses.udt.records.UStreetTypeRecord[] value5() {
		return getUdtArray();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.test.postgres.generatedclasses.enums.UCountry[] value6() {
		return getEnumArray();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer[] value7() {
		return getArrayArray();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached TArraysRecord
	 */
	public TArraysRecord() {
		super(org.jooq.test.postgres.generatedclasses.tables.TArrays.T_ARRAYS);
	}
}
