package com.anno.user4;

import javax.inject.Inject;

public class User {
	//�ڹٰ� �����ϴ� ������̼�
	// Ÿ������ ������ ����
	//������ Ÿ���� �� �̻��̸� ������ �̸����� ������ ������ ����
	//����Ϸ��� javax inject �߰��ؾ��Ѵ�.
	@Inject
	private UserService userService;
	
	
	public void write() {
		System.out.println("--- @Inject  : �ڹٰ� �����ϴ� ������̼�. Ÿ������ ������ ���� ---");
		System.out.println(userService.message());
	}
}
