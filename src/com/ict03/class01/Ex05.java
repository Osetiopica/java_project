package com.ict03.class01;

public class Ex05 {
//	���� ������
//	public(�ƹ���) protected(���� ��Ű��, ��� ����) default(���� ��Ű��) private(���� �Ұ�) 

	public int s1 = 1;
	private int s2 = 2;
	public static int s3 = 3;
	private static int s4 = 4;

	public void add() {
		s1 += 10;
		s2 += 10;
		s3 += 10;
		s4 += 10;
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
	}
	private void add2() {
		s1 += 10;
		s2 += 10;
		s3 += 10;
		s4 += 10;
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
	}
	void add3() {
		add2();
	}
}
