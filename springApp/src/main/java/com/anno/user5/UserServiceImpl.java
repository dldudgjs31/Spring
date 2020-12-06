package com.anno.user5;

import org.springframework.beans.factory.annotation.Value;

public class UserServiceImpl implements UserService {
	private String name; 
	private String tel;
	private int age;
	
	@Value("�ڹ�")
	private String subject;
	
	public UserServiceImpl(@Value("��ä��") String name, @Value("010-4400-7660") String tel , @Value("25") int age) {
		this.name=name;
		this.tel=tel;
		this.age=age;
	}

	@Override
	public String message() {
		String s = name+" : " + tel + " : " + age +" : ";
		s +=age>=19?"����":"�̼�����" + "���� : "+subject;
		
		return s;
	}
	
	
	
}
