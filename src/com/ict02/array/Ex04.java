package com.ict02.array;

import java.util.Arrays;
import java.util.Collections;

public class Ex04 {

	public static void main(String[] args) {
		// ���� ���ϱ�, ��� ����� 1������ �ʱ�ȭ, ��� ����� ���ؾ� ��
		// �ڽ��� ���� �ʿ����, i���� j�� ũ�� ���� ����
		int[] s = { 270, 265, 285, 290, 285 };
		int[] r = { 1, 1, 1, 1, 1 };

		for (int i = 0; i < s.length; i++) {
			for (int j = 0; j < s.length; j++) {
				if (s[i] == s[j]) {
					continue;
				}
				if (s[i] < s[j]) {
					r[i]++;
				}
			}
		}
		for (int i = 0; i < r.length; i++) {
			System.out.println(r[i]);
		}
	}

}
