package com.anno.scope1;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value="prototype") // getBean()���� ��ü�� ��ȯ������ ���� ���ο� ��ü ����
public class Music {
	public void play() {
		System.out.println("����  : "+toString());
	}
}
