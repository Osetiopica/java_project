package com.ict02.array;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
//		������ ���� �迭
//		1���� �迭 �ȿ� �����ϴ� �迭�� ũ�Ⱑ ���� �ٸ� �迭

		char[][] c1 = new char[3][];

//		���� ���� ������ �Է� �� ���� ����ó�� �ϸ� ����

//		c1[0][0] = 'a';

//		1���� �迭 ���� ������ �迭�� �ֱ�

		char[] cc1 = { 'j', 'a', 'v', 'a' };
		char[] cc2 = { 'a', 'n', 'd', 'r', 'o', 'i', 'd' };
		char[] cc3 = { 's', 'p', 'r', 'i', 'n', 'g' };
		char[][] c2 = { cc1, cc2, cc3 };
		for (int i = 0; i < c2.length; i++) {
			for (int j = 0; j < c2[i].length; j++) {
				System.out.print(c2[i][j]);
			}
			System.out.print(" ");
		}
		System.out.println();
		
//		����, ����, ������ ���� �ѹ���
		char[][] c3 = { 
						{ 'j', 'a', 'v', 'a' }, 
						{ 'a', 'n', 'd', 'r', 'o', 'i', 'd' }, 
						{ 's', 'p', 'r', 'i', 'n', 'g' } 
					  };
		for (int i = 0; i < c3.length; i++) {
			for (int j = 0; j < c3[i].length; j++) {
				System.out.print(c3[i][j]);
			}
			System.out.print(" ");
		}
		
	}

}
