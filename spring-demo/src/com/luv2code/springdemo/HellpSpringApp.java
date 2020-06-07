package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HellpSpringApp {
	public static void main(String[] args) {
		
		//Load Spring Configuration File, create context
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Retrieve Bean from Spring Container
		Coach baseballCoach = context.getBean("baseballCoach", Coach.class);
		Coach trackCoach = context.getBean("trackCoach", Coach.class);
		Coach basketballCoach = context.getBean("basketballCoach", Coach.class);
		
		//call method on bean
		System.out.println(baseballCoach.getDailyWorkout() + "---" + baseballCoach.getDailyFortune());
		System.out.println(trackCoach.getDailyWorkout() + "---" + trackCoach.getDailyFortune());
		System.out.println(basketballCoach.getDailyWorkout() + "---" + basketballCoach.getDailyFortune());	
		System.out.println(baseballCoach.getDailyRandomFortune());
		
		//close context
		context.close();
	}
}
