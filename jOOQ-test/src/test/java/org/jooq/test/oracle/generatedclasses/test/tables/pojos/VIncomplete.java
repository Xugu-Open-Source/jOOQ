/**
 * This class is generated by jOOQ
 */
package org.jooq.test.oracle.generatedclasses.test.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
@javax.persistence.Entity
@javax.persistence.Table(name = "V_INCOMPLETE", schema = "TEST")
public class VIncomplete implements java.io.Serializable {

	private static final long serialVersionUID = -501358626;

	private java.lang.Object id;
	private java.lang.Object authorId;
	private java.lang.Object coAuthorId;
	private java.lang.Object detailsId;
	private java.lang.Object title;
	private java.lang.Object publishedIn;
	private java.lang.Object languageId;
	private java.lang.Object contentText;
	private java.lang.Object contentPdf;
	private java.lang.Object recVersion;
	private java.lang.Object recTimestamp;

	public VIncomplete() {}

	public VIncomplete(
		java.lang.Object id,
		java.lang.Object authorId,
		java.lang.Object coAuthorId,
		java.lang.Object detailsId,
		java.lang.Object title,
		java.lang.Object publishedIn,
		java.lang.Object languageId,
		java.lang.Object contentText,
		java.lang.Object contentPdf,
		java.lang.Object recVersion,
		java.lang.Object recTimestamp
	) {
		this.id = id;
		this.authorId = authorId;
		this.coAuthorId = coAuthorId;
		this.detailsId = detailsId;
		this.title = title;
		this.publishedIn = publishedIn;
		this.languageId = languageId;
		this.contentText = contentText;
		this.contentPdf = contentPdf;
		this.recVersion = recVersion;
		this.recTimestamp = recTimestamp;
	}

	@javax.persistence.Column(name = "ID")
	public java.lang.Object getId() {
		return this.id;
	}

	public void setId(java.lang.Object id) {
		this.id = id;
	}

	@javax.persistence.Column(name = "AUTHOR_ID")
	public java.lang.Object getAuthorId() {
		return this.authorId;
	}

	public void setAuthorId(java.lang.Object authorId) {
		this.authorId = authorId;
	}

	@javax.persistence.Column(name = "CO_AUTHOR_ID")
	public java.lang.Object getCoAuthorId() {
		return this.coAuthorId;
	}

	public void setCoAuthorId(java.lang.Object coAuthorId) {
		this.coAuthorId = coAuthorId;
	}

	@javax.persistence.Column(name = "DETAILS_ID")
	public java.lang.Object getDetailsId() {
		return this.detailsId;
	}

	public void setDetailsId(java.lang.Object detailsId) {
		this.detailsId = detailsId;
	}

	@javax.persistence.Column(name = "TITLE")
	public java.lang.Object getTitle() {
		return this.title;
	}

	public void setTitle(java.lang.Object title) {
		this.title = title;
	}

	@javax.persistence.Column(name = "PUBLISHED_IN")
	public java.lang.Object getPublishedIn() {
		return this.publishedIn;
	}

	public void setPublishedIn(java.lang.Object publishedIn) {
		this.publishedIn = publishedIn;
	}

	@javax.persistence.Column(name = "LANGUAGE_ID")
	public java.lang.Object getLanguageId() {
		return this.languageId;
	}

	public void setLanguageId(java.lang.Object languageId) {
		this.languageId = languageId;
	}

	@javax.persistence.Column(name = "CONTENT_TEXT")
	public java.lang.Object getContentText() {
		return this.contentText;
	}

	public void setContentText(java.lang.Object contentText) {
		this.contentText = contentText;
	}

	@javax.persistence.Column(name = "CONTENT_PDF")
	public java.lang.Object getContentPdf() {
		return this.contentPdf;
	}

	public void setContentPdf(java.lang.Object contentPdf) {
		this.contentPdf = contentPdf;
	}

	@javax.persistence.Column(name = "REC_VERSION")
	public java.lang.Object getRecVersion() {
		return this.recVersion;
	}

	public void setRecVersion(java.lang.Object recVersion) {
		this.recVersion = recVersion;
	}

	@javax.persistence.Column(name = "REC_TIMESTAMP")
	public java.lang.Object getRecTimestamp() {
		return this.recTimestamp;
	}

	public void setRecTimestamp(java.lang.Object recTimestamp) {
		this.recTimestamp = recTimestamp;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		final VIncomplete other = (VIncomplete) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		}
		else if (!id.equals(other.id))
			return false;
		if (authorId == null) {
			if (other.authorId != null)
				return false;
		}
		else if (!authorId.equals(other.authorId))
			return false;
		if (coAuthorId == null) {
			if (other.coAuthorId != null)
				return false;
		}
		else if (!coAuthorId.equals(other.coAuthorId))
			return false;
		if (detailsId == null) {
			if (other.detailsId != null)
				return false;
		}
		else if (!detailsId.equals(other.detailsId))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		}
		else if (!title.equals(other.title))
			return false;
		if (publishedIn == null) {
			if (other.publishedIn != null)
				return false;
		}
		else if (!publishedIn.equals(other.publishedIn))
			return false;
		if (languageId == null) {
			if (other.languageId != null)
				return false;
		}
		else if (!languageId.equals(other.languageId))
			return false;
		if (contentText == null) {
			if (other.contentText != null)
				return false;
		}
		else if (!contentText.equals(other.contentText))
			return false;
		if (contentPdf == null) {
			if (other.contentPdf != null)
				return false;
		}
		else if (!contentPdf.equals(other.contentPdf))
			return false;
		if (recVersion == null) {
			if (other.recVersion != null)
				return false;
		}
		else if (!recVersion.equals(other.recVersion))
			return false;
		if (recTimestamp == null) {
			if (other.recTimestamp != null)
				return false;
		}
		else if (!recTimestamp.equals(other.recTimestamp))
			return false;
		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((authorId == null) ? 0 : authorId.hashCode());
		result = prime * result + ((coAuthorId == null) ? 0 : coAuthorId.hashCode());
		result = prime * result + ((detailsId == null) ? 0 : detailsId.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result + ((publishedIn == null) ? 0 : publishedIn.hashCode());
		result = prime * result + ((languageId == null) ? 0 : languageId.hashCode());
		result = prime * result + ((contentText == null) ? 0 : contentText.hashCode());
		result = prime * result + ((contentPdf == null) ? 0 : contentPdf.hashCode());
		result = prime * result + ((recVersion == null) ? 0 : recVersion.hashCode());
		result = prime * result + ((recTimestamp == null) ? 0 : recTimestamp.hashCode());
		return result;
	}
}
