package com.ict06.thread;

public class Ex09_main extends Thread {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		Ex07 e1 = new Ex07();
		Ex08 e2 = new Ex08();
		Ex09 e3 = new Ex09();

//		Ex07, Ex08, Ex09는 Runnable을 상속받아 start()가 없음
//		e1.start();

//		run() 메소드를 가진 클래스를 타겟으로 지정해야 함
//		Thread t1 = new Thread();

		Thread t1 = new Thread(e1);
		t1.start();
		new Thread(e2).start();
		Thread t3 = new Thread(e3);
		t3.start();

//		안드로이드에서 많이 쓰는 방법(익명 내부 클래스)
		new Thread(new Runnable() {

			@Override
			public void run() {
				while (true) {
					System.out.println(Thread.currentThread().getName() + " : ㅁㅁ");
				}
			}
		}).start();
	}

}