package com.ict06.thread;

public class Ex05 extends Thread {

	@Override
	public void run() {
		while (true) {
			System.out.println(currentThread().getName() + ":1");
		}
	}

}