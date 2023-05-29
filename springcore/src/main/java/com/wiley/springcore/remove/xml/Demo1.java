package com.wiley.springcore.remove.xml;

import org.springframework.stereotype.Component;

//@Component("firststudent")

public class Demo1 {
	private Student samosa;
	public Demo1() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Demo1(Student samosa) {
		super();
		this.samosa = samosa;
	}
	public Student getSamosa() {
		return samosa;
	}
	public void setSamosa(Student samosa) {
		this.samosa = samosa;
	}
	public void study() {
		this.samosa.display();
		System.out.println("student is reading books");
	}

}
