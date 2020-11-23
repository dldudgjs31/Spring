package com.user1;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		//AbstractApplicationContext : applicationcontext의 구현 추상 클래스
		//스프링 컨테이너 개념
		AbstractApplicationContext context = new GenericXmlApplicationContext
				("classpath:com/user1/applicationContext.xml");
		
		
		try {
			User obj=(User)context.getBean("user");
			obj.write();
		} finally{
			
			context.close();
			
		}
	}
}
