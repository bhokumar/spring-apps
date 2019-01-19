package org.education.school.dao;

import java.util.List;

import org.education.school.beans.Course;
import org.education.school.beans.CourseCategory;

public interface CourseCategoryDAO {
	
	public String getCategoryName(final int courseCategoryId);

	public String getCourseCategory(final int courseCategoryId);

	public CourseCategory getCategorydetails(final int courseCategoryId);

	public List<Course> getCourses(final int courseCategoryId);
	
	public CourseCategory createCategorydetails(CourseCategory category);

	CourseCategory getCategory(int courseCategoryId);

	List<CourseCategory> getAllCategorydetails();

	CourseCategory modifyCourseCategory(int courseCategoryId, CourseCategory category);
}
