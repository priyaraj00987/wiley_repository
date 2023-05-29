package com.wiley.springcore.autowire.annotation;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("heloo");
		ApplicationContext context=  new ClassPathXmlApplicationContext("com/wiley/springcore/autowire/annotation/autowirecofig.xml");
       Emp emp  =context.getBean("emp",Emp.class);
        System.out.println(emp);
     
	}

}
