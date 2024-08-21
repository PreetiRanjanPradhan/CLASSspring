package com.class1807.basicconstructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[]args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/class1807/basicconstructor/constructorConfig.xml");
		Faculty Faculty = (Faculty) context.getBean("Faculty");
		Faculty Faculty1 = (Faculty) context.getBean("Faculty1");
		System.out.println(Faculty);
		System.out.println(Faculty1);
	}
	
}