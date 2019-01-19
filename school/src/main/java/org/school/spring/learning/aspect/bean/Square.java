package org.school.spring.learning.aspect.bean;

public class Square  {
	private String name;
	
	public void draw() {
		System.out.println("Name of Shape is : Square");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
