package com.config.user2;

import org.springframework.beans.factory.annotation.Autowired;

public class User {
	@Autowired
	private UserService service;
	
	public void init() {
		System.out.println("init...");
	}
	
	public void write() {
		System.out.println("---�ڹٷ� ȯ�� ���� : @Bean ---");
		System.out.println(service.message());
	}
	
	public void destroy() {
		System.out.println("destroy...");
	}
}
