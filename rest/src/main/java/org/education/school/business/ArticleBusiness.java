package org.education.school.business;

import java.util.List;

import org.education.school.beans.Article;
import org.education.school.beans.Section;
import org.education.school.beans.SubSection;
import org.education.school.dao.OperationsDAO;
import org.education.school.mongo.MongoDataOperations;

public class ArticleBusiness {
	private static OperationsDAO<Article> articleDAO = new MongoDataOperations<>(Article.class);
	
	public Article addArticle(Article article){
		return articleDAO.createObject(article);
	}

	public Article searchArticle(final int articleId){
		return articleDAO.getDetails(articleId);
	}
	
	public List<Article> searchAllArticle(){
		return articleDAO.findAllObjects();
	}
	
	public Article modifyArticle(final int articleId,final Article article){
		return articleDAO.modifyDetails(articleId, article);
	}
	
	public String deleteArticle(final int articleId){
		return articleDAO.deleteObjects(articleId);
	}
	
	public List<Section> findAllSections(final int articleId){
		return articleDAO.findChildObjects(articleId);
	}

	public List<SubSection> findAllSubSections(int articleId, int sectionId) {
		return articleDAO.findAllSubSections(articleId, sectionId);
	}
}
