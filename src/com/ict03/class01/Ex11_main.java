package com.ict03.class01;

public class Ex11_main {

	public static void main(String[] args) {
		Ex11 test = new Ex11();
		System.out.println("�̸� " + test.getName());
		System.out.println("���� " + test.getAge());
		System.out.println("���� " + test.isGender());
		System.out.println("----");
		test.setName("������");
		System.out.println("�̸� " + test.getName());
		System.out.println("���� " + test.getAge());
		System.out.println("���� " + test.isGender());
		System.out.println("----");
		Ex11 test2 = new Ex11("�Ӳ���", 22);
		System.out.println("�̸� " + test2.getName());
		System.out.println("���� " + test2.getAge());
		System.out.println("���� " + test2.isGender());

	}

}
