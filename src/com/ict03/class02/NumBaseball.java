package com.ict03.class02;

import java.util.Scanner;

public class NumBaseball {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int strk = 0;
		int ball = 0;
		int out = 0;
		int out_c = 0;
		int pan = 0;
		int[] f = { 0, 7, 4 };
		int[] a = new int[f.length];
		System.out.println("���� �߱� ����");
		while (true) {
			strk = 0;
			ball = 0;
			out_c = 0;
			for (int i = 0; i < f.length; i++) {
				System.out.println((i + 1) + "��° ���� �Է� -> ");
				int t = sc.nextInt();
				a[i] = t;
			}
			if (a[0] == a[1] || a[0] == a[2] || a[1] == a[2]) {
				System.out.println("�ߺ��Ǵ� ���� �Է�������!");
				continue;
			}
			for (int i = 0; i < f.length; i++) {
				for (int j = 0; j < a.length; j++) {
					if ((i == j) && (f[i] == a[j])) { // ��Ʈ����ũ : ��ġ+���� ����
						strk++;
					} else if ((i != j) && (f[i] == a[j])) { // �� : ���ڸ� ����
						ball++;
					} else if ((f[i] != a[j])) {
						out_c++;
					}
				}
			}
			if (out_c == 9) {
				out++;
			}
			pan++;
			System.out.printf("%d�� - %d��Ʈ����ũ %d�� | %d�ƿ�%n", pan, strk, ball, out);
			if (pan == 9 || out == 3) {
				System.out.println("���ӿ��� �й��Ͽ����ϴ�.");
				break;
			} else if (strk == 3) {
				System.out.println("���ӿ��� �̰���ϴ�.");
				break;
			}
		}
		sc.close();
	}

}
