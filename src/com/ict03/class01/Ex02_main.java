package com.ict03.class01;

public class Ex02_main {

	public static void main(String[] args) {
//		Ex02 Ŭ������ ����ϱ� ���ؼ� Ŭ������ ��ü�� ������
//		Ex02 Ŭ������ �����ڰ� �����Ƿ� �⺻ �����ڷ� ��ü�� ����
//		�⺻ �����ڶ� �Ű������� ���� ������ Ŭ�����̸�()
//		Ŭ���� �������� = new ������;
		
		Ex02.z2(); // static�� �ν��Ͻ� ���� ȣ�� ����
		double e = Ex02.z4(1);
		System.out.println(e);

		Ex02 ex = new Ex02();
		ex.z1();
		System.out.println();
		System.out.print(ex.a1);
		System.out.print(ex.a2);
		System.out.print(ex.A3);
		System.out.print(ex.A4);
	}

}
