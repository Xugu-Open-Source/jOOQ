/**
 * This class is generated by jOOQ
 */
package org.jooq.test.mysql.generatedclasses.enums;

/**
 * This class is generated by jOOQ.
 *
 * The book's stock status
 */
@java.lang.SuppressWarnings("all")
public enum VBookStatus implements org.jooq.EnumType {

	SOLD_OUT("SOLD OUT"),

	ORDERED("ORDERED"),

	ON_STOCK("ON STOCK"),

	;

	private final java.lang.String literal;

	private VBookStatus(java.lang.String literal) {
		this.literal = literal;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String getName() {
		return "v_book_STATUS";
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String getLiteral() {
		return literal;
	}
}
