package com.wiley.springcore.ci;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("heloo");
		ApplicationContext context=  new ClassPathXmlApplicationContext("com./wiley/springcore/ci/NewFile4.xml");
        Person temp=(Person)context.getBean("p1");
        System.out.println(temp);
     
	}

}
