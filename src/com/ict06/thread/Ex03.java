package com.ict06.thread;

//	thread는 start() -> run() 이동해야 스레드 처리가 됨
//	start() -> start() 스레드 아님
//	run() -> run() 스레드 아님

//	thread 실행은 Thread 클래스를 상속, Runnable 인터페이스 상속
// 	thread 클래스는 start(), run() 모두 가짐
//	Runnable 인터페이스는 run() 메소드만 가짐

public class Ex03 extends Thread {

	public void go() {
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + ":" + i);
		}
	}

//	@Override
//	public void start() {
//		for (int i = 0; i < 4; i++) {
//			System.out.println(Thread.currentThread().getName() + ":" + i);
//		}
//	}

	@Override
	public void run() {
		for (int i = 4; i < 8; i++) {
			System.out.println(Thread.currentThread().getName() + ":" + i);
		}
	}

}