package com.ict02.array;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
//		다차원 가변 배열
//		1차원 배열 안에 존재하는 배열의 크기가 각각 다른 배열

		char[][] c1 = new char[3][];

//		가변 길이 데이터 입력 시 고정 길이처럼 하면 오류

//		c1[0][0] = 'a';

//		1차원 배열 만들어서 다차원 배열에 넣기

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
		
//		선언, 생성, 데이터 저장 한번에
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
