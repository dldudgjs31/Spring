package com.anno.user7;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
//@Service : 
// @Component의 구체적인 어노테이션으로 
// 비지니스 로직을 담당하는 클래스의 빈 동록
@Service("user7.user2")
public class User2 {
	@Resource(name="user7.userService2")
	private UserService userService;
	
	
	public void write() {
		System.out.println("--- @Component : 이름을 지정 ---");
		System.out.println(userService.message());
	}
}
