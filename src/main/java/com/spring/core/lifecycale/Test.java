package com.spring.core.lifecycale;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("/com/spring/core/lifecycale/life.xml");
		
		Samosa bean = (Samosa) context.getBean("samosa");
		
		System.out.println(bean);
		
	}

}
