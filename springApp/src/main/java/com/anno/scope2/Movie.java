package com.anno.scope2;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


//������Ÿ���� ��ü ȣ��� ���ο� ��ü ����
@Component 
@Scope(value="prototype")
public class Movie {
	public void play() {
		System.out.println("��ȭ : "+toString());
	}
}
