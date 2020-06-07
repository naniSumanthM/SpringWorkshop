package com.luv2code.springdemo;

public class TrackCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public TrackCoach() {}
	
	public TrackCoach(FortuneService service){
		fortuneService = service;
	}

	@Override
	public String getDailyWorkout() {
		return "Run 5K!";
	}

	@Override
	public String getDailyFortune() {
		return "Track Fortune: " + fortuneService.getFortune();
	}

	@Override
	public String getDailyRandomFortune() {
		return "Random Track Fortune: " + fortuneService.getRandomFortune();
	}

}
