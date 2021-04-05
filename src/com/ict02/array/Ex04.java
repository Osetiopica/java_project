package com.ict02.array;

import java.util.Arrays;
import java.util.Collections;

public class Ex04 {

	public static void main(String[] args) {
		// 순위 구하기, 모든 사람은 1등으로 초기화, 모든 사람과 비교해야 함
		// 자신은 비교할 필요없음, i보다 j가 크면 순위 증가
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
