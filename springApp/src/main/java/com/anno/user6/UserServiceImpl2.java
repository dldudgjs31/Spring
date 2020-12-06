package com.anno.user6;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("user6.userService2") // ���� �̸��� ����
public class UserServiceImpl2 implements UserService {
	private String name; 
	private String tel;
	private int age;
	
	public UserServiceImpl2(@Value("����") String name,@Value("010-7894-5623") String tel,@Value("25") int age) {
		this.name= name;
		this.tel=tel;
		this.age=age;
	}
	
	@Override
	public String message() {
		String s = name+" : " + tel + " : " + age +" : ";
		s +=age>=19?"����":"�̼�����";
		
		return s;
	}
	
	
	
}
