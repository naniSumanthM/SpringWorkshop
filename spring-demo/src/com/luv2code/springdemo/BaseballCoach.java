package com.luv2code.springdemo;

public class BaseballCoach implements Coach{
	
	private FortuneService fortuneService;
	
	public BaseballCoach() {}

	public BaseballCoach(FortuneService service) {
		fortuneService = service;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes in the batting cage!";
	}

	@Override
	public String getDailyFortune() {
		return "Baseball Fortune: " + fortuneService.getFortune();
	}

	@Override
	public String getDailyRandomFortune() {
		return "Random Baseball Fortune: " + fortuneService.getRandomFortune();
	}
	
	public void initMethod() {
		System.out.println("Init Method - Basbeall Bean Startup");
	}
	
	public void destroyMethod() {
		System.out.println("Destroy Method - Baseball Destroy Method");
	}

}
