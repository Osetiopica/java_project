package com.ict04.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
//		finally : ���� ó���� ������� �� �����ؾ� �ϴ� ������ ó���� �� ���(DB, IO, Network���� �ַ� ���)
//		try{}catch{}finally{}

		while (true) {
			Scanner sc = new Scanner(System.in);
			try {
				int v = 27;
				System.out.print("���� �Է� >> ");
				int s = sc.nextInt();
				System.out.println("���� : " + (v / s));
				return ;
			} catch (InputMismatchException e) {
				System.out.println("������ �Է�");
			} catch (ArithmeticException e) {
				System.out.println("0���δ� ���� �� ����");
			} catch (Exception e) {
				System.out.println("�ٽ� �Է�");
				return ;
			} finally {
				System.out.println("�ݵ�� �ؾ� �� ����");
			}
			System.out.println("����");
			sc.close();
		}
	}
}