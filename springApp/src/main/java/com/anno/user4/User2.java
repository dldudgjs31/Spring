package com.anno.user4;

import javax.inject.Inject;
import javax.inject.Named;

public class User2 {
	@Inject
	@Named("userService2") //@Inject �� ���� ��� , �̸����� �� ����
	private UserService service; 
	
	
	public void write() {
		System.out.println("--- @Resource ,@Named : name �Ӽ� ��� ---");
		System.out.println(service.message());
	}
}
