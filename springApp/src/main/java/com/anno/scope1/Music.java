package com.anno.scope1;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value="prototype") // getBean()으로 객체를 반환받을때 마다 새로운 객체 생성
public class Music {
	public void play() {
		System.out.println("음악  : "+toString());
	}
}
