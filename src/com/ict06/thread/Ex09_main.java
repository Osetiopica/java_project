package com.ict06.thread;

public class Ex09_main extends Thread {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		Ex07 e1 = new Ex07();
		Ex08 e2 = new Ex08();
		Ex09 e3 = new Ex09();

//		Ex07, Ex08, Ex09�� Runnable�� ��ӹ޾� start()�� ����
//		e1.start();

//		run() �޼ҵ带 ���� Ŭ������ Ÿ������ �����ؾ� ��
//		Thread t1 = new Thread();

		Thread t1 = new Thread(e1);
		t1.start();
		new Thread(e2).start();
		Thread t3 = new Thread(e3);
		t3.start();

//		�ȵ���̵忡�� ���� ���� ���(�͸� ���� Ŭ����)
		new Thread(new Runnable() {

			@Override
			public void run() {
				while (true) {
					System.out.println(Thread.currentThread().getName() + " : ����");
				}
			}
		}).start();
	}

}