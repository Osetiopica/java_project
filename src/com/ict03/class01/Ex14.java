package com.ict03.class01;

public class Ex14 {
//	static : ��ü ������ ������� �̸� ��������� �ʵ�� �޼ҵ�
//	Ŭ���� ����� �������� ���𿡼� static ��� �Ұ�
//	��� ��ü�� ����� �� �ִ� ������
//	���� �����ڰ� private�̸� static�̶� ������ �� ����

	int s1 = 1;
	static int s2 = 1;

//	������
	public Ex14() {
		s1++;
		s2++;
	}

	public void prn() {
		int s3 = 1;
//		static int s4 = 1; ���� ������ static �Ұ�
	}

//	static �޼ҵ�� static ������ ����
	public static void prn2() {
//		System.out.println(s1);
		System.out.println(s2);
		int s4 = 1;
//		static int s5 = 1; ���� ������ static �Ұ�
	}
}
