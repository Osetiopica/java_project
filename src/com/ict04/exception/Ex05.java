package com.ict04.exception;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
//		throws : 예외가 발생하면 처리하지 않고 자신을 호출한 곳으로 되돌려 보내는 것
//		나중에라도 예외 처리(try~catch~)하는 것이 좋음

		Ex05 e5 = new Ex05();
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("정수 입력 >> ");
			String m = sc.next();
			e5.setData(m);
		} catch (Exception e) {
			System.out.println("첫 글자를 숫자로 입력");
		}

	}

	public void setData(String m) throws NumberFormatException {
		if (m.length() >= 1) {
			String s = m.substring(0, 1);
			pData(s);
		}
	}

	public void pData(String s) throws NumberFormatException {
		int d = Integer.parseInt(s);
		System.out.println(d + "단");
		for (int i = 1; i <= 9; i++) {
			System.out.println(d + "*" + i + "=" + d * i);
		}
	}
}
