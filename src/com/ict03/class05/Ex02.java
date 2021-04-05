package com.ict03.class05;

public abstract class Ex02 implements Ex01 {
	public static void main(String[] args) {
//		Ex01 멤버들이 static이라는 증거
//		객체 생성없이 접근 가능
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		
//		값 변경 불가 -> final
//		System.out.println(s1++);
//		System.out.println(s2++);
//		System.out.println(s3++);
//		System.out.println(s4++);
	}
}