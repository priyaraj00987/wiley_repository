package com.wiley.springcore;

public class Address {

	private String city;

	
	public void setCity(String city) {
		this.city = city;
	}
	public String getCity() {
		return city;
	}
	public Address() {
		super();
	}
	@Override
	public String toString() {
		return "Address [city=" + city + "]";
		}
}
