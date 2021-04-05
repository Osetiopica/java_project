package com.ict03.class01;

public class Ex11_main {

	public static void main(String[] args) {
		Ex11 test = new Ex11();
		System.out.println("이름 " + test.getName());
		System.out.println("나이 " + test.getAge());
		System.out.println("성별 " + test.isGender());
		System.out.println("----");
		test.setName("일지매");
		System.out.println("이름 " + test.getName());
		System.out.println("나이 " + test.getAge());
		System.out.println("성별 " + test.isGender());
		System.out.println("----");
		Ex11 test2 = new Ex11("임꺽정", 22);
		System.out.println("이름 " + test2.getName());
		System.out.println("나이 " + test2.getAge());
		System.out.println("성별 " + test2.isGender());

	}

}
