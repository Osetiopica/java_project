package com.ict03.class02;

public class Ex05 {

	public static void main(String[] args) {
//		StringBuffer, StringBuilder
//		String�� �Һ� �Ӽ�, ���� �� �޸𸮿� ���ο� ������ ���� ����
//		StringBuffer�� ���� �Ӽ�, ���� �� ���� �������� �ٲ�
		String m = "Hello"; 
		System.out.println(m);
		m = m + " Java";
		System.out.println(m);

		StringBuffer sb = new StringBuffer("welcome");
		System.out.println(sb.toString());
		sb.append(" Java");
		System.out.println(sb.toString());
	}

}
