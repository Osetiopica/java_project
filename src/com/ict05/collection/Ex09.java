package com.ict05.collection;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Ex09 {

	public static void main(String[] args) {
//		���� �Է��ϸ� ������ ���
//		1> ����� ������ ���� ������
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("�ѱ�", "����");
		map.put("���ѹα�", "����");
		map.put("KOREA", "����");
		map.put("korea", "����");
		map.put("�̱�", "������DC");
		map.put("�߱�", "����¡");
		map.put("�Ϻ�", "����");
		map.put("�±�", "����");
		map.put("ĳ����", "��Ÿ��");

//		key�� set�÷��ǿ� ����
		Set<String> set = map.keySet();
		Scanner sc = new Scanner(System.in);

		esc: while (true) {
			System.out.println("���� >> ");
			String s = sc.next();
			if (set.contains(s)) {
				String a = map.get(s);
				System.out.println(s + "�� ������ " + a + "�Դϴ�.");
			} else {
				System.out.println("�����Ϳ� ���� ����");
			}
			while (true) {
				System.out.println("���?(y/n)");
				String t = sc.next();
				if (t.equalsIgnoreCase("y")) {
					continue esc;
				} else if (t.equalsIgnoreCase("n")) {
					break esc;
				} else {
					System.out.println("�ٽ� �Է�");
					continue;
				}
			}
		}
		System.out.println("����");
	}

}