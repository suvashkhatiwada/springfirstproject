package com.springfirstproject.maven.SpringFirstProject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMainApp {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("application-context.xml");
		Customers customer = (Customers) ctx.getBean("cust");
		System.out.println(customer.toString());

		Address address = (Address) ctx.getBean("address");
		System.out.println(address.toString());

		
	}

}
