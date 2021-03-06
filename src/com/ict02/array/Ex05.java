package com.ict02.array;

import java.util.Arrays;
import java.util.Collections;

public class Ex05 {

	public static void main(String[] args) {
		String[] name = { "ȫ", "??", "??", "??", "??" };
		int[] kor = { 80, 90, 80, 70, 100 };
		int[] eng = { 80, 95, 85, 75, 100 };
		int[] math = { 100, 100, 80, 100, 100 };
		int[] rank = { 1, 1, 1, 1, 1 };

		int[] sum = new int[5];
		double[] avr = new double[5];
		String[] hak = new String[5];

		for (int i = 0; i < hak.length; i++) {
			sum[i] = kor[i] + eng[i] + math[i];
			avr[i] = (int) (sum[i] / 3.0 * 10) / 10.0;
			if (avr[i] >= 90) {
				hak[i] = "A";
			}
			else if (avr[i] >= 80) {
				hak[i] = "B";
			}
			else if (avr[i] >= 70) {
				hak[i] = "C";
			} else {
				hak[i] = "F";
			}
		}

		for (int i = 0; i < sum.length; i++) {
			for (int j = 0; j < sum.length; j++) {
				if (sum[i] < sum[j]) {
					rank[i]++;
				}
			}
		}

		System.out.println("??  ??\t??  ??\t??  ??\t??  ??\t??  ??");
		for (int i = 0; i < hak.length; i++) {
			System.out.print(name[i] + "\t");
			System.out.print(sum[i] + "\t");
			System.out.print(avr[i] + "\t");
			System.out.print(hak[i] + "\t");
			System.out.println(rank[i]);
		}
	}

}
