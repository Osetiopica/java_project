package com.ict03.class07;

public class Ex02_main {
	public static void main(String[] args) {
//		Member 내부 클래스는 별도로 객체 생성 못 함
//		Inner01 t1 = new Inner01();

//		외부 클래스를 통해서 내부 클래스 사용 가능
		Ex02 t1 = new Ex02();

//		외부를 통해서 내부 클래스 생성
//		내부 클래스 주소 앞에는 '$'가 붙음
		Ex02.Inner01 t2 = t1.new Inner01();
		System.out.println(t2.name);
		System.out.println(t2.i2);
		System.out.println(t2.i4);
		System.out.println();
		t2.play();
	}
}
