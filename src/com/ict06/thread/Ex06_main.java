package com.ict06.thread;

public class Ex06_main extends Thread {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		Ex04 e1 = new Ex04();
		Ex05 e2 = new Ex05();
		Ex06 e3 = new Ex06();

//		병렬 스레드 처리의 증거
		e1.start();
		e2.start();
		e3.start();
	}

}