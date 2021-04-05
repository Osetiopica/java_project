package com.ict03.class01;

public class Ex05_main {

	public static void main(String[] args) {
		
		System.out.println(Ex05.s3);
//		System.out.println(Ex05.s4); // static이라도 private면 접근 불가
		
		Ex05 ex = new Ex05();
		
		System.out.println(ex.s1);
//		System.out.println(ex.s2); // private 접근 불가
		System.out.println("----");
		ex.add();
		System.out.println("----");
		ex.add3();
	}

}
