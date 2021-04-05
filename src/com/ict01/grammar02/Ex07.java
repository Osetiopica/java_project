package com.ict01.grammar02;
class Ex07{
	public static void main(String[] args){
		int kor = 90;
		int eng = 80;
		int math = 90;
		int sum = kor+eng+math;
		double av = sum / 3.0;
		double av2 = (int)(av*10)/10.0;
		String name = "홍길동";
		System.out.printf("이름: %s%n합계: %d점%n평균: %.1f점", name, sum, av2);
	}
}





