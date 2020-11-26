package com.anno.user1;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		//AbstractApplicationContext : applicationcontext의 구현 추상 클래스
		//스프링 컨테이너 개념
		AbstractApplicationContext context = new GenericXmlApplicationContext
				("classpath:com/anno/user1/applicationContext.xml");
		
		
		try {
			User user= context.getBean(User.class);
			user.write(); 
			System.out.println("=================================");
			
			
			User2 user2= context.getBean(User2.class);
			user2.write(); 
			System.out.println("=================================");
			
			User3 user3= context.getBean(User3.class);
			user3.write(); 
			System.out.println("=================================");
			
		} finally{
			
			context.close();
			
		}
	}
}
