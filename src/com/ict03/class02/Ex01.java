package com.ict03.class02;

import java.util.Calendar;

public class Ex01 {

	public static void main(String[] args) {
//		String Ŭ����
		String s1 = "abc";
		char[] d = { 'a', 'b', 'c' };
		String s2 = new String(d);

		byte[] d2 = { 97, 98, 99 };
		String s3 = new String(d);

		String s4 = new String("abc");

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);

		System.out.println("--�ֿ� �޼ҵ�--");
		String m = "�ѱ� ICT ���� ���߿� 1���ǽ�";
//		charAt(int index) : char
//		��ġ ���� �޾� �ش� ��ġ�� �����ϴ� ���ڸ� ��ȯ
		char c1 = m.charAt(1);
		System.out.println(c1);

//		�ҹ��ڸ� �빮�ڷ�
		m = "���� I Love You 123";
//		���ڿ��� ���̸� ���ϱ� : length() : int
		System.out.println(m.length());
		for (int i = 0; i < m.length(); i++) {
			char c2 = m.charAt(i);
			if (c2 >= 'a' && c2 <= 'z') {
				c2 = (char) (c2 - 32);
			}
			System.out.print(c2);
		}
		System.out.println();

//		���ڿ� ��ġ��
		String m1 = "����";
		String m2 = "�α�";
		String m3 = "KOREA";
		System.out.println(m1.concat(m2.concat(m3)));
		System.out.println(m1 + m2 + m3);

//		contains(String s) : boolean
//		���� ���ڿ��� �ش� ���ڿ��� �����ϸ� true, ������ false
		m = "���� I Love You 123";
		boolean b = m.contains("Love");
		if (b) {
			System.out.println("���Ե�");
		} else {
			System.out.println("���� �� ��");
		}

//		equals(Object anObject) : boolean
//		���� ���ڿ��� ���� ���ڿ� ������ true, �ٸ��� false(��ҹ��� ����)
//		equalsIgnoreCase(String anotherString) : boolean
//		���� ���ڿ��� ���� ���ڿ� ������ true, �ٸ��� false(��ҹ��� ���� ����)
//		����) ���ڿ��̳� ��ü�� ���� �� ==�� ����ϸ� ������ �ƴ϶� �ּҸ� ��
//		���ڿ����� equals �Ǵ� equalsIgnoreCase�� ����ؾ� ��
		String ss1 = "korea";
		String ss2 = "KOREA";
		String ss3 = new String("Korea");
		String ss4 = new String("Korea");

		System.out.println(ss1 == ss2); // false
		System.out.println(ss2 == ss3); // false
		System.out.println(ss3 == ss4); // false
		System.out.println(ss1.equalsIgnoreCase(ss2)); // true
		System.out.println(ss1.equalsIgnoreCase(ss3)); // true
		System.out.println(ss1.equalsIgnoreCase(ss4)); // true
		System.out.println();
		ss1 = "seoul";
		ss2 = "seoul";
		System.out.println(ss1 == ss2); // �ּ� ���� ����
		System.out.println(ss1.equalsIgnoreCase(ss2)); // ���� ���� ����

//		format(Locale l, String format, Object... args)
//		������ �����ϰ� ���Ŀ� �°� ����
		String m4 = "�ѱ� ICT ���� ���߿�";
		int s5 = 14;
		double s6 = 12.244;
		String m5 = String.format("%s�� ���� ������ %d���̰� ��� ������ %.1f�̴�.", m4, s5, s6);
		System.out.println(m5);

//		getBytes() : byte[]
//		�ش� ���ڿ��� byte[]�� ���� 
//		���� ��/��� ��Ʈ���� �� ���(���� ��ҹ���, ���ڸ� ����)
		String m6 = "java";
		byte[] b2 = m6.getBytes();
		for (int i = 0; i < b2.length; i++) {
			System.out.println((char) b2[i] + " " + b2[i] + " ");
		}

//		�ݴ�� �ش� byte[]�� ���ڿ��� ���� �� ����(String ������ �̿�)
		String m7 = new String(b2);
		System.out.println(m7);

//		toCharArray() : char[]
//		�ش� ���ڿ��� char[]�� ����
//		���� ��/��� ��Ʈ���� �� ���(������ ��� ���� ����)
		String m8 = "�ڹ�8 java8 �������� 123";
		char[] c = m8.toCharArray();
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i]);
		}
		System.out.println();

//		�ݴ�� �ش� char[]�� ���ڿ��� ���� �� ����(String ������ �̿�)
		String m9 = new String(c);
		System.out.println(m9);

