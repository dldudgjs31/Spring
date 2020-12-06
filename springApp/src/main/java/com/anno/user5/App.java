package com.anno.user5;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		AbstractApplicationContext context = new GenericXmlApplicationContext
				("classpath:com/anno/user5/applicationContext.xml");
		
		
		try {
			User user= context.getBean(User.class);
			user.write(); 
		} finally{
			
			context.close();
			
		}
	}
}
