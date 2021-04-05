package com.ict01.grammar04;

import java.util.Scanner;
class Ex10 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		esc:
		while (true) {
			System.out.print("수 입력 : ");
			int a = sc.nextInt();
			String m = "";
			if (a % 2 == 0) {
				m = "짝";
			} else if (a % 2 == 1) {
				m = "홀";
			}
			System.out.println(a + "는 " + m + "입니다.");
			while (true) {
				System.out.print("계속 할까요? 1.Yes 2.No >>>");
				int a2 = sc.nextInt();
				if (a2 == 1) {
					continue esc;
				}
				else if (a2 == 2) {
					break esc;
				}
				else {
					System.out.println("다시 입력");
					continue;
				}
			}
		}
	}
}
