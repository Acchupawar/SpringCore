package com.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		// Class path configuration with xml file
		ApplicationContext context = new ClassPathXmlApplicationContext("Config.xml");
		// proveding a variable declartion in xml file
		Student bean1 = (Student) context.getBean("student1");
		Student bean2 = (Student) context.getBean("student2");
		Student bean3 = (Student) context.getBean("student3");

		System.out.println(bean1); // toString method print here

		System.out.println(bean2); // toString method print here
		
		System.out.println(bean3); // toString method print here
	}
}
