package com.anno.user5;

import org.springframework.beans.factory.annotation.Autowired;

public class User {
	@Autowired
	private UserService userService;
	
	
	public void write() {
		System.out.println("--- @Value �� �̿��� �������� �Ķ���Ϳ� ���ڿ� �Ǵ� �⺻ �ڷ��� �� ���� ---");
		System.out.println(userService.message());
	}
}
