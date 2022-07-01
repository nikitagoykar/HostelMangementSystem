package com.Setter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentApp {

	public static void main(String[] args) {
		ApplicationContext appContext=new ClassPathXmlApplicationContext("com/Setter/Studentconfig.xml");
      Student student=appContext.getBean(Student.class,"student");
      System.out.println(student);
	}

}
