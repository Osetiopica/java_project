package com.ict03.class01;

public class Ex13 {

	private String name = "����";
	private int age = 3;
	private String adr = "����";

//	������
	public Ex13() {
//		this : ��ü ���ο��� �ڽ��� ��Ī�ϴ� �����
//		this.���� : ���� ����
		this("������", 21, "����");
		System.out.println("�⺻ ������ : " + this);
		System.out.println("�⺻ �̸� : " + this.name);
//		this() : �����ڰ� �����ڸ� ȣ���� �� ����ϴ� �����
//		�ݵ�� ù �ٿ��� ��� ����
	}

//	�޴����� ������ ����
	public Ex13(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Ex13(int age, String name) {
		this(name,age,"����");
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
