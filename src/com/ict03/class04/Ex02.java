package com.ict03.class04;

//	일반적인 클래스가 추상클래스를 상속하면 
//	반드시 추상클래스의 추상메소드를 오버라이딩 해야 된다.
public class Ex02 extends Ex01 {
	@Override
	public void sound() {

	}
}

//	자식 클래스를 추상 클래스로 만들면 오버라이딩 안 해도 됨
//	부모의 추상 메소드를 구체화 하지 않음
abstract class Ex03 extends Ex01 {
	public void song() {
		System.out.println("노래");
	}
}

//	자식 클래스를 추상 클래스로 만들면 오버라이딩 안 해도 됨
//	부모의 추상 메소드를 구체화 하지 않음
//  추상 메소드를 추가함
abstract class Ex04 extends Ex01 {
	public void music() {
		System.out.println("음악");
	}

	public abstract void pop();
}