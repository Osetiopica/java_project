package com.ict03.class03;

import java.util.Scanner;

public class Ex12_main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("선택(1.고양이 2.강아지) ->  ");
		int s1 = scan.nextInt();

//		if (s1 == 1) {
//			Ex10_Cat cat = new Ex10_Cat();
//			cat.sound();
//			cat.hobby();
//			cat.like();
//			cat.sleep();
//		} else if (s1 == 2) {
//			Ex11_Dog dog = new Ex11_Dog();
//			dog.sound();
//			dog.hobby();
//			dog.like();
//			dog.sleep();
//		}

//		부모 클래스를 이용한 선언
		Ex09_Animal a = null;
		if (s1 == 1) {
			a = new Ex10_Cat();
		} else if (s1 == 2) {
			a = new Ex11_Dog();
		}

//		특징 : 부모 클래스에 없는 메소드 사용 불가
		a.sound();
//		a.hobby();
		a.like();
		a.sleep();
	}
}
