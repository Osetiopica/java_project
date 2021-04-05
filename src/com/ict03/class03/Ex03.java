package com.ict03.class03;

public class Ex03 extends Ex02 {

	String name = "차두리";
	int age = 34;
	static String hobby = "영화보기";

	public Ex03() {
		System.out.println("자식 생성자" + this);
	}

	public void sound() {
		System.out.println("자식 메소드");
	}

//	객체 생성없이 부모 클래스의 멤버 사용
	public void study() {
		System.out.println("공부 장소 : " + addr);
		System.out.println("name : " + this.name);
		System.out.println("name : " + super.name);

//		상속 관계라도 private은 사용 불가
//		System.out.println("우리집 동물 : " + dog);
	}

	@Override
	public void eat() {
		System.out.println("아침 생략");
	}

//	오버라이딩을 막는 예약어 : final
	
}
