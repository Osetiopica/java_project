package com.ict06.thread;

//	wait() : ����ȭ ó�� �� ���� ���� �����带 ������ ��� ���·� ���� ��Ű�� �޼ҵ�
//	 ��wait()�� �����带 Ǯ������ ������ �״�� ��� ���¿��� ���α׷��� ����
//	 ��Ǯ���ִ� �޼ҵ�� notify()(�ϳ��� ����), notifyAll()(��� ����)�� ����
public class Ex14 implements Runnable {
	int x = 0;

	@Override
	public synchronized void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName() + " : " + (++x));
			if (x == 3) {
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
