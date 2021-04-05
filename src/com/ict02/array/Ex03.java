package com.ict02.array;

import java.util.Arrays;
import java.util.Collections;

public class Ex03 {

	public static void main(String[] args) {
		int[] a = { 5, 2, 4, 6, 1, 7, 8, 9, 0, 3, 10 };
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] < a[j]) { // �������� ����
					int t = a[i];
					a[i] = a[j];
					a[j] = t;
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		Arrays.sort(a); // �������� ����
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		Integer[] a2 = { 5, 2, 4, 6, 1, 7, 8, 9, 0, 3, 10 };
		Arrays.sort(a2, Collections.reverseOrder()); // �������� ����
		for (int i = 0; i < a2.length; i++) {
			System.out.print(a2[i] + " ");
		}
	}

}
