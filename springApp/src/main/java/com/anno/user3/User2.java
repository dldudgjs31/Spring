package com.anno.user3;

import javax.annotation.Resource;

public class User2 {
	@Resource(name="userService2")
	private UserService service; 
	
	
	public void write() {
		System.out.println("--- @Resource : name 속성 사용 ---");
		System.out.println(service.message());
	}
}
