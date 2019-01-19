package org.school.spring.learning.data.client;

import org.school.spring.learning.data.service.StudentDAO;
import org.school.spring.learning.data.service.impl.mongodriver.StudentDAOMongoJavadriver;


public class DataClient {

	public static void main(String[] args) {
		StudentDAO studentDAO = new StudentDAOMongoJavadriver();
		System.out.println(studentDAO.getStudent());
		
	}

}
