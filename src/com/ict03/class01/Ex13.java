package com.ict03.class01;

public class Ex13 {

	private String name = "희동이";
	private int age = 3;
	private String adr = "서울";

//	생성자
	public Ex13() {
//		this : 개체 내부에서 자신을 지칭하는 예약어
//		this.변수 : 전역 변수
		this("공실이", 21, "남극");
		System.out.println("기본 생성자 : " + this);
		System.out.println("기본 이름 : " + this.name);
//		this() : 생성자가 생성자를 호출할 때 사용하는 예약어
//		반드시 첫 줄에만 사용 가능
	}

//	메뉴에서 생성자 생성
	public Ex13(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Ex13(int age, String name) {
		this(name,age,"남극");
	}

	public Ex13(String name, int age, String adr) {
		this.name = name;
		this.age = age;
		this.adr = adr;
		System.out.println(4);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAdr() {
		return adr;
	}

	public void setAdr(String adr) {
		this.adr = adr;
	}

}
