package com.springcore.object;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beanss.xml");
		Person personInformation = context.getBean("personInfo", Person.class);
		System.out.println(personInformation);	
	}

}
