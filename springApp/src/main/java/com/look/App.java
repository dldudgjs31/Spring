package com.look;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		AbstractApplicationContext context = new GenericXmlApplicationContext(
				"classpath:com/look/applicationContext.xml");

		
		try {
			PizzaShop shop= (PizzaShop)context.getBean("pizzaShop");
			
			Pizza p1 = shop.makePizza();
			System.out.println("ù��° ����: "+p1);
			
			Pizza p2 = shop.makePizza();
			System.out.println("�ι�° ����: "+p2);
			
			Pizza p3 = shop.makeVeggiePizza();
			System.out.println("���� ����: "+p3);
			
		} finally {

			context.close();

		}
	}
}
