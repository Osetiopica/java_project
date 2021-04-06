package com.ict05.collection;

public class Ex01 {
	
	public static void main(String[] args) {
//		제네릭과 컬렉션(자료구조)
//		제네릭 : 컬렉션과 어떤 객체들로 이루어졌는지 표시하는 객체 타입
//		컬렉션 : 객체들을 모아서 관리하는 인터페이스를 구현한 것
//		API : <T> -> 객체 타입, <E> -> 요소(컬렉션 안에 존재하는 객체 하나)
//		Map 형식에서는 <K, V> -> Key, Value
//		Key과 Value는 1:1 대응, Key를 호출하면 Value가 나옴
//		형식 : 컬렉션<제네릭>
//		최상위 컬렉션은 Collection<E>, Map<K, V>
//		Collection<E>를 상속받은 인터페이스 : Set<E>, List<E>, Queue<E

//		Collection의 주요 메소드
//		add(E e) : boolean -> 해당 컬렉션에 객체 추가, 성공 true, 실패 false
//		addAll(Collection<? extends E> c) : boolean
//		 ㄴ특정 컬렉션에 있는 모든 요소들을 다른 컬렉션에 추가 
//		clear() : void -> 모든 요소 삭제
//		contains(Object o) : boolean
//		 ㄴ해당 컬렉션에 인자로 들어온 객체가 존재하면 true 없으면 farse
//		containsAll(Collection<?> c) : boolean
//		 ㄴ이 컬렉션에 지정된 컬렉션의 모든 요소가 포함된 경우 true
//		equals(Object o) : boolean -> 지정된 객체와의 컬렉션이 같은지 비교
//		isEmpty() : boolean -> 해당 컬렉션이 비었으면 true
//		iterator() : Iterator<E>
//		 ㄴ컬렉션 안에 요소들을 순서대로 접근하기 위한 Iterator 객체를 반환	
//		 ㄴ컬렉션 안에 존재하는 요소들을 하나씩 꺼내서 작업할 때 사용
//		remove(Object o) : boolean -> 인자로 들어온 객체를 삭제할 때 사용, 성공 시 true
//		size() : int -> 컬렉션 안에 존재하는 요소들의 수(for문에 사용 가능)
//		toArray() : Object[] -> 컬렉션을 배열로 만듦
	}
	
}