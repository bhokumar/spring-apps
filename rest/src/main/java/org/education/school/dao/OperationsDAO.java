package org.education.school.dao;

import java.util.List;

import org.education.school.beans.School;
import org.education.school.beans.Section;
import org.education.school.beans.SubSection;

public interface OperationsDAO<T extends School> {
	String getName(final int id);
	int getParentId(final int id);
	T getDetails(final int id);
	List<T> getChilds(final int id);
	T modifyDetails(final int id, T t);
	T createObject(T t);
	List<T> findAllObjects();
	String deleteObjects(int id);
	List<Section> findChildObjects(int id);
	List<SubSection> findAllSubSections(int articleId, int sectionId);
}
