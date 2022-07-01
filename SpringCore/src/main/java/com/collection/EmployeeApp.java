package com.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeApp {

	public static void main(String[] args) {
		
		ApplicationContext appContext=new ClassPathXmlApplicationContext("com/collection/config.xml");
	     Employee employee=appContext.getBean(Employee.class,"employee");
	      System.out.println(employee);
	}

	

}
