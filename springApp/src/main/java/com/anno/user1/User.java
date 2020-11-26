package com.anno.user1;

import org.springframework.beans.factory.annotation.Autowired;

public class User {
	//필드를 이용한 의존관계 설정. setter를 작성하지 않는다.
	@Autowired //타입을 이용한 의존관계 설정
	private UserService userService;
	
	
	public void write() {
		System.out.println("--- 어노테이션 : 필드를 이용한 의존관계  설정 ---");
		System.out.println(userService.message());
	}
}
