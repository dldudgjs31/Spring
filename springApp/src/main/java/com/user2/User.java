package com.user2;

public class User {
	private UserService userService;
	
	public User(UserService userService) {
		this.userService=userService;
	}
	
	public void init() {
		System.out.println("�ʱ�ȭ�۾��� ���⼭..");
	}
	
	public void write() {
		String s = userService.message();
		System.out.println(">>���<<");
		System.out.println(s);
	}
	public void destroy() {
		System.out.println("��ü �Ҹ��� �۾��� ���⼭...");
	}
}
