package org.education.school.mongo;

import java.util.List;

import org.education.school.beans.Section;
import org.education.school.beans.SubSection;
import org.education.school.dao.SectionDAO;
import org.springframework.data.mongodb.core.MongoTemplate;

public class SectionMongo implements SectionDAO {
	private static MongoTemplate mongoTemplate = MongoOpeartionsSingleton.getMongoTemplate();
	@Override
	public int articleId(long sectionId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getSectionHeader(long sectionId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getSectionContent(long sectionId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Section getSection(final long sectionId) {
		return mongoTemplate.findById(sectionId, Section.class);
	}

	@Override
	public List<SubSection> getSubSections(long sectionId) {
		return null;
	}

	@Override
	public Section createSection(final Section section) {
		mongoTemplate.save(section);
		System.out.println("Section saved");
		return null;
	}
	
	@Override
	public List<Section> getAllSections() {
		return mongoTemplate.findAll(Section.class);
	}

}
