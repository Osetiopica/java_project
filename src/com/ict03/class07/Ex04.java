package com.ict03.class07;

//	static 내부 클래스
public class Ex04 {
	String name = "홍길동";
	private static int age = 24;
	static String addr = "제주도";

	public Ex04() {
		System.out.println("외부 클래스 생성자 : " + this);
	}

	public void sound() {
		int money = 1000;
		final int time = 2;
//		지역 변수는 static 불가
//		static int number = 12;
//		static final int number2 = 12;
		System.out.println("외부 클래스 메소드 : " + name + ", money : " + money);
	}

	public static class Inner03 {
		String name = "홍일점";
		final int i2 = 10;
//		내부 클래스에선 static 사용 불가
//		강제로 static을 사용하려면 내부 클래스에 static을 붙임
		static int i3 = 20;
		static final int i4 = 30;

		public Inner03() {
			System.out.println("내부 클래스 생성자 : " + this);
		}

//		내부 클래스는 외부 클래스의 메소드와 필드를 맘대로 사용 가능
//		내부 클래스 메소드
		public void play() {
			int money = 3000;
			System.out.println("이름 : " + name);
			System.out.println("금액 : " + money);
			
//			외부 클래스의 멤버는 static 붙여야 됨
			System.out.println("나이 : " + age);

//			외부 클래스 메소드도 static 붙여야 됨
//			sound();
		}

	}
}
