package com.config.user2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//스프링 환경 설정 파일
//이파일은 applicationContext.xml과 같은 용도의 파일이다. 단지 자바로 작성됨
@Configuration
@ComponentScan(basePackages = {"com.config.user2"})
public class SpringConfig {
	//@bean : 외부 라이브러리의 객체를 생성하는 경우에 사용
			// 하나 이상의 @bean이 있다면 클래스는 @Configuration이 필요
	@Bean //빈이름은 기본적으로 메소드명 : userServiceDevice
	//기본적으로 싱글턴 :객체는 하나만 생성됨
	public UserService userServiceDevice() {
		return new UserServiceImpl();
	}
	
	@Bean(name="user2.user", initMethod = "init", destroyMethod = "destroy")
	public User userDevice() {
		return new User();
	}
}
