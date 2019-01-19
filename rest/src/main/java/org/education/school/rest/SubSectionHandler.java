package org.education.school.rest;

import java.util.List;

import org.education.school.beans.SubSection;
import org.education.school.dao.OperationsDAO;
import org.education.school.mongo.MongoDataOperations;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class SubSectionHandler {

	private static OperationsDAO<SubSection> subSectionDAO = new MongoDataOperations<>(SubSection.class);
	@CrossOrigin(origins="*")
	@RequestMapping(value = "/subSection",method =RequestMethod.GET)
	public ResponseEntity<List<SubSection>> getSubSection() {
		System.out.println("Request Made");
		List<SubSection> subSections = subSectionDAO.findAllObjects();
		if(subSections.isEmpty()){
			return new ResponseEntity<List<SubSection>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<SubSection>>(subSections,HttpStatus.FOUND);
		
	}

	@RequestMapping(value = "/subSection/{subSubSectionId}",method =RequestMethod.GET)
	@CrossOrigin(origins="*")
	public ResponseEntity<SubSection> getSubSection(@PathVariable("subSubSectionId")final int subSectionID) {
		SubSection subSection = subSectionDAO.getDetails(subSectionID);
		if(subSection!=null){
			return new ResponseEntity<SubSection>(subSection,HttpStatus.FOUND);
		}
		return new ResponseEntity<SubSection>(HttpStatus.NO_CONTENT);
	}
	
	@RequestMapping(value = "/subSection",method =RequestMethod.POST)
	@CrossOrigin(origins="*")
	public ResponseEntity<SubSection> createSubSection(@RequestBody final SubSection subSection) {
		final SubSection addedSubSection = subSectionDAO.createObject(subSection);
		if(addedSubSection!=null){
			return new ResponseEntity<SubSection>(addedSubSection,HttpStatus.CREATED);
		}
		return new ResponseEntity<SubSection>(HttpStatus.NO_CONTENT);
	}

	@RequestMapping(value = "/subSection/{subSubSectionId}",method =RequestMethod.PUT)
	@CrossOrigin(origins="*")
	public ResponseEntity<SubSection> modifySubSection(@PathVariable("subSubSectionId")final int subSectionID,@RequestBody final SubSection subSection) {
		final SubSection modifiedSubSection = subSectionDAO.modifyDetails(subSectionID, subSection);
		if(modifiedSubSection!=null){
			return new ResponseEntity<SubSection>(modifiedSubSection,HttpStatus.OK);
		}
		return new ResponseEntity<SubSection>(HttpStatus.NOT_MODIFIED);
	}
	
	@RequestMapping(value = "/subSection/{subSubSectionId}",method =RequestMethod.DELETE)
	@CrossOrigin(origins="*")
	public ResponseEntity<String> deleteSubSection(@PathVariable("subSubSectionId")final int subSectionID) {
		final String deleted = subSectionDAO.deleteObjects(subSectionID);
		if(deleted!=null){
			return new ResponseEntity<String>(HttpStatus.OK);
		}
		return new ResponseEntity<String>(HttpStatus.NO_CONTENT);
	}
	
	/*
	
	@POST
	@Path("/{subSubSectionId}")
	public SubSection createSubSection(int subSectionID) {
		return null;
	}

	@PUT
	public List<SubSection> modifySubSection() {
		return null;
	}

	@PUT
	@Path("/{subSubSectionId}")
	public SubSection modifySubSection(int subSectionID) {
		return null;
	}

*/}
