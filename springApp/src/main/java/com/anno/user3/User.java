package com.anno.user3;

import javax.annotation.Resource;

public class User {
	// 자바가 제공하는 어노테이션. 이름으로 빈의 의존성 주입
	// name 속성을 생략한 경우 필드와 동일한 이름을 갖는 빈 주입
	@Resource 
	private UserService userService;
	
	
	public void write() {
		System.out.println("--- @Resource  : 자바가 제공하는 어노테이션. 이름으로 빈의 의존성 주입 ---");
		System.out.println(userService.message());
	}
}
