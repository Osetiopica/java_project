package com.ict03.class01;

public class Ex14 {
//	static : 객체 생성과 상관없이 미리 만들어지는 필드와 메소드
//	클래스 선언과 지역변수 선언에선 static 사용 불가
//	모든 객체가 사용할 수 있는 공유재
//	접근 제한자가 private이면 static이라도 접근할 수 없음

	int s1 = 1;
	static int s2 = 1;

//	생성자
	public Ex14() {
		s1++;
		s2++;
	}

	public void prn() {
		int s3 = 1;
//		static int s4 = 1; 지역 변수에 static 불가
	}

//	static 메소드는 static 변수만 참조
	public static void prn2() {
//		System.out.println(s1);
		System.out.println(s2);
		int s4 = 1;
//		static int s5 = 1; 지역 변수에 static 불가
	}
}
