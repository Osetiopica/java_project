package com.ict03.class03;

public class Ex16_main {
	public static void main(String[] args) {
//		자식을 호출하는 순간 부모 클래스가 먼저 만들어짐
		Ex15 person1 = new Ex15();
		System.out.println(person1.name);
		System.out.println(person1.age);
		System.out.println(person1.id);
		System.out.println();
		
		Ex15 person2 = new Ex15("임꺽정");
		System.out.println(person2.name);
		System.out.println(person2.age);
		System.out.println(person2.id);
		System.out.println();
		
		person1.prn();
	}
}
