package com.anno.user2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class User2 {
	// @Autowired와 함께 사용하며, 이름을 설정하여 의존성 주입
	
	@Autowired // 동일한 타입
	@Qualifier("userService2") //1순위 : 동일한 이름, 2순위 : 지정한 이름
	private UserService service; 
	
	
	public void write() {
		System.out.println("--- @Autowired, @Qualifier : 동일한 타입이 둘 이상인 경우 ---");
		System.out.println(service.message());
	}
}
