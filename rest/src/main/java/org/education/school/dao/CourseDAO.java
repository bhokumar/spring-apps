package org.education.school.dao;

import java.util.List;

import org.education.school.beans.Article;
import org.education.school.beans.Course;

public interface CourseDAO {
	public int getCourseCategoryID(final int courseId);

	public String getCourseName(final int courseId);

	public String getCourseDescrption(final int courseId);

	public Course getCourseDetails(final int courseId);

	public List<Article> getCourseArticles(final int courseId);
	
	public Course createCourse(final Course course);

	List<Course> getAllCourses();

	Course modifyCourse(int courseId, Course course);
}
