/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle3.generatedclasses.udt;


import org.jooq.Configuration;
import org.jooq.Field;
import org.jooq.Package;
import org.jooq.UDTField;
import org.jooq.impl.UDTImpl;
import org.jooq.test.oracle3.generatedclasses.DefaultSchema;
import org.jooq.test.oracle3.generatedclasses.udt.u_3709.VALUE;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class U_3709 extends UDTImpl<org.jooq.test.oracle3.generatedclasses.udt.records.U_3709> implements Cloneable, Package {

	private static final long serialVersionUID = 1455599228;

	/**
	 * The reference instance of <code>U_3709</code>
	 */
	public static final U_3709 U_3709 = new U_3709();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<org.jooq.test.oracle3.generatedclasses.udt.records.U_3709> getRecordType() {
		return org.jooq.test.oracle3.generatedclasses.udt.records.U_3709.class;
	}

	/**
	 * The attribute <code>U_3709.V</code>.
	 */
	public static final UDTField<org.jooq.test.oracle3.generatedclasses.udt.records.U_3709, String> V = createField("V", org.jooq.impl.SQLDataType.VARCHAR.length(4000), U_3709, "");

	/**
	 * Call <code>U_3709.VALUE</code>
	 */
	public static String call_VALUE(Configuration configuration, org.jooq.test.oracle3.generatedclasses.udt.records.U_3709 SELF, String VALUE) {
		VALUE f = new VALUE();
		f.setSELF(SELF);
		f.setVALUE(VALUE);

		f.execute(configuration);
		return f.getReturnValue();
	}

	/**
	 * Get <code>U_3709.VALUE</code> as a field
	 */
	public static Field<String> call_VALUE(org.jooq.test.oracle3.generatedclasses.udt.records.U_3709 SELF, String VALUE) {
		VALUE f = new VALUE();
		f.setSELF(SELF);
		f.setVALUE(VALUE);

		return f.asField();
	}

	/**
	 * Get <code>U_3709.VALUE</code> as a field
	 */
	public static Field<String> call_VALUE(Field<org.jooq.test.oracle3.generatedclasses.udt.records.U_3709> SELF, Field<String> VALUE) {
		VALUE f = new VALUE();
		f.setSELF(SELF);
		f.setVALUE(VALUE);

		return f.asField();
	}

	/**
	 * No further instances allowed
	 */
	private U_3709() {
		super("U_3709", DefaultSchema.DEFAULT_SCHEMA);

		// Initialise data type
		getDataType();
	}
}
