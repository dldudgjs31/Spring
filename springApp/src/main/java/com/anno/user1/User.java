package com.anno.user1;

import org.springframework.beans.factory.annotation.Autowired;

public class User {
	//�ʵ带 �̿��� �������� ����. setter�� �ۼ����� �ʴ´�.
	@Autowired //Ÿ���� �̿��� �������� ����
	private UserService userService;
	
	
	public void write() {
		System.out.println("--- ������̼� : �ʵ带 �̿��� ��������  ���� ---");
		System.out.println(userService.message());
	}
}
