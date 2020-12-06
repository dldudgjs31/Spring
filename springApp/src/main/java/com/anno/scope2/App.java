package com.anno.scope2;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		AbstractApplicationContext context = new GenericXmlApplicationContext(
				"classpath:com/anno/scope2/applicationContext.xml");

		
		try {
			User user= context.getBean(User.class);
			//movie는 동일 객체이지만 music 은 proxyMode에 의해
			//play() 메소드를 실행할때마다 새로운 객체가 생성
			user.execute();
			user.execute();
			System.out.println("---------------------------");
			
			Movie movie = context.getBean(Movie.class);
			Music music = context.getBean(Music.class);
			
			movie.play();
			movie.play(); //동일 객체
			
			music.play();
			music.play(); // 다른 객체
			
		} finally {

			context.close();

		}
	}
}
