package com.ict01.grammar02;
class Ex04{
	public static void main(String[] args){
		// 숫자들의 크기에 따른 저장 원리
		// char < int < long < float < double
		// (문자)  (정수형 숫자)    (실수형 숫자)
		// 형변환: 자동형변환과 강제형변환
		// 자동 형변환: 작은 자료형이 큰 자료형에 저장될 때
		// char를 int에 저장할 수 있다.
		char c1 = 'a';
		System.out.println(c1);
		int s1 = 'a';
		System.out.println(s1);
		int s2 = c1;
		System.out.println(s2);

		byte k1 = (byte)(257);
		System.out.println(k1);

		char k2 = 97;
		System.out.println(k2);

		int k3 = 97;
		char k4 = (char)k3;
		System.out.println(k4);

		int k5 = (int)12.45;
		System.out.println(k5);

		short s = 10;
		float f = 10 + 3.5f;
		System.out.println(f);
	}
}





