package com.ict03.class01;

public class Ex02 {
//	클래스 = {(static, instance)멤버필드, 멤버메소드, 생성자}
//	final 붙으면 상수
//	static 없으면 인스턴스
//	static은 객체 생성과 상관없이 미리 생성

	int a1 = 1; // 인스턴스 변수 = 일반 변수
	static int a2 = 2; // static 변수
	final int A3 = 3; // 인스턴스 상수
	static final int A4 = 4; // static 상수 = API에서 제공하는 상수 형태

	// 인스턴스, 반환형 없음
	public void z1() {
		a1=a1+1;
		a2=a2+2;
		System.out.println(a1);
		System.out.println(a2);
//		a3=a3+3;
//		a4=a4+4;
		
//		지역변수 : 메소드 안에서 만들어짐, static을 만들 수 없음
//		메소드 안에서 만들어진 변수는 메소드를 호출할 때 생성, 메소드가 끝나면 사라짐
		int a1 = 1;
//		static int a2 = 2;
		final int A3 = 3;
//		static final int A4 = 4;
	}

	// static, 반환형 없음
	public static void z2() {
	// static 메소드에선 인스턴스 변수 사용 불가
//		a1=a1+1;
		a2=a2+2;
//		System.out.println(a1);
		System.out.println(a2);
//		a3=a3+3;
//		a4=a4+4;
	}

	// 인스턴스, 반환형 있음
	public int z3() {
		return 0;
	}

	// static, 반환형 있음
	public static double z4(int a) {
		return a;
	}

	public static void main(String[] args) {
		z2();
	}

}
