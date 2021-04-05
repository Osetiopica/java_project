package com.ict03.class01;

public class Ex01 {
	public static void main(String[] args) {
//		클래스 : 객체(오브젝트, 인스턴스)를 만들기 위한 모든 정보를 갖고 있는 것
//		클래스가 파일 형태로 되어 있으면 객체로 만들어야 사용 가능
//		클래스가 가진 것 : 데이터(상태 값, 속성, 정보), 기능(동작), 생성자
//		 +데이터(상태 값, 속성) -> 변수, 상수 -> 멤버 필드
//		 +기능(동작, 작동) -> 메소드 -> 멤버 메소드
//		생성자 : 클래스를 객체로 만들 때 호출 된다. 클래스 이름과 같음. 클래스이름()
//		 +멤버 필드(데이터)의 초기화가 목적이다.
		
//		클래스 구조 : 헤더, 멤버 필드, 멤버 메소드, 생성자 
//		 +헤더 : [접근제한자] [클래스종류] class 클래스이름 // (대괄호는 생략 가능하다는 뜻)
//		  ++접근 제한자 : 외부에서 접근할 수 있는 권한을 말한다.
//		   +++public : 누구나 접근 가능
//		   +++protected : 같은 패키지와 상속 관계에서는 접근 가능
//		   +++(default) : 같은 패키지에서만 접근 가능
//		   +++private : 외부에서는 접근 불가, 내부 멤버(필드, 메소드)끼리만 접근 가능
//		  ++클래스 종류 : 일반적인 클래스는 생략, 특정 클래스는 예약어를 사용(final, abstract)
//		  ++클래스 이름 : = 저장 파일명 = 생성자, 첫글자 대문자, 나머지 소문자
//		   +++두 단어 이상일 때 단어의 첫 글자는 대문자, 특수문자 사용 불가, 숫자는 중간이나 끝에만 사용
//		 +멤버 필드
//		  ++변수 : 언제든지 변할 수 있는 데이터를 저장하는 공간
// 		   +++첫글자 소문자, 두 단어 이상일 때 단어들의 첫글자는 대문자
//		   +++특수문자 사용 불가, 숫자는 중간이나 끝에만 사용
//		  ++상수 : 한 번 지정하면 바꿀 수 없는 데이터를 저장하는 공간
//		   +++모든 글자가 대문자, 단어와 단어 사이에 _를 사용하기도 함(JAVA_HOME)
//		 +멤버 메소드 : 동작, 기능, 작동, 이름 뒤에 무조건 괄호()가 존재, 실행이 끝나면 되돌아 감
//		  ++해당 메소드를 호출하면 해당 메소드가 실행
//		  ++main()은 JVM이 호출
//		  ++구성 : [접근제한자] [메소드종류] 반환형 메소드이름([인자=매개변수]) {실행내용;}
//		  ++종류 : 
//		   +++instance 메소드 : 일반적인 메소드로 예약어 생략
//		   +++static 메소드 : 반드시 static 메소드 사용해서 표시
//		  ++반환형 : 메소드는 자기를 호출한 곳으로 되돌아 간다.
//		   +++이때 실행한 결과를 갖고 갈 때에 자료형을 반환형이라고 한다.
//		   +++만약에 결과를 갖고 가지 않을 때엔 반환형에 void라고 적는다.
//		  ++인자(매개변수) : 메소드가 동작을 할 때 필요한 정보를 외부에서 받아서 사용할 때 인자가 필요
//		   +++overloading : 같은 클래스 안에서 이름은 같지만 인자의 개수나 자료형이 다른 메소드
//		  ++getter : 호출하는 입장에서 메소드를 이용해 멤버 필드에 데이터를 얻어냄
//		  ++setter : 메소드를 이용해 멤버 필드에 데이터를 입력함
//		 +생성자 : 클래스를 객체로 만들 때 맨 처음 호출되는 것
//		  ++목적 : 멤버 필드의 초기값 설정
//		  ++형식 : 클래스이름(), 반환형 없음
//		  ++클래스 객체 만드는 법 - Scanner sc = new Scanner(System.in);
//		                      클래스 참조변수 = 인스턴스 생성자;
//		  ++생성자도 오버로딩 가능
//		 +클래스에는 일반적으로 static 사용 불가(내부 클래스는 예외)
//		  ++instance : 일반적인 메소드나 필드, 객체가 생성될 때 같이 생성되는 메소드, 필드
//		   +++호출 방법 : 객체 만들 때 사용한 참조변수.메소드, 참조변수.필드
//		  ++static : static이 붙어있음, 객체 생성과 상관없이 미리 만들어진 메소드나 필드
//		   +++호출 방법 : 클래스이름.메소드, 클래스이름,필드
//		
//		
	}
}

