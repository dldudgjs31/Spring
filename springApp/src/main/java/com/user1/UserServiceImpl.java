package com.user1;

public class UserServiceImpl implements UserService{

	private String name;
	private String tel;
	private int age;
	
	public UserServiceImpl() {
		this.name="�ڹ�";
		this.tel="010-3938-7660";
		this.age=20;
	}
	

	@Override
	public String message() {
		String state=age>=19?"����":"�̼�����";
		String s= name+","+tel+","+age+","+state;
		
		return s;
	}

}
