package com.anno.user2;

import org.springframework.beans.factory.annotation.Autowired;

public class User {
	//������ Ÿ���� ���̻��̸� �ʵ��� ������ �̸��� ���� ���� �����ϸ�
	//������ �̸��� �������� ������ ���� �߻�
	@Autowired 
	private UserService userService;
	
	
	public void write() {
		System.out.println("--- @Autowired : ������ Ÿ���� �� �̻��� ��� ---");
		System.out.println(userService.message());
	}
}
