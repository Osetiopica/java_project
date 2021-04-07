package com.ict06.thread;

public class Ex12_main extends Thread {

	public static void main(String[] args) {
		System.out.println("main 시작");

		Ex12 e1 = new Ex12();

		Thread t1 = new Thread(e1);
		t1.start();
//		join() : 현재 스레드는 join()을 호출한 스레드가 끝날 때까지
//		대기 상태에 빠져 있다가 join()을 호출한 스레드가 끝나면 다시 실행함
//		join()을 실행한 스레드가 끝날 때까지 실행할 수 없다는 뜻
		try {
			t1.join();
			for (int i = 0; i <= 5; i++) {
				System.out.println(Thread.currentThread().getName() + " : " + i);
			}
			System.out.println("main 끝");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}