package com.ict02.array;

public class Ex02 {

	public static void main(String[] args) {
		char[] c = new char[4];
		c[0] = 'J';
		c[1] = 'A';
		c[2] = 'V';
		c[3] = 'A';

		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i] + " ");
		}

		String[] m = { "J", "A", "V", "A" };
		for (int i = 0; i < m.length; i++) {
			System.out.print(m[i] + " ");
		}
	}

}
