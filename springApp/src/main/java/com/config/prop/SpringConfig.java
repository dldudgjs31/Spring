package com.config.prop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

//������ ȯ�� ���� ����
//�������� applicationContext.xml�� ���� �뵵�� �����̴�. ���� �ڹٷ� �ۼ���
@Configuration
@ComponentScan("com.config.prop")
@PropertySource("classpath:com/config/prop/main.properties")
public class SpringConfig {
}
