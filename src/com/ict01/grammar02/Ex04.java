package com.ict01.grammar02;
class Ex04{
	public static void main(String[] args){
		// ���ڵ��� ũ�⿡ ���� ���� ����
		// char < int < long < float < double
		// (����)  (������ ����)    (�Ǽ��� ����)
		// ����ȯ: �ڵ�����ȯ�� ��������ȯ
		// �ڵ� ����ȯ: ���� �ڷ����� ū �ڷ����� ����� ��
		// char�� int�� ������ �� �ִ�.
		char c1 = 'a';
		System.out.println(c1);
		int s1 = 'a';
		System.out.println(s1);
		int s2 = c1;
		System.out.println(s2);

		byte k1 = (byte)(257);
		System.out.println(k1);

		char k2 = 97;
		System.out.println(k2);

		int k3 = 97;
		char k4 = (char)k3;
		System.out.println(k4);

		int k5 = (int)12.45;
		System.out.println(k5);

		short s = 10;
		float f = 10 + 3.5f;
		System.out.println(f);
	}
}





