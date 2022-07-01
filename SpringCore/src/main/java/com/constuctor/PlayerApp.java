package com.constuctor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PlayerApp {

	public static void main(String[] args) {
		ApplicationContext appContext=new ClassPathXmlApplicationContext("com/constuctor/config.xml");
	     Player player=appContext.getBean(Player.class,"player");
	      System.out.println(player);

	}

}
