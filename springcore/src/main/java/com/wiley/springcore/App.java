package com.wiley.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wiley.springcore.reftype.WileyA;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context=  new ClassPathXmlApplicationContext("com/wiley/springcore/config1.xml");
    	Student  student1=(Student)context.getBean("wileystudent1");
    	
        System.out.println(student1);
        System.out.println(student1.getObj().getCity());
        System.out.println(student1.getPhones());
        System.out.println(student1.getAddresses());
        System.out.println(student1.getCourses());
    }
}
