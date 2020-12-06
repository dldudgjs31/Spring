package com.anno.scope1;

import org.springframework.stereotype.Component;

//기본 싱글턴 패턴
@Component 
public class Movie {
	public void play() {
		System.out.println("영화 : "+toString());
	}
}
