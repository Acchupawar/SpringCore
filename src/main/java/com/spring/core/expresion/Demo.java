package com.spring.core.expresion;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Demo {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/core/expresion/Expretion.xml");
		
		Expresion bean = context.getBean("exp",Expresion.class);
		
		System.out.println(bean.getClass().getName());
		
		System.out.println("--------variable value in a same class------------");
		
		System.out.println(bean.getX()); // expresion value
		System.out.println(bean.getY()); // expresion value
		/*
		 * SpEL calling a other class Static Method and varibale value
		 */
		
		System.out.println("--------satic method and variable value other class------------");
		System.out.println(bean.getZ()); // expresion value from Math class Static Method sqrt(555) parametarize
		System.out.println(bean.getE()); // expresion value from Math Static Varibale Value PI
		
		System.out.println("--------Objct creation and Inisalization value in a same class------------");
		System.out.println(bean);
		
		
		/*
		 * SpEL Spring Expresion languge directly
		 */
		System.out.println("-------- SePL Class getvalue param ------------");
		
		SpelExpressionParser parser = new SpelExpressionParser();
		Expression expression = parser.parseExpression("22+33");
		Expression expression1 = parser.parseExpression("22+33+66");
		System.out.println(expression.getValue());
		System.out.println(expression1.getValue());
		
		
		
	}

}
