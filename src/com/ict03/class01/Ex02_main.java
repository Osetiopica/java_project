package com.ict03.class01;

public class Ex02_main {

	public static void main(String[] args) {
//		Ex02 클래스를 사용하기 위해서 클래스를 객체로 만들자
//		Ex02 클래스는 생성자가 없으므로 기본 생성자로 객체를 생성
//		기본 생성자란 매개변수가 없는 생성자 클래스이름()
//		클래스 참조변수 = new 생성자;
		
		Ex02.z2(); // static만 인스턴스 없이 호출 가능
		double e = Ex02.z4(1);
		System.out.println(e);

		Ex02 ex = new Ex02();
		ex.z1();
		System.out.println();
		System.out.print(ex.a1);
		System.out.print(ex.a2);
		System.out.print(ex.A3);
		System.out.print(ex.A4);
	}

}
