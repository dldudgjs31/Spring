package com.anno.scope2;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


//프로토타입은 객체 호출시 새로운 객체 생성
@Component 
@Scope(value="prototype")
public class Movie {
	public void play() {
		System.out.println("영화 : "+toString());
	}
}
