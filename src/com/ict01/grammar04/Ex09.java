package com.ict01.grammar04;
import java.util.Scanner;

class Ex09 {

	public static void main(String[] args) {
		// 1-10���� ¦���� ���(continue)
		for (int i = 1; i < 11; i++) {
			if (i % 2 == 1) {
				continue;
			}
			System.out.print(i + " ");
		}
		System.out.println();

		// ¦, Ȧ �Ǻ�
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("�� �Է� : ");
			int a = sc.nextInt();
			String m = "";
			if (a % 2 == 0) {
				m = "¦";
			} else if (a % 2 == 1) {
				m = "Ȧ";
			}
			System.out.println(a + "�� " + m + "�Դϴ�.");
			System.out.print("��� �ұ��? 1.Yes 2.No >>>");
			int a2 = sc.nextInt();
			if (a2 == 2) {
				break;
			}
		}
	}
}
