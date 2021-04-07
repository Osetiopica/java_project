package com.ict06.thread;

public class Ex16_main extends Thread {

	public static void main(String[] args) {

		Ex16 e1 = new Ex16();

		new Thread(e1, "1").start();
		new Thread(e1, "2").start();

	}

}