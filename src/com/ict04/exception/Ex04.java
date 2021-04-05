package com.ict04.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
//		finally : 예외 처리와 상관없이 꼭 실행해야 하는 문장을 처리할 때 사용(DB, IO, Network에서 주로 사용)
//		try{}catch{}finally{}

		while (true) {
			Scanner sc = new Scanner(System.in);
			try {
				int v = 27;
				System.out.print("정수 입력 >> ");
				int s = sc.nextInt();
				System.out.println("정답 : " + (v / s));
				return ;
			} catch (InputMismatchException e) {
				System.out.println("정수만 입력");
			} catch (ArithmeticException e) {
				System.out.println("0으로는 나눌 수 없음");
			} catch (Exception e) {
				System.out.println("다시 입력");
				return ;
			} finally {
				System.out.println("반드시 해야 될 문장");
			}
			System.out.println("ㅅㄱ");
			sc.close();
		}
	}
}