package com.ict02.array;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
//		1. ���� ���� �迭
//		�̸�[][] = ������; - ���� ���̿��� ���
//		1���� �迭 �ȿ� �ٸ� �迭 �ֱ� - ����, ���� ��� ���
		int[][] a;
		a = new int[2][4];
		a[0][0] = 1;
		a[0][1] = 2;
		a[0][2] = 3;
		a[0][3] = 4;
		a[1][0] = 5;
		a[1][1] = 6;
		a[1][2] = 7;
		a[1][3] = 8;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j]);
			}
			System.out.println();
		}

		// ���� ���� ����� ������ �ѹ���
		char[][] c = new char[3][2];
		c[0][0] = 'a';
		c[0][1] = 'A';
		c[1][0] = 'b';
		c[1][1] = 'B';
		c[2][0] = 'c';
		c[2][1] = 'C';

		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].length; j++) {
				System.out.print(c[i][j]);
			}
			System.out.println();
		}

		int[][] a2 = { { 1, 2, 3, 4 }, { 4, 5, 6, 7 }, { 7, 8, 9, 0 } };
		for (int i = 0; i < a2.length; i++) {
			for (int j = 0; j < a2[i].length; j++) {
				System.out.print(a2[i][j]);
			}
			System.out.println();
		}

		char[] s1 = { 'j', 'a', 'v', 'a' };
		char[] s2 = { '��', '��', '��', '��' };
		char[] s3 = { '1', '2', '3', '4' };
		char[][] a3 = { s1, s2, s3 };
		for (int i = 0; i < a3.length; i++) {
			for (int j = 0; j < a3[i].length; j++) {
				System.out.print(a3[i][j]);
			}
			System.out.println();
		}
	}

}
