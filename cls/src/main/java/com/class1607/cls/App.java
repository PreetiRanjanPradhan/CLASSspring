package com.class1607.cls;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/class1607/cls/applicationContext.xml");
        Student std = (Student) context.getBean("btech1");
        //Student std1 = (Student) context.getBean("btech2");
        System.out.println(std);
        //System.out.println(std);
    }
}
