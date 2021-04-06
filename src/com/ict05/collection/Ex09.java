package com.ict05.collection;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Ex09 {

	public static void main(String[] args) {
//		나라를 입력하면 수도를 출력
//		1> 나라와 수도를 가진 데이터
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("한국", "서울");
		map.put("대한민국", "서울");
		map.put("KOREA", "서울");
		map.put("korea", "서울");
		map.put("미국", "워싱턴DC");
		map.put("중국", "베이징");
		map.put("일본", "도쿄");
		map.put("태국", "방콕");
		map.put("캐나다", "어타와");

//		key를 set컬렉션에 넣음
		Set<String> set = map.keySet();
		Scanner sc = new Scanner(System.in);

		esc: while (true) {
			System.out.println("나라 >> ");
			String s = sc.next();
			if (set.contains(s)) {
				String a = map.get(s);
				System.out.println(s + "의 수도는 " + a + "입니다.");
			} else {
				System.out.println("데이터에 없는 나라");
			}
			while (true) {
				System.out.println("계속?(y/n)");
				String t = sc.next();
				if (t.equalsIgnoreCase("y")) {
					continue esc;
				} else if (t.equalsIgnoreCase("n")) {
					break esc;
				} else {
					System.out.println("다시 입력");
					continue;
				}
			}
		}
		System.out.println("ㅅㄱ");
	}

}