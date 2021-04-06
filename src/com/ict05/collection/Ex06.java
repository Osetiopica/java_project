package com.ict05.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

public class Ex06 {
//	List 인터페이스를 구현한 클래스들 : Stack, ArrayList, Vector
//	ArrayList, Vector : 배열과 비슷한 구조지만 삽입, 추가, 삭제가 자유
//	 ㄴ크기를 미리 정하지 않아도 됨, ArrayList(동기화 미지원), Vector(동기화 지원=동시접속)
//	set 구조는 순서가 없음, 중복 불가
//	list 구조는 순서가 있고, 중복 가능
	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
//		추가(add)
		list.add("박찬호");
		list.add("류현진");
		list.add("손흥민");
		System.out.println(list);

//		삽입(add)
		list.add(1, "추신수");
		System.out.println(list);

		Vector<String> vector = new Vector<String>();
		vector.add("둘리");
		vector.add("도우너");
		vector.add("또치");
		System.out.println(vector);

//		삽입(add)
		vector.add(2, "희동이");
		System.out.println(vector);

		if (list.contains("손흥민")) {
			System.out.println(list.indexOf("손흥민") + "에 있");
			System.out.println(list.get(3));
			System.out.println(list.get(list.indexOf("손흥민")));
		} else {
			System.out.println("없");
		}
		System.out.println(list.size());

//		치환(set)
		list.set(3, "이대호");
		System.out.println(list);

//		추신수가 있으면 추신수를 이종범으로 치환
		if (list.contains("추신수")) {
			list.set(list.indexOf("추신수"), "이종범");
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