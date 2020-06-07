package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Value;

public class FootballCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public FootballCoach(FortuneService service) {
		fortuneService = service;
	}
	
	@Value("${foo.email}")
	private String email;
	
	public String getEmail() {
		return email;
	}

	@Value("${foo.team}")
	private String team;

	public String getTeam() {
		return team;
	}

	@Override
	public String getDailyWorkout() {
		return "Run 200 yards";
	}

	@Override
	public String getDailyFortune() {
		return "";
	}

}
