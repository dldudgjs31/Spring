package com.anno.user1;

import org.springframework.beans.factory.annotation.Autowired;

public class User2 {
	//필드를 이용한 의존관계 설정. setter를 작성하지 않는다.
	@Autowired //타입을 이용한 의존관계 설정
	private UserService userService;
	
	//setter를 통한 의존관계 설정. 일반 메소드도 가능
	@Autowired
	public void setUserService(UserService userService) {
		this.userService = userService;
	}



	public void write() {
		System.out.println("--- 어노테이션 : setter를 이용한 의존관계  설정 ---");
		System.out.println(userService.message());
	}
}
