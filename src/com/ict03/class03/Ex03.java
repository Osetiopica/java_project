package com.ict03.class03;

public class Ex03 extends Ex02 {

	String name = "���θ�";
	int age = 34;
	static String hobby = "��ȭ����";

	public Ex03() {
		System.out.println("�ڽ� ������" + this);
	}

	public void sound() {
		System.out.println("�ڽ� �޼ҵ�");
	}

//	��ü �������� �θ� Ŭ������ ��� ���
	public void study() {
		System.out.println("���� ��� : " + addr);
		System.out.println("name : " + this.name);
		System.out.println("name : " + super.name);

//		��� ����� private�� ��� �Ұ�
//		System.out.println("�츮�� ���� : " + dog);
	}

	@Override
	public void eat() {
		System.out.println("��ħ ����");
	}

//	�������̵��� ���� ����� : final
	
}
