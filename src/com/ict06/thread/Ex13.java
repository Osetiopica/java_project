package com.ict06.thread;

//	임계영역 : 멀티스레드에서 공통으로 사용되는 영역
//	 ㄴ현재 실행 중인 스레드가 다른 스레드에게 제어권을 빼앗기는 문제가 발생
//	 ㄴ이를 해결하기 위한 방법이 동기화 처리
//	동기화 처리 : 임계영역에 synchronized 예약어를 사용하면 됨
//	 ㄴ그러면 현재 실행 중인 스레드가 끝날 때까지 다른 스레드가 임계영역에 접근해서 제어권을 뺏을 수 없음
public class Ex13 implements Runnable {
	@Override
	public synchronized void run() {
		int x = 0;
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName() + " : " + (++x));
		}
	}

}
