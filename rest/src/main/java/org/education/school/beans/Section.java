package org.education.school.beans;

import org.springframework.data.annotation.Id;

public class Section implements School{
	/**
	 * 
	 */
	private static final long serialVersionUID = -2217224749446952883L;
	private long articleID;
	@Id
	private long sectionID;
	private String sectionHeader;
	private String sectionContent;

	public Section() {
	}

	public long getArticleID() {
		return articleID;
	}

	public void setArticleID(long articleID) {
		this.articleID = articleID;
	}

	public long getSectionID() {
		return sectionID;
	}

	public void setSectionID(long sectionID) {
		this.sectionID = sectionID;
	}

	public String getSectionHeader() {
		return sectionHeader;
	}

	public void setSectionHeader(String sectionHeader) {
		this.sectionHeader = sectionHeader;
	}

	public String getSectionContent() {
		return sectionContent;
	}

	public void setSectionContent(String sectionContent) {
		this.sectionContent = sectionContent;
	}

}
