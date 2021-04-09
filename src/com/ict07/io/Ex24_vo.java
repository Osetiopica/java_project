package com.ict07.io;

import java.io.Serializable;

//	��ü ����ȭ�� ������ȭ�� �ϱ� ���� Serializable�̳� Exrernalizable�� ��� �޾ƾ� ��
//	Serializable�� ��� ������ �ش� Ŭ������ ��ü�� ���� �� ���� �ִ� ��� ����� ����ȭ ���
//	���� �տ� transient ���� ���� ����ȭ ��󿡼� ����
//	���ܵ� ������ �����ʹ� �⺻ ���� ����(int->0, double->0.0 boolean->false)

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
