package com.user3;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		AbstractApplicationContext context = new GenericXmlApplicationContext(
				"classpath:com/user3/applicationContext.xml");

		
		try {
			//getBean�� ��ȯ Ÿ���� object
			User obj = context.getBean(User.class);
			obj.write();
		} finally {
			context.close();
		}
	}
}
