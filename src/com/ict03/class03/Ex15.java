package com.ict03.class03;

public class Ex15 extends Ex14 {
	String name = "홍일점";
	int id = 2410;

	public Ex15() {
		super("일지매", 15); // 숨어 있음
		System.out.println("자식클래스 생성자 : " + this);
		name = "홍두께";
		id = 1004;
	}

	public Ex15(String name) {
		super("태권브이", 37); // 숨어 있음
		this.name = name;
	}

	public void prn() {
		String name = "홍시";
//		지역, 전역, 부모에 같은 이름을 가진 변수들은 반드시 구분 필요
		System.out.println("지역 변수 이름 : " + name);
		System.out.println("전역 변수 이름 : " + this.name);
		System.out.println("부모 변수 이름 : " + super.name);
		System.out.println();
		
//		부모만 가진 변수는 구분하지 않아도 됨
		System.out.println("지역 변수 나이 : " + age);
		System.out.println("전역 변수 나이 : " + this.age);
		System.out.println("부모 변수 나이 : " + super.age);
		System.out.println();
		
//		전역 변수만 가진 변수
		System.out.println("지역 변수 id : " + id);
		System.out.println("전역 변수 id : " + this.id);
//		System.out.println("부모 변수 id : " + super.id);
		System.out.println();
		
	}
}
