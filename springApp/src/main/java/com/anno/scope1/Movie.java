package com.anno.scope1;

import org.springframework.stereotype.Component;

//�⺻ �̱��� ����
@Component 
public class Movie {
	public void play() {
		System.out.println("��ȭ : "+toString());
	}
}
