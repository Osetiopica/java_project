package com.ict03.class01;

import java.util.Scanner;

public class Ex13_main {

	public static void main(String[] args) {
		Ex13 x = new Ex13();
		System.out.println(x);
		System.out.println(x.getName());
		System.out.println(x.getAge());
		System.out.println(x.getAdr());
		System.out.println();
		Ex13 x2 = new Ex13(5, "¸¶ÀÌÄÝ");
		System.out.println(x2.getName());
		System.out.println(x2.getAge());
		System.out.println(x2.getAdr());
		System.out.println();
	}

}
