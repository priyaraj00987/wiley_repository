package com.wiley.springcore.remove.xml;

import org.springframework.stereotype.Component;

//@Component("firststudent")

public class Demo1 {
	private Student student;
	public Demo1() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Demo1(Student student) {
		super();
		this.student = student;
	}
	public Student getStudent() {
		return student;
	}
	public void setSamosa(Student student) {
		this.student = student;
	}
	public void study() {
		this.student.display();
		System.out.println("student is reading books");
	}

}
