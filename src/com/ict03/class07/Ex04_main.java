package com.ict03.class07;

import com.ict03.class07.Ex04.Inner03;

public class Ex04_main {
	public static void main(String[] args) {
//		static 내부 클래스는 객체 생성 가능, static은 그냥 호출 가능
		System.out.println(Inner03.i3);
		System.out.println(Inner03.i4);
		
//		static 내부 클래스 중에 static이 없는 멤버는 객체 생성 후 사용(외부 클래스 미사용)
		Inner03 in03 = new Inner03();
		System.out.println(in03.i2);
		System.out.println(in03.name);
		in03.play();
	}
}
