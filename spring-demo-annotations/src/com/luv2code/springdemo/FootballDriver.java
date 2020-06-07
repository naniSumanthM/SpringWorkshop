package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class FootballDriver {

	public static void main(String[] args) {
		
		//Define application Context
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(FootballConfiguration.class);
		
		//Retrieve Bean
		FootballCoach coach = context.getBean("footballCoach", FootballCoach.class);
		
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getTeam());
		
		context.close();

	}

}
