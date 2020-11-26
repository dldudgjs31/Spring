package com.config.user1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService{
	private @Value("영헌") String name;
	private @Value("28") int age;
	
		
	@Override
	public String message() {
		String s ="이름 : "+name+", 나이: "+age;
		s += age>=19 ? "성인" : "미성년자";
		return s;
	}

}
