package com.ict03.class03;

public class Ex04_main {

	public static void main(String[] args) {
		Ex03 ex = new Ex03();
		ex.study();
		System.out.println(ex);
		
//		�θ�� �ڽ��� �� �� ���� ������ �ڽ� ���� ���
		System.out.println(ex.name);
		
//		�ڽĿ��� ������ �θ� �� ���
		System.out.println(ex.addr);
		
		ex.sound();
		ex.prn();
		
//		static ��ü
		System.out.println(Ex03.hobby);
		System.out.println(Ex02.car);
		
		ex.eat();
	}
	
}
