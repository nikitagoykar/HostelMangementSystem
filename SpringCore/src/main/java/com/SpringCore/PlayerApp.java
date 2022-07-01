package com.SpringCore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PlayerApp {

	public static void main(String[] args) {
		
ApplicationContext context=new ClassPathXmlApplicationContext("com/SpringCore/config.xml");
Player player=context.getBean(Player.class,"player");
System.out.println(player);
	}

}
