package com.ict04.exception;

public class Ex01 {
	public static void main(String[] args) {
//		�ڹٿ��� ������ �߻��ϸ� ���α׷��� ����ȴ�
//		�׷��� ����Ǵ� ������ ������ ó���ϴ� ����� ���� ���������� �����ų �� �ִ�
//		exception(����ó��) : try{}catch{}
//		���������� ���Ḧ �������� ����� ����
//		���� �߻� �� ���ܿ� ���� ó���� �Ѵ�.
//		try {
//			���ܰ� �߻��� �� �ִ� ����;
//			���ܰ� �߻��� �� �ִ� ����;
//		}catch(���ܹ߻���ü e) {
//			���� �߻� �� ó�� ����;
//		}
		
		try {
			int[] v = { 1, 2, 3 };
			for (int i = 0; i <= v.length; i++) {
				System.out.println(1);
				System.out.println(2);
				System.out.println("v+[" + i + "] = " + v[i]);
				System.out.println(3);
				System.out.println(4);
			}
		} catch (Exception e) {
			
		}
		System.out.println("����");
	}
}