package com.ict06.thread;

public class Ex13_main extends Thread {

	public static void main(String[] args) {

		Ex13 e1 = new Ex13();

		new Thread(e1,"dog").start();
		new Thread(e1,"cat").start();
		new Thread(e1,"tiger").start();
		new Thread(e1,"lion").start();
		
	}

}