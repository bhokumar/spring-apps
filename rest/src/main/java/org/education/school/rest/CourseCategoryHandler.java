package org.education.school.rest;

import java.util.List;

import org.education.school.beans.CourseCategory;
import org.education.school.business.CourseCategoryBusiness;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseCategoryHandler {
	private static CourseCategoryBusiness courseCategoryBusiness =new CourseCategoryBusiness();
	@RequestMapping(value = "/courseCategory",method = RequestMethod.GET)
	@CrossOrigin(origins="*")
	public ResponseEntity<List<CourseCategory>> getCourseCategory() {
		final List<CourseCategory> courseCategory = courseCategoryBusiness.searchAllCourseCategory();
		if(courseCategory.isEmpty()){
			return new ResponseEntity<List<CourseCategory>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<CourseCategory>>(courseCategory,HttpStatus.FOUND);
	}

	
	@RequestMapping(value = "/courseCategory",method = RequestMethod.PUT)
	@CrossOrigin(origins="*")
	public List<CourseCategory> modifyCourseCategory() {
		return null;
	}

	@RequestMapping(value ="/courseCategory/{courseCategoryId}",method = RequestMethod.PUT)
	@CrossOrigin(origins="*")
	public ResponseEntity<CourseCategory> modifyCourseCategory(@PathVariable("courseCategoryId")int courseCategoryID,@RequestBody CourseCategory category) {
		CourseCategory courseCategory = courseCategoryBusiness.modifyCourseCategory(courseCategoryID, category);
		if(courseCategory!=null){
		return new 	ResponseEntity<CourseCategory>(courseCategory,HttpStatus.ACCEPTED);
		}
		return new ResponseEntity<CourseCategory>(HttpStatus.NO_CONTENT);
	}

	@RequestMapping(value = "/courseCategory",method = RequestMethod.POST)
	@CrossOrigin(origins="*")
	public ResponseEntity<CourseCategory> createCourseCategory(@RequestBody final CourseCategory courseCategory) {
		final CourseCategory category = courseCategoryBusiness.AddCourseCategory(courseCategory);
		 if(category==null){
			 return new ResponseEntity<CourseCategory>(HttpStatus.NO_CONTENT);
		 }
		 return new ResponseEntity<CourseCategory>(category,HttpStatus.CREATED);
	}
	
	@RequestMapping(value ="/courseCategory/{courseCategoryId}",method = RequestMethod.GET)
	@CrossOrigin(origins="*")
	public ResponseEntity<CourseCategory> getCourseCategory(@PathVariable("courseCategoryId")final int courseCategoryId) {
	CourseCategory courseCategory =courseCategoryBusiness.searchCourseCategory(courseCategoryId);
	if(courseCategory!=null){
		return new ResponseEntity<CourseCategory>(courseCategory,HttpStatus.FOUND);
	}
	return new ResponseEntity<CourseCategory>(HttpStatus.NO_CONTENT);	
	}
	
	@RequestMapping(value ="/courseCategory/{courseCategoryId}",method = RequestMethod.DELETE)
	@CrossOrigin(origins="*")
	public ResponseEntity<String> deleteCourseCategory(@PathVariable("courseCategoryId")final int courseCategoryId) {
		String deleted =courseCategoryBusiness.deleteCourseCategory(courseCategoryId);
	if(deleted!=null){
		return new ResponseEntity<String>(HttpStatus.OK);
	}
	return new ResponseEntity<String>(HttpStatus.NO_CONTENT);
	}
}
