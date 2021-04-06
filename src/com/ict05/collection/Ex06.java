package com.ict05.collection;

import java.util.Iterator;
import java.util.Stack;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Ex06 {
//	List 인터페이스를 구현한 클래스들 : Stack, ArrayList, Vector
//	ArrayList, Vector : 배열과 비슷한 구조지만 삽입, 추가, 삭제가 자유
//	 ㄴ크기를 미리 정하지 않아도 됨, ArrayList(동기화 미지원), Vector(동기화 지원)
//	set 구조는 순서가 없음, 중복 불가
//	list 구조는 순서가 있고, 중복 가능
	public static void main(String[] args) {

		Stack<String> stack = new Stack<String>();
		stack.add("둘리");
		stack.addElement("공실이");
		stack.push("마이콜");
		System.out.println(stack);

		stack.add(1, "도우너"); // 삽입
		stack.add(0, "또치"); // 삽입
		stack.add(1, "뿌끄"); // 삽입 (중복 아님)
		stack.add(1, "둘리"); // 중복 허용
		System.out.println(stack);
		System.out.println("----");

//		pop, peak
		System.out.println(stack.peek());
		System.out.println(stack);

		System.out.println(stack.pop());
		System.out.println(stack);

//		contains, indexOf, search, get, elementAt, firstElement, lastElement
		if (stack.contains("둘리")) {
			System.out.println("존재");
			System.out.println(stack.indexOf("둘리") + "번째 위치");
			System.out.println(stack.search("둘리") + "번째 위치");
			System.out.println(stack.get(stack.indexOf("둘리")));
			System.out.println(stack.elementAt(stack.indexOf("둘리")));
			System.out.println(stack.firstElement());
			System.out.println(stack.lastElement());
		} else {
			System.out.println("미존재");
		}

//		size(크기), set(치환), setElementAt(치환)
		System.out.println(stack.size() + "요소 존재");

//		index 3울 치환
//		stack.set(3, "마이콜");
		stack.setElementAt("마이콜", 3);
		System.out.println(stack);

//		하나씩 꺼내기 
//		foreach, iterator : 데이터가 그대로 유지
//		pop : 데이터가 삭제됨
		for (String s : stack) {
			System.out.print(s + " ");
		}
		System.out.println(stack.size() + "요소 존재");

		Iterator<String> it = stack.iterator();
		while (it.hasNext()) {
			String s = (String) it.next();
			System.out.print(s + " ");
		}
		System.out.println(stack.size() + "요소 존재");

		while (!stack.isEmpty()) {
			String s = stack.pop();
			System.out.println();
			System.out.print(s + " 삭제됨, " + "크기는 " + stack.size());
		}

	}

}