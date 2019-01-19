package com.example;

import java.util.List;

import org.bhoopendra.mongo.config.document.SimpleDocument;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
	@Autowired
	MongoOperations mongoOperations;
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		SimpleDocument document = new SimpleDocument("document2", "This is document2");
		mongoOperations.save(document);
		System.out.println("Document Saved!");
		Query query = new Query(Criteria.where("name").is("document1"));
		SimpleDocument object = mongoOperations.findOne(query, SimpleDocument.class);
		System.out.println(object);
		mongoOperations.updateFirst(query, Update.update("description", "Updated description"), SimpleDocument.class);
		List<SimpleDocument> documents = mongoOperations.findAll(SimpleDocument.class);
		documents.forEach(System.out::println);
		mongoOperations.remove(query,SimpleDocument.class);
		System.out.println(mongoOperations.getCollectionName(SimpleDocument.class));
	}
}
