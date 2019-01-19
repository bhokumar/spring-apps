package org.education.school.mongo.repository;

import java.io.Serializable;

import org.education.school.beans.Article;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;


@EnableMongoRepositories
public interface ArticleRepository extends MongoRepository<Article, Serializable> {

}
