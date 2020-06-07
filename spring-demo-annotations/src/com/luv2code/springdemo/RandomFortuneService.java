package com.luv2code.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
	
	private String[] fortunes = {"fortuneOne", "fortuneTwo", "fortuneThree"};
	private Random rnd = new Random();
	
	@Override
	public String getFortune() {
		return fortunes[rnd.nextInt(fortunes.length)];
	}

}
