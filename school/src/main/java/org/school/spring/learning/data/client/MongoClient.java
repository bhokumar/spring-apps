package org.school.spring.learning.data.client;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.school.spring.learning.data.bean.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;

import com.mongodb.Mongo;
import com.mongodb.MongoClientOptions;
import com.mongodb.MongoOptions;

public class MongoClient {
private  @Autowired Mongo mongo;

	public Mongo getMongo() {
	return mongo;
}

public void setMongo(Mongo mongo) {
	this.mongo = mongo;
}

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring_mongo.xml");
		MongoClient mongoClient = new MongoClient();
		 final Log log = LogFactory.getLog(MongoClient.class);
		 MongoOperations mongoOperations = new MongoTemplate(new Mongo(), "test");
		 
		 mongoOperations.insert(new Person("101", "bhoopendra", 24));
		 
	}

}
