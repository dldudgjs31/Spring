package com.user2;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		AbstractApplicationContext context = new GenericXmlApplicationContext(
				"classpath:com/user2/applicationContext.xml");

		
		try {
			User obj = (User) context.getBean("user");
			obj.write();
		} finally {

			context.close();

		}
	}
}
