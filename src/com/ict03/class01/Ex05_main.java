package com.ict03.class01;

public class Ex05_main {

	public static void main(String[] args) {
		
		System.out.println(Ex05.s3);
//		System.out.println(Ex05.s4); // static�̶� private�� ���� �Ұ�
		
		Ex05 ex = new Ex05();
		
		System.out.println(ex.s1);
//		System.out.println(ex.s2); // private ���� �Ұ�
		System.out.println("----");
		ex.add();
		System.out.println("----");
		ex.add3();
	}

}
