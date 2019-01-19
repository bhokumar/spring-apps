package org.bhoopendra.app.controller;

import java.util.ArrayList;
import java.util.List;

import org.bhoopendra.app.beans.Address;
import org.bhoopendra.app.beans.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class StudentController {
	
	@RequestMapping(value = "/students", method = RequestMethod.GET)
	public String getAllStudents(){
		List<Student> students = new ArrayList<Student>();
		students.add(new Student(11100, new Address("Budaun", 201301, "streate"), "Bijendra"));
		return "students";
	}

}
