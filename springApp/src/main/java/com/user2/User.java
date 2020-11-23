package com.user2;

public class User {
	private UserService userService;
	
	public User(UserService userService) {
		this.userService=userService;
	}
	
	public void init() {
		System.out.println("초기화작업은 여기서..");
	}
	
	public void write() {
		String s = userService.message();
		System.out.println(">>결과<<");
		System.out.println(s);
	}
	public void destroy() {
		System.out.println("객체 소멸전 작업은 여기서...");
	}
}
