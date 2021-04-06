package com.ict06.thread;

public class Ex01 {

	public static void main(String[] args) {
//		Thread 생성자
//		 ㄴThread() : 기본 생성자
//		 ㄴThread(Runnable target) : Runnable 인터페이스를 인자로 받아서 처리
//		  ㄴㄴ익명 내부 클래스를 사용할 수 있음
//		 ㄴThread(Runnable target, String name) : 
//		  ㄴㄴRunnable 인터페이스를 인자로 받아서 처리, name에 thread 이름 지정
//		 ㄴThread(String name) : name에 thread 이름 지정

//		주요 메소드
//		join() : 현재 스레드는 join()메소드를 호출한 스레드가 끝날 때까지 
//		 ㄴ대기 상태로 빠져있다가 끝나면 다시 실행할 수 있음
//		 ㄴjoin()을 호출한 스레드가 끝날 때까지 실행할 수 없음
//		start() : 실행하면 run()메소드를 호출, 만약 start()메소드가 있으면 start()로 감
//		run() : start()가 호출해서 run()이 실행되면 이때 thread 처리를 했다고 함
//		sleep(long millis) : 1ms 단위로 대기 상태로 빠지게 함
//		yield() : 수행 중인 thread 중 우선 순위가 같은 thread에게 제어권을 넘김
//		getName() : thread 이름 구하기
//		setName(String name) : thread 이름 설정
//		currentThread() : 현재 수행되는 thread 객체를 return -> (static)

//		앞에서 만든 것들은 메인 스레드가 혼자 처리함 -> 싱글 스레드

//		JVM이 main 메소드를 호출하면 무조건 main 스레드가 일처리를 한다.
		System.out.println(Thread.currentThread().getName());

		Ex02 t = new Ex02();
		System.out.println("1" + Thread.currentThread().getName());
		t.add(1, 2);
		System.out.println("4" + Thread.currentThread().getName());
		int a = t.sub(2, 1);
		System.out.println("7" + Thread.currentThread().getName());
		System.out.println(a);
	}

}