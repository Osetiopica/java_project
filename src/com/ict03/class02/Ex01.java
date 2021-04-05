package com.ict03.class02;

import java.util.Calendar;

public class Ex01 {

	public static void main(String[] args) {
//		String 클래스
		String s1 = "abc";
		char[] d = { 'a', 'b', 'c' };
		String s2 = new String(d);

		byte[] d2 = { 97, 98, 99 };
		String s3 = new String(d);

		String s4 = new String("abc");

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);

		System.out.println("--주요 메소드--");
		String m = "한국 ICT 인재 개발원 1강의실";
//		charAt(int index) : char
//		위치 값을 받아 해당 위치에 존재하는 문자를 반환
		char c1 = m.charAt(1);
		System.out.println(c1);

//		소문자를 대문자로
		m = "대한 I Love You 123";
//		문자열의 길이를 구하기 : length() : int
		System.out.println(m.length());
		for (int i = 0; i < m.length(); i++) {
			char c2 = m.charAt(i);
			if (c2 >= 'a' && c2 <= 'z') {
				c2 = (char) (c2 - 32);
			}
			System.out.print(c2);
		}
		System.out.println();

//		문자열 합치기
		String m1 = "대한";
		String m2 = "민국";
		String m3 = "KOREA";
		System.out.println(m1.concat(m2.concat(m3)));
		System.out.println(m1 + m2 + m3);

//		contains(String s) : boolean
//		받은 문자열이 해당 문자열에 존재하면 true, 없으면 false
		m = "대한 I Love You 123";
		boolean b = m.contains("Love");
		if (b) {
			System.out.println("포함됨");
		} else {
			System.out.println("포함 안 됨");
		}

//		equals(Object anObject) : boolean
//		받은 문자열과 현재 문자열 같으면 true, 다르면 false(대소문자 구별)
//		equalsIgnoreCase(String anotherString) : boolean
//		받은 문자열과 현재 문자열 같으면 true, 다르면 false(대소문자 구별 없음)
//		주의) 문자열이나 객체를 비교할 때 ==는 사용하면 내용이 아니라 주소를 비교
//		문자열에는 equals 또는 equalsIgnoreCase를 사용해야 함
		String ss1 = "korea";
		String ss2 = "KOREA";
		String ss3 = new String("Korea");
		String ss4 = new String("Korea");

		System.out.println(ss1 == ss2); // false
		System.out.println(ss2 == ss3); // false
		System.out.println(ss3 == ss4); // false
		System.out.println(ss1.equalsIgnoreCase(ss2)); // true
		System.out.println(ss1.equalsIgnoreCase(ss3)); // true
		System.out.println(ss1.equalsIgnoreCase(ss4)); // true
		System.out.println();
		ss1 = "seoul";
		ss2 = "seoul";
		System.out.println(ss1 == ss2); // 주소 동일 여부
		System.out.println(ss1.equalsIgnoreCase(ss2)); // 내용 동일 여부

//		format(Locale l, String format, Object... args)
//		형식을 지정하고 형식에 맞게 생성
		String m4 = "한국 ICT 인재 개발원";
		int s5 = 14;
		double s6 = 12.244;
		String m5 = String.format("%s의 시작 연도는 %d년이고 평균 점수는 %.1f이다.", m4, s5, s6);
		System.out.println(m5);

//		getBytes() : byte[]
//		해당 문자열을 byte[]로 변경 
//		보통 입/출력 스트림할 때 사용(영문 대소문자, 숫자만 가능)
		String m6 = "java";
		byte[] b2 = m6.getBytes();
		for (int i = 0; i < b2.length; i++) {
			System.out.println((char) b2[i] + " " + b2[i] + " ");
		}

//		반대로 해당 byte[]을 문자열로 만들 수 있음(String 생성자 이용)
		String m7 = new String(b2);
		System.out.println(m7);

//		toCharArray() : char[]
//		해당 문자열을 char[]로 변경
//		보통 입/출력 스트림할 때 사용(전세계 모든 문자 가능)
		String m8 = "자바8 java8 大韓民國 123";
		char[] c = m8.toCharArray();
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i]);
		}
		System.out.println();

//		반대로 해당 char[]을 문자열로 만들 수 있음(String 생성자 이용)
		String m9 = new String(c);
		System.out.println(m9);

