package com.anno.user7;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;
@Component("user7.user")
public class User {
	@Resource(name="user7.userService")
	private UserService userService;
	
	public void write() {
		System.out.println("--- @Component : ºó »ý¼º ---");
		System.out.println(userService.message());
	}
}
