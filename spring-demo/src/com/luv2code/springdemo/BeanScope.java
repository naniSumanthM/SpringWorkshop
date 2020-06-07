package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScope {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanscope.xml");
		
		Coach coachA = context.getBean("baseballCoach", Coach.class);
		Coach coachB = context.getBean("baseballCoach", Coach.class);
		
		System.out.println(coachA == coachB);
		System.out.println(coachA + "--" + coachB);
		
	}

}
