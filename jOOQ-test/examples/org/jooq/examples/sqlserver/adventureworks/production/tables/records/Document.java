/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.production.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
@javax.persistence.Entity
@javax.persistence.Table(name = "Document", schema = "Production")
public class Document extends org.jooq.impl.UpdatableRecordImpl<org.jooq.examples.sqlserver.adventureworks.production.tables.records.Document> {

	private static final long serialVersionUID = -588693503;

	/**
	 * The table column <code>Production.Document.DocumentID</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	public void setDocumentID(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Document.Document.DocumentID, value);
	}

	/**
	 * The table column <code>Production.Document.DocumentID</code>
	 * <p>
	 * This column is part of the table's PRIMARY KEY
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "DocumentID", unique = true, nullable = false, precision = 10)
	public java.lang.Integer getDocumentID() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Document.Document.DocumentID);
	}

	/**
	 * The table column <code>Production.Document.Title</code>
	 */
	public void setTitle(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Document.Document.Title, value);
	}

	/**
	 * The table column <code>Production.Document.Title</code>
	 */
	@javax.persistence.Column(name = "Title", nullable = false, length = 50)
	public java.lang.String getTitle() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Document.Document.Title);
	}

	/**
	 * The table column <code>Production.Document.FileName</code>
	 */
	public void setFileName(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Document.Document.FileName, value);
	}

	/**
	 * The table column <code>Production.Document.FileName</code>
	 */
	@javax.persistence.Column(name = "FileName", nullable = false, length = 400)
	public java.lang.String getFileName() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Document.Document.FileName);
	}

	/**
	 * The table column <code>Production.Document.FileExtension</code>
	 */
	public void setFileExtension(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Document.Document.FileExtension, value);
	}

	/**
	 * The table column <code>Production.Document.FileExtension</code>
	 */
	@javax.persistence.Column(name = "FileExtension", nullable = false, length = 8)
	public java.lang.String getFileExtension() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Document.Document.FileExtension);
	}

	/**
	 * The table column <code>Production.Document.Revision</code>
	 */
	public void setRevision(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Document.Document.Revision, value);
	}

	/**
	 * The table column <code>Production.Document.Revision</code>
	 */
	@javax.persistence.Column(name = "Revision", nullable = false, length = 5)
	public java.lang.String getRevision() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Document.Document.Revision);
	}

	/**
	 * The table column <code>Production.Document.ChangeNumber</code>
	 */
	public void setChangeNumber(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Document.Document.ChangeNumber, value);
	}

	/**
	 * The table column <code>Production.Document.ChangeNumber</code>
	 */
	@javax.persistence.Column(name = "ChangeNumber", nullable = false, precision = 10)
	public java.lang.Integer getChangeNumber() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Document.Document.ChangeNumber);
	}

	/**
	 * The table column <code>Production.Document.Status</code>
	 */
	public void setStatus(java.lang.Byte value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Document.Document.Status, value);
	}

	/**
	 * The table column <code>Production.Document.Status</code>
	 */
	@javax.persistence.Column(name = "Status", nullable = false, precision = 3)
	public java.lang.Byte getStatus() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Document.Document.Status);
	}

	/**
	 * The table column <code>Production.Document.DocumentSummary</code>
	 */
	public void setDocumentSummary(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Document.Document.DocumentSummary, value);
	}

	/**
	 * The table column <code>Production.Document.DocumentSummary</code>
	 */
	@javax.persistence.Column(name = "DocumentSummary")
	public java.lang.String getDocumentSummary() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Document.Document.DocumentSummary);
	}

	/**
	 * The table column <code>Production.Document.Document</code>
	 */
	public void setDocument(byte[] value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Document.Document.Document_, value);
	}

	/**
	 * The table column <code>Production.Document.Document</code>
	 */
	@javax.persistence.Column(name = "Document")
	public byte[] getDocument() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Document.Document.Document_);
	}

	/**
	 * The table column <code>Production.Document.ModifiedDate</code>
	 */
	public void setModifiedDate(java.sql.Timestamp value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Document.Document.ModifiedDate, value);
	}

	/**
	 * The table column <code>Production.Document.ModifiedDate</code>
	 */
	@javax.persistence.Column(name = "ModifiedDate", nullable = false)
	public java.sql.Timestamp getModifiedDate() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Document.Document.ModifiedDate);
	}

	/**
	 * Create a detached Document
	 */
	public Document() {
		super(org.jooq.examples.sqlserver.adventureworks.production.tables.Document.Document);
	}
}
