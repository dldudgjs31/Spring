package com.config.user1;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//������ ȯ�� ���� ����
//�������� applicationContext.xml�� ���� �뵵�� �����̴�. ���� �ڹٷ� �ۼ���
@Configuration
@ComponentScan(basePackages = {"com.config.user1"})
public class SpringConfig {
	
}
