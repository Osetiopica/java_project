package com.ict03.class02;

import java.util.Random;
import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int cnt = 0;
		int t_cnt = 0;
		int win = 0;
		esc: while (true) {
			int c = r.nextInt(3) + 1;
			System.out.print("1.°¡À§ 2.¹ÙÀ§ 3.º¸ -> ");
			int a = sc.nextInt();
			if (c == a) {
				System.out.println("ºñ±è");
				cnt--;
			} else if (c == 1 && a == 2) {
				System.out.println("½Â¸®");
				win++;
			} else if (c == 1 && a == 3) {
				System.out.println("ÆÐ¹è");
			} else if (c == 2 && a == 1) {
				System.out.println("ÆÐ¹è");
			} else if (c == 2 && a == 3) {
				System.out.println("½Â¸®");
				win++;
			} else if (c == 3 && a == 1) {
				System.out.println("½Â¸®");
				win++;
			} else if (c == 3 && a == 2) {
				System.out.println("ÆÐ¹è");
			} else {
				System.out.println("´Ù½Ã ÀÔ·Â");
			}
			cnt++;
			t_cnt++;
			System.out.printf("ÆÇ¼ö : %d, ½Â·ü: %.2f%%", t_cnt, (double) win / cnt * 100);
			System.out.println();
			System.out.println();
			while (true) {
				System.out.println("°è¼Ó ÇÒ±î¿ä?(y/n) -> ");
				String ans = sc.next();
				if (ans.equalsIgnoreCase("y")) {
					continue esc;
				} else if (ans.equalsIgnoreCase("n")) {
					break esc;
				} else {
					continue;
				}
			}
		}
		sc.close();
	}

}
