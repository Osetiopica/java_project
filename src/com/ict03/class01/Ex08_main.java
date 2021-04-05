package com.ict03.class01;

import java.util.Scanner;

public class Ex08_main {

	public static void main(String[] args) {

		Ex08 coffee = new Ex08();
		coffee.setName(" 커피음료");
		coffee.setPrice(1800);
		Ex08 ion = new Ex08();
		ion.setName("이온음료");
		ion.setPrice(1500);
		Ex08 cola = new Ex08();
		cola.setName("탄산음료");
		cola.setPrice(2000);
		Ex08 juice = new Ex08();
		juice.setName("과일음료");
		juice.setPrice(2200);

//		배열에 넣기
//		Ex08[] arr = new Ex08[4];
//		arr[0] = coffee;
//		arr[1] = ion;
//		arr[2] = cola;
//		arr[3] = juice;

		Ex08[] arr = { coffee, ion, cola, juice };

//		이름과 가격 출력
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i].getName() + ", " + arr[i].getPrice());
//		}

//		동전 투입

//		1500 미만이면 금액 부족
//		1500 이상이면 구입 가능

		Scanner sc = new Scanner(System.in);
		System.out.print("동전 투입 : ");
		int in = sc.nextInt();
		while (true) {
			if (in < 1500) {
				System.out.println("금액 부족");
			} else {
				System.out.println("1.커 피\t2.이 온\t3.탄 산\t4.과 일");
				for (int i = 0; i < arr.length; i++) {
					if (arr[i].getPrice() <= in) {
						System.out.print("O\t");
					} else {
						System.out.print("X\t");
					}
				}
			}
			System.out.println();
			System.out.print("번호로 선택하세요 >> ");
			int drink = sc.nextInt();
			int out = 0;
			if (drink == 1) {
				out = in - arr[0].getPrice();
			} else if (drink == 2) {
				out = in - arr[1].getPrice();
			} else if (drink == 3) {
				out = in - arr[2].getPrice();
			} else if (drink == 4) {
				out = in - arr[3].getPrice();
			}
			System.out.println("잔돈 : " + out);
			if (out >= 1500) {
				in = out;
			} else {
				break;
			}
		}
	}

}
