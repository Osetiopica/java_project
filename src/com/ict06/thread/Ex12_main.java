package com.ict06.thread;

public class Ex12_main extends Thread {

	public static void main(String[] args) {
		System.out.println("main ����");

		Ex12 e1 = new Ex12();

		Thread t1 = new Thread(e1);
		t1.start();
//		join() : ���� ������� join()�� ȣ���� �����尡 ���� ������
//		��� ���¿� ���� �ִٰ� join()�� ȣ���� �����尡 ������ �ٽ� ������
//		join()�� ������ �����尡 ���� ������ ������ �� ���ٴ� ��
		try {
			t1.join();
			for (int i = 0; i <= 5; i++) {
				System.out.println(Thread.currentThread().getName() + " : " + i);
			}
			System.out.println("main ��");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}