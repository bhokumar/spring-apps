package org.education.school.mongo;

import java.util.List;

import org.education.school.beans.Article;
import org.education.school.beans.Course;
import org.education.school.beans.CourseCategory;
import org.education.school.beans.School;
import org.education.school.beans.Section;
import org.education.school.beans.SubSection;
import org.education.school.dao.OperationsDAO;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;

public class MongoDataOperations<T extends School> implements OperationsDAO<T>{

	private Class<T> type;
	
	public MongoDataOperations(Class<T> type) {
		super();
		this.type = type;
	}

	private static MongoTemplate mongoTemplate = MongoOpeartionsSingleton.getMongoTemplate();
	@Override
	public T createObject(T t) {
		mongoTemplate.save(t);
		System.out.println("Document Saved Type : "+t.getClass().getName());
		return t;
	}

	@Override
	public String getName(int id) {
		return null;
	}

	@Override
	public int getParentId(int id) {
		return 0;
	}

	@Override
	public T getDetails(int id) {
			return	mongoTemplate.findById(id, type);
	}

	@Override
	public List<T> getChilds(int id) {
		return null;
	}

	@Override
	public List<T> findAllObjects() {
		return mongoTemplate.findAll(type);
	}

	@Override
	public T modifyDetails(final int id, final T t) {
		if(type.equals(Article.class)){
			Article article =(Article)t;
				mongoTemplate.upsert(new Query(Criteria.where("_id").is(id)), new Update().set("courseID", article.getCourseID()).set("articleName", article.getArticleName()), type);
		}else if(type.equals(CourseCategory.class)){
			CourseCategory category = (CourseCategory)t;
			mongoTemplate.upsert(new Query(Criteria.where("_id").is(id)), new Update().set("categoryName", category.getCategoryName()).set("categoryDescrption", category.getCategoryDescrption()), type);
		}else if(type.equals(Course.class)){
			final Course course =(Course)t;
			mongoTemplate.upsert(new Query(Criteria.where("_id").is(id)),new Update().set("courseCategoryID", course.getCourseCategoryID()).set("courseName", course.getCourseName()).set("courseDescription", course.getCourseDescription()), type);
		}else if(type.equals(Section.class)){
			final Section section = (Section)(t);
			mongoTemplate.upsert(new Query(Criteria.where("_id").is(id)),new Update().set("articleID", section.getArticleID()).set("sectionHeader", section.getSectionHeader()).set("sectionContent", section.getSectionContent()), type);
		}else if(type.equals(SubSection.class)){
			final SubSection subSection = (SubSection)(t);
			mongoTemplate.upsert(new Query(Criteria.where("_id").is(id)),new Update().set("sectionID", subSection.getSectionID()).set("subSectionHeader", subSection.getSubSectionHeader()).set("subSectionContent", subSection.getSubSectionContent()), type);
		}
		return t;
	}
	
	/*@Override
	public String deleteObjects(final int id) {
		WriteResult result =  mongoTemplate.remove(new Query(Criteria.where("_id").is(id)), type);
		if(result!=null){
			return "deleted";
		}
		return null;
	}*/
	
	@Override
	public List<Section> findChildObjects(final int id) {
		return mongoTemplate.find(new Query(Criteria.where("articleID").is(id)), Section.class);
	}
	
	@Override
	public List<SubSection> findAllSubSections(int articleId, int sectionId) {/*
		List<Section> sections = mongoTemplate.find(new Query(Criteria.where("articleID").is(articleId)), Section.class);
		List<SubSection> subSections = mongoTemplate.find(new Query(Criteria.where("articleID").is(articleId)), SubSection.class);
		final List<SubSection> finalSubSections = new ArrayList<>();
		return null;
	*/
		return null;
		}

	@Override
	public String deleteObjects(int id) {
		// TODO Auto-generated method stub
		return null;
	}
}
