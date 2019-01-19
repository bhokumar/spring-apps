package org.bhoopendra.app.controller;

import org.bhoopendra.app.beans.Address;
import org.bhoopendra.app.beans.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class RegistrationController {

    @RequestMapping(value = "/registration", method = RequestMethod.POST)
    public ModelAndView handleRegistration(@RequestParam("userName") String userName, @RequestParam("password") String password) {
        List<Student> students = new ArrayList<Student>();
        students.add(new Student(11100, new Address("Budaun", 201301, "streate"), userName,"Software Engineer"));
        students.add(new Student(11100, new Address("Budaun", 201301, "streate"), "Bijendra","Software Engineer"));
        students.add(new Student(11100, new Address("Budaun", 201301, "streate"), "Rahul","Software Engineer"));
        students.add(new Student(11100, new Address("Budaun", 201301, "streate"), "Prakash","Software Engineer"));
        students.add(new Student(11100, new Address("Budaun", 201301, "streate"), "Tulsi","Software Engineer"));
        students.add(new Student(11100, new Address("Budaun", 201301, "streate"), "Manisha","Software Engineer"));
        students.add(new Student(11100, new Address("Budaun", 201301, "streate"), "Kanwal","Software Engineer"));
        students.add(new Student(11100, new Address("Budaun", 201301, "streate"), "Aman","Software Engineer"));
        return new ModelAndView("students","students",students);
    }
}
