package com.luv2code.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:practice.properties")
public class PracticeConfiguration {
	
	
	// define bean for our motivation fortune service
	@Bean
	public FortuneService motivationFortuneService() {
		return new PracticeMotivationFortuneService();
	}
	
	// define bean for our football coach and inject dependency
	@Bean
	public Coach footballCoach() {
		return new PracticeFootballCoach(motivationFortuneService());
	}
}
