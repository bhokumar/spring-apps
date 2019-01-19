package org.bhoopendra.mongo.config.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="simpleDocument")
public class SimpleDocument {
	@Id
	String id;
	String name;
	String description;
	
	public SimpleDocument(String name, String description) {
		super();
		this.name = name;
		this.description = description;
	}
	
	@Override
	public String toString() {
		return "SimpleDocument [id=" + id + ", name=" + name + ", description=" + description + "]";
	}
}
