package com.prop;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		AbstractApplicationContext context = new GenericXmlApplicationContext
				("classpath:com/prop/applicationContext.xml");
		
		
		try {
			User user = context.getBean(User.class);
			user.wrtie();
		} finally{
			
			context.close();
			
		}
	}
}
