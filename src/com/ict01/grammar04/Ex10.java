package com.ict01.grammar04;

import java.util.Scanner;
class Ex10 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		esc:
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
			while (true) {
				System.out.print("��� �ұ��? 1.Yes 2.No >>>");
				int a2 = sc.nextInt();
				if (a2 == 1) {
					continue esc;
				}
				else if (a2 == 2) {
					break esc;
				}
				else {
					System.out.println("�ٽ� �Է�");
					continue;
				}
			}
		}
	}
}
