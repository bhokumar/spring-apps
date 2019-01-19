package org.education.school.mongo.repository;

import java.io.Serializable;

import org.education.school.beans.SubSection;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.NoRepositoryBean;
//@EnableMongoRepositories
@NoRepositoryBean
public interface SubSectionRepository extends MongoRepository<SubSection, Serializable>{

}
