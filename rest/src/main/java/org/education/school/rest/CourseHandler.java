package org.education.school.rest;

import java.util.List;

import org.education.school.beans.Course;
import org.education.school.business.CourseBusiness;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseHandler {
	CourseBusiness courseBusiness = new CourseBusiness();
	@CrossOrigin(origins="*")
	@RequestMapping(value = "/course",method = RequestMethod.POST)
	public ResponseEntity<Course> createCourse(@RequestBody final Course course) {
		final Course addedCourse = courseBusiness.addCourse(course);
		if(addedCourse!=null){
			return new ResponseEntity<Course>(addedCourse,HttpStatus.CREATED);
		}
		return new ResponseEntity<Course>(HttpStatus.NO_CONTENT);
	}
	@RequestMapping(value = "/course",method = RequestMethod.GET)
	@CrossOrigin(origins="*")
	public ResponseEntity<List<Course>> getAllCourse() {
		List<Course> courses = courseBusiness.searchAllCourses();
		if(courses.isEmpty()){
			return new ResponseEntity<List<Course>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<Course>>(courses,HttpStatus.FOUND);
	}
	
	@RequestMapping(value = "/course/{courseId}",method = RequestMethod.GET)
	@CrossOrigin(origins="*")
	public ResponseEntity<Course> getCourse(@PathVariable("courseId")final int courseID) {
		final Course course = courseBusiness.searchCourse(courseID);
		if(course!=null){
			return new ResponseEntity<Course>(course,HttpStatus.FOUND);
		}
		return new  ResponseEntity<Course>(HttpStatus.NO_CONTENT);
	}
	
	public List<Course> modifyCourse() {
		return null;
	}

	@RequestMapping(value = "/course/{courseId}",method = RequestMethod.PUT)
	@CrossOrigin(origins="*")
	public ResponseEntity<Course> modifyCourse(@PathVariable("courseId")final int courseID,@RequestBody final Course course) {
		final Course modifiedCourse = courseBusiness.modifyCourse(courseID,course);
		if(modifiedCourse!=null){
			return new ResponseEntity<Course>(course,HttpStatus.CREATED);
		}
		return new ResponseEntity<Course>(HttpStatus.NO_CONTENT);
	}
	
	@RequestMapping(value = "/course/{courseId}",method = RequestMethod.DELETE)
	@CrossOrigin(origins="*")
	public ResponseEntity<String> deleteCourse(@PathVariable("courseId")final int courseID) {
		final String deleted = courseBusiness.deleteCourse(courseID);
		if(deleted!=null){
			return new ResponseEntity<String>(HttpStatus.OK);
		}
		return new ResponseEntity<String>(HttpStatus.NO_CONTENT);
	}
}
