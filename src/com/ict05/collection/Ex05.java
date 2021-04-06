package com.ict05.collection;

import java.util.Iterator;
import java.util.Stack;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Ex05 {
//	List 인터페이스를 구현한 클래스들 : Stack, ArrayList, Vector
//	Stack : LIFO(Last in First Out), 마지막에 들어온 데이터가 맨 처음 나감
//	주요 메소드 : add(), psh(), addElement() : 끝에 추가
//	add(index, E) -> 중간에 삽입
//	pop() : 맨 위에 존재하는 객체를 반환하고 삭제
//	peek() : 맨 위에 존재하는 객체를 반환(무한루프 주의)
//	search() : 오른쪽, 1부터 검색
//	indexOf() : 왼쪽, 0부터 검색 -> 배열 방식
//	elementAt(index) : 위치 값을 받아서 해당 객체 추출 
//	get(index) : 위치 값을 받아서 해당 객체 추출 
//	firstElement() : 맨 첫 요소 추출
//	lastElement() : 맨 끝 요소 추출
//	setElement(Element, index) : 치환

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