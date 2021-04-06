package com.ict05.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

public class Ex06 {
//	List �������̽��� ������ Ŭ������ : Stack, ArrayList, Vector
//	ArrayList, Vector : �迭�� ����� �������� ����, �߰�, ������ ����
//	 ��ũ�⸦ �̸� ������ �ʾƵ� ��, ArrayList(����ȭ ������), Vector(����ȭ ����=��������)
//	set ������ ������ ����, �ߺ� �Ұ�
//	list ������ ������ �ְ�, �ߺ� ����
	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
//		�߰�(add)
		list.add("����ȣ");
		list.add("������");
		list.add("�����");
		System.out.println(list);

//		����(add)
		list.add(1, "�߽ż�");
		System.out.println(list);

		Vector<String> vector = new Vector<String>();
		vector.add("�Ѹ�");
		vector.add("�����");
		vector.add("��ġ");
		System.out.println(vector);

//		����(add)
		vector.add(2, "����");
		System.out.println(vector);

		if (list.contains("�����")) {
			System.out.println(list.indexOf("�����") + "�� ��");
			System.out.println(list.get(3));
			System.out.println(list.get(list.indexOf("�����")));
		} else {
			System.out.println("��");
		}
		System.out.println(list.size());

//		ġȯ(set)
		list.set(3, "�̴�ȣ");
		System.out.println(list);

//		�߽ż��� ������ �߽ż��� ���������� ġȯ
		if (list.contains("�߽ż�")) {
			list.set(list.indexOf("�߽ż�"), "������");
		}
		System.out.println(list);
		for (String s : list) {
			System.out.print(s + " ");
		}
		System.out.println();
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			String s = (String) it.next();
			System.out.print(s + " ");
		}

	}

}