package com.ict03.class02;

import java.util.Random;
import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int cnt = 0;
		int t_cnt = 0;
		int win = 0;
		esc: while (true) {
			int c = r.nextInt(3) + 1;
			System.out.print("1.���� 2.���� 3.�� -> ");
			int a = sc.nextInt();
			if (c == a) {
				System.out.println("���");
				cnt--;
			} else if (c == 1 && a == 2) {
				System.out.println("�¸�");
				win++;
			} else if (c == 1 && a == 3) {
				System.out.println("�й�");
			} else if (c == 2 && a == 1) {
				System.out.println("�й�");
			} else if (c == 2 && a == 3) {
				System.out.println("�¸�");
				win++;
			} else if (c == 3 && a == 1) {
				System.out.println("�¸�");
				win++;
			} else if (c == 3 && a == 2) {
				System.out.println("�й�");
			} else {
				System.out.println("�ٽ� �Է�");
			}
			cnt++;
			t_cnt++;
			System.out.printf("�Ǽ� : %d, �·�: %.2f%%", t_cnt, (double) win / cnt * 100);
			System.out.println();
			System.out.println();
			while (true) {
				System.out.println("��� �ұ��?(y/n) -> ");
				String ans = sc.next();
				if (ans.equalsIgnoreCase("y")) {
					continue esc;
				} else if (ans.equalsIgnoreCase("n")) {
					break esc;
				} else {
					continue;
				}
			}
		}
		sc.close();
	}

}