//		indexOf(int ch) : int
//		문자를 받아서 해당 문자의 위치 값을 표시
//		시작 위치는 처음부터, 찾는 문자가 없으면 -1
//		indexOf(int ch, int fromIndex) : int
//		문자와 시작 위치를 받아서 해당 문자의 위치 값을 표시
//		찾는 문자가 없으면 -1
//		indexOf(String str) : int
//		문자열을 받아서 해당 문자열의 위치 값을 표시
//		시작 위치는 처음부터, 찾는 문자열이 없으면 -1
//		indexOf(String str, int fromIndex)
//		문자열과 시작 위치를 받아서 해당 문자열의 위치 값을 표시
//		찾는 문자열이 없으면 -1

		String m10 = "BufferedReader";
//		'e' 찾기
		int k1 = m10.indexOf('e');
		System.out.println(k1);

//		두 번째 'e' 찾기
//		k1 = m10.indexOf('e', 5); // 첫 번째 'e'가 4라 5부터 찾음
		k1 = m10.indexOf('e', m10.indexOf('e') + 1);
		System.out.println(k1);

//		세 번째 'e' 찾기
		k1 = m10.indexOf('e', m10.indexOf('e', m10.indexOf('e') + 1) + 1);
		System.out.println(k1);

//		없는 글자 찾기('A')
		k1 = m10.indexOf('A');
		System.out.println(k1); // -1
		b = m10.contains("A");
		System.out.println(b); // false

//		String으로 찾기
		k1 = m10.indexOf("er");
		System.out.println(k1);

//		두 번째 "er" 찾기
		k1 = m10.indexOf("er", m10.indexOf("er") + 1);
		System.out.println(k1);

//		lastIndexOf(int ch) : int
//		lastIndexOf(String str) : int
		k1 = m10.lastIndexOf('e');
		System.out.println(k1);
		k1 = m10.lastIndexOf("er");
		System.out.println(k1);

//		isEmpty() : boolean
//		문자열의 길이가 0이면 true, 아니면 false
//		length() : int
//		문자열의 길이를 숫자로 표시
		String m11 = "";
		String m12 = "java";

		System.out.println(m11.isEmpty()); // true
		System.out.println(m12.isEmpty()); // false

		System.out.println(m11.length()); // 0
		System.out.println(m12.length()); // 4

//		replace(char oldChar, char newChar) : String
//		replace(String target, String replacement) : String
//		문자나 문자열을 받아서 치환
		String m13 = "대한민국";
		String m14 = m13.replace("대한민국", "korea");
		String m15 = m13.replace(m13, "korea");
		String m16 = m13.replace('한', '韓');
		System.out.println(m14);
		System.out.println(m15);
		System.out.println(m16);

//		split(String regex) : String[]
//		구분자를 받아서 배열로 나눔 (배열 크기 자동)
//		split(String regex, int limit) : String[]
//		구분자를 받아서 배열로 나눔 (배열 크기 limit)

		String m17 = "사과,딸기,망고,오렌지,파인애플";
		String[] r = m17.split(",");
		for (int i = 0; i < r.length; i++) {
			System.out.print(r[i] + " ");
		}
		System.out.println();
		String[] r2 = m17.split(",", 2);
		for (int i = 0; i < r2.length; i++) {
			System.out.print(r2[i] + " ");
		}
		System.out.println();

//		substring(int beginIndex) : String
//		시작 위치를 받아 해당 문자열 끝까지 문자열 추출
//		substring(int beginIndex, int endIndex) : String
//		시작 위치를 끝 위치를 받아 해당 문자열 추출(끝 위치 포함 안 됨)
		String m18 = "010-1234-5678";
		String r3 = m18.substring(4);
		System.out.println(r3);
		String r4 = m18.substring(4, 8);
		System.out.println(r4);
		String r5 = m18.substring(m18.indexOf('-') + 1, m18.lastIndexOf('-'));
		System.out.println(r5);

		String m19 = "770707";

		// 년도 추출
		String r7 = m19.substring(0, 2);
		System.out.println(r7);

		// 달 추출
		String r8 = m19.substring(2, 4);
		System.out.println(r8);

		// 숙제) 010-7777-9999 -> 010-XXXX-9999, 010-7777-XXXX
		String p = "010-7777-9999";
		String[] p2 = p.split("-");
		String[] p3 = p.split("-");
		p2[1] = "XXXX";
		for (int i = 0; i < p2.length; i++) {
			System.out.print(p2[i]);
			if(i<p2.length-1) {
				System.out.print("-");
			}
		}
		System.out.println();
		p3[2] = "XXXX";
		for (int i = 0; i < p3.length; i++) {
			System.out.print(p3[i]);
			if(i<p3.length-1) {
				System.out.print("-");
			}
		}
		System.out.println();

