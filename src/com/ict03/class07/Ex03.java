package com.ict03.class07;

//Member ���� Ŭ����
public class Ex03 {
	String name = "�Ѹ�";
	int height = 160;

	public Ex03() {
		System.out.println("�ܺ� Ŭ���� ������ : " + this);
	}

	public void sound() {
		String addr = "����";
		System.out.println("ȣ��");
	}

	public void play() {
		int age = 24;
		int money = 3000;
		class Inner02 {
			String name = "����";
			int time = 36;

			public Inner02() {
				System.out.println("���� : " + this);
			}

			public void hobby() {
				System.out.println(name);
				System.out.println(height);
				System.out.println(age);
				System.out.println(time);
			} // ���� �޼ҵ� ��
		} // ���� Ŭ���� ��
		Inner02 in02 = new Inner02();
//		�ܺ� ���
		System.out.println(name);
//		�ܺ� �޼ҵ�
		sound();
		in02.hobby();
	} // �ܺ� �޼ҵ� ��
} // �ܺ� Ŭ���� ��
