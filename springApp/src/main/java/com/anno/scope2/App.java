package com.anno.scope2;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		AbstractApplicationContext context = new GenericXmlApplicationContext(
				"classpath:com/anno/scope2/applicationContext.xml");

		
		try {
			User user= context.getBean(User.class);
			//movie�� ���� ��ü������ music �� proxyMode�� ����
			//play() �޼ҵ带 �����Ҷ����� ���ο� ��ü�� ����
			user.execute();
			user.execute();
			System.out.println("---------------------------");
			
			Movie movie = context.getBean(Movie.class);
			Music music = context.getBean(Music.class);
			
			movie.play();
			movie.play(); //���� ��ü
			
			music.play();
			music.play(); // �ٸ� ��ü
			
		} finally {

			context.close();

		}
	}
}
