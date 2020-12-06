package com.config.prop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

//@value("${프로퍼티이름}") => 프로퍼티값 반환
//@value("${user.name}") => 시스템 사용자 명
@Service
public class UserServiceImpl implements UserService{
	private @Value("${join.name}") String name;
	private @Value("${join.tel}") String tel;
	private @Value("${join.age}") int age;
	
		
	@Override
	public String message() {
		String s ="이름 : "+name+", 나이: "+age+", 전화번호 : "+ tel+", ";
		s += age>=19 ? "성인" : "미성년자";
		return s;
	}

}
