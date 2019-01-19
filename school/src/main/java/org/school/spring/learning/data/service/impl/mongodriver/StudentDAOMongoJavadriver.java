package org.school.spring.learning.data.service.impl.mongodriver;

import org.school.spring.learning.data.bean.Student;
import org.school.spring.learning.data.service.StudentDAO;
import org.springframework.data.repository.core.support.RepositoryFactorySupport;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;

public class StudentDAOMongoJavadriver implements StudentDAO {

	@Override
	public Student getStudent() {
		MongoClient mongoClient = new MongoClient("127.0.0.1", 27017);
		DB db = mongoClient.getDB("test");
		System.out.println("Connection to database successfull");
		DBCollection collection = db.getCollection("students");
		BasicDBObject doc = new BasicDBObject("name","bijendra").append("college", "rkgit").append("school","DDSVM").append("home", "Budaun");
		collection.insert(doc);
		return null;
	}

}
