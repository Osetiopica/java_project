package com.ict03.class01;

import java.util.Scanner;

public class Ex10_main {

	public static void main(String[] args) {

//		�Է� �޾Ƽ� �迭�� �ֱ�
		Scanner sc = new Scanner(System.in);

		System.out.print("�ο� �� : ");
		int s = sc.nextInt();

		Ex10[] menu = new Ex10[5]; // Ŭ������ �ִ� �迭

		Ex10 w1 = new Ex10();
		w1.setName("īǪġ��");
		w1.setPrice(2000);
		menu[1] = w1;
		Ex10 w2 = new Ex10();
		w2.setName("�Ƹ޸�ī��");
		w2.setPrice(1800);
		menu[2] = w2;
		Ex10 w3 = new Ex10();
		w3.setName("ī���");
		w3.setPrice(2500);
		menu[3] = w3;
		Ex10 w4 = new Ex10();
		w4.setName("�ڸ��ֽ�");
		w4.setPrice(2000);
		menu[4] = w4;

		int sum = 0;
		for (int i = 0; i < s; i++) {
			System.out.print("����- 1.īǪ 2.�Ƹ� 3.�� 4.�ֽ� : ");
			int order = sc.nextInt();

//			Ex10 pro = new Ex10();
//			if (order == 1) {
//				pro.setName(menu[1].getName());
//				pro.setPrice(menu[1].getPrice());
//			} else if (order == 2) {
//				pro.setName(menu[2].getName());
//				pro.setPrice(menu[2].getPrice());
//			} else if (order == 3) {
//				pro.setName(menu[3].getName());
//				pro.setPrice(menu[3].getPrice());
//			} else if (order == 4) {
//				pro.setName(menu[4].getName());
//				pro.setPrice(menu[4].getPrice());
//			}
			sum += menu[order].getPrice();
		}
//		���
		System.out.println("�հ� : " + sum);
		System.out.print("�Աݾ� : ");
		int in = sc.nextInt();
		System.out.println("�ܵ� : " + (in - sum));
	}

}
