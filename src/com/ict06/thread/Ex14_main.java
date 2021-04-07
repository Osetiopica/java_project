package com.ict06.thread;

public class Ex14_main extends Thread {

	public static void main(String[] args) {

		Ex14 e1 = new Ex14();

		new Thread(e1,"dog").start();
		new Thread(e1,"cat").start();
		new Thread(e1,"tiger").start();
		
	}

}