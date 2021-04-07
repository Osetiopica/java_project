package com.ict06.thread;

public class Ex04 extends Thread {

	@Override
	public void run() {
		while (true) {
			System.out.println(currentThread().getName() + ":a");
		}
	}

}