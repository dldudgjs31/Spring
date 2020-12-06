package com.anno.user6;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
//�ڵ����� �� ���(��ü ����)
//���� �̸��� Ŭ�������� ù���ڸ� �ҹ��ڷ� �� �̸����� �����ȴ�.
//�� �̸� : userServiceImpl
//���� �̸��� ������ ���� �ΰ� �վ��̸� ���� �߻�
@Component
public class UserServiceImpl implements UserService {
	@Value("�������")
	private String name; 
	@Value("010-1234-4567")
	private String tel;
	@Value("30")
	private int age;
	

	@Override
	public String message() {
		String s = name+" : " + tel + " : " + age +" : ";
		s +=age>=19?"����":"�̼�����";
		
		return s;
	}
	
	
	
}
