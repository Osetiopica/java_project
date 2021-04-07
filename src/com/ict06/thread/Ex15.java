package com.ict06.thread;

//	2개의 스레드를 생성하여 첫 번째 스레드는 1~100 출력
//	두 번째 스레드는 101~200까지 출력(synchronized 사용)
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
