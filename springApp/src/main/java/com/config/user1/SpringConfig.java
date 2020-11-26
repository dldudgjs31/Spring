package com.config.user1;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//스프링 환경 설정 파일
//이파일은 applicationContext.xml과 같은 용도의 파일이다. 단지 자바로 작성됨
@Configuration
@ComponentScan(basePackages = {"com.config.user1"})
public class SpringConfig {
	
}
