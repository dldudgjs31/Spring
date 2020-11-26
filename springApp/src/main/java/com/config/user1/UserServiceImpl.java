package com.config.user1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService{
	private @Value("����") String name;
	private @Value("28") int age;
	
		
	@Override
	public String message() {
		String s ="�̸� : "+name+", ����: "+age;
		s += age>=19 ? "����" : "�̼�����";
		return s;
	}

}
