package org.education.school.rest;

import java.util.List;

import org.education.school.beans.Section;
import org.education.school.business.SectionBusiness;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SectionHandler {
	private static SectionBusiness sectionBusiness = new SectionBusiness();

	@RequestMapping(value = "/section", method = RequestMethod.GET)
	@CrossOrigin(origins="*")
	public ResponseEntity<List<Section>> getSections() {
		List<Section> sections = sectionBusiness.searchAllSections();
		if (sections.isEmpty()) {
			return new ResponseEntity<List<Section>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<Section>>(sections, HttpStatus.FOUND);
	}

	@RequestMapping(value = "/section/{sectionId}", method = RequestMethod.GET)
	@CrossOrigin(origins="*")
	public ResponseEntity<Section> getSection(@PathVariable("sectionId") final int sectionID) {
		final Section section = sectionBusiness.searchSection(sectionID);
		if (section != null) {
			return new ResponseEntity<Section>(section, HttpStatus.FOUND);
		}
		return new ResponseEntity<Section>(HttpStatus.NO_CONTENT);
	}

	@RequestMapping(value = "/section", method = RequestMethod.POST)
	@CrossOrigin(origins="*")
	public ResponseEntity<Section> createSection(@RequestBody final Section section) {
		Section addedSection = sectionBusiness.addSection(section);
		if (addedSection != null) {
			return new ResponseEntity<Section>(addedSection, HttpStatus.CREATED);
		}
		return new ResponseEntity<Section>(HttpStatus.NO_CONTENT);
	}

	public List<Section> modifySection() {
		return null;
	}

	@RequestMapping(value = "/section/{sectionId}", method = RequestMethod.POST)
	@CrossOrigin(origins="*")
	public ResponseEntity<Section> modifySection(@PathVariable("sectionId")final int sectionID,@RequestBody final Section section) {
		final Section modifiedSection = sectionBusiness.modifySection(sectionID, section);
		if(modifiedSection!=null){
			return new ResponseEntity<Section>(modifiedSection,HttpStatus.OK);
		}
		return new ResponseEntity<Section>(HttpStatus.NOT_MODIFIED);
	}
	
	@RequestMapping(value = "/section/{sectionId}", method = RequestMethod.DELETE)
	@CrossOrigin(origins="*")
	public ResponseEntity<String> deleteSection(@PathVariable("sectionId")final int sectionID) {
		final String deleted = sectionBusiness.deleteSection(sectionID);
		if(deleted!=null){
			return new ResponseEntity<String>(HttpStatus.OK);
		}
		return new ResponseEntity<String>(HttpStatus.NO_CONTENT);
	}

}
