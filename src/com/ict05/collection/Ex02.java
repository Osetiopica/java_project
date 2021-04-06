package com.ict05.collection;

import java.util.HashSet;
import java.util.Iterator;

public class Ex02 {

	public static void main(String[] args) {
//		set 인터페이스를 상속받은 클래스 : HashSet, TreeSet
//		HashSet과 TreeSet 사용법은 같음
//		그러나 TreeSet은 내부에서 항상 오름차순 정렬 상태를 유지함
//		set은 특정 기준으로 정렬을 할 수 없음
//		HashSet, TreeSet 모두 중복 안 됨(오류는 안 남)

//		컬렉션 생성
//		HashSet<제네릭타입=객체타입=같은클래스> 참조변수 = new HashSet<제네릭타입>();
//		HashSet<제네릭타입=객체타입=같은클래스> 참조변수 = new HashSet<>();
		HashSet<String> h1 = new HashSet<>(); // 문자열형 객체 모임
		HashSet<Integer> h2 = new HashSet<>(); // 정수형 객체 모임
		HashSet<Double> h3 = new HashSet<>(); // 실수형 객체 모임
		HashSet<Boolean> h4 = new HashSet<>(); // 논리형 객체 모임

//		h2(정수형)에 객체를 추가하는 방법
//		1> 기본 자료형을 객체로 만들어 넣기(Boxing)
		Integer k1 = new Integer(10);
		Integer k2 = new Integer("10");

//		2> 기본 자료형을 그냥 넣기 -> 기본 자료형이 자동으로 객체가 돼서 들어감(AutoBoxing)
//		h2 컬렉션에 객체 넣기(add(요소))
		h2.add(k1); // true
		h2.add(k2); // 중복이라 false
		h2.add(10); // 중복이라 false
		h2.add(new Integer(10));
//		h2.add('A'); // 같은 제네릭 타입이 아니면 오류

		h3.add(3.14);
		h3.add(new Double(3.141));
//		h3.add(14); // 같은 제네릭 타입이 아니면 오류

//		내용 보기(전체 내용) -> 배열처럼 보임
		System.out.println(h1);
		System.out.println(h2);
		System.out.println(h3);

		h1.add("java");
		h1.add("Java");
		h1.add("JAVA");
		h1.add("jsp");
		h1.add("JSP");
		h1.add("spring");
		System.out.println(h1);

//		하나씩 꺼내서 사용하기
//		1> foreach문(index가 없어서 for문 사용 불가)
//		2> iterator()

		for (String s : h1) {
			System.out.println(s);
		}
		System.out.println("----");
		Iterator<String> it = h1.iterator();
		while (it.hasNext()) { // hasNext() : 다음 객체가 존재하면 true
			String m = (String) it.next(); // 다음 객체 return 하고 다음 객체로 이동
			System.out.println(m);
		}
	}

}