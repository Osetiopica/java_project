package com.ict06.thread;

public class Ex03_main extends Thread {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		Ex03 e = new Ex03();
		e.go();
		System.out.println("ㅅㄱ");
		System.out.println("----");
		
		
//		thread 처리 위해 start() 실행하면 run()으로 가야 되지만
//		우선 순위가 높은 start()가 있어서 start()로 감(스레드 처리 아님)
//		Ex03의 start()를 주석 처리하면 start() -> run()으로 가게 됨
//		이것을 스레드 처리했다고 함
		System.out.println(Thread.currentThread().getName());
		e.start();
		System.out.println("ㅅㄱ");
		System.out.println("----");
	}

}