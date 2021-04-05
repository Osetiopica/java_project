package com.ict03.class01;

import java.util.Scanner;

public class Ex12_main {

	public static void main(String[] args) {
//		5명의 이름, 국, 영, 수 점수를 받아서
//		이름, 총점, 평균, 학점, 순위를 구하고 정렬하기

//		입력 받아서 배열에 넣기
		Scanner sc = new Scanner(System.in);
		Ex12[] ar = new Ex12[5]; // 클래스를 넣는 배열
		for (int i = 0; i < ar.length; i++) {
			System.out.print("이름 : ");
			String name = sc.next();
			System.out.print("국어 : ");
			int kor = sc.nextInt();
			System.out.print("영어 : ");
			int eng = sc.nextInt();
			System.out.print("수학 : ");
			int math = sc.nextInt();

			Ex12 person = new Ex12(name, kor, eng, math);
			ar[i] = person;
		}
//		순위
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar.length; j++) {
				if (i == j) {
					continue;
				}
				if (ar[i].getSum() < ar[j].getSum()) {
					ar[i].setRank(ar[i].getRank() + 1);
				}
			}
		}
//		정렬
		Ex12 t = new Ex12();
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar.length; j++) {
				if (ar[i].getRank() < ar[j].getRank()) {
					t = ar[i];
					ar[i] = ar[j];
					ar[j] = t;
				}
			}
		}
//		출력
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i].getName() + "\t");
			System.out.print(ar[i].getSum() + "\t");
			System.out.print(ar[i].getAvg() + "\t");
			System.out.print(ar[i].getHak() + "\t");
			System.out.println(ar[i].getRank());
		}
	}

}
