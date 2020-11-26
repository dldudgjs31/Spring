package com.anno.user4;

import javax.inject.Inject;

public class User {
	//자바가 제공하는 어노테이션
	// 타입으로 의존성 주입
	//동일한 타입이 둘 이상이면 동일한 이름으로 빈으로 의존성 주입
	//사용하려면 javax inject 추가해야한다.
	@Inject
	private UserService userService;
	
	
	public void write() {
		System.out.println("--- @Inject  : 자바가 제공하는 어노테이션. 타입으로 의존성 주입 ---");
		System.out.println(userService.message());
	}
}
