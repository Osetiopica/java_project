package com.ict05.collection;

import java.util.HashSet;
import java.util.Iterator;

public class Ex03_main {

	public static void main(String[] args) {
		Ex03 coffee = new Ex03();
//		setter를 이용해서 이름과 값을 정함
		coffee.setName("커피음료");
		coffee.setPrice(2500);

//		생성자를 이용해서 이름과 값을 정함
		Ex03 cola = new Ex03("콜라", 1600);
		Ex03 juice = new Ex03("과일음료", 2300);

//		객체들을 저장하고 관리하는 방법 : 배열, 컬렉션
//		1> 배열
		Ex03[] arr = new Ex03[3];
		arr[0] = coffee;
		arr[1] = cola;
		arr[2] = juice;

//		이름과 가격 꺼내기
		for (Ex03 e : arr) {
			System.out.print("이름 : " + e.getName() + "\t");
			System.out.println("가격 : " + e.getPrice());
		}

		System.out.println("----");

//		2> 컬렉션
		HashSet<Ex03> h1 = new HashSet<Ex03>();
//		추가
		h1.add(coffee);
		h1.add(cola);
		h1.add(juice);
//		더 추가할 수 있음
		h1.add(new Ex03("ion", 1500));

//		이름, 가격 꺼내기
//		1> foreach
		for (Ex03 e : h1) {
			System.out.print("이름 : " + e.getName() + "\t");
			System.out.println("가격 : " + e.getPrice());
		}
		System.out.println("----");
//		2> iterator()
		Iterator<Ex03> it = h1.iterator();
		while (it.hasNext()) {
			Ex03 e1 = (Ex03) it.next();
			System.out.print("이름 : " + e1.getName() + "\t");
			System.out.println("가격 : " + e1.getPrice());
		}

//		포함여부 : contains
		if (h1.contains(coffee)) {
			System.out.println("있");
		} else {
			System.out.println("없");
		}

//		갯수 : size
		System.out.println(h1.size());

//		삭제 : remove(Object o), clear()
//		컬렉션 안에 해당 객체가 있으면 삭제
		if (h1.contains(cola)) {
			h1.remove(cola);
			System.out.println(cola.getName() + " 삭제");
		} else {
			System.out.println("없");
		}

//		비었나 확인 : isEmpty()
		if (h1.isEmpty()) {
			System.out.println("빔");
		} else {
			System.out.println("안 빔");
		}
		
//		전체 삭제
		h1.clear();
		if (h1.isEmpty()) {
			System.out.println("빔");
		} else {
			System.out.println("안 빔");
		}
	}
}