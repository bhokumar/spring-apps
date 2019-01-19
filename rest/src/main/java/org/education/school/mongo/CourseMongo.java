package org.education.school.mongo;

import java.util.List;

import org.education.school.beans.Article;
import org.education.school.beans.Course;
import org.education.school.dao.CourseDAO;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

public class CourseMongo implements CourseDAO {
 private static MongoTemplate mongotemplate = MongoOpeartionsSingleton.getMongoTemplate();
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
	public Course getCourseDetails(final int courseId) {
		return	mongotemplate.findOne(new Query(Criteria.where("_id").is(courseId)), Course.class);
	}

	@Override
	public List<Article> getCourseArticles(int courseId) {
		return null;
	}

	@Override
	public Course createCourse(final Course course) {
		mongotemplate.save(course);
		System.out.println("Course created!");
		return course;
	}
	
	@Override
	public List<Course> getAllCourses() {
		return mongotemplate.findAll(Course.class);
	}
/*	
	@Override
	public Course modifyCourse(final int courseId,final Course course) {
		WriteResult result = mongotemplate.upsert(new Query(Criteria.where("_id").is(courseId)),new Update().set("courseCategoryID", course.getCourseCategoryID()).set("courseName", course.getCourseName()).set("courseDescription", course.getCourseDescription()), Course.class);
		if(result!=null){
			System.out.println("Course modified");
			return course;
		}
		return null;
	}
*/

	@Override
	public Course modifyCourse(int courseId, Course course) {
		// TODO Auto-generated method stub
		return null;
	}
}
