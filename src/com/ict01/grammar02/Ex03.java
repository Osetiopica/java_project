package com.ict01.grammar02;
class Ex03{
	public static void main(String[] args){
		byte s1 = -127;
		System.out.println(s1);
		s1 = -128;
		System.out.println(s1);
		// byte ����(-128~127)�� ����� ���� �߻�
		// s1 = -129;
		System.out.println(s1);
		// short(-32768~32767) 
		// short s2 = -32760+100;
		// System.out.println(s2);
		// �Ϲ����� ������ int
		// ���� ū ������ long
		// long ���� �ڿ��� L(l)�� ���̰ų� ����
		int s3 = 117;
		long s4 = 117L;
		long s5 = 117l;
		long s6 = 117;
		System.out.printf("%d %d %d %d %n",s3,s4,s5,s6);
		// �Ǽ��� �⺻���� double
		// float�� ���� �ڿ� F(f)�� ���δ�.(���� �Ұ�)
		// char < int < long < float < double
		float s7 = 3.14f;
		System.out.println(s7);
		double s8 = 3.14;
		System.out.println(s8);
		double s9 = 117;
		System.out.println(s9);
		int s10 = (int)s9;
		System.out.println(s10);
	}
}





