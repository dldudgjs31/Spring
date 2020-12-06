package com.config.prop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

//@value("${������Ƽ�̸�}") => ������Ƽ�� ��ȯ
//@value("${user.name}") => �ý��� ����� ��
@Service
public class UserServiceImpl implements UserService{
	private @Value("${join.name}") String name;
	private @Value("${join.tel}") String tel;
	private @Value("${join.age}") int age;
	
		
	@Override
	public String message() {
		String s ="�̸� : "+name+", ����: "+age+", ��ȭ��ȣ : "+ tel+", ";
		s += age>=19 ? "����" : "�̼�����";
		return s;
	}

}
