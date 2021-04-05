package com.ict04.exception;

public class Ex01 {
	public static void main(String[] args) {
//		자바에서 오류가 발생하면 프로그램이 종료된다
//		그러나 예상되는 오류를 별도로 처리하는 방법을 쓰면 정상적으로 종료시킬 수 있다
//		exception(예외처리) : try{}catch{}
//		비정상적인 종료를 정상적인 종료롤 유도
//		예외 발생 시 예외에 대한 처리를 한다.
//		try {
//			예외가 발생할 수 있는 문장;
//			예외가 발생할 수 있는 문장;
//		}catch(예외발생객체 e) {
//			예외 발생 시 처리 문장;
//		}
		
		try {
			int[] v = { 1, 2, 3 };
			for (int i = 0; i <= v.length; i++) {
				System.out.println(1);
				System.out.println(2);
				System.out.println("v+[" + i + "] = " + v[i]);
				System.out.println(3);
				System.out.println(4);
			}
		} catch (Exception e) {
			
		}
		System.out.println("ㅅㄱ");
	}
}