package com.wiley.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
;

public class LCmain {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/wiley/springcore/lifecycle/lcconfig.xml");
		Pizza pz1 =  (Pizza) context.getBean("pizza1");
		System.out.println(pz1);
		context.registerShutdownHook();
	}

}
