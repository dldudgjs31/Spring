package com.anno.user7;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
//@Service : 
// @Component�� ��ü���� ������̼����� 
// �����Ͻ� ������ ����ϴ� Ŭ������ �� ����
@Service("user7.user2")
public class User2 {
	@Resource(name="user7.userService2")
	private UserService userService;
	
	
	public void write() {
		System.out.println("--- @Component : �̸��� ���� ---");
		System.out.println(userService.message());
	}
}
