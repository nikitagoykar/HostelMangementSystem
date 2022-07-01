package com.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonApp {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/bean/beanconfig.xml");
		Person person =context.getBean(Person.class,"person");
System.out.println(person);
	}

}
