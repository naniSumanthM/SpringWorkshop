package com.luv2code.springdemo;

public class CricketCoach implements Coach {
	
	private String emailAddress;
	private String team;
	private FortuneService fortuneService;
	
	public CricketCoach() {
//		System.out.println("New Cricket Coach Created");
	}
	
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
//		System.out.println("Cricket Coach--Set Email Address");
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
//		System.out.println("Cricket Coach--Set Team");
		this.team = team;
	}
	
	public void setFortuneService(FortuneService fortuneService) {
//		System.out.println("Cricket Coach Inside Setter Method");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice spin bowling!";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	@Override
	public String getDailyRandomFortune() {
		return "Random Cricket Fortune: " + fortuneService.getRandomFortune();
	}
	
}