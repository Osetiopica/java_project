package com.ict03.class03;

public class Ex15 extends Ex14 {
	String name = "ȫ����";
	int id = 2410;

	public Ex15() {
		super("������", 15); // ���� ����
		System.out.println("�ڽ�Ŭ���� ������ : " + this);
		name = "ȫ�β�";
		id = 1004;
	}

	public Ex15(String name) {
		super("�±Ǻ���", 37); // ���� ����
		this.name = name;
	}

	public void prn() {
		String name = "ȫ��";
//		����, ����, �θ� ���� �̸��� ���� �������� �ݵ�� ���� �ʿ�
		System.out.println("���� ���� �̸� : " + name);
		System.out.println("���� ���� �̸� : " + this.name);
		System.out.println("�θ� ���� �̸� : " + super.name);
		System.out.println();
		
//		�θ� ���� ������ �������� �ʾƵ� ��
		System.out.println("���� ���� ���� : " + age);
		System.out.println("���� ���� ���� : " + this.age);
		System.out.println("�θ� ���� ���� : " + super.age);
		System.out.println();
		
//		���� ������ ���� ����
		System.out.println("���� ���� id : " + id);
		System.out.println("���� ���� id : " + this.id);
//		System.out.println("�θ� ���� id : " + super.id);
		System.out.println();
		
	}
}
