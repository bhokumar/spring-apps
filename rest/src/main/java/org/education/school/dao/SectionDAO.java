package org.education.school.dao;

import java.util.List;

import org.education.school.beans.Section;
import org.education.school.beans.SubSection;

public interface SectionDAO {
	public int articleId(final long sectionId);

	public String getSectionHeader(final long sectionId);

	public String getSectionContent(final long sectionId);

	public Section getSection(final long sectionId);

	public List<SubSection> getSubSections(final long sectionId);
	public Section createSection(Section section);

	List<Section> getAllSections();
}
