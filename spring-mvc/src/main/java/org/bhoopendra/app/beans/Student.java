package org.bhoopendra.app.beans;

public class Student {
	private int rollNo;
	private Address address;
	private String name;
	private String designation;

	public Student(int rollNo, Address address, String name) {
		super();
		this.rollNo = rollNo;
		this.address = address;
		this.name = name;
	}

	public Student(int rollNo, Address address, String name,final String designation) {
		super();
		this.rollNo = rollNo;
		this.address = address;
		this.name = name;
		this.designation = designation;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}
}
