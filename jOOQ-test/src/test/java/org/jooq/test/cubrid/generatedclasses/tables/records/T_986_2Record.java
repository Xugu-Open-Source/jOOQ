/**
 * This class is generated by jOOQ
 */
package org.jooq.test.cubrid.generatedclasses.tables.records;


import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Row1;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.test.cubrid.generatedclasses.tables.T_986_2;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class T_986_2Record extends UpdatableRecordImpl<T_986_2Record> implements Record1<Integer> {

	private static final long serialVersionUID = 633706819;

	/**
	 * Setter for <code>t_986_2.ref</code>.
	 */
	public void setRef(Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>t_986_2.ref</code>.
	 */
	public Integer getRef() {
		return (Integer) getValue(0);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record1<Integer> key() {
		return (Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record1 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row1<Integer> fieldsRow() {
		return (Row1) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row1<Integer> valuesRow() {
		return (Row1) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field1() {
		return T_986_2.REF;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value1() {
		return getRef();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public T_986_2Record value1(Integer value) {
		setRef(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public T_986_2Record values(Integer value1) {
		value1(value1);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached T_986_2Record
	 */
	public T_986_2Record() {
		super(T_986_2.T_986_2);
	}

	/**
	 * Create a detached, initialised T_986_2Record
	 */
	public T_986_2Record(Integer ref) {
		super(T_986_2.T_986_2);

		setValue(0, ref);
	}
}
