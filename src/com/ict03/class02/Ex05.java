package com.ict03.class02;

public class Ex05 {

	public static void main(String[] args) {
//		StringBuffer, StringBuilder
//		String은 불변 속성, 변경 시 메모리에 새로운 영역을 만들어서 넣음
//		StringBuffer는 가변 속성, 변경 시 현재 영역에서 바뀜
		String m = "Hello"; 
		System.out.println(m);
		m = m + " Java";
		System.out.println(m);

		StringBuffer sb = new StringBuffer("welcome");
		System.out.println(sb.toString());
		sb.append(" Java");
		System.out.println(sb.toString());
	}

}
