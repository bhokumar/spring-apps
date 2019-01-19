package org.bhoopendra.mongo.client;

import org.bhoopendra.mongo.config.document.SimpleDocument;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.core.MongoOperations;

@SpringBootApplication
public class MongoDataClient implements CommandLineRunner {
	@Autowired
	MongoOperations mongoOperations;

	public static void main(String[] args) {
		SpringApplication.run(MongoDataClient.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		SimpleDocument document = new SimpleDocument("Document1", "This is first document");
		mongoOperations.save(document);
		System.out.println("Document saved!");
	}

}
