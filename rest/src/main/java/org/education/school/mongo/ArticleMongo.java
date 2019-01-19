package org.education.school.mongo;

import java.util.List;
import org.education.school.beans.Article;
import org.education.school.beans.Section;
import org.education.school.dao.ArticleDAO;
import org.springframework.data.mongodb.core.MongoTemplate;

public class ArticleMongo implements ArticleDAO {
	MongoTemplate mongoTemplate = MongoOpeartionsSingleton.getMongoTemplate();

	@Override
	public Article createArticle(final Article article) {
		mongoTemplate.save(article);
		System.out.println("article saved " + mongoTemplate);
		return article;
	}

	@Override
	public String getName(int articleId) {
		return null;
	}

	@Override
	public int getCourseId(int articleId) {
		return 0;
	}

	@Override
	public Article getArticleDetails(int articleId) {
		return mongoTemplate.findById(articleId, Article.class);
	}

	@Override
	public List<Section> getSections(int articleId) {
		return null;
	}

	@Override
	public List<Article> findAllArticles() {
		return mongoTemplate.findAll(Article.class);
	}

	@Override
	public Article modifyArticleDetails(int articleId, Article article) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * @Override public UpArticle modifyArticleDetails(final int articleId,final
	 * Article article) { UpdateResult writeResult = mongoTemplate.upsert(new
	 * Query(Criteria.where("_id").is(articleId)), new Update().set("courseID",
	 * article.getCourseID()).set("articleName", article.getArticleName()),
	 * Article.class); if(writeResult.isUpdateOfExisting()){ return article; }
	 * return null; }
	 */

}
