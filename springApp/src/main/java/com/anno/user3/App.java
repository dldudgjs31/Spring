package com.anno.user3;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		AbstractApplicationContext context = new GenericXmlApplicationContext
				("classpath:com/anno/user3/applicationContext.xml");
		
		
		try {
			User user= context.getBean(User.class);
			user.write(); 
			System.out.println("==------------------------------");
			
			User2 user2= context.getBean(User2.class);
			user2.write(); 
			System.out.println("==------------------------------");
			
		} finally{
			
			context.close();
			
		}
	}
}