//		indexOf(int ch) : int
//		���ڸ� �޾Ƽ� �ش� ������ ��ġ ���� ǥ��
//		���� ��ġ�� ó������, ã�� ���ڰ� ������ -1
//		indexOf(int ch, int fromIndex) : int
//		���ڿ� ���� ��ġ�� �޾Ƽ� �ش� ������ ��ġ ���� ǥ��
//		ã�� ���ڰ� ������ -1
//		indexOf(String str) : int
//		���ڿ��� �޾Ƽ� �ش� ���ڿ��� ��ġ ���� ǥ��
//		���� ��ġ�� ó������, ã�� ���ڿ��� ������ -1
//		indexOf(String str, int fromIndex)
//		���ڿ��� ���� ��ġ�� �޾Ƽ� �ش� ���ڿ��� ��ġ ���� ǥ��
//		ã�� ���ڿ��� ������ -1

		String m10 = "BufferedReader";
//		'e' ã��
		int k1 = m10.indexOf('e');
		System.out.println(k1);

//		�� ��° 'e' ã��
//		k1 = m10.indexOf('e', 5); // ù ��° 'e'�� 4�� 5���� ã��
		k1 = m10.indexOf('e', m10.indexOf('e') + 1);
		System.out.println(k1);

//		�� ��° 'e' ã��
		k1 = m10.indexOf('e', m10.indexOf('e', m10.indexOf('e') + 1) + 1);
		System.out.println(k1);

//		���� ���� ã��('A')
		k1 = m10.indexOf('A');
		System.out.println(k1); // -1
		b = m10.contains("A");
		System.out.println(b); // false

//		String���� ã��
		k1 = m10.indexOf("er");
		System.out.println(k1);

//		�� ��° "er" ã��
		k1 = m10.indexOf("er", m10.indexOf("er") + 1);
		System.out.println(k1);

//		lastIndexOf(int ch) : int
//		lastIndexOf(String str) : int
		k1 = m10.lastIndexOf('e');
		System.out.println(k1);
		k1 = m10.lastIndexOf("er");
		System.out.println(k1);

//		isEmpty() : boolean
//		���ڿ��� ���̰� 0�̸� true, �ƴϸ� false
//		length() : int
//		���ڿ��� ���̸� ���ڷ� ǥ��
		String m11 = "";
		String m12 = "java";

		System.out.println(m11.isEmpty()); // true
		System.out.println(m12.isEmpty()); // false

		System.out.println(m11.length()); // 0
		System.out.println(m12.length()); // 4

//		replace(char oldChar, char newChar) : String
//		replace(String target, String replacement) : String
//		���ڳ� ���ڿ��� �޾Ƽ� ġȯ
		String m13 = "���ѹα�";
		String m14 = m13.replace("���ѹα�", "korea");
		String m15 = m13.replace(m13, "korea");
		String m16 = m13.replace('��', '��');
		System.out.println(m14);
		System.out.println(m15);
		System.out.println(m16);

//		split(String regex) : String[]
//		�����ڸ� �޾Ƽ� �迭�� ���� (�迭 ũ�� �ڵ�)
//		split(String regex, int limit) : String[]
//		�����ڸ� �޾Ƽ� �迭�� ���� (�迭 ũ�� limit)

		String m17 = "���,����,����,������,���ξ���";
		String[] r = m17.split(",");
		for (int i = 0; i < r.length; i++) {
			System.out.print(r[i] + " ");
		}
		System.out.println();
		String[] r2 = m17.split(",", 2);
		for (int i = 0; i < r2.length; i++) {
			System.out.print(r2[i] + " ");
		}
		System.out.println();

//		substring(int beginIndex) : String
//		���� ��ġ�� �޾� �ش� ���ڿ� ������ ���ڿ� ����
//		substring(int beginIndex, int endIndex) : String
//		���� ��ġ�� �� ��ġ�� �޾� �ش� ���ڿ� ����(�� ��ġ ���� �� ��)
		String m18 = "010-1234-5678";
		String r3 = m18.substring(4);
		System.out.println(r3);
		String r4 = m18.substring(4, 8);
		System.out.println(r4);
		String r5 = m18.substring(m18.indexOf('-') + 1, m18.lastIndexOf('-'));
		System.out.println(r5);

		String m19 = "770707";

		// �⵵ ����
		String r7 = m19.substring(0, 2);
		System.out.println(r7);

		// �� ����
		String r8 = m19.substring(2, 4);
		System.out.println(r8);

		// ����) 010-7777-9999 -> 010-XXXX-9999, 010-7777-XXXX
		String p = "010-7777-9999";
		String[] p2 = p.split("-");
		String[] p3 = p.split("-");
		p2[1] = "XXXX";
		for (int i = 0; i < p2.length; i++) {
			System.out.print(p2[i]);
			if(i<p2.length-1) {
				System.out.print("-");
			}
		}
		System.out.println();
		p3[2] = "XXXX";
		for (int i = 0; i < p3.length; i++) {
			System.out.print(p3[i]);
			if(i<p3.length-1) {
				System.out.print("-");
			}
		}
		System.out.println();

