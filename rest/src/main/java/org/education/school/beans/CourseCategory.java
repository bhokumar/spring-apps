package org.education.school.beans;

import org.springframework.data.annotation.Id;

public class CourseCategory implements School {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4203333566793633312L;
	@Id
	private int courseCategoryID;
	private String categoryName;
	private String categoryDescrption;

	public CourseCategory() {

	}

	public CourseCategory(int courseCategoryID, String categoryName,
			String categoryDescrption) {
		super();
		this.courseCategoryID = courseCategoryID;
		this.categoryName = categoryName;
		this.categoryDescrption = categoryDescrption;
	}

	public int getCourseCategoryID() {
		return courseCategoryID;
	}

	public void setCourseCategoryID(int courseCategoryID) {
		this.courseCategoryID = courseCategoryID;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getCategoryDescrption() {
		return categoryDescrption;
	}

	public void setCategoryDescrption(String categoryDescrption) {
		this.categoryDescrption = categoryDescrption;
	}

}
