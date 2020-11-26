package com.anno.user4;

public class UserServiceImpl2 implements UserService {
	private String name; 
	private String tel;
	private int age;
	
	public UserServiceImpl2() {
		
	}

	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String message() {
		String s = "이름 : " +name+" , " + "전화 : "+ tel + " , " + "나이 : "+ age +" , ";
		s +=age>=19?"성인":"미성년자";
		
		return s;
	}
	
	
	
}
