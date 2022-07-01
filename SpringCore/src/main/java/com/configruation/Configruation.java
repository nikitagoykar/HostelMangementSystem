package com.configruation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan (basePackages = "com.configruation")
public class Configruation {
	
	@Bean
	public Pepsi getPepsi()
	{
		Pepsi pepsi=new Pepsi(25,2);
		return pepsi;
	}
	@Bean
	public Laptop getLaptop()
	{
		Laptop laptop=new Laptop(45,5);
		return laptop;
	}
}
