package com.wiley.springcore;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {
	private int studentId;
	private Address obj;
	private String studentName;
	private String studentAddress;
	private List<String>phones;
	private Set<String> addresses;
	private Map<String, String >courses;
	public Map<String, String> getCourses() {
		return courses;
	}
	public List<String> getPhones() {
		return phones;
	}
	public void setPhones(List<String> phones) {
		this.phones = phones;
	}
	public Set<String> getAddresses() {
		return addresses;
	}
	public void setAddresses(Set<String> addresses) {
		this.addresses = addresses;
	}
	
	
	
	
	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}
	public Student(String name, List<String> phones, Set<String> addresses, Map<String, String> courses) {
		super();
		this.phones = phones;
		this.addresses = addresses;
		this.courses = courses;
	}
	@Override
	public String toString() {
		return "Sudent [studentId=" + studentId + ", studentName=" + studentName + ", studentAddress=" + studentAddress
				+", obj=" + obj + "]";
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address getObj() {
		return obj;
	}
	public void setObj(Address obj) {
		this.obj = obj;
	}

}
