package com.wiley.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		System.out.println("hello");
		ApplicationContext context=  new ClassPathXmlApplicationContext("com/wiley/springcore/stereotype/stereotype.xml");
        Student1 student1=context.getBean("student1",Student1.class);
        System.out.println(student1);
        System.out.println(student1.hashCode());
        System.out.println(student1.getList());
        Student1 student2=context.getBean("student1",Student1.class);
        System.out.println(student2.hashCode());
      
	}

}
