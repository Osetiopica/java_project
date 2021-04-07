package com.ict06.thread;

//	2���� �����带 �����Ͽ� ù ��° ������� 1~50 ���
//	�� ��° ������� 51~100���� ���
//	�ٽ� ù ��° �����尡 101~150 ���
//	�ٽ� �� ��° �����尡 151~200 ���(synchronized, wait, notify ���)
public class Ex16 implements Runnable {
	int x = 0;

	@Override
	public synchronized void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() + " : " + (++x));
			if (x == 50 || x == 100) {
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
