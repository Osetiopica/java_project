package com.ict11.test;

import java.util.Random;

public class Ex2 {
//		����1
	public static void main(String[] args) {

//		����2
//		boolean, char, byte, short, int, long, float, double

//		����3
		int intVar = 129;
		byte byteBar = (byte) intVar;

//		����4
//		a++, ++a�� ����

//		����5
		double s1 = 36.6666;
		s1 = (int) (s1 * 10) / 10.0;
		System.out.println(s1);

//		����1
//		Ŭ���� - ����ʵ�, ����޼ҵ�, ������

//		����2
//		������

//		����3
//		�����ε�

//		����4
//		�������̵�

//		����5
//		�߻�Ŭ����, �������̽�

//		����1
		Random r = new Random();
		int n1 = r.nextInt(10) + 1;
		int n2 = (int) (r.nextDouble() * 10) + 1;
		System.out.println(n1+" "+n2);

//		����2
//		���׸�, �÷���
		
//		����3
//		Thread, Runnable
		
//		����4
//		����ȭ ó��

//		����5
//		����Ʈ ��Ʈ��, ���� ��Ʈ��
		
		
		
	}

}
