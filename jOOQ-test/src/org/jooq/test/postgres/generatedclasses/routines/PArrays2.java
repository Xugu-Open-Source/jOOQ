/**
 * This class is generated by jOOQ
 */
package org.jooq.test.postgres.generatedclasses.routines;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked" })
public class PArrays2 extends org.jooq.impl.AbstractRoutine<java.lang.Void> {

	private static final long serialVersionUID = 703898977;

	/**
	 * The parameter <code>public.p_arrays.in_array</code>. 
	 */
	public static final org.jooq.Parameter<java.lang.Long[]> IN_ARRAY = createParameter("in_array", org.jooq.impl.SQLDataType.BIGINT.getArrayDataType());

	/**
	 * The parameter <code>public.p_arrays.out_array</code>. 
	 */
	public static final org.jooq.Parameter<java.lang.Long[]> OUT_ARRAY = createParameter("out_array", org.jooq.impl.SQLDataType.BIGINT.getArrayDataType());

	/**
	 * Create a new routine call instance
	 */
	public PArrays2() {
		super("p_arrays", org.jooq.test.postgres.generatedclasses.Public.PUBLIC);

		addInParameter(IN_ARRAY);
		addOutParameter(OUT_ARRAY);
		setOverloaded(true);
	}

	/**
	 * Set the <code>in_array</code> parameter IN value to the routine
	 */
	public void setInArray(java.lang.Long[] value) {
		setValue(org.jooq.test.postgres.generatedclasses.routines.PArrays2.IN_ARRAY, value);
	}

	/**
	 * Get the <code>out_array</code> parameter OUT value from the routine
	 */
	public java.lang.Long[] getOutArray() {
		return getValue(OUT_ARRAY);
	}
}
