package com.luv2code.springdemo;

public class BasketballCoach implements Coach{
	
	private FortuneService fortuneService;
	
	public BasketballCoach() {}
	
	public BasketballCoach(FortuneService service) {
		fortuneService = service;
	}

	@Override
	public String getDailyWorkout() {
		return "Work on your jumpshot!";
	}

	@Override
	public String getDailyFortune() {
		return "Basektball Fortune: " + fortuneService.getFortune();
	}

	@Override
	public String getDailyRandomFortune() {
		return "Random BasketBall Fortune: " + fortuneService.getRandomFortune();
	}
	

}
