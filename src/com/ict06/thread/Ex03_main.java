package com.ict06.thread;

public class Ex03_main extends Thread {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		Ex03 e = new Ex03();
		e.go();
		System.out.println("����");
		System.out.println("----");
		
		
//		thread ó�� ���� start() �����ϸ� run()���� ���� ������
//		�켱 ������ ���� start()�� �־ start()�� ��(������ ó�� �ƴ�)
//		Ex03�� start()�� �ּ� ó���ϸ� start() -> run()���� ���� ��
//		�̰��� ������ ó���ߴٰ� ��
		System.out.println(Thread.currentThread().getName());
		e.start();
		System.out.println("����");
		System.out.println("----");
	}

}