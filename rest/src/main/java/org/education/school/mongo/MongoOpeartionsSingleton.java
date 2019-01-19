package org.education.school.mongo;

import org.springframework.data.mongodb.core.MongoTemplate;

import com.mongodb.MongoClient;

public class MongoOpeartionsSingleton {
	private static MongoTemplate mongoTemplate = new MongoTemplate(new MongoClient("localhost", 27017),"test");
	public static MongoTemplate getMongoTemplate() {
		return mongoTemplate;
	}
}
