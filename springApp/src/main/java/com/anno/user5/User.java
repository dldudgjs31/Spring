package com.anno.user5;

import org.springframework.beans.factory.annotation.Autowired;

public class User {
	@Autowired
	private UserService userService;
	
	
	public void write() {
		System.out.println("--- @Value 를 이용한 생성자의 파라미터에 문자열 또는 기본 자료형 값 설정 ---");
		System.out.println(userService.message());
	}
}
