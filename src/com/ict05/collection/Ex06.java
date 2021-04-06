package com.ict05.collection;

import java.util.Iterator;
import java.util.Stack;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Ex06 {
//	List �������̽��� ������ Ŭ������ : Stack, ArrayList, Vector
//	ArrayList, Vector : �迭�� ����� �������� ����, �߰�, ������ ����
//	 ��ũ�⸦ �̸� ������ �ʾƵ� ��, ArrayList(����ȭ ������), Vector(����ȭ ����)
//	set ������ ������ ����, �ߺ� �Ұ�
//	list ������ ������ �ְ�, �ߺ� ����
	public static void main(String[] args) {

		Stack<String> stack = new Stack<String>();
		stack.add("�Ѹ�");
		stack.addElement("������");
		stack.push("������");
		System.out.println(stack);

		stack.add(1, "�����"); // ����
		stack.add(0, "��ġ"); // ����
		stack.add(1, "�Ѳ�"); // ���� (�ߺ� �ƴ�)
		stack.add(1, "�Ѹ�"); // �ߺ� ���
		System.out.println(stack);
		System.out.println("----");

//		pop, peak
		System.out.println(stack.peek());
		System.out.println(stack);

		System.out.println(stack.pop());
		System.out.println(stack);

//		contains, indexOf, search, get, elementAt, firstElement, lastElement
		if (stack.contains("�Ѹ�")) {
			System.out.println("����");
			System.out.println(stack.indexOf("�Ѹ�") + "��° ��ġ");
			System.out.println(stack.search("�Ѹ�") + "��° ��ġ");
			System.out.println(stack.get(stack.indexOf("�Ѹ�")));
			System.out.println(stack.elementAt(stack.indexOf("�Ѹ�")));
			System.out.println(stack.firstElement());
			System.out.println(stack.lastElement());
		} else {
			System.out.println("������");
		}

//		size(ũ��), set(ġȯ), setElementAt(ġȯ)
		System.out.println(stack.size() + "��� ����");

//		index 3�� ġȯ
//		stack.set(3, "������");
		stack.setElementAt("������", 3);
		System.out.println(stack);

//		�ϳ��� ������ 
//		foreach, iterator : �����Ͱ� �״�� ����
//		pop : �����Ͱ� ������
		for (String s : stack) {
			System.out.print(s + " ");
		}
		System.out.println(stack.size() + "��� ����");

		Iterator<String> it = stack.iterator();
		while (it.hasNext()) {
			String s = (String) it.next();
			System.out.print(s + " ");
		}
		System.out.println(stack.size() + "��� ����");

		while (!stack.isEmpty()) {
			String s = stack.pop();
			System.out.println();
			System.out.print(s + " ������, " + "ũ��� " + stack.size());
		}

	}

}