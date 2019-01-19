package org.education.school.business;

import java.util.List;

import org.education.school.beans.CourseCategory;
import org.education.school.dao.OperationsDAO;
import org.education.school.mongo.MongoDataOperations;

public class CourseCategoryBusiness {
	private static OperationsDAO<CourseCategory> courseCategoryDAO = new MongoDataOperations<>(CourseCategory.class);
	
	public CourseCategory AddCourseCategory(final CourseCategory courseCategory){
		return courseCategoryDAO.createObject(courseCategory);
	}
	
	public CourseCategory searchCourseCategory(final int courseCategoryId){
		return courseCategoryDAO.getDetails(courseCategoryId);
	}
	
	public List<CourseCategory> searchAllCourseCategory(){
		return courseCategoryDAO.findAllObjects();
	}

	public CourseCategory modifyCourseCategory(final int courseCategoryId,final CourseCategory courseCategory){
		return courseCategoryDAO.modifyDetails(courseCategoryId, courseCategory);
	}
	public String deleteCourseCategory(final int courseCategoryId){
		return courseCategoryDAO.deleteObjects(courseCategoryId);
	}
}
