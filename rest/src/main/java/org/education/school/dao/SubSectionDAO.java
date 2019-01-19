package org.education.school.dao;

import org.education.school.beans.SubSection;

public interface SubSectionDAO {
	public long getSectionId(final long subSectionId);

	public String getSubSectionHeader(final long subSectionId);

	public String getSubSectionContent(final long subSectionId);

	public SubSection getSubSectionDetails(final long subSectionId);
	
	public SubSection createSubSectionDetails(SubSection subSection);
	
}
