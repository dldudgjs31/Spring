package com.scope2;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		AbstractApplicationContext context = new GenericXmlApplicationContext(
				"classpath:com/scope2/applicationContext.xml");

		
		try {
			User user = context.getBean(User.class);
			// <aop:scoped-proxy/>�� ����  �޼ҵ尡 ȣ���Ҷ����� ��ü�� ���� ����
			user.execute(); //movie�� ���� ��ü�� �������� ������ movie�� ���� ��ü�� ����
			user.execute();
			user.execute();
			
			Movie movie = context.getBean(Movie.class);
			Music music = context.getBean(Music.class);
			
			System.out.println("======================================");
			//���ϰ�ü
			movie.play();
			movie.play();
			
			System.out.println();
			//�ٸ���ü
			music.play();
			music.play();
		} finally {

			context.close();

		}
	}
}
