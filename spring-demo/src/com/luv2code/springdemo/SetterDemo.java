package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemo {

	public static void main(String[] args) {
		
		//Load Spring Configuration File
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Retrieve Bean From Spring Container
		CricketCoach cricketCoach = context.getBean("cricketCoach", CricketCoach.class);
		
		//Call Methods
		System.out.println(cricketCoach.getDailyWorkout());
		System.out.println(cricketCoach.getEmailAddress());
		System.out.println(cricketCoach.getTeam());
		System.out.println(cricketCoach.getDailyFortune());
		System.out.println(cricketCoach.getDailyRandomFortune());
		
		//Close Context
		context.close();
	}
}
