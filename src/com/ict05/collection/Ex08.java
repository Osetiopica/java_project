package com.ict05.collection;

import java.util.HashMap;
import java.util.Iterator;

public class Ex08 {

	public static void main(String[] args) {
//		Map �������̽� : key�� value�� �����ϴ� ����
//		 ��key�� �ߺ� �Ұ�(�ߺ��Ǹ� ���)
//		 ��key�� ȣ���ϸ� value�� ����
//		key�� set�÷��ǿ� ������ ���� -> keySet()
//		�ֿ� �޼ҵ�
//		add()�� �߰�, ���� �Ұ�
//		put(K key, V value)
//		key�� set���� ���� : keySet()
//		containsKey(Object key) : boolean
//		 �����ڷ� ���� key�� �����ϸ� true 
//		containsValue(Object value) : boolean
//		 �����ڷ� ���� value�� �����ϸ� true
//		get(Object key) : Ű�� �޾Ƽ� value�� return
//		remove(Object key) : Ű�� �޾Ƽ� ����
//		replace(K key, V value) : ġȯ

//		1> key�� �����ִ� ���ڷ� ����� for�� ��� ����
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(1, "�ѱ�");
		map1.put(2, "�̱�");
		map1.put(3, "�߱�");
		map1.put(4, "����");
		map1.put(5, "�±�");
		System.out.println(map1);

		map1.put(3, "�Ϻ�"); // key �ߺ�(�����)
		System.out.println(map1);

		map1.put(6, "�ѱ�"); // value �ߺ�(�������)
		System.out.println(map1);

//		�ϳ��� ����(get(key))
		System.out.print(map1.get(1) + " ");
		System.out.print(map1.get(2) + " ");
		System.out.print(map1.get(3) + " ");
		System.out.print(map1.get(4) + " ");
		System.out.print(map1.get(5) + " ");
		System.out.print(map1.get(6) + " ");
		System.out.println();

		for (int i = 1; i <= map1.size(); i++) {
			System.out.print(map1.get(i) + " ");
		}
		System.out.println();

//		foreach ����Ϸ��� keySet() �̿�
		for (int i : map1.keySet()) {
			System.out.print(map1.get(i) + " ");
		}
		System.out.println();

//		iterator ��� - keySet() �̿�
		Iterator<Integer> it = map1.keySet().iterator();
		while (it.hasNext()) {
			int s = (int) it.next();
			System.out.print(map1.get(s) + " ");
		}
		System.out.println();
		System.out.println("----");

//		2> key�� ���ڷ� ����� ��� �� keySet()�� ��� (�Ϲ���)
		HashMap<String, String> map2 = new HashMap<String, String>();
		map2.put("�̸�", "��浿");
		map2.put("����", "34");
		map2.put("�ּ�", "������");
		map2.put("����", "��");
		map2.put("���", "���ڱ�");

		System.out.print(map2.get("�̸�") + " ");
		System.out.print(map2.get("����") + " ");
		System.out.print(map2.get("�ּ�") + " ");
		System.out.print(map2.get("����") + " ");
		System.out.print(map2.get("���") + " ");
		System.out.println();

//		foreach��
		for (String s : map2.keySet()) {
			System.out.print(map2.get(s) + " ");
		}
		System.out.println();
		
//		iterator ���
		Iterator<String> it2 = map2.keySet().iterator();
		while (it2.hasNext()) {
			String s = (String) it2.next();
			System.out.print(map2.get(s) + " ");
		}
	}

}