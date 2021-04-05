package com.ict03.class02;

import java.util.Random;

public class Ex03 {

	public static void main(String[] args) {
//		랜덤 : Math.random(), Random클래스

//		Random클래스
		Random r = new Random();
		System.out.println(r.nextBoolean());
		System.out.println(r.nextInt());
		System.out.println(r.nextLong());

//		실수 형태는 0.0에서 1.0미만
		System.out.println(r.nextFloat());
		System.out.println(r.nextDouble());

		System.out.println(r.nextInt(2)); // 0~2
		System.out.println((int) (r.nextDouble() * 3)); // 0~2

//		Math 클래스 : 생성자 없음, static으로 호출
		System.out.println(Math.random()); // 0.0~1.0미만
		System.out.println((int) (Math.random() * 3)); // 0~2

//		abs : 절대값 반환
		System.out.println(Math.abs(-10));

//		ceil(올림), round(반올림), floor(버림)
		System.out.println(Math.ceil(3.14)); // 4.0
		System.out.println(Math.round(3.14)); // 3
		System.out.println(Math.floor(3.54)); // 3.0

//		max : 둘 중 큰 값
//		min : 둘 중 작은 
		System.out.println(Math.max(1.1, 2)); // 2.0
		System.out.println(Math.min(1.9, 2.1)); // 1.9
		
//		pow(double a, double b) : 제곱
		System.out.println(Math.pow(2, 10)); // 1024.0

	}

}
