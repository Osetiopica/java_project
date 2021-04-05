package com.ict03.class05;

//	인터페이스 상속
//	 ㄴ일반 클래스가 인터페이스 상속 받을 때는 무조건 오버라이딩 해야 함
//	 ㄴ추상 클래스가 인터페이스를 상속하면 오버라이딩 안 해도 됨
//	 ㄴ인터페이스가 인터페이스를 상속할 때도 오버라이딩 필요 없음
//	 ㄴ다중 상속 가능
//	  ㄴㄴ인터페이스자식 extends 인터페이스부모1, 인터페이스부모2, 인터페이스부모3
//	 ㄴ일반 클래스가 부모 클래스와 부모 인터페이스를 같이 상속
//	  ㄴㄴclass 클래스이름 extends 부모클래스 implements 인터페이스
//	 ㄴ인터페이스 -> 인터페이스, 클래스 -> 클래스 : extends 예약어 사용
//	  ㄴㄴ클래스(자식) -> 인터페이스(부모) : implements 예약어 사용
//    ㄴㄴ인터페이스(자식) -> 클래스(부모)는 불가능

//	일반 클래스가 인터페이스를 상속
public class Ex03 implements Ex01 {

	@Override
	public void like() {

	}

	@Override
	public void sound() {

	}
}

//	추상 클래스가 인터페이스 상속
abstract class Ex04 implements Ex01 {
	
}

//	인터페이스가 인터페이스 상속
interface Ex05 extends Ex01{
	
}