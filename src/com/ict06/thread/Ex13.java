package com.ict06.thread;

//	�Ӱ迵�� : ��Ƽ�����忡�� �������� ���Ǵ� ����
//	 ������ ���� ���� �����尡 �ٸ� �����忡�� ������� ���ѱ�� ������ �߻�
//	 ���̸� �ذ��ϱ� ���� ����� ����ȭ ó��
//	����ȭ ó�� : �Ӱ迵���� synchronized ���� ����ϸ� ��
//	 ���׷��� ���� ���� ���� �����尡 ���� ������ �ٸ� �����尡 �Ӱ迵���� �����ؼ� ������� ���� �� ����
public class Ex13 implements Runnable {
	@Override
	public synchronized void run() {
		int x = 0;
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName() + " : " + (++x));
		}
	}

}
