package com.spring.core.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("/com/spring/core/collection/Collection.xml");
		Emp bean = (Emp) context.getBean("emp1");
		
		System.out.println(bean);
		System.out.println(bean.getName());
		System.out.println(bean.getPhone());
		System.out.println(bean.getAddress());
		System.out.println(bean.getCours());
		
		
	}

}
