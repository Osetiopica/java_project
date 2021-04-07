package com.ict06.thread;

public class Ex11 implements Runnable {

	@Override
	public void run() {
		while (true) {
			System.out.println(Thread.currentThread().getName() + " : 111");
		}
	}

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
	}

}