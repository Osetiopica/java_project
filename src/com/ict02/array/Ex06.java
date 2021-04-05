package com.ict02.array;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		String[] name = new String[5];
		int[] kor = new int[5];
		int[] eng = new int[5];
		int[] math = new int[5];
		int[] rank = { 1, 1, 1, 1, 1 };

		for (int i = 0; i < name.length; i++) {
			Scanner sc = new Scanner(System.in);
			System.out.print("�̸� : ");
			name[i] = sc.next();
			System.out.print("���� : ");
			kor[i] = sc.nextInt();
			System.out.print("���� : ");
			eng[i] = sc.nextInt();
			System.out.print("���� : ");
			math[i] = sc.nextInt();
		}

		int[] sum = new int[5];
		double[] avr = new double[5];
		String[] hak = new String[5];

		for (int i = 0; i < hak.length; i++) {
			sum[i] = kor[i] + eng[i] + math[i];
			avr[i] = (int) (sum[i] / 3.0 * 10) / 10.0;
			if (avr[i] >= 90) {
				hak[i] = "A";
			} else if (avr[i] >= 80) {
				hak[i] = "B";
			} else if (avr[i] >= 70) {
				hak[i] = "C";
			} else {
				hak[i] = "F";
			}
		}

		for (int i = 0; i < rank.length; i++) {
			for (int j = 0; j < rank.length; j++) {
				if (sum[i] < sum[j]) {
					rank[i]++;
				}
			}
		}

		System.out.println("�� ��\t�� ��\t�� ��\t�� ��\t�� ��");
		for (int i = 0; i < name.length; i++) {
			System.out.print(name[i] + "\t");
			System.out.print(sum[i] + "\t");
			System.out.print(avr[i] + "\t");
			System.out.print(hak[i] + "\t");
			System.out.println(rank[i]);
		}
	}

}
