package com.anno.user6;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
//자동으로 빈 등록(객체 생성)
//빈의 이름은 클래스명의 첫글자를 소문자로 한 이름으로 설정된다.
//빈 이름 : userServiceImpl
//빈의 이름이 동일한 것이 두개 잇아이면 예외 발생
@Component
public class UserServiceImpl implements UserService {
	@Value("한장희쌤")
	private String name; 
	@Value("010-1234-4567")
	private String tel;
	@Value("30")
	private int age;
	

	@Override
	public String message() {
		String s = name+" : " + tel + " : " + age +" : ";
		s +=age>=19?"성인":"미성년자";
		
		return s;
	}
	
	
	
}
