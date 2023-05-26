package com.wiley.springcore.reftype;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("heloo");
		ApplicationContext context=  new ClassPathXmlApplicationContext("com/wiley/springcore/reftype/config.xml");
        WileyA temp=(WileyA)context.getBean("aref");
        System.out.println(temp.getCounta());
        System.out.println(temp.getObj().getCount());
        System.out.println(temp);
	}

}
