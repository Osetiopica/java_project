package com.ict03.class01;

import java.util.Scanner;

public class Ex08_main {

	public static void main(String[] args) {

		Ex08 coffee = new Ex08();
		coffee.setName(" Ŀ������");
		coffee.setPrice(1800);
		Ex08 ion = new Ex08();
		ion.setName("�̿�����");
		ion.setPrice(1500);
		Ex08 cola = new Ex08();
		cola.setName("ź������");
		cola.setPrice(2000);
		Ex08 juice = new Ex08();
		juice.setName("��������");
		juice.setPrice(2200);

//		�迭�� �ֱ�
//		Ex08[] arr = new Ex08[4];
//		arr[0] = coffee;
//		arr[1] = ion;
//		arr[2] = cola;
//		arr[3] = juice;

		Ex08[] arr = { coffee, ion, cola, juice };

//		�̸��� ���� ���
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i].getName() + ", " + arr[i].getPrice());
//		}

//		���� ����

//		1500 �̸��̸� �ݾ� ����
//		1500 �̻��̸� ���� ����

		Scanner sc = new Scanner(System.in);
		System.out.print("���� ���� : ");
		int in = sc.nextInt();
		while (true) {
			if (in < 1500) {
				System.out.println("�ݾ� ����");
			} else {
				System.out.println("1.Ŀ ��\t2.�� ��\t3.ź ��\t4.�� ��");
				for (int i = 0; i < arr.length; i++) {
					if (arr[i].getPrice() <= in) {
						System.out.print("O\t");
					} else {
						System.out.print("X\t");
					}
				}
			}
			System.out.println();
			System.out.print("��ȣ�� �����ϼ��� >> ");
			int drink = sc.nextInt();
			int out = 0;
			if (drink == 1) {
				out = in - arr[0].getPrice();
			} else if (drink == 2) {
				out = in - arr[1].getPrice();
			} else if (drink == 3) {
				out = in - arr[2].getPrice();
			} else if (drink == 4) {
				out = in - arr[3].getPrice();
			}
			System.out.println("�ܵ� : " + out);
			if (out >= 1500) {
				in = out;
			} else {
				break;
			}
		}
	}

}
