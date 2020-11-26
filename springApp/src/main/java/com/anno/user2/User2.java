package com.anno.user2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class User2 {
	// @Autowired�� �Բ� ����ϸ�, �̸��� �����Ͽ� ������ ����
	
	@Autowired // ������ Ÿ��
	@Qualifier("userService2") //1���� : ������ �̸�, 2���� : ������ �̸�
	private UserService service; 
	
	
	public void write() {
		System.out.println("--- @Autowired, @Qualifier : ������ Ÿ���� �� �̻��� ��� ---");
		System.out.println(service.message());
	}
}
