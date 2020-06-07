package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifecycle {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanlifecycle.xml");
		Coach coachA = context.getBean("baseballCoach", Coach.class);
		System.out.println(coachA.getDailyWorkout());
		context.close();
	}
}
