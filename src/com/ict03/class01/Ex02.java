package com.ict03.class01;

public class Ex02 {
//	Ŭ���� = {(static, instance)����ʵ�, ����޼ҵ�, ������}
//	final ������ ���
//	static ������ �ν��Ͻ�
//	static�� ��ü ������ ������� �̸� ����

	int a1 = 1; // �ν��Ͻ� ���� = �Ϲ� ����
	static int a2 = 2; // static ����
	final int A3 = 3; // �ν��Ͻ� ���
	static final int A4 = 4; // static ��� = API���� �����ϴ� ��� ����

	// �ν��Ͻ�, ��ȯ�� ����
	public void z1() {
		a1=a1+1;
		a2=a2+2;
		System.out.println(a1);
		System.out.println(a2);
//		a3=a3+3;
//		a4=a4+4;
		
//		�������� : �޼ҵ� �ȿ��� �������, static�� ���� �� ����
//		�޼ҵ� �ȿ��� ������� ������ �޼ҵ带 ȣ���� �� ����, �޼ҵ尡 ������ �����
		int a1 = 1;
//		static int a2 = 2;
		final int A3 = 3;
//		static final int A4 = 4;
	}

	// static, ��ȯ�� ����
	public static void z2() {
	// static �޼ҵ忡�� �ν��Ͻ� ���� ��� �Ұ�
//		a1=a1+1;
		a2=a2+2;
//		System.out.println(a1);
		System.out.println(a2);
//		a3=a3+3;
//		a4=a4+4;
	}

	// �ν��Ͻ�, ��ȯ�� ����
	public int z3() {
		return 0;
	}

	// static, ��ȯ�� ����
	public static double z4(int a) {
		return a;
	}

	public static void main(String[] args) {
		z2();
	}

}
