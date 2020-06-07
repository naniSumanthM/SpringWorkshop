package com.luv2code.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:sport.properties")
@ComponentScan("com.luv2code.springdemo")
public class FootballConfiguration {
	
	@Bean
	public FortuneService footballFortuneService() {
		return new FootballFortuneService();
	}
	
	@Bean
	public Coach footballCoach() {
		return new FootballCoach(footballFortuneService());
	}

}
