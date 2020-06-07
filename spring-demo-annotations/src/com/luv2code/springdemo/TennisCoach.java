package com.luv2code.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope("singleton")
@Component 	//Default beanId if not stated is the camelCase of className
public class TennisCoach implements Coach {
	
	public TennisCoach(){}
	
	private FortuneService fortuneService;
	
    @Autowired
    public TennisCoach(@Qualifier("happyFortuneService") FortuneService service) {
        fortuneService = service;
    }
        
	@Override
	public String getDailyWorkout() {
		return "Pratice Serves!";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	@PostConstruct
	public void init() {
		System.out.println("Initilization Method");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("Destroy Method");
	}

}
