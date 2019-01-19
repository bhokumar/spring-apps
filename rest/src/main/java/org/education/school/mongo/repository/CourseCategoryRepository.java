package org.education.school.mongo.repository;

import java.io.Serializable;

import org.education.school.beans.CourseCategory;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.NoRepositoryBean;
//@EnableMongoRepositories
@NoRepositoryBean
public interface CourseCategoryRepository extends MongoRepository<CourseCategory, Serializable> {

}
