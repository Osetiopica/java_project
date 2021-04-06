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
		System.out.println("숫자 야구 게임");
		while (true) {
			strk = 0;
			ball = 0;
			out_c = 0;
			for (int i = 0; i < f.length; i++) {
				System.out.println((i + 1) + "번째 숫자 입력 -> ");
				int t = sc.nextInt();
				a[i] = t;
			}
			if (a[0] == a[1] || a[0] == a[2] || a[1] == a[2]) {
				System.out.println("중복되는 숫자 입력하지마!");
				continue;
			}
			for (int i = 0; i < f.length; i++) {
				for (int j = 0; j < a.length; j++) {
					if ((i == j) && (f[i] == a[j])) { // 스트라이크 : 위치+숫자 맞음
						strk++;
					} else if ((i != j) && (f[i] == a[j])) { // 볼 : 숫자만 맞음
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
			System.out.printf("%d판 - %d스트라이크 %d볼 | %d아웃%n", pan, strk, ball, out);
			if (pan == 9 || out == 3) {
				System.out.println("게임에서 패배하였습니다.");
				break;
			} else if (strk == 3) {
				System.out.println("게임에서 이겼습니다.");
				break;
			}
		}
		sc.close();
	}

}
