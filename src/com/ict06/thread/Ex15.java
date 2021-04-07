package com.ict06.thread;

//	2���� �����带 �����Ͽ� ù ��° ������� 1~100 ���
//	�� ��° ������� 101~200���� ���(synchronized ���)
public class Ex15 implements Runnable {
	int x = 0;

	@Override
	public synchronized void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() + " : " + (++x));
			if (x == 100) {
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			} else {
				notify();
			}
		}
	}

}
