package com.config.user2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class App {
	public static void main(String[] args) {
		AbstractApplicationContext context = 
				new AnnotationConfigApplicationContext(SpringConfig.class);
		
		try {
			User user = context.getBean(User.class);
			user.write();
			System.out.println("---------------------------------");
			System.out.println("----------货肺 积己等 按眉------------");
			//User user2 = (User)context.getBean("user2.user");
			User user2 = context.getBean(User.class, "user2.user");
			
			if(user==user2) {
				System.out.println("鞍篮 按眉");
			}else {
				System.out.println("促弗 按眉");
			}
		}finally {
			context.close();
		}
		
	}
}
