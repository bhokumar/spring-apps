package org.education.school.mongo;

import java.util.List;

import org.education.school.beans.Course;
import org.education.school.beans.CourseCategory;
import org.education.school.dao.CourseCategoryDAO;
import org.springframework.data.mongodb.core.MongoTemplate;

public class CourseCategoryMongo implements CourseCategoryDAO {
	
	private static MongoTemplate mongoTemplate = MongoOpeartionsSingleton.getMongoTemplate();
	@Override
	public String getCategoryName(int courseCategoryId) {
		return null;
	}

	@Override
	public String getCourseCategory(int courseCategoryId) {
		return null;
	}

	@Override
	public CourseCategory getCategorydetails(int courseCategoryId) {
		return	mongoTemplate.findById(courseCategoryId, CourseCategory.class);
	}


	@Override
	public List<CourseCategory> getAllCategorydetails() {
		return	mongoTemplate.findAll(CourseCategory.class);
	}
	
	@Override
	public List<Course> getCourses(int courseCategoryId) {
		return null;
	}

	@Override
	public CourseCategory createCategorydetails(final CourseCategory category) {
		mongoTemplate.save(category);
		System.out.println("Course Category saved ! "+mongoTemplate);
		return category;
				
	}

	@Override
	public CourseCategory getCategory(int courseCategoryId) {
		return null;
	}

	@Override
	public CourseCategory modifyCourseCategory(int courseCategoryId, CourseCategory category) {
		// TODO Auto-generated method stub
		return null;
	}
	

	/*@Override
	public CourseCategory modifyCourseCategory(final int courseCategoryId,final CourseCategory category) {
		WriteResult result = mongoTemplate.upsert(new Query(Criteria.where("_id").is(courseCategoryId)), new Update().set("categoryName", category.getCategoryName()).set("categoryDescrption", category.getCategoryDescrption()), CourseCategory.class);
		if(result!=null){
			return category;
		}
		return null;
	}
*/
}
