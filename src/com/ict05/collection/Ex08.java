package com.ict05.collection;

import java.util.HashMap;
import java.util.Iterator;

public class Ex08 {

	public static void main(String[] args) {
//		Map 인터페이스 : key와 value를 매핑하는 구조
//		 ㄴkey는 중복 불가(중복되면 덮어씀)
//		 ㄴkey를 호출하면 value가 나옴
//		key를 set컬렉션에 별도로 관리 -> keySet()
//		주요 메소드
//		add()로 추가, 삽입 불가
//		put(K key, V value)
//		key를 set에서 관리 : keySet()
//		containsKey(Object key) : boolean
//		 ㄴ인자로 받은 key가 존재하면 true 
//		containsValue(Object value) : boolean
//		 ㄴ인자로 받은 value가 좋재하면 true
//		get(Object key) : 키를 받아서 value를 return
//		remove(Object key) : 키를 받아서 삭제
//		replace(K key, V value) : 치환

//		1> key를 순서있는 숫자로 만들면 for문 사용 가능
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(1, "한국");
		map1.put(2, "미국");
		map1.put(3, "중국");
		map1.put(4, "영국");
		map1.put(5, "태국");
		System.out.println(map1);

		map1.put(3, "일본"); // key 중복(덮어쓰기)
		System.out.println(map1);

		map1.put(6, "한국"); // value 중복(상관없음)
		System.out.println(map1);

//		하나씩 추출(get(key))
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

//		foreach 사용하려면 keySet() 이용
		for (int i : map1.keySet()) {
			System.out.print(map1.get(i) + " ");
		}
		System.out.println();

//		iterator 사용 - keySet() 이용
		Iterator<Integer> it = map1.keySet().iterator();
		while (it.hasNext()) {
			int s = (int) it.next();
			System.out.print(map1.get(s) + " ");
		}
		System.out.println();
		System.out.println("----");

//		2> key를 문자로 만들면 출력 시 keySet()을 사용 (일반적)
		HashMap<String, String> map2 = new HashMap<String, String>();
		map2.put("이름", "고길동");
		map2.put("나이", "34");
		map2.put("주소", "도봉구");
		map2.put("성별", "남");
		map2.put("취미", "잠자기");

		System.out.print(map2.get("이름") + " ");
		System.out.print(map2.get("나이") + " ");
		System.out.print(map2.get("주소") + " ");
		System.out.print(map2.get("성별") + " ");
		System.out.print(map2.get("취미") + " ");
		System.out.println();

//		foreach문
		for (String s : map2.keySet()) {
			System.out.print(map2.get(s) + " ");
		}
		System.out.println();
		
//		iterator 사용
		Iterator<String> it2 = map2.keySet().iterator();
		while (it2.hasNext()) {
			String s = (String) it2.next();
			System.out.print(map2.get(s) + " ");
		}
	}

}