//		toLowerCase() : String
//		해당 문자열의 모든 대문자를 소문자로 변경
//		toUpperCase() : String
//		해당 문자열의 모든 소문자를 대문자로 변경
		String m20 = "자바8 JAVA8 java8";
		String r9 = m20.toLowerCase();
		System.out.println(r9);
		String r10 = m20.toUpperCase();
		System.out.println(r10);

//		toString() : String
//		String -> toString()은 문자열 자체를 반환
//		Object -> toString()은 모든 객체에서 사용 가능
//		 ㄴ객체가 갖고 있는 정보나 값들을 문자열로 리턴할 때 사용(오버라이딩에서 다시 배움)
		String m21 = "Java8 자바8";
		String r11 = m21.toString();
		System.out.println(r11);

//		trim() : String
//		해당 문자열의 앞, 뒤에 있는 공백 제거, 중간 공백은 제거 불가
		String m22 = "  Java 8  ";
		String r12 = m22.trim();
		System.out.println(m22);
		System.out.println(m22.length());
		System.out.println(r12);
		System.out.println(r12.length());
		System.out.println();

//		valueOf(자료형) : static String
//		어떤 자료형이든 String으로 변환
		boolean y1 = true;
		char y2 = 'd';
		int y3 = 100;
		long y4 = 100L;
		float y5 = 100.0f;
		double y6 = 100.0;

//		System.out.println(y1 + 1); // boolean형 연산 불가
		System.out.println(y2 + 1); // char + int = int
		System.out.println(y3 + 1);
		System.out.println(y4 + 1);
		System.out.println(y5 + 1);
		System.out.println(y6 + 1);
		System.out.println();

//		String으로 변경시키고 +1
		System.out.println(String.valueOf(y1) + 1);
		System.out.println(String.valueOf(y2) + 1);
		System.out.println(String.valueOf(y3) + 1);
		System.out.println(String.valueOf(y4) + 1);
		System.out.println(String.valueOf(y5) + 1);
		System.out.println(String.valueOf(y6) + 1);
		System.out.println();

		System.out.println(y1 + "1"); // 나쁜 예

//		Wrapper Class(Boolean, Byte, Short, Integer, Long, Float, Double, Character)
//		parseXxxx(String s) 이용, Character는 String.charAt() 사용
//		각 자료형의 형태를 가진 문자열을 해당 자료형으로 변경
//		예전 의미는 기본 자료형을 객체형으로 만들 때 사용(오토 박싱, 현재는 자동으로 만들어짐)
//		객체형을 기본 자료형으로 자동으로 변경(오토 언박싱)

//		boolean 형태의 문자열을 Boolean 형으로 변경
		if (Boolean.parseBoolean("true")) {
			System.out.println("참");
		}

//		문자열을 double로 변경
		System.out.println(Double.parseDouble("1.1") + 1);

//		문자열을 char로 변경
		char cc = "c".charAt(0); // 문자열의 0번을 char로
		System.out.println(cc + 1); // char + int = int
		System.out.println((char) (cc + 1)); // char 100은 'd'

//		주민번호 앞자리로 나이
		String j = "940909";
		String gender = "1";

		String year = j.substring(0, 2);
		int year2 = Integer.parseInt(year);
		if (gender.equals("1") || gender.equals("2")) {
			year2 = year2 + 1900;
		} else if (gender.equals("3") || gender.equals("4")) {
			year2 = year2 + 2000;
		}
//		gender가 1, 2면 1900, 3, 4는 2000
//		올해년도-구한년도+1
		int age = Calendar.getInstance().get(Calendar.YEAR) - year2 + 1;
		System.out.println("나이 : " + age);
	}

}
