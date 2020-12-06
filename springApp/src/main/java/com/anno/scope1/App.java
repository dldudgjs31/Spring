package com.anno.scope1;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		AbstractApplicationContext context = new GenericXmlApplicationContext(
				"classpath:com/anno/scope1/applicationContext.xml");

		
		try {
			Movie movie1 = context.getBean(Movie.class);
			Movie movie2 = context.getBean(Movie.class);
			
			//singleton(�⺻)
			if(movie1==movie2) {
				System.out.println("movie : ���ϰ�ü");
			}else  { 
				System.out.println("movie : �ٸ���ü");
				
			}
			movie1.play();
			movie2.play();
			System.out.println("============================================");
			Music music1 =context.getBean(Music.class);
			Music music2 =context.getBean(Music.class);
			
			if(music1==music2) {
				System.out.println("music : ���ϰ�ü");
			}else  { 
				System.out.println("music : �ٸ���ü");
				
			}
			music1.play();
			music2.play();
		} finally {

			context.close();

		}
	}
}
