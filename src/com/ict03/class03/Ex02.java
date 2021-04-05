package com.ict03.class03;

public class Ex02 {

	String name = "차범근";
	int age = 57;
	String addr = "서울 우리집 거실";
	private String dog = "댕댕이";
	static int car = 2;

	public Ex02() {
		System.out.println("부모 생성자" + this);
	}

	public void prn() {
		System.out.println("부모 메소드");
	}

	public static void play() {
		System.out.println("부모 static 메소드");
	}

	public void eat() {
		System.out.println("우리집 아침 무조건");
	}

	public final void walk() {
		System.out.println("하루 한 시간 걷기");
	}
}
