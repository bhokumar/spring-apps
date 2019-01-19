package org.education.school.hibernate;

import java.util.List;

import org.education.school.beans.Article;
import org.education.school.beans.Section;
import org.education.school.dao.ArticleDAO;

public class ArticleHB implements ArticleDAO{

	@Override
	public Article createArticle(Article article) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getName(int articleId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getCourseId(int articleId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Article getArticleDetails(int articleId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Section> getSections(int articleId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Article> findAllArticles() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Article modifyArticleDetails(int articleId, Article article) {
		// TODO Auto-generated method stub
		return null;
	}}
