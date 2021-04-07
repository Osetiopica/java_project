package com.ict06.thread;

public class Ex12 implements Runnable {

	@Override
	public void run() {
		System.out.println("run ½ÃÀÛ");
		for (int i = 0; i <= 5; i++) {
			System.out.println(Thread.currentThread().getName() + " : " + i);
		}
		System.out.println("run ³¡");
	}

}
