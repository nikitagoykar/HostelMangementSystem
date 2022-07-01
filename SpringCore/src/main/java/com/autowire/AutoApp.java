package com.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class AutoApp {

	public static void main(String[] args) {
		
			ApplicationContext context=new ClassPathXmlApplicationContext("com/autowire/autoconfig.xml");
			Teacher teacher =context.getBean(Teacher.class,"teacher");
	System.out.println(teacher);
		}

	}


