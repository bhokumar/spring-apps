package org.education.school.beans;

import org.springframework.data.annotation.Id;
public class SubSection implements School{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7150303667508653648L;
	private long sectionID;
	@Id
	private long subSectionId;
	private String subSectionHeader;
	private String subSectionContent;

	public SubSection() {
	}

	public SubSection(long sectionID, String subSectionHeader,
			String subSectionContent) {
		super();
		this.sectionID = sectionID;
		this.subSectionHeader = subSectionHeader;
		this.subSectionContent = subSectionContent;
	}

	public SubSection(long sectionID, long subSectionId,
			String subSectionHeader, String subSectionContent) {
		super();
		this.sectionID = sectionID;
		this.subSectionId = subSectionId;
		this.subSectionHeader = subSectionHeader;
		this.subSectionContent = subSectionContent;
	}

	public long getSectionID() {
		return sectionID;
	}

	public void setSectionID(long sectionID) {
		this.sectionID = sectionID;
	}

	public String getSubSectionHeader() {
		return subSectionHeader;
	}

	public void setSubSectionHeader(String subSectionHeader) {
		this.subSectionHeader = subSectionHeader;
	}

	public String getSubSectionContent() {
		return subSectionContent;
	}

	public void setSubSectionContent(String subSectionContent) {
		this.subSectionContent = subSectionContent;
	}

	public long getSubSectionId() {
		return subSectionId;
	}

	public void setSubSectionId(long subSectionId) {
		this.subSectionId = subSectionId;
	}

	
}
