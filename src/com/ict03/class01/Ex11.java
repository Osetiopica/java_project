package com.ict03.class01;

public class Ex11 {
//	생성자 : 클래스를 객체로 만들 때 자동으로 한 번 호출
//	목적 : 멤버 필드의 초기화
//	특징 : 클래스와 이름이 같음, 클래스이름(매개변수), 반환형이 없음, 없으면 자동으로 기본생성자 생성
//	기본 생성자 : 매개변수가 없는 생성자, 클래스이름()
//	생성자도 오버로딩 가능(하나의 클래스에 여러 생성자 존재 가능)
//	클래스 안에서 생성자를 만들었으면 만들어진 생성자를 사용해야 함

	private String name = "둘리";
	private int age = 24;
	private boolean gender = true;

	public Ex11() {
		System.out.println("기본 생성자");
		name = "태권브이";
		age = 43;
	}

	public Ex11(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public Ex11(int age, String name) {
		this.name = name;
		this.age = age;
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

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

}
