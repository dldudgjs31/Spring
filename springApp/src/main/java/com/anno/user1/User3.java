package com.anno.user1;

import org.springframework.beans.factory.annotation.Autowired;

public class User3 {
	//필드를 이용한 의존관계 설정. setter를 작성하지 않는다.
	@Autowired //타입을 이용한 의존관계 설정
	private UserService userService;
	
	//생성자를 통한 의존관계 설정
	@Autowired
	public User3(UserService userService) {
		this.userService = userService;
	}

	public void write() {
		System.out.println("--- 어노테이션 : 생성자를 이용한 의존관계  설정 ---");
		System.out.println(userService.message());
	}
}
