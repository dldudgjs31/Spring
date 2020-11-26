package com.anno.user2;

import org.springframework.beans.factory.annotation.Autowired;

public class User {
	//동일한 타입이 둘이상이면 필드명과 동일한 이름을 갖는 빈을 주입하며
	//동일한 이름이 존재하지 않으면 예외 발생
	@Autowired 
	private UserService userService;
	
	
	public void write() {
		System.out.println("--- @Autowired : 동일한 타입이 둘 이상인 경우 ---");
		System.out.println(userService.message());
	}
}
