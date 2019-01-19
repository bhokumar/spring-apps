package org.education.school.beans;

import org.springframework.data.annotation.Id;

public class Course implements School {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2437870823744095014L;

	private int courseCategoryID;
	@Id
	private int courseID;
	
	private String courseName;
	
	private String courseDescription;

	public Course() {
	}

	public Course(int courseCategoryID, int courseID, String courseName,
			String courseDescription) {
		super();
		this.courseCategoryID = courseCategoryID;
		this.courseID = courseID;
		this.courseName = courseName;
		this.courseDescription = courseDescription;
	}

	public int getCourseCategoryID() {
		return courseCategoryID;
	}

	public void setCourseCategoryID(int courseCategoryID) {
		this.courseCategoryID = courseCategoryID;
	}

	public int getCourseID() {
		return courseID;
	}

	public void setCourseID(int courseID) {
		this.courseID = courseID;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseDescription() {
		return courseDescription;
	}

	public void setCourseDescription(String courseDescription) {
		this.courseDescription = courseDescription;
	}

}
