package com.spring.core.scop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Teacher {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/core/scop/Scop.xml");
		
		Teacher bean = context.getBean("ob",Teacher.class);
		Teacher bean1 = context.getBean("ob",Teacher.class);
		
		System.out.println(bean.hashCode());
		System.out.println(bean1.hashCode());
		
	}
	
	

}
