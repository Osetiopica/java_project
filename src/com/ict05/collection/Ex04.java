package com.ict05.collection;

import java.util.HashSet;
import java.util.TreeSet;

public class Ex04 {

	public static void main(String[] args) {
//		로또 1~45, 랜덤, 중복 불가
		HashSet<Integer> lotto = new HashSet<Integer>();
		for (int i = 0; i < 6; i++) {
			int a = (int) (Math.random() * 45) + 1;
			boolean b = lotto.add(a);
			if (!b) {
				i--;
			}
		}
		System.out.println(lotto);
		
		TreeSet<Integer> lotto2 = new TreeSet<Integer>();
		for (int i = 0; i < 6; i++) {
			int a = (int) (Math.random() * 45) + 1;
			boolean b = lotto2.add(a);
			if (!b) {
				i--;
			}
		}
		System.out.println(lotto2);

	}

}