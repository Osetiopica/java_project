package com.ict03.class03;

public class Ex04_main {

	public static void main(String[] args) {
		Ex03 ex = new Ex03();
		ex.study();
		System.out.println(ex);
		
//		부모와 자식이 둘 다 갖고 있으면 자식 것을 사용
		System.out.println(ex.name);
		
//		자식에게 없으면 부모 것 사용
		System.out.println(ex.addr);
		
		ex.sound();
		ex.prn();
		
//		static 객체
		System.out.println(Ex03.hobby);
		System.out.println(Ex02.car);
		
		ex.eat();
	}
	
}