//		toLowerCase() : String
//		�ش� ���ڿ��� ��� �빮�ڸ� �ҹ��ڷ� ����
//		toUpperCase() : String
//		�ش� ���ڿ��� ��� �ҹ��ڸ� �빮�ڷ� ����
		String m20 = "�ڹ�8 JAVA8 java8";
		String r9 = m20.toLowerCase();
		System.out.println(r9);
		String r10 = m20.toUpperCase();
		System.out.println(r10);

//		toString() : String
//		String -> toString()�� ���ڿ� ��ü�� ��ȯ
//		Object -> toString()�� ��� ��ü���� ��� ����
//		 ����ü�� ���� �ִ� ������ ������ ���ڿ��� ������ �� ���(�������̵����� �ٽ� ���)
		String m21 = "Java8 �ڹ�8";
		String r11 = m21.toString();
		System.out.println(r11);

//		trim() : String
//		�ش� ���ڿ��� ��, �ڿ� �ִ� ���� ����, �߰� ������ ���� �Ұ�
		String m22 = "  Java 8  ";
		String r12 = m22.trim();
		System.out.println(m22);
		System.out.println(m22.length());
		System.out.println(r12);
		System.out.println(r12.length());
		System.out.println();

//		valueOf(�ڷ���) : static String
//		� �ڷ����̵� String���� ��ȯ
		boolean y1 = true;
		char y2 = 'd';
		int y3 = 100;
		long y4 = 100L;
		float y5 = 100.0f;
		double y6 = 100.0;

//		System.out.println(y1 + 1); // boolean�� ���� �Ұ�
		System.out.println(y2 + 1); // char + int = int
		System.out.println(y3 + 1);
		System.out.println(y4 + 1);
		System.out.println(y5 + 1);
		System.out.println(y6 + 1);
		System.out.println();

//		String���� �����Ű�� +1
		System.out.println(String.valueOf(y1) + 1);
		System.out.println(String.valueOf(y2) + 1);
		System.out.println(String.valueOf(y3) + 1);
		System.out.println(String.valueOf(y4) + 1);
		System.out.println(String.valueOf(y5) + 1);
		System.out.println(String.valueOf(y6) + 1);
		System.out.println();

		System.out.println(y1 + "1"); // ���� ��

//		Wrapper Class(Boolean, Byte, Short, Integer, Long, Float, Double, Character)
//		parseXxxx(String s) �̿�, Character�� String.charAt() ���
//		�� �ڷ����� ���¸� ���� ���ڿ��� �ش� �ڷ������� ����
//		���� �ǹ̴� �⺻ �ڷ����� ��ü������ ���� �� ���(���� �ڽ�, ����� �ڵ����� �������)
//		��ü���� �⺻ �ڷ������� �ڵ����� ����(���� ��ڽ�)

//		boolean ������ ���ڿ��� Boolean ������ ����
		if (Boolean.parseBoolean("true")) {
			System.out.println("��");
		}

//		���ڿ��� double�� ����
		System.out.println(Double.parseDouble("1.1") + 1);

//		���ڿ��� char�� ����
		char cc = "c".charAt(0); // ���ڿ��� 0���� char��
		System.out.println(cc + 1); // char + int = int
		System.out.println((char) (cc + 1)); // char 100�� 'd'

//		�ֹι�ȣ ���ڸ��� ����
		String j = "940909";
		String gender = "1";

		String year = j.substring(0, 2);
		int year2 = Integer.parseInt(year);
		if (gender.equals("1") || gender.equals("2")) {
			year2 = year2 + 1900;
		} else if (gender.equals("3") || gender.equals("4")) {
			year2 = year2 + 2000;
		}
//		gender�� 1, 2�� 1900, 3, 4�� 2000
//		���س⵵-���ѳ⵵+1
		int age = Calendar.getInstance().get(Calendar.YEAR) - year2 + 1;
		System.out.println("���� : " + age);
	}

}
