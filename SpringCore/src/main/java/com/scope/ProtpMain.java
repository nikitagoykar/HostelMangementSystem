package com.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProtpMain {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/scope/Scopeconfig.xml");
	      Prototype obj = (Prototype) context.getBean("prototype");

	      obj.setMessage("I'm object A");
	      obj.getMessage();

	    Prototype obj1 = (Prototype) context.getBean("prototype");
	      obj1.getMessage();

	}

}
