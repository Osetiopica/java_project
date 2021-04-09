package com.ict07.io;

import java.io.Serializable;

//	객체 직렬화나 역직렬화를 하기 위해 Serializable이나 Exrernalizable을 상송 받아야 함
//	Serializable을 상속 받으면 해당 클래스를 객체로 만들 때 갖고 있는 모든 멤버가 직렬화 대상
//	변수 앞에 transient 예약어를 쓰면 직렬화 대상에서 제외
//	에외된 변수의 데이터는 기본 값을 가짐(int->0, double->0.0 boolean->false)

public class Ex24_vo implements Serializable {
	private String name;
	private int age;
	private double weight;
	private boolean gender;

	public Ex24_vo() {
	}

	public Ex24_vo(String name, int age, double weight, boolean gender) {
		super();
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.gender = gender;
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

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

}
