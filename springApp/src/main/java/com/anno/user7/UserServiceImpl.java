package com.anno.user7;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component("user7.userService")
public class UserServiceImpl implements UserService {
	@Value("채혀니")
	private String name; 
	@Value("010-1234-4567")
	private String tel;
	@Value("25")
	private int age;
	

	@Override
	public String message() {
		String s = name+" : " + tel + " : " + age +" : ";
		s +=age>=19?"성인":"미성년자";
		
		return s;
	}
	
	
	
}
