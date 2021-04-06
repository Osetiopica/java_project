package com.ict05.collection;

import java.util.HashSet;
import java.util.Iterator;

public class Ex03_main {

	public static void main(String[] args) {
		Ex03 coffee = new Ex03();
//		setter�� �̿��ؼ� �̸��� ���� ����
		coffee.setName("Ŀ������");
		coffee.setPrice(2500);

//		�����ڸ� �̿��ؼ� �̸��� ���� ����
		Ex03 cola = new Ex03("�ݶ�", 1600);
		Ex03 juice = new Ex03("��������", 2300);

//		��ü���� �����ϰ� �����ϴ� ��� : �迭, �÷���
//		1> �迭
		Ex03[] arr = new Ex03[3];
		arr[0] = coffee;
		arr[1] = cola;
		arr[2] = juice;

//		�̸��� ���� ������
		for (Ex03 e : arr) {
			System.out.print("�̸� : " + e.getName() + "\t");
			System.out.println("���� : " + e.getPrice());
		}

		System.out.println("----");

//		2> �÷���
		HashSet<Ex03> h1 = new HashSet<Ex03>();
//		�߰�
		h1.add(coffee);
		h1.add(cola);
		h1.add(juice);
//		�� �߰��� �� ����
		h1.add(new Ex03("ion", 1500));

//		�̸�, ���� ������
//		1> foreach
		for (Ex03 e : h1) {
			System.out.print("�̸� : " + e.getName() + "\t");
			System.out.println("���� : " + e.getPrice());
		}
		System.out.println("----");
//		2> iterator()
		Iterator<Ex03> it = h1.iterator();
		while (it.hasNext()) {
			Ex03 e1 = (Ex03) it.next();
			System.out.print("�̸� : " + e1.getName() + "\t");
			System.out.println("���� : " + e1.getPrice());
		}

//		���Կ��� : contains
		if (h1.contains(coffee)) {
			System.out.println("��");
		} else {
			System.out.println("��");
		}

//		���� : size
		System.out.println(h1.size());

//		���� : remove(Object o), clear()
//		�÷��� �ȿ� �ش� ��ü�� ������ ����
		if (h1.contains(cola)) {
			h1.remove(cola);
			System.out.println(cola.getName() + " ����");
		} else {
			System.out.println("��");
		}

//		����� Ȯ�� : isEmpty()
		if (h1.isEmpty()) {
			System.out.println("��");
		} else {
			System.out.println("�� ��");
		}
		
//		��ü ����
		h1.clear();
		if (h1.isEmpty()) {
			System.out.println("��");
		} else {
			System.out.println("�� ��");
		}
	}
}