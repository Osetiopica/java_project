package com.ict03.class01;

import java.util.Scanner;

public class Ex12_main {

	public static void main(String[] args) {
//		5���� �̸�, ��, ��, �� ������ �޾Ƽ�
//		�̸�, ����, ���, ����, ������ ���ϰ� �����ϱ�

//		�Է� �޾Ƽ� �迭�� �ֱ�
		Scanner sc = new Scanner(System.in);
		Ex12[] ar = new Ex12[5]; // Ŭ������ �ִ� �迭
		for (int i = 0; i < ar.length; i++) {
			System.out.print("�̸� : ");
			String name = sc.next();
			System.out.print("���� : ");
			int kor = sc.nextInt();
			System.out.print("���� : ");
			int eng = sc.nextInt();
			System.out.print("���� : ");
			int math = sc.nextInt();

			Ex12 person = new Ex12(name, kor, eng, math);
			ar[i] = person;
		}
//		����
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar.length; j++) {
				if (i == j) {
					continue;
				}
				if (ar[i].getSum() < ar[j].getSum()) {
					ar[i].setRank(ar[i].getRank() + 1);
				}
			}
		}
//		����
		Ex12 t = new Ex12();
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar.length; j++) {
				if (ar[i].getRank() < ar[j].getRank()) {
					t = ar[i];
					ar[i] = ar[j];
					ar[j] = t;
				}
			}
		}
//		���
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i].getName() + "\t");
			System.out.print(ar[i].getSum() + "\t");
			System.out.print(ar[i].getAvg() + "\t");
			System.out.print(ar[i].getHak() + "\t");
			System.out.println(ar[i].getRank());
		}
	}

}
