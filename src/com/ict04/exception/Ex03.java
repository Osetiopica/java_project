package com.ict04.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
//		다중 catch문 : try문에 여러가지의 예외가 발생할 경우 사용
//		주의 : Exception을 사용할 땐 반드시 아래쪽 catch문에 사용

		while (true) {
			Scanner sc = new Scanner(System.in);
			try {
				int v = 27;
				System.out.print("정수 입력 >> ");
				int s = sc.nextInt();
				System.out.println("정답 : " + (v / s));
			} catch (InputMismatchException e) {
				System.out.println("정수만 입력");
			} catch (ArithmeticException e) {
				System.out.println("0으로는 나눌 수 없음");
			} catch (Exception e) {
				System.out.println("프로그램 종료");
				System.out.println(e);
				System.exit(0);
			}
			System.out.println("ㅅㄱ");
			sc.close();
		}
	}
}