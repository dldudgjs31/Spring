package com.scope2;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		AbstractApplicationContext context = new GenericXmlApplicationContext(
				"classpath:com/scope2/applicationContext.xml");

		
		try {
			User user = context.getBean(User.class);
			// <aop:scoped-proxy/>에 의해  메소드가 호출할때마다 객체가 새로 생성
			user.execute(); //movie는 새로 객체가 생성되지 않지만 movie는 새로 객체가 생성
			user.execute();
			user.execute();
			
			Movie movie = context.getBean(Movie.class);
			Music music = context.getBean(Music.class);
			
			System.out.println("======================================");
			//동일객체
			movie.play();
			movie.play();
			
			System.out.println();
			//다른객체
			music.play();
			music.play();
		} finally {

			context.close();

		}
	}
}
