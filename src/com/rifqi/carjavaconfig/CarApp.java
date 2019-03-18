package com.rifqi.carjavaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class CarApp {

	public static void main(String[] args) {
		
//		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("CarConfig.xml");
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CarConfig.class);
		
		SedanCar myLancer = context.getBean("sedanCar", SedanCar.class);
		
		System.out.println(myLancer);
		
		context.close();
	}

}
