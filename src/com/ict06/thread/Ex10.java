package com.ict06.thread;

public class Ex10 implements Runnable {

	@Override
	public void run() {
		while (true) {
			System.out.println(Thread.currentThread().getName() + " : aaa");
		}
	}

}