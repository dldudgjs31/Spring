package com.user1;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		//AbstractApplicationContext : applicationcontext�� ���� �߻� Ŭ����
		//������ �����̳� ����
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
