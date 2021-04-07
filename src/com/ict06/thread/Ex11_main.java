package com.ict06.thread;

//	데몬 스레드 : 일반 스레드의 작업을 돕는 보조적인 역할을 수행하는 스레드
//	일반 스레드가 종료되면 데몬 스레드는 강제적으로 종료됨

public class Ex11_main extends Thread {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName() + " : 시작");
		Ex10 e1 = new Ex10();
		Ex11 e2 = new Ex11();

		Thread t1 = new Thread(e1);
		t1.setDaemon(true);
		t1.start();

		Thread t2 = new Thread(e2);
		t2.setDaemon(true);
		t2.start();

		for (int i = 1; i <= 50; i++) {
			System.out.println(Thread.currentThread().getName() + " : " + i);
		}
		System.out.println(Thread.currentThread().getName() + " : 끝");
	}

}