package com.anno.scope2;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
/**
 * �����ֱⰡ �� �� ��ü�� ���� ��ü�� �����Ǵ� ���
 * �ش� ��ü�� ����(�޼ҵ� ȣ�� ��) �Ҷ����� ���ο� ��ü�� ����
 */
@Component
@Scope(value="prototype", proxyMode=ScopedProxyMode.TARGET_CLASS)
public class Music {
	public void play() {
		System.out.println("����  : "+toString());
	}
}
