package com.ict03.class01;

import java.util.Scanner;

public class Ex09_main {

	public static void main(String[] args) {
//		5���� �̸�, ��, ��, �� ������ �޾Ƽ�
//		�̸�, ����, ���, ����, ������ ���ϰ� �����ϱ�

//		�Է� �޾Ƽ� �迭�� �ֱ�
		Scanner sc = new Scanner(System.in);
		Ex09[] ar = new Ex09[5]; // Ŭ������ �ִ� �迭
		for (int i = 0; i < ar.length; i++) {
			System.out.print("�̸� : ");
			String name = sc.next();
			System.out.print("���� : ");
			int kor = sc.nextInt();
			System.out.print("���� : ");
			int eng = sc.nextInt();
			System.out.print("���� : ");
			int math = sc.nextInt();

			Ex09 person = new Ex09(); // Ŭ���� �ν��Ͻ� ����
			person.setName(name);
			person.p_sum(kor, eng, math);
//			person.p_avg();
//			person.p_hak();

			ar[i] = person; // �迭�� ����
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
		Ex09 t = new Ex09();
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
