package com.anno.user3;

import javax.annotation.Resource;

public class User {
	// �ڹٰ� �����ϴ� ������̼�. �̸����� ���� ������ ����
	// name �Ӽ��� ������ ��� �ʵ�� ������ �̸��� ���� �� ����
	@Resource 
	private UserService userService;
	
	
	public void write() {
		System.out.println("--- @Resource  : �ڹٰ� �����ϴ� ������̼�. �̸����� ���� ������ ���� ---");
		System.out.println(userService.message());
	}
}
