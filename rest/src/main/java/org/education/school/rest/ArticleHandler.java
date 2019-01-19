package org.education.school.rest;

import java.util.List;

import org.education.school.beans.Article;
import org.education.school.beans.Section;
import org.education.school.beans.SubSection;
import org.education.school.business.ArticleBusiness;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArticleHandler {
	private ArticleBusiness articleBusiness = new ArticleBusiness();
	@RequestMapping(value = "/article",method = RequestMethod.GET)
	@CrossOrigin(origins="*")
	public ResponseEntity<List<Article>>  getArticle() {
		List<Article> articles =articleBusiness.searchAllArticle();
		if(articles.isEmpty()){
			return new ResponseEntity<List<Article>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<Article>>(articles, HttpStatus.OK);
	}

	@RequestMapping(value = "/article",method = RequestMethod.POST)
	@CrossOrigin(origins="*")
	public ResponseEntity<Article> createArticle(@RequestBody Article article) {
		Article article2 = articleBusiness.addArticle(article);
		if (article2 == null) {
			return new ResponseEntity<Article>(HttpStatus.NOT_ACCEPTABLE);
		}
		return new ResponseEntity<Article>(article2, HttpStatus.CREATED);
	}
	
	@RequestMapping(value = "/article/{articleId}",method = RequestMethod.GET)
	@CrossOrigin(origins="*")
	public  ResponseEntity<Article> getArticle(@PathVariable("articleId") int articleID) {
		Article article = articleBusiness.searchArticle(articleID);
		if(article==null){
			return new ResponseEntity<Article>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<Article>(article,HttpStatus.FOUND);
	}

	@RequestMapping(value = "/article",method = RequestMethod.PUT)
	@CrossOrigin(origins="*")
	public List<Article> modifyArticle() {
		return null;
	}

	@RequestMapping(value = "/article/{articleId}",method = RequestMethod.PUT)
	@CrossOrigin(origins="*")
	public ResponseEntity<Article> modifyArticle(@PathVariable("articleId")final int articleId,@RequestBody final Article article) {
	final Article modifiedArticle = articleBusiness.modifyArticle(articleId, article);
	if(modifiedArticle==null){
		return new ResponseEntity<Article>(HttpStatus.NOT_FOUND);
	}
	return new ResponseEntity<Article>(modifiedArticle,HttpStatus.OK);
	}
	
	@RequestMapping(value = "/article/{articleId}",method = RequestMethod.DELETE)
	@CrossOrigin(origins="*")
	public ResponseEntity<String> deleteArticle(@PathVariable("articleId")final int articleId) {
	final String deleted = articleBusiness.deleteArticle(articleId);
	if(deleted!=null){
		return new ResponseEntity<String>(HttpStatus.OK);
	}
	return new ResponseEntity<String>(HttpStatus.NO_CONTENT);
	}
	
	@RequestMapping(value = "/article/{articleId}/section",method = RequestMethod.GET)
	@CrossOrigin(origins="*")
	public ResponseEntity<List<Section>> findSections(@PathVariable("articleId")final int articleId) {
	final List<Section> sections = articleBusiness.findAllSections(articleId);
	if(sections.isEmpty()){
		return new ResponseEntity<List<Section>>(HttpStatus.NO_CONTENT);
	}
	return new ResponseEntity<List<Section>>(sections,HttpStatus.FOUND);
	}
	
	@RequestMapping(value = "/article/{articleId}/section/{sectionId}/subSection",method = RequestMethod.GET)
	@CrossOrigin(origins="*")
	public ResponseEntity<List<SubSection>> findSubSections(@PathVariable("articleId")final int articleId,@PathVariable("sectionId")final int sectionId) {
	final List<SubSection> subSections = articleBusiness.findAllSubSections(articleId,sectionId);
	if(subSections.isEmpty()){
		return new ResponseEntity<List<SubSection>>(HttpStatus.NO_CONTENT);
	}
	return new ResponseEntity<List<SubSection>>(subSections,HttpStatus.FOUND);
	}
}
