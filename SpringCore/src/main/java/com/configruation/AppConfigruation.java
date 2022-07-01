package com.configruation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppConfigruation {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(Configruation.class);
		Pepsi pepsi = (Pepsi) context.getBean("getPepsi");
		System.out.println(pepsi);
		
		Laptop laptop = (Laptop) context.getBean("getLaptop");
		System.out.println(laptop);
		
	}

}
