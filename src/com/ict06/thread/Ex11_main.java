package com.ict06.thread;

//	���� ������ : �Ϲ� �������� �۾��� ���� �������� ������ �����ϴ� ������
//	�Ϲ� �����尡 ����Ǹ� ���� ������� ���������� �����

public class Ex11_main extends Thread {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName() + " : ����");
		Ex10 e1 = new Ex10();
		Ex11 e2 = new Ex11();

		Thread t1 = new Thread(e1);
		t1.setDaemon(true);
		t1.start();

		Thread t2 = new Thread(e2);
		t2.setDaemon(true);
		t2.start();

		for (int i = 1; i <= 50; i++) {
			System.out.println(Thread.currentThread().getName() + " : " + i);
		}
		System.out.println(Thread.currentThread().getName() + " : ��");
	}

}