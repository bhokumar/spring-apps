package org.bhoopendra.client;

import org.bhoopendra.bean.Circle;
import org.bhoopendra.dao.CircleDAO;
import org.bhoopendra.jdbc.CircleDAOImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JDBCDemo {
	public static void main(String args[]) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		Circle circle = new Circle(1, "second Circle");
		ApplicationContext context =new  ClassPathXmlApplicationContext("spring.xml");
		CircleDAO circleDAO = context.getBean("circleDAOImpl", CircleDAOImpl.class);
		/*System.out.println(circleDAO.getCircleCount());
		System.out.println(circleDAO.getCircleName());
		System.out.println(circleDAO.createCircle(circle));
		circleDAO.getAllCircle().forEach(System.out::println);*/
		circleDAO.insertCircle();
		System.out.println(circleDAO.getCircleCount());
		//circleDAO.createTriangleTable();
	//MongoTemplate mongoTemplate  = new MongoTemplate(new MongoClient("localhost",1527), "test");
		
	}
}
