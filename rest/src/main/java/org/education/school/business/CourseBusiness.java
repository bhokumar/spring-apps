package org.education.school.business;

import java.util.List;

import org.education.school.beans.Course;
import org.education.school.dao.OperationsDAO;
import org.education.school.mongo.MongoDataOperations;

public class CourseBusiness {
	private static OperationsDAO<Course> courseDAO = new MongoDataOperations<>(Course.class);

	public Course addCourse(Course course) {
		return courseDAO.createObject(course);
	}

	public Course searchCourse(final int courseId) {
		return courseDAO.getDetails(courseId);
	}

	public List<Course> searchAllCourses() {
		return courseDAO.findAllObjects();
	}

	public Course modifyCourse(final int courseId, final Course course) {
		return courseDAO.modifyDetails(courseId, course);
	}
	public String deleteCourse(final int courseId){
		return courseDAO.deleteObjects(courseId);
	}
}
