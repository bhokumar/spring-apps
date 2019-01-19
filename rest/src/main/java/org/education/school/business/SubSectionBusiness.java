package org.education.school.business;

import java.util.List;

import org.education.school.beans.SubSection;
import org.education.school.dao.OperationsDAO;
import org.education.school.mongo.MongoDataOperations;

public class SubSectionBusiness {
private static OperationsDAO<SubSection> subSectionDAO = new MongoDataOperations<>(SubSection.class);

public SubSection addSubSection(final SubSection subSection) {
	return subSectionDAO.createObject(subSection);
}

public SubSection searchSubSection(final int subSectionId) {
	return  subSectionDAO.getDetails(subSectionId);
}

public List<SubSection> searchSubSections() {
	return subSectionDAO.findAllObjects();
}

public SubSection modifySubSection(final int subSectionId,final SubSection subSection) {
	return  subSectionDAO.modifyDetails(subSectionId, subSection);
}

public String deleteSubSection(final int subSectionId) {
	return  subSectionDAO.deleteObjects(subSectionId);
}

}
