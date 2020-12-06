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
			System.out.println("----------���� ������ ��ü------------");
			//User user2 = (User)context.getBean("user2.user");
			User user2 = context.getBean(User.class, "user2.user");
			
			if(user==user2) {
				System.out.println("���� ��ü");
			}else {
				System.out.println("�ٸ� ��ü");
			}
		}finally {
			context.close();
		}
		
	}
}
