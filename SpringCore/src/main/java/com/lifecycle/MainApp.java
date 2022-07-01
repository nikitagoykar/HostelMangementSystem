package com.lifecycle;

import org.springframework.aop.framework.AopContext;
import org.springframework.context.annotation.ContextAnnotationAutowireCandidateResolver;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/lifecycle/Studentconfig.xml");
         Student student= context.getBean(Student.class,"student");
         context.registerShutdownHook();
         System.out.println(student);
	}

}
