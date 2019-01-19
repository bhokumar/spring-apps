package org.bhoopendra.app.beans;

public class Address  {
	private String city;
	private int pincode;
	private String street;
	
	public Address(String city, int pincode, String street) {
		super();
		this.city = city;
		this.pincode = pincode;
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	@Override
	public String toString() {
		return "["+"city: "+city+"] pincode : "+"["+pincode+"] street : "+street;
	}
}
