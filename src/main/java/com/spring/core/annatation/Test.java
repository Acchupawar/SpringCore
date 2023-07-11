package com.spring.core.annatation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/core/annatation/Annatation.xml");
		Emp bean = (Emp) context.getBean("emp");
		
		System.out.println(bean);
		
	}

}
