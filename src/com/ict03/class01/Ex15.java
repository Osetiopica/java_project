package com.ict03.class01;

public class Ex15 {
	int s1 = 100;

//	초기화 전 데이터는 초기화를 만나면 없어짐
	static int s2 = 200;

//	static 초기화
	static {
		s2 = 2000;
		s3 = 3000;
		s4 = 4000;
	}

//	초기화 이후 선언해도 오류 아님
	static int s3 = 300;
	static int s4;

	public static void main(String[] args) {
//		main()도 static이므로 instance 변수 사용 불가
//		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
	}
}
