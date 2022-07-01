package com.annotation;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifeApp {

	public static void main(String[] args) {
		
		      AbstractApplicationContext context = new ClassPathXmlApplicationContext("");

		     Lifecycle obj = (Lifecycle) context.getBean("helloWorld");
		      obj.getMessage();
		      context.registerShutdownHook();
		   }

	}


