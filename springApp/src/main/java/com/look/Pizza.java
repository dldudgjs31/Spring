package com.look;

import java.util.concurrent.atomic.AtomicLong;

public class Pizza {
	//������ ȯ�濡�� �����ϰ� �ڵ����� ���ڸ� ������ų�� �ִ� Ŭ����
	private static AtomicLong count = new AtomicLong(0);
	
	private boolean isVeg;
	
	public Pizza() {
		//get�̶�� �޼ҵ带 ȣ���Ҷ����� ������Ű��� �޼ҵ�
		count.incrementAndGet();
	}
	
	public String toString() {
		return "A new "+(isVeg ? "veggie":"")+"Pizza, "
				+ "count("+count.get()+")";
	}
	
	public void setIsVeg(boolean isVeg) {
		this.isVeg = isVeg;
	}
}
