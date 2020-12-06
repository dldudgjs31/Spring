package com.anno.user6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class User {
	@Autowired
	private UserService userServiceImpl;
	
	
	public void write() {
		System.out.println("--- @Component : ºó »ý¼º ---");
		System.out.println(userServiceImpl.message());
	}
}
