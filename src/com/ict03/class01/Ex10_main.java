package com.ict03.class01;

import java.util.Scanner;

public class Ex10_main {

	public static void main(String[] args) {

//		입력 받아서 배열에 넣기
		Scanner sc = new Scanner(System.in);

		System.out.print("인원 수 : ");
		int s = sc.nextInt();

		Ex10[] menu = new Ex10[5]; // 클래스를 넣는 배열

		Ex10 w1 = new Ex10();
		w1.setName("카푸치노");
		w1.setPrice(2000);
		menu[1] = w1;
		Ex10 w2 = new Ex10();
		w2.setName("아메리카노");
		w2.setPrice(1800);
		menu[2] = w2;
		Ex10 w3 = new Ex10();
		w3.setName("카페라떼");
		w3.setPrice(2500);
		menu[3] = w3;
		Ex10 w4 = new Ex10();
		w4.setName("자몽주스");
		w4.setPrice(2000);
		menu[4] = w4;

		int sum = 0;
		for (int i = 0; i < s; i++) {
			System.out.print("선택- 1.카푸 2.아메 3.라떼 4.주스 : ");
			int order = sc.nextInt();

//			Ex10 pro = new Ex10();
//			if (order == 1) {
//				pro.setName(menu[1].getName());
//				pro.setPrice(menu[1].getPrice());
//			} else if (order == 2) {
//				pro.setName(menu[2].getName());
//				pro.setPrice(menu[2].getPrice());
//			} else if (order == 3) {
//				pro.setName(menu[3].getName());
//				pro.setPrice(menu[3].getPrice());
//			} else if (order == 4) {
//				pro.setName(menu[4].getName());
//				pro.setPrice(menu[4].getPrice());
//			}
			sum += menu[order].getPrice();
		}
//		출력
		System.out.println("합계 : " + sum);
		System.out.print("입금액 : ");
		int in = sc.nextInt();
		System.out.println("잔돈 : " + (in - sum));
	}

}
