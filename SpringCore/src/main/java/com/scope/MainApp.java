package com.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/scope/Scopeconfig.xml");
	      Scope obj = (Scope) context.getBean("scope");

	      obj.setMessage("I'm object");
	      obj.getMessage();

	      Scope obj1 = (Scope) context.getBean("scope");
	      obj1.getMessage();

	}

}
