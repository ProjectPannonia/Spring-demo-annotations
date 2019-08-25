package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Value;

public class PracticeFootballCoach implements Coach {

	private FortuneService fortuneService;
	
	@Value("${foo.name}")
	private String name;
	
	@Value("${foo.email}")
	private String email;
	
	public PracticeFootballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Practice passing.";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}

}
