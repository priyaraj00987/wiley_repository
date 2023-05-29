package com.wiley.springcore.remove.xml;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
// @ComponentScan(basePackages="com.springcore.remove.xml")
public class Javaconfig {
	
	
@Bean
	public Student getSamosa() {
		return new Student();
	}

@Bean
    public Demo1 getDemo() {
		//creating a new student object
    Demo1 demo1= new Demo1(getSamosa());
	return demo1;
}


	
}
