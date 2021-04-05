package com.ict03.class06;

enum Type2 {
//	순서 지켜야 함
//	1. 들어갈 정보
	WALK("워킹화", 270), RUN("런닝화", 275), TRACK("트래킹화", 265), HIK("하이킹화", 260);

//	2. 전역변수
	final private String name;
	final private int size;

//	3. 생성자
	Type2(String name, int size) {
		this.name = name;
		this.size = size;
	}

//	4. getter
	public String getName() {
		return name;
	}

	public int getSize() {
		return size;
	}

}

public class Ex03 {

	public static void main(String[] args) {
		Type2[] arr = Type2.values();
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].getName() + ", " + arr[i].getSize());
		}

//		개선된 for문 = foreach = for in -> 배열이나 컬렉션에서 주로 사용
//		':'의 의미는 배열이 갖고 있는 처음부터 끝까지 차례대로 변수에 대입 
//		배열의 특정 요소를 처리할 수 없음
//		for (자료형 내부에서사용할변수 : 변수) {
//			
//		}
		for (Type2 i : arr) {
			System.out.print(i + " ");
			System.out.print(i.getName() + " ");
			System.out.print(i.getSize() + " ");
			System.out.println();
		}

		String[] m = { "java", "jsp", "spring", "android" };
		for (String i : m) {
			System.out.print(i + " ");
		}
	}
}
