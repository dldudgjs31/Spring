package com.prop;

public class User {
	private UserService userService;

	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	public void wrtie() {
		System.out.println("---프로퍼티 파일의 내용을 읽어오기---");
		System.out.println(userService.message());
	}
}
