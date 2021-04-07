package com.ict06.thread;

//	wait() : 동기화 처리 시 실행 중인 스레드를 강제로 대기 상태로 변경 시키는 메소드
//	 ㄴwait()된 스레드를 풀어주지 않으면 그대로 대기 상태에서 프로그램이 종료
//	 ㄴ풀어주는 메소드는 notify()(하나만 깨움), notifyAll()(모두 깨움)이 있음
public class Ex14 implements Runnable {
	int x = 0;

	@Override
	public synchronized void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName() + " : " + (++x));
			if (x == 3) {
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			} else {
				notify();
			}
		}
	}

}
