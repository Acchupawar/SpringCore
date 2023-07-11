package com.spring.core.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/core/stereotype/Stereo.xml");
		Student bean = (Student) context.getBean("student");
		
		System.out.println(bean);
		
	/*	bean.setCity("Bangalore");
		bean.setName("Anand");
		
		System.out.println(bean);
		
		System.out.println(bean.getName());
		System.out.println(bean.getCity());
		System.out.println(bean.getClass());
	*/	
		
	}

}
