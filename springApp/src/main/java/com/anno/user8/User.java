package com.anno.user8;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component("user8.user")
public class User {
	@Autowired
	private UserService userService;
	
	public User() {
		System.out.println("생성자 생성");
	}
	
	
	@PostConstruct
	public void init() {
		System.out.println("생성자 호출후 바로 다음에 호출, 초기화 작업");
	}
	
	
	public void write() {
		System.out.println("--- @PostConstruct @PreDestroy ---");
		System.out.println(userService.message());
	}
	
	@PreDestroy
	public void destory() {
		System.out.println("객체 소멸전 호출 ");
	}
}
