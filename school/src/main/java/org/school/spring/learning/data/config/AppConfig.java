package org.school.spring.learning.data.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoClientFactoryBean;

@Configuration
public class AppConfig {
	
public @Bean MongoClientFactoryBean mongo(){
	MongoClientFactoryBean mongo = new MongoClientFactoryBean();
	mongo.setHost("127.0.0.1");
	mongo.setPort(27017);
	return mongo;
}
	
}
