package com.prop;

public class User {
	private UserService userService;

	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	public void wrtie() {
		System.out.println("---������Ƽ ������ ������ �о����---");
		System.out.println(userService.message());
	}
}
