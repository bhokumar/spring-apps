package org.education.school.business;

import java.util.List;

import org.education.school.beans.Section;
import org.education.school.dao.OperationsDAO;
import org.education.school.mongo.MongoDataOperations;

public class SectionBusiness {
private static OperationsDAO<Section> sectionDAO = new MongoDataOperations<>(Section.class);

	public Section addSection(Section section){
		return sectionDAO.createObject(section);
	}
	
	public Section searchSection(final int sectionId) {
		return sectionDAO.getDetails(sectionId);
	}
	
	public List<Section> searchAllSections() {
		return sectionDAO.findAllObjects();
	}
	
	public Section modifySection(final int sectionId,final Section section) {
		return sectionDAO.modifyDetails(sectionId, section);
	}
	
	public String deleteSection(final int sectionId) {
		return sectionDAO.deleteObjects(sectionId);
	}
	
}
