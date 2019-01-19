package org.school.spring.learning.aspect.clients;

import org.school.spring.learning.aspect.service.ShapeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AOPClient {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring2.xml");
		ShapeService shapeService = context.getBean("shapeService", ShapeService.class);
		shapeService.getSquare().setName("bhoopendra");
		System.out.println(shapeService.getSquare().getName());
	}

}
