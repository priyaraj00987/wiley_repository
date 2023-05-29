package com.wiley.springcore.remove.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=  new AnnotationConfigApplicationContext(Javaconfig.class);
	    Demo1 demo1=context.getBean("getDemo",Demo1.class);
	   demo1.study();
	}

}
