package com.user1;

public class UserServiceImpl implements UserService{

	private String name;
	private String tel;
	private int age;
	
	public UserServiceImpl() {
		this.name="자바";
		this.tel="010-3938-7660";
		this.age=20;
	}
	

	@Override
	public String message() {
		String state=age>=19?"성인":"미성년자";
		String s= name+","+tel+","+age+","+state;
		
		return s;
	}

}
