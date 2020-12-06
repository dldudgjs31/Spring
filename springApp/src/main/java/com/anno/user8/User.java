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
		System.out.println("������ ����");
	}
	
	
	@PostConstruct
	public void init() {
		System.out.println("������ ȣ���� �ٷ� ������ ȣ��, �ʱ�ȭ �۾�");
	}
	
	
	public void write() {
		System.out.println("--- @PostConstruct @PreDestroy ---");
		System.out.println(userService.message());
	}
	
	@PreDestroy
	public void destory() {
		System.out.println("��ü �Ҹ��� ȣ�� ");
	}
}
