package com.anno.user6;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;
@Component("user6.user2")
public class User2 {
	@Resource(name="user6.userService2")
	private UserService userService;
	
	
	public void write() {
		System.out.println("--- @Component : 이름을 지정 ---");
		System.out.println(userService.message());
	}
}
