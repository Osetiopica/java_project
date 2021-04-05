package com.ict01.grammar02;
class Ex03{
	public static void main(String[] args){
		byte s1 = -127;
		System.out.println(s1);
		s1 = -128;
		System.out.println(s1);
		// byte 범위(-128~127)가 벗어나서 오류 발생
		// s1 = -129;
		System.out.println(s1);
		// short(-32768~32767) 
		// short s2 = -32760+100;
		// System.out.println(s2);
		// 일반적인 정수는 int
		// 아주 큰 정수는 long
		// long 숫자 뒤에는 L(l)을 붙이거나 생략
		int s3 = 117;
		long s4 = 117L;
		long s5 = 117l;
		long s6 = 117;
		System.out.printf("%d %d %d %d %n",s3,s4,s5,s6);
		// 실수의 기본형은 double
		// float는 숫자 뒤에 F(f)를 붙인다.(생략 불가)
		// char < int < long < float < double
		float s7 = 3.14f;
		System.out.println(s7);
		double s8 = 3.14;
		System.out.println(s8);
		double s9 = 117;
		System.out.println(s9);
		int s10 = (int)s9;
		System.out.println(s10);
	}
}





