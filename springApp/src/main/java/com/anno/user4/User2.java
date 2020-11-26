package com.anno.user4;

import javax.inject.Inject;
import javax.inject.Named;

public class User2 {
	@Inject
	@Named("userService2") //@Inject 과 같이 사용 , 이름으로 빈 주입
	private UserService service; 
	
	
	public void write() {
		System.out.println("--- @Resource ,@Named : name 속성 사용 ---");
		System.out.println(service.message());
	}
}
