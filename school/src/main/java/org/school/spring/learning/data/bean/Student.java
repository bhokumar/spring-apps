package org.school.spring.learning.data.bean;

public class Student {
	private int studentId;
	private int studentName;
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public int getStudentName() {
		return studentName;
	}
	public void setStudentName(int studentName) {
		this.studentName = studentName;
	}
	public Student(int studentId, int studentName) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
	}
	
}
