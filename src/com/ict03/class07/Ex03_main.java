package com.ict03.class07;

public class Ex03_main {
	public static void main(String[] args) {
//		별도로 객체 생성 불가
//		Inner02 t1 = new Inner02();

//		Member 내부 클래스처럼 객체 생성 불가
//		Ex03 t1 = new Ex03();
//		Ex03.Inner02 t2 = t1.new Inner02();

//		외부 클래스를 객체 생성
//		내부 클래스 주소 앞에는 '$'가 붙음
		Ex03 t1 = new Ex03();
		
//		내부 클래스를 갖고 있는 메소드를 실행해야 내부 클래스 만들 조건이 성립
//		내부 클래스의 끝과 내부 클래스를 가진 메소드의 끝 사이에서 객체를 생성과 실행해야 함
		t1.play();
	}
}
