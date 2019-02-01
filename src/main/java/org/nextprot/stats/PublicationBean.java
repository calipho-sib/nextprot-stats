package org.nextprot.stats;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class PublicationBean implements Serializable {

	private Long id;

	private String md5;

	private String title;

	private String abstractText;

	private String publicationType;

	private Date publicationDate;

	private String textDate;

	private String submission;

	private List<Map<String, Object>> authors;

	private List<Map<String, Object>> dbXrefs;

	private Map<String, Object> publicationResourceLocator;

	public PublicationBean() {}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMd5() {
		return md5;
	}

	public void setMd5(String md5) {
		this.md5 = md5;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAbstractText() {
		return abstractText;
	}

	public void setAbstractText(String abstractText) {
		this.abstractText = abstractText;
	}

	public String getPublicationType() {
		return publicationType;
	}

	public void setPublicationType(String publicationType) {
		this.publicationType = publicationType;
	}

	public Date getPublicationDate() {
		return publicationDate;
	}

	public void setPublicationDate(Date publicationDate) {
		this.publicationDate = publicationDate;
	}

	public String getTextDate() {
		return textDate;
	}

	public void setTextDate(String textDate) {
		this.textDate = textDate;
	}

	public String getSubmission() {
		return submission;
	}

	public void setSubmission(String submission) {
		this.submission = submission;
	}

	public List<Map<String, Object>> getAuthors() {
		return authors;
	}

	public void setAuthors(List<Map<String, Object>> authors) {
		this.authors = authors;
	}

	public List<Map<String, Object>> getDbXrefs() {
		return dbXrefs;
	}

	public void setDbXrefs(List<Map<String, Object>> dbXrefs) {
		this.dbXrefs = dbXrefs;
	}

	public Map<String, Object> getPublicationResourceLocator() {
		return publicationResourceLocator;
	}

	public void setPublicationResourceLocator(Map<String, Object> publicationResourceLocator) {
		this.publicationResourceLocator = publicationResourceLocator;
	}
}
