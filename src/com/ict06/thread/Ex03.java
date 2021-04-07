package com.ict06.thread;

//	thread�� start() -> run() �̵��ؾ� ������ ó���� ��
//	start() -> start() ������ �ƴ�
//	run() -> run() ������ �ƴ�

//	thread ������ Thread Ŭ������ ���, Runnable �������̽� ���
// 	thread Ŭ������ start(), run() ��� ����
//	Runnable �������̽��� run() �޼ҵ常 ����

public class Ex03 extends Thread {

	public void go() {
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + ":" + i);
		}
	}

//	@Override
//	public void start() {
//		for (int i = 0; i < 4; i++) {
//			System.out.println(Thread.currentThread().getName() + ":" + i);
//		}
//	}

	@Override
	public void run() {
		for (int i = 4; i < 8; i++) {
			System.out.println(Thread.currentThread().getName() + ":" + i);
		}
	}

}