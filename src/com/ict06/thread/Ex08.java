package com.ict06.thread;

//	Runnable �������̽��� run()�� ����
public class Ex08 implements Runnable {

	@Override
	public void run() {
		while (true) {
			System.out.println(Thread.currentThread().getName() + " : aa");
		}
	}

}