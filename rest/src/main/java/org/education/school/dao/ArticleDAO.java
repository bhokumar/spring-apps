package org.education.school.dao;

import java.util.List;

import org.education.school.beans.Article;
import org.education.school.beans.Section;

public interface ArticleDAO {
	public Article createArticle(Article article);
	public String getName(final int articleId);

	public int getCourseId(final int articleId);

	public Article getArticleDetails(final int articleId);

	public List<Section> getSections(final int articleId);
	List<Article> findAllArticles();
	Article modifyArticleDetails(int articleId, Article article);
}
