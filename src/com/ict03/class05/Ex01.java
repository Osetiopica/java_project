package com.ict03.class05;

public interface Ex01 {
//	인터페이스 : 서비스를 제공하는 목록
//	 ㄴ상수와 추상 메소드들로만 이루어짐
//	 ㄴ생성자가 없음(객체 생성 불가, 사용 불가) -> 다중 상속 가능
//	 ㄴ사용하기 위해서는 인터페이스를 상속받은 클래스를 사용함
//	 ㄴ부모인 인터페이스가 같다는 말은 대체(호환)가 가능하다는 뜻이다.
	final int s1 = 1;
	static final int s2 = 2;
	int s3 = 3;
	static int s4 = 4;
//	위 멤버 필드들은 모두 static final

//	추상 메소드 아니라 오류
//	public void play() {}

//	일반적 추상 메소드
	public abstract void like();

//	interface 안에서는 abstract 예약어 사용 안 해도 됨
	public void sound();
}
