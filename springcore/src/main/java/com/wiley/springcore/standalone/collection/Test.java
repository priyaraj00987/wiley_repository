package com.wiley.springcore.standalone.collection;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("heloo");
		ApplicationContext context=  new ClassPathXmlApplicationContext("com/wiley/springcore/standalone/collection/standalonecofig.xml");
        Person temp=context.getBean("person1",Person.class);
        System.out.println(temp);
        //System.out.println(temp.getFriends().getClass().getName());
    
	}

}
