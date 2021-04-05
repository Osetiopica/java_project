package com.ict02.array;

public class Ex01 {

	public static void main(String[] args) {
		int[] s;
		s = new int[5];
		s[0] = 1;
		s[1] = 2;
		s[2] = 3;
		s[3] = 4;
		s[4] = 5;

		for (int i = 0; i < s.length; i++) {
			System.out.printf(s[i] + " ");
		}
	}

}
