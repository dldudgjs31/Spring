package com.anno.user1;

import org.springframework.beans.factory.annotation.Autowired;

public class User2 {
	//�ʵ带 �̿��� �������� ����. setter�� �ۼ����� �ʴ´�.
	@Autowired //Ÿ���� �̿��� �������� ����
	private UserService userService;
	
	//setter�� ���� �������� ����. �Ϲ� �޼ҵ嵵 ����
	@Autowired
	public void setUserService(UserService userService) {
		this.userService = userService;
	}



	public void write() {
		System.out.println("--- ������̼� : setter�� �̿��� ��������  ���� ---");
		System.out.println(userService.message());
	}
}
