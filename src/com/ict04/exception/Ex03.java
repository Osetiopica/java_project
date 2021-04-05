package com.ict04.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
//		���� catch�� : try���� ���������� ���ܰ� �߻��� ��� ���
//		���� : Exception�� ����� �� �ݵ�� �Ʒ��� catch���� ���

		while (true) {
			Scanner sc = new Scanner(System.in);
			try {
				int v = 27;
				System.out.print("���� �Է� >> ");
				int s = sc.nextInt();
				System.out.println("���� : " + (v / s));
			} catch (InputMismatchException e) {
				System.out.println("������ �Է�");
			} catch (ArithmeticException e) {
				System.out.println("0���δ� ���� �� ����");
			} catch (Exception e) {
				System.out.println("���α׷� ����");
				System.out.println(e);
				System.exit(0);
			}
			System.out.println("����");
			sc.close();
		}
	}
}