package com.user1;

public class User {
	private UserService userService;
	
	public User(UserService userService) {
		this.userService=userService;
	}
	
	public void write() {
		String s = userService.message();
		System.out.println(">>���<<");
		System.out.println(s);
	}
}
