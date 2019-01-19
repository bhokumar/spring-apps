package org.education.school.hibernate;

import java.util.List;

import org.education.school.beans.Article;
import org.education.school.beans.Course;
import org.education.school.dao.CourseDAO;

public class CourseHB implements CourseDAO {

	@Override
	public int getCourseCategoryID(int courseId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getCourseName(int courseId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getCourseDescrption(int courseId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Course getCourseDetails(int courseId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Article> getCourseArticles(int courseId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Course createCourse(Course course) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Course> getAllCourses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Course modifyCourse(int courseId, Course course) {
		// TODO Auto-generated method stub
		return null;
	}}
