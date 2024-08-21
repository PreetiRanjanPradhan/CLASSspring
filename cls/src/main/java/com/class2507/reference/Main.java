package com.class2507.reference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main (String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/class2507/reference/refAppContext.xml");
		Product st = (Product) context.getBean("product1");
		System.out.println(st);
	}

}
