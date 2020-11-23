package com.user5;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;

public class UserServiceImpl implements UserService {
	private String name;
	private Map<String, String> address;
	private List<String> hobby;
	private Properties tels; 
	
	public Properties getTels() {
		return tels;
	}

	public void setTels(Properties tels) {
		this.tels = tels;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Map<String, String> getAddress() {
		return address;
	}

	public void setAddress(Map<String, String> address) {
		this.address = address;
	}

	public List<String> getHobby() {
		return hobby;
	}

	public void setHobby(List<String> hobby) {
		this.hobby = hobby;
	}

	@Override
	public String message() {
		String str = "�̸�: " + name + "...\n";
		str += "----------------------------\n";
		str += "ģ���ּҷ�,,,\n";

		Iterator<String> it = address.keySet().iterator();
		while (it.hasNext()) {
			String key = it.next();
			String value = address.get(key);
			str += key + " : " + value + "\n";
		}
		str += "-----------------------------\n";

		str+="��ȭ��ȣ : ";
		Iterator<Object> it2=tels.keySet().iterator();
		while(it2.hasNext()) {
			String key =(String)it2.next();
			String value= tels.getProperty(key);
			str+=key+" : " + value +"\n";
		}
		str += "���: ";
		for (String s : hobby) {
			str += s + " ";
		}
		str += "\n-------------------------------\n";

		return str;
	}

}
