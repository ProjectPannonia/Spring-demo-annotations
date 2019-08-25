package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PracticeFootballJavaConfigDemoApp {

	public static void main(String[] args) {
		
		// read spring config java class
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(PracticeConfiguration.class);
		
		// get the bean from spring container
		PracticeFootballCoach theCoach = context.getBean("footballCoach",PracticeFootballCoach.class);
		
		// call a method on the bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		
		//get the footballcoach name and emailaddress
		System.out.println(theCoach.getName());
		System.out.println(theCoach.getEmail());
		
		context.close();

	}

}
