package com.ict02.array;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[][] a = new int[5][5];
		for (int i = 0; i < a.length; i++) {
			System.out.print("번호 : ");
			a[i][0] = sc.nextInt();
			System.out.print("국어 : ");
			a[i][1] = sc.nextInt();
			System.out.print("영어 : ");
			a[i][1] += sc.nextInt();
			System.out.print("수학 : ");
			a[i][1] += sc.nextInt();
		}

//		평균
		for (int i = 0; i < a.length; i++) {
			a[i][2] = a[i][1] / 3;
		}

//		학점
		for (int i = 0; i < a.length; i++) {
			if (a[i][2] >= 90) {
				a[i][3] = 'A';
			} else if (a[i][2] >= 80) {
				a[i][3] = 'B';
			} else if (a[i][2] >= 70) {
				a[i][3] = 'C';
			} else {
				a[i][3] = 'F';
			}
		}

//		순위
		for (int i = 0; i < a.length; i++) {
			a[i][4] = 1;
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (a[i][1] > a[j][1]) {
					a[j][4]++;
				}
			}
		}

//		정렬
		int[] t;
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i][4] > a[j][4]) {
					t = a[i];
					a[i] = a[j];
					a[j] = t;
				}
			}
		}

//		출력
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (j == 3) {
					System.out.print((char) a[i][j] + "\t");
				} else {
					System.out.print(a[i][j] + "\t");
				}
			}
			System.out.println();
		}
	}

}
