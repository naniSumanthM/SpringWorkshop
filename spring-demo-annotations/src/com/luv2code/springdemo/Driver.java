package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
	public static void main(String[] args) {
		
		//read spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//get bean from spring container
		Coach tennisCoach = context.getBean("tennisCoach", Coach.class);
		Coach soccerCoach = context.getBean("soccerCoach", Coach.class);
		Coach golfCoach = context.getBean("golfCoach", Coach.class);
		
		//call method on the bean
		System.out.println(tennisCoach.getDailyFortune());
		System.out.println(soccerCoach.getDailyFortune());
		System.out.println(golfCoach.getDailyFortune());
		
		//close context
		context.close();
	}
}
