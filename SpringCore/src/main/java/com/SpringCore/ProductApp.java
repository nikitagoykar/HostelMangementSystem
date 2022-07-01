package com.SpringCore;

import org.springframework.cglib.transform.AbstractClassFilterTransformer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProductApp {

	public static void main(String[] args) {
		 AbstractApplicationContext  context = new ClassPathXmlApplicationContext("com/SpringCore/config.xml");
        Product product=context.getBean(Product.class,"product");
        context.registerShutdownHook();
       System.out.println(product);
      
	}

}
