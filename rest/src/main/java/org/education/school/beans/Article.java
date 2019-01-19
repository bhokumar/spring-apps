package org.education.school.beans;

import org.springframework.data.annotation.Id;

public class Article implements School {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1609945610352925180L;
	private int courseID;
	@Id
	private long articleID;
	private String articleName;

	public Article() {
	}

	public int getCourseID() {
		return courseID;
	}

	public void setCourseID(int courseID) {
		this.courseID = courseID;
	}

	public long getArticleID() {
		return articleID;
	}

	public void setArticleID(long articleID) {
		this.articleID = articleID;
	}

	public String getArticleName() {
		return articleName;
	}

	public void setArticleName(String articleName) {
		this.articleName = articleName;
	}

	public Article(int courseID, long articleID, String articleName) {
		super();
		this.courseID = courseID;
		this.articleID = articleID;
		this.articleName = articleName;
	}

	@Override
	public String toString() {
		return "Article{" +
				"courseID=" + courseID +
				", articleID=" + articleID +
				", articleName='" + articleName + '\'' +
				'}';
	}
}
