package com.ict01.grammar04;
import java.util.Scanner;

class Ex09 {

	public static void main(String[] args) {
		// 1-10에서 짝수만 출력(continue)
		for (int i = 1; i < 11; i++) {
			if (i % 2 == 1) {
				continue;
			}
			System.out.print(i + " ");
		}
		System.out.println();

		// 짝, 홀 판별
		Scanner sc = new Scanner(System.in);
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
			System.out.print("계속 할까요? 1.Yes 2.No >>>");
			int a2 = sc.nextInt();
			if (a2 == 2) {
				break;
			}
		}
	}
}
