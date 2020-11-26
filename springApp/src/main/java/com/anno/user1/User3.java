package com.anno.user1;

import org.springframework.beans.factory.annotation.Autowired;

public class User3 {
	//�ʵ带 �̿��� �������� ����. setter�� �ۼ����� �ʴ´�.
	@Autowired //Ÿ���� �̿��� �������� ����
	private UserService userService;
	
	//�����ڸ� ���� �������� ����
	@Autowired
	public User3(UserService userService) {
		this.userService = userService;
	}

	public void write() {
		System.out.println("--- ������̼� : �����ڸ� �̿��� ��������  ���� ---");
		System.out.println(userService.message());
	}
}
