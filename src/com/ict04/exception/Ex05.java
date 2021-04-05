package com.ict04.exception;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
//		throws : ���ܰ� �߻��ϸ� ó������ �ʰ� �ڽ��� ȣ���� ������ �ǵ��� ������ ��
//		���߿��� ���� ó��(try~catch~)�ϴ� ���� ����

		Ex05 e5 = new Ex05();
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("���� �Է� >> ");
			String m = sc.next();
			e5.setData(m);
		} catch (Exception e) {
			System.out.println("ù ���ڸ� ���ڷ� �Է�");
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
		System.out.println(d + "��");
		for (int i = 1; i <= 9; i++) {
			System.out.println(d + "*" + i + "=" + d * i);
		}
	}
}
