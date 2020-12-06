package com.look;

import java.util.concurrent.atomic.AtomicLong;

public class Pizza {
	//스레드 환경에서 안전하게 자동으로 숫자를 증가시킬수 있는 클래스
	private static AtomicLong count = new AtomicLong(0);
	
	private boolean isVeg;
	
	public Pizza() {
		//get이라는 메소드를 호출할때마다 증가시키라는 메소드
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
