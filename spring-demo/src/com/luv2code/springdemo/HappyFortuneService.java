package com.luv2code.springdemo;

import java.util.Random;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "You will win the lottery!";
	}

	@Override
	public String getRandomFortune() {
		Random rnd = new Random();
		String[] fortunes = {"Lottery Winner!", "Job Winner!", "Love Winner!"};
		int randomNumber = rnd.nextInt(fortunes.length);
		return fortunes[randomNumber];
	}
}
