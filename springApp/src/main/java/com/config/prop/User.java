package com.config.prop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class User {
	@Autowired
	private UserService service;
	
	public void write() {
		System.out.println("---�ڹٷ� ȯ�� ���� : properties ---");
		System.out.println(service.message());
	}
	
}
