package com.ict06.thread;

public class Ex15_main extends Thread {

	public static void main(String[] args) {

		Ex15 e1 = new Ex15();

		new Thread(e1, "1").start();
		new Thread(e1, "2").start();

	}

}