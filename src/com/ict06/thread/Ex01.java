package com.ict06.thread;

public class Ex01 {

	public static void main(String[] args) {
//		Thread ������
//		 ��Thread() : �⺻ ������
//		 ��Thread(Runnable target) : Runnable �������̽��� ���ڷ� �޾Ƽ� ó��
//		  �����͸� ���� Ŭ������ ����� �� ����
//		 ��Thread(Runnable target, String name) : 
//		  ����Runnable �������̽��� ���ڷ� �޾Ƽ� ó��, name�� thread �̸� ����
//		 ��Thread(String name) : name�� thread �̸� ����

//		�ֿ� �޼ҵ�
//		join() : ���� ������� join()�޼ҵ带 ȣ���� �����尡 ���� ������ 
//		 ����� ���·� �����ִٰ� ������ �ٽ� ������ �� ����
//		 ��join()�� ȣ���� �����尡 ���� ������ ������ �� ����
//		start() : �����ϸ� run()�޼ҵ带 ȣ��, ���� start()�޼ҵ尡 ������ start()�� ��
//		run() : start()�� ȣ���ؼ� run()�� ����Ǹ� �̶� thread ó���� �ߴٰ� ��
//		sleep(long millis) : 1ms ������ ��� ���·� ������ ��
//		yield() : ���� ���� thread �� �켱 ������ ���� thread���� ������� �ѱ�
//		getName() : thread �̸� ���ϱ�
//		setName(String name) : thread �̸� ����
//		currentThread() : ���� ����Ǵ� thread ��ü�� return -> (static)

//		�տ��� ���� �͵��� ���� �����尡 ȥ�� ó���� -> �̱� ������

//		JVM�� main �޼ҵ带 ȣ���ϸ� ������ main �����尡 ��ó���� �Ѵ�.
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