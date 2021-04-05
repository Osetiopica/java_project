package com.ict03.class02;

import java.util.Random;

public class Ex03 {

	public static void main(String[] args) {
//		���� : Math.random(), RandomŬ����

//		RandomŬ����
		Random r = new Random();
		System.out.println(r.nextBoolean());
		System.out.println(r.nextInt());
		System.out.println(r.nextLong());

//		�Ǽ� ���´� 0.0���� 1.0�̸�
		System.out.println(r.nextFloat());
		System.out.println(r.nextDouble());

		System.out.println(r.nextInt(2)); // 0~2
		System.out.println((int) (r.nextDouble() * 3)); // 0~2

//		Math Ŭ���� : ������ ����, static���� ȣ��
		System.out.println(Math.random()); // 0.0~1.0�̸�
		System.out.println((int) (Math.random() * 3)); // 0~2

//		abs : ���밪 ��ȯ
		System.out.println(Math.abs(-10));

//		ceil(�ø�), round(�ݿø�), floor(����)
		System.out.println(Math.ceil(3.14)); // 4.0
		System.out.println(Math.round(3.14)); // 3
		System.out.println(Math.floor(3.54)); // 3.0

//		max : �� �� ū ��
//		min : �� �� ���� 
		System.out.println(Math.max(1.1, 2)); // 2.0
		System.out.println(Math.min(1.9, 2.1)); // 1.9
		
//		pow(double a, double b) : ����
		System.out.println(Math.pow(2, 10)); // 1024.0

	}

}
