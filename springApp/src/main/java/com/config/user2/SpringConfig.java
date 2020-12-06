package com.config.user2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//������ ȯ�� ���� ����
//�������� applicationContext.xml�� ���� �뵵�� �����̴�. ���� �ڹٷ� �ۼ���
@Configuration
@ComponentScan(basePackages = {"com.config.user2"})
public class SpringConfig {
	//@bean : �ܺ� ���̺귯���� ��ü�� �����ϴ� ��쿡 ���
			// �ϳ� �̻��� @bean�� �ִٸ� Ŭ������ @Configuration�� �ʿ�
	@Bean //���̸��� �⺻������ �޼ҵ�� : userServiceDevice
	//�⺻������ �̱��� :��ü�� �ϳ��� ������
	public UserService userServiceDevice() {
		return new UserServiceImpl();
	}
	
	@Bean(name="user2.user", initMethod = "init", destroyMethod = "destroy")
	public User userDevice() {
		return new User();
	}
}
