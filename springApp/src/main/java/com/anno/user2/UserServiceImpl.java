package com.anno.user2;

public class UserServiceImpl implements UserService {
	private String name; 
	private String tel;
	private int age;
	
	public UserServiceImpl() {
		name="이영헌";
		tel="010-3938-7660";
		age=27;
	}

	@Override
	public String message() {
		String s = name+" : " + tel + " : " + age +" : ";
		s +=age>=19?"성인":"미성년자";
		
		return s;
	}
	
	
	
}
