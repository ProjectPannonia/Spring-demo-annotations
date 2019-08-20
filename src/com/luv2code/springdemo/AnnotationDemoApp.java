package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		
		// read spring config file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// get the bean from spring container
		Coach theCoach = context.getBean("tennisCoach",Coach.class);
		Coach hockeyCoach = context.getBean("hockeyCoach",Coach.class);
		Coach fotballCoach = context.getBean("footballCoach",Coach.class);
		// call a method on the bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(hockeyCoach.getDailyWorkout());
		System.out.println(fotballCoach.getDailyWorkout());
		// close the context
		context.close();
	}

}
