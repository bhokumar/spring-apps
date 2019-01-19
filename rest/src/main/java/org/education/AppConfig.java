package org.education;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;

import com.mongodb.MongoClient;

@Configuration
public class AppConfig {
	
	@Bean
	public MongoDbFactory mongoDbFactory(){
	return new SimpleMongoDbFactory(new MongoClient("localhost", 27017), "test");	
	}
	
	@Bean
	public MongoOperations mongoOperations(){
		return new MongoTemplate(mongoDbFactory());
	}

}